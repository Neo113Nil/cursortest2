package ru.ok.android.webrtc.mediarecord;

import android.content.Context;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoSource;
import org.webrtc.VideoTrack;
import ru.ok.android.webrtc.LocalMediaStreamSource;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.rotation.RotationProvider;
import xsna.cgn;
import xsna.odj;

/* loaded from: classes9.dex */
public final class ScreenShareRecord extends MediaRecord<VideoTrack, VideoSource> implements BaseVideoRecord {

    @Deprecated
    public static final String Screen_CAPTURER_THREAD_NAME = "ScreenCapturerThread";
    public final PeerConnectionFactory f;
    public SurfaceTextureHelper g;
    public final RtpScreenCapturerObserver h;

    public ScreenShareRecord(PeerConnectionFactory peerConnectionFactory, String str, MediaStream mediaStream, RTCLog rTCLog, LocalMediaStreamSource.ScreenCaptureStateListener screenCaptureStateListener, RotationProvider rotationProvider) {
        super(str, mediaStream, rTCLog);
        this.f = peerConnectionFactory;
        this.h = new RtpScreenCapturerObserver(rotationProvider, screenCaptureStateListener);
    }

    public final void setCapturer(Context context, EglBase.Context context2, VideoCapturer videoCapturer) {
        CapturerObserver capturerObserver;
        RtpScreenCapturerObserver rtpScreenCapturerObserver = this.h;
        VideoSource source = getSource();
        if (source == null || (capturerObserver = source.getCapturerObserver()) == null) {
            throw new IllegalStateException("Can't set capture in absence of video source");
        }
        rtpScreenCapturerObserver.setCapturerObserver(capturerObserver);
        SurfaceTextureHelper surfaceTextureHelper = this.g;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
        }
        SurfaceTextureHelper create = SurfaceTextureHelper.create(Screen_CAPTURER_THREAD_NAME, context2);
        this.g = create;
        videoCapturer.initialize(create, context.getApplicationContext(), this.h);
    }

    public final void setVideoMaxDimension(int i, int i2, int i3) {
        int i4;
        VideoDimension calculateDimension = calculateDimension(i, i2, i3);
        if (calculateDimension == null) {
            return;
        }
        VideoSource source = getSource();
        if (source != null) {
            i4 = i3;
            source.adaptOutputFormat(calculateDimension.getLandscapeWidth(), calculateDimension.getLandscapeHeight(), calculateDimension.getPortraitWidth(), calculateDimension.getPortraitHeight(), i4);
        } else {
            i4 = i3;
        }
        RTCLog log = getLog();
        String logTag = getLogTag();
        StringBuilder a = odj.a(calculateDimension.getLandscapeWidth(), calculateDimension.getLandscapeHeight(), "Set screenshare dimensions to ", " x ", " by requested ");
        cgn.a(i, i2, " x ", " fps ", a);
        a.append(i4);
        log.log(logTag, a.toString());
    }

    public String toString() {
        return "OkSdkScreenShareRecord";
    }

    @Override // ru.ok.android.webrtc.mediarecord.MediaRecord
    public void afterCreateTrack(MediaStream mediaStream, VideoTrack videoTrack) {
        if (mediaStream != null) {
            mediaStream.addTrack(videoTrack);
        }
    }

    @Override // ru.ok.android.webrtc.mediarecord.MediaRecord
    public void beforeRemoveTrack(MediaStream mediaStream, VideoTrack videoTrack) {
        if (mediaStream != null) {
            mediaStream.removeTrack(videoTrack);
        }
        SurfaceTextureHelper surfaceTextureHelper = this.g;
        if (surfaceTextureHelper != null) {
            surfaceTextureHelper.dispose();
        }
        this.g = null;
    }

    @Override // ru.ok.android.webrtc.mediarecord.MediaRecord
    public VideoSource createSource() {
        return this.f.createVideoSource(false);
    }

    @Override // ru.ok.android.webrtc.mediarecord.MediaRecord
    public VideoTrack createTrack(String str, VideoSource videoSource) {
        return this.f.createVideoTrack(str, videoSource);
    }
}
