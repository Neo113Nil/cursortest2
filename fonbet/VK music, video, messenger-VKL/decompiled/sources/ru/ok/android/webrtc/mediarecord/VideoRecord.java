package ru.ok.android.webrtc.mediarecord;

import android.content.Context;
import android.graphics.Matrix;
import com.unity3d.services.UnityAdsConstants;
import com.vk.movika.sdk.android.defaultplayer.interactive.c;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;
import org.webrtc.YuvConverter;
import ru.ok.android.webrtc.RTCLog;
import xsna.an10;
import xsna.efz;

/* loaded from: classes9.dex */
public final class VideoRecord extends MediaRecord<VideoTrack, VideoSource> implements BaseVideoRecord, SurfaceTextureHelper.FrameGeometryAdjuster {

    @Deprecated
    public static final float DEFAULT_FRAME_RATE = 24.0f;

    @Deprecated
    public static final int DEFAULT_MAX_DIMENSION = 960;

    @Deprecated
    public static final String LOG_TAG = "VideoRecord";

    @Deprecated
    public static final String LOG_TAG_TRANSFORM = "VideoRecord_BufferTransform";

    @Deprecated
    public static final String VIDEO_CAPTURER_THREAD_NAME = "VideoCapturerThread";
    public final PeerConnectionFactory f;
    public final boolean g;
    public final EventListener h;
    public SurfaceTextureHelper i;
    public CameraObserver j;
    public final VideoFrameTransform k;
    public volatile Size l;
    public volatile float m;

    public final class CameraObserver implements CapturerObserver {
        public final CapturerObserver a;

        public CameraObserver(CapturerObserver capturerObserver) {
            this.a = capturerObserver;
        }

        @Override // org.webrtc.CapturerObserver
        public void onCapturerStarted(boolean z) {
            VideoRecord.this.getLog().log(VideoRecord.LOG_TAG, "Capture started (success=" + z + "), notify listener");
            EventListener eventListener = VideoRecord.this.h;
            if (eventListener != null) {
                eventListener.onCaptureStateChanged(z, !z);
            }
        }

        @Override // org.webrtc.CapturerObserver
        public void onCapturerStopped() {
            VideoRecord.this.getLog().log(VideoRecord.LOG_TAG, "Capture stopped, notify listener");
            EventListener eventListener = VideoRecord.this.h;
            if (eventListener != null) {
                eventListener.onCaptureStateChanged(false, false);
            }
        }

        @Override // org.webrtc.CapturerObserver
        public void onFrameCaptured(VideoFrame videoFrame) {
            this.a.onFrameCaptured(videoFrame);
        }
    }

    public interface EventListener {
        void onCaptureStateChanged(boolean z, boolean z2);
    }

    public VideoRecord(PeerConnectionFactory peerConnectionFactory, String str, MediaStream mediaStream, Integer num, boolean z, boolean z2, boolean z3, EventListener eventListener, RTCLog rTCLog) {
        super(str, mediaStream, rTCLog);
        this.f = peerConnectionFactory;
        this.g = z3;
        this.h = eventListener;
        this.k = new VideoFrameTransform(z, z2, num != null ? num.intValue() : 960, new a(this));
        this.l = new Size(DEFAULT_MAX_DIMENSION, 540);
        this.m = 1.0f;
    }

    public final void a() {
        VideoSource source = getSource();
        if (source == null) {
            getLog().log(getLogTag(), "No source while trying to update video format");
            return;
        }
        Size transformToSize = this.k.transformToSize(this.l.width, this.l.height);
        if (transformToSize == null) {
            transformToSize = new Size(DEFAULT_MAX_DIMENSION, 540);
        }
        getLog().log(getLogTag(), efz.a(transformToSize.width, transformToSize.height, "Apply output format adaptation: size= ", "x"));
        source.adaptOutputFormat(transformToSize.width, transformToSize.height, an10.b(this.m * 24.0f));
    }

    @Override // org.webrtc.SurfaceTextureHelper.FrameGeometryAdjuster
    public SurfaceTextureHelper.FrameGeometry adjustFrameGeometry(Matrix matrix, int i, int i2) {
        return this.k.transform(i, i2).apply(matrix, i, i2);
    }

    public final Size getCameraDimensions(Size size) {
        Size transformToSize = this.k.transformToSize(size.width, size.height);
        return transformToSize == null ? size : transformToSize;
    }

    @Override // ru.ok.android.webrtc.mediarecord.MediaRecord
    public String getLogTag() {
        return LOG_TAG;
    }

    public final void onCaptureFormatChanged(int i, int i2) {
        getLog().log(getLogTag(), efz.a(i, i2, "Camera capture dimensions were changed to ", "x"));
        this.l.width = i;
        this.l.height = i2;
        a();
    }

    @Override // ru.ok.android.webrtc.mediarecord.MediaRecord
    public void release() {
        super.release();
        this.j = null;
    }

    public final void restrictMaxDimension(Integer num) {
        getLog().log(getLogTag(), "Set restriction to video frame max dimension: " + num);
        this.k.restrictMaxDimension(num);
        a();
    }

    public final void scaleCameraFrameRate(Float f) {
        this.m = (f == null || f.floatValue() <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || ((double) f.floatValue()) >= 1.0d) ? 1.0f : f.floatValue();
        a();
    }

    public final void scaleCameraFrameSize(Float f) {
        this.k.setScaleRestriction(f);
        a();
    }

    public final void setCapturer(Context context, EglBase.Context context2, VideoCapturer videoCapturer) {
        CapturerObserver capturerObserver;
        VideoSource source = getSource();
        if (source == null || (capturerObserver = source.getCapturerObserver()) == null) {
            throw new IllegalStateException("Can't set capture in absence of video source");
        }
        if (this.i != null) {
            throw new IllegalStateException(c.a("An attempt to create surface texture screencast=", ", while got one", this.g));
        }
        this.i = SurfaceTextureHelper.create(VIDEO_CAPTURER_THREAD_NAME, context2, false, new YuvConverter(), null, this);
        this.j = new CameraObserver(capturerObserver);
        videoCapturer.initialize(this.i, context.getApplicationContext(), this.j);
    }

    public String toString() {
        return c.a("OkSdkVideoRecord(isScreenCast=", ")", this.g);
    }

    @Override // ru.ok.android.webrtc.mediarecord.MediaRecord
    public void afterCreateTrack(MediaStream mediaStream, VideoTrack videoTrack) {
        videoTrack.setContentHint(this.g ? VideoTrack.ContentHint.TEXT : VideoTrack.ContentHint.NONE);
        if (mediaStream != null) {
            mediaStream.addTrack(videoTrack);
        }
    }

    @Override // ru.ok.android.webrtc.mediarecord.MediaRecord
    public void beforeRemoveTrack(MediaStream mediaStream, VideoTrack videoTrack) {
        if (mediaStream != null) {
            mediaStream.removeTrack(videoTrack);
        }
        SurfaceTextureHelper surfaceTextureHelper = this.i;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
        }
        this.i = null;
    }

    @Override // ru.ok.android.webrtc.mediarecord.MediaRecord
    public VideoSource createSource() {
        return this.f.createVideoSource(this.g);
    }

    @Override // ru.ok.android.webrtc.mediarecord.MediaRecord
    public VideoTrack createTrack(String str, VideoSource videoSource) {
        return this.f.createVideoTrack(str, videoSource);
    }
}
