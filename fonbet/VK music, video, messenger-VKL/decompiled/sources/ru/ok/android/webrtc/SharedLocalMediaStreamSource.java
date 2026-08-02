package ru.ok.android.webrtc;

import android.content.Context;
import android.media.projection.MediaProjection;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import org.webrtc.EglBase;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoSink;
import ru.ok.android.annotation.CallInternalApi;
import ru.ok.android.webrtc.LocalMediaStreamAdapter;
import ru.ok.android.webrtc.LocalMediaStreamSource;
import ru.ok.android.webrtc.MutableMediaSettings;
import ru.ok.android.webrtc.enumerator.camera.CameraParams;
import ru.ok.android.webrtc.rotation.RotationProvider;
import ru.ok.android.webrtc.stat.camera.CameraStatProvider;
import ru.ok.android.webrtc.stat.screenshare.StatsTrackIdClassifier;
import ru.ok.android.webrtc.utils.MiscHelper;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.l96;
import xsna.qc9;
import xsna.w63;

@CallInternalApi
/* loaded from: classes9.dex */
public final class SharedLocalMediaStreamSource implements LocalMediaStreamSource, LocalMediaStreamSource.EventListener, MutableMediaSettings.EventListener {
    public final EglBase.Context a;
    public final LocalMediaStreamAdapter.OutOfBandScreenshareChecker b;
    public final SharedPeerConnectionFactory c;
    public final VideoCaptureFactory d;
    public final MutableMediaSettings e;
    public final Context f;
    public final String g;
    public final String h;
    public final String i;
    public final Integer j;
    public final RTCLog k;
    public final boolean l;
    public final CallParams m;
    public volatile LocalMediaStreamAdapter o;
    public volatile VideoSink p;
    public final LocalMediaPermissionProvider q;
    public final RotationProvider r;
    public final TimeProvider s;
    public final StatsTrackIdClassifierConsumer t;
    public final LocalMediaStreamSource.ScreenCaptureStateListener u;
    public f x;
    public final CopyOnWriteArraySet n = new CopyOnWriteArraySet();
    public CameraParams v = null;
    public volatile boolean w = false;

    public static final class Builder {
        public SharedPeerConnectionFactory a;
        public VideoCaptureFactory b;
        public MutableMediaSettings c;
        public Context d;
        public RTCLog e;
        public CallParams f;
        public LocalMediaStreamAdapter.OutOfBandScreenshareChecker g;
        public LocalMediaStreamSource.ScreenCaptureStateListener h;
        public Integer i;
        public boolean j;
        public EglBase.Context k;
        public LocalMediaPermissionProvider l;
        public TimeProvider m;
        public RotationProvider n;
        public StatsTrackIdClassifierConsumer o;

        public SharedLocalMediaStreamSource build() {
            if (this.a == null) {
                throw new IllegalStateException("sharedPeerConnectionFactory is null");
            }
            if (this.b == null) {
                throw new IllegalStateException("videoCaptureFactory is null");
            }
            if (this.l == null) {
                throw new IllegalStateException("mediaPermissionProvider is null");
            }
            if (this.d == null) {
                throw new IllegalStateException("context is null");
            }
            if (this.c == null) {
                throw new IllegalStateException("mediaSettings is null");
            }
            if (this.e == null) {
                throw new IllegalStateException("log is null");
            }
            if (this.f == null) {
                throw new IllegalStateException("params is null");
            }
            if (this.g == null) {
                throw new IllegalStateException("screenshareChecker is null");
            }
            if (this.n == null) {
                throw new IllegalStateException("rotationProvider is null");
            }
            if (this.h != null) {
                return new SharedLocalMediaStreamSource(this);
            }
            throw new IllegalStateException("screenCaptureStateListener is null");
        }

        public Builder setContext(@NonNull Context context) {
            this.d = context;
            return this;
        }

        public Builder setEglContext(EglBase.Context context) {
            this.k = context;
            return this;
        }

        public Builder setMaxCameraFrameDimension(Integer num) {
            this.i = num;
            return this;
        }

        public Builder setMediaPermissionsProvider(LocalMediaPermissionProvider localMediaPermissionProvider) {
            this.l = localMediaPermissionProvider;
            return this;
        }

        public Builder setMediaSettings(@NonNull MutableMediaSettings mutableMediaSettings) {
            this.c = mutableMediaSettings;
            return this;
        }

        public Builder setParams(CallParams callParams) {
            this.f = callParams;
            return this;
        }

        public Builder setRotationProvider(RotationProvider rotationProvider) {
            this.n = rotationProvider;
            return this;
        }

        public Builder setRtcLog(@NonNull RTCLog rTCLog) {
            this.e = rTCLog;
            return this;
        }

        public Builder setScreenCaptureStateListener(LocalMediaStreamSource.ScreenCaptureStateListener screenCaptureStateListener) {
            this.h = screenCaptureStateListener;
            return this;
        }

        public Builder setScreenshareChecker(LocalMediaStreamAdapter.OutOfBandScreenshareChecker outOfBandScreenshareChecker) {
            this.g = outOfBandScreenshareChecker;
            return this;
        }

        public Builder setSharedPeerConnectionFactory(@NonNull SharedPeerConnectionFactory sharedPeerConnectionFactory) {
            this.a = sharedPeerConnectionFactory;
            return this;
        }

        public Builder setStartCameraCapturerOnDemand(boolean z) {
            this.j = z;
            return this;
        }

        public Builder setStatsTrackIdClassifierConsumer(StatsTrackIdClassifierConsumer statsTrackIdClassifierConsumer) {
            this.o = statsTrackIdClassifierConsumer;
            return this;
        }

        public Builder setTimeProvider(TimeProvider timeProvider) {
            this.m = timeProvider;
            return this;
        }

        public Builder setVideoCaptureFactory(VideoCaptureFactory videoCaptureFactory) {
            this.b = videoCaptureFactory;
            return this;
        }
    }

    public interface StatsTrackIdClassifierConsumer {
        void accept(StatsTrackIdClassifier statsTrackIdClassifier);
    }

    public SharedLocalMediaStreamSource(Builder builder) {
        RTCLog rTCLog = builder.e;
        this.k = rTCLog;
        this.c = builder.a;
        this.d = builder.b;
        this.j = builder.i;
        this.f = builder.d;
        this.e = builder.c;
        this.a = builder.k;
        this.l = builder.j;
        this.m = builder.f;
        this.b = builder.g;
        this.q = builder.l;
        this.r = builder.n;
        this.h = "ARDAMSv0";
        this.i = "ARDAMSa0";
        this.g = "ARDAMS";
        rTCLog.log("SlmsSource", "local media stream id = ARDAMS local video track id = ARDAMSv0 local audio track id = ARDAMSa0");
        this.s = builder.m;
        this.t = builder.o;
        this.u = builder.h;
    }

    public final /* synthetic */ void a(MutableMediaSettings mutableMediaSettings) {
        w a = a();
        if (a == null || a.b) {
            return;
        }
        a.a.apply(mutableMediaSettings);
    }

    public void addEventListener(LocalMediaStreamSource.EventListener eventListener) {
        this.n.add(eventListener);
    }

    public final void b() {
        this.k.log("SlmsSource", "releaseInternal");
        if (this.o != null) {
            this.o.release();
            this.k.log("SlmsSource", MiscHelper.identity2(this.o) + " was released");
            this.o = null;
        }
    }

    public VideoCapturer getCameraCapturer() {
        LocalMediaStreamAdapter localMediaStreamAdapter = this.o;
        if (localMediaStreamAdapter != null) {
            return localMediaStreamAdapter.getCameraCapturer();
        }
        return null;
    }

    public CameraStatProvider getCameraStatProvider() {
        LocalMediaStreamAdapter localMediaStreamAdapter = this.o;
        if (localMediaStreamAdapter != null) {
            return localMediaStreamAdapter.getCameraStatProvider();
        }
        return null;
    }

    public MediaProjection getScreenShareMediaProjection(boolean z) {
        LocalMediaStreamAdapter localMediaStreamAdapter = this.o;
        if (localMediaStreamAdapter != null) {
            return localMediaStreamAdapter.getScreenShareMediaProjection(z);
        }
        return null;
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource
    public int getVideoCaptureState() {
        LocalMediaStreamAdapter localMediaStreamAdapter = this.o;
        if (localMediaStreamAdapter != null) {
            return localMediaStreamAdapter.getVideoCaptureState();
        }
        return 0;
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.EventListener
    public void onLocalMediaStreamChanged(@NonNull LocalMediaStreamSource.LocalMediaStream localMediaStream) {
        this.k.log("SlmsSource", "onLocalMediaStreamChanged");
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((LocalMediaStreamSource.EventListener) it.next()).onLocalMediaStreamChanged(localMediaStream);
        }
    }

    @Override // ru.ok.android.webrtc.MutableMediaSettings.EventListener
    public void onMediaSettingsChanged(@NonNull MutableMediaSettings mutableMediaSettings) {
        this.k.log("SlmsSource", "onMediaSettingsChanged, " + mutableMediaSettings);
        this.c.getExecutor().execute(new l96(2, this, mutableMediaSettings));
    }

    public void release() {
        this.k.log("SlmsSource", "release");
        this.w = true;
        this.n.clear();
        this.e.removeEventListener(this);
        this.c.getExecutor().execute(new qc9(this, 4));
    }

    public void removeEventListener(LocalMediaStreamSource.EventListener eventListener) {
        this.n.remove(eventListener);
    }

    public void setScreenShareAudioRecordEnabled(boolean z) {
        LocalMediaStreamAdapter localMediaStreamAdapter = this.o;
        if (localMediaStreamAdapter != null) {
            localMediaStreamAdapter.setAudioShareTrackEnabled(z);
        }
    }

    public void setVideoRenderer(VideoSink videoSink) {
        this.p = videoSink;
        LocalMediaStreamAdapter localMediaStreamAdapter = this.o;
        if (localMediaStreamAdapter != null) {
            localMediaStreamAdapter.setVideoRenderer(videoSink);
        }
    }

    public void start() {
        this.e.addEventListener(this);
        onMediaSettingsChanged(this.e);
    }

    public void switchCamera(@Nullable CameraParams cameraParams) {
        this.k.log("SlmsSource", "switchCamera");
        this.c.getExecutor().execute(new w63(8, this, cameraParams));
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource
    @Nullable
    public LocalMediaStreamAdapter getMediaStream() {
        w a = a();
        if (a != null) {
            return a.a;
        }
        return null;
    }

    public final /* synthetic */ void a(CameraParams cameraParams) {
        if (this.o != null) {
            this.o.switchCamera(cameraParams);
        } else {
            this.v = cameraParams;
        }
    }

    public final w a() {
        PeerConnectionFactory factory = this.c.getFactory();
        if (factory == null) {
            this.k.reportException("SlmsSource", "PeerConnectionFactory is null in getOrCreateMediaStream, isReleased=" + this.w, new IllegalStateException("PeerConnectionFactory is null"));
            return null;
        }
        boolean z = this.o == null;
        if (z) {
            this.o = new LocalMediaStreamAdapter.Builder().setPeerConnectionFactory(factory).setExecutor(this.c.getExecutor()).setVideoCaptureFactory(this.d).setMediaStreamId(this.g).setVideoTrackId(this.h).setAudioTrackId(this.i).setContext(this.f).setRtcLog(this.k).setEglContext(this.a).setBindToMediaStream(true).setScreenshareChecker(this.b).setStartCameraCapturerOnDemand(this.l).setShowLocalVideoInOriginalQuality(this.m.getShowLocalVideoInOriginalQuality()).setMediaPermissionsProvider(this.q).setRotationProvider(this.r).setFrameMaxDimension(this.j).setCamera2ApiEnabled(Boolean.valueOf(this.m.getExperiments().M())).setDynamicScreenShareSizeUpdateEnabled(this.m.getExperiments().z()).setTimeProvider(this.s).setScreenCaptureStateListener(this.u).setAudioRecordEnabledOnStart(this.m.getExperiments().l()).setVideoFrameTransformV2Enabled(this.m.getExperiments().G()).build();
            this.o.x = this.x;
            this.o.addEventListener(this);
            if (this.v != null) {
                this.o.switchCamera(this.v);
            }
            VideoSink videoSink = this.p;
            if (videoSink != null) {
                this.o.setVideoRenderer(videoSink);
            }
            this.o.apply(this.e);
            StatsTrackIdClassifierConsumer statsTrackIdClassifierConsumer = this.t;
            if (statsTrackIdClassifierConsumer != null) {
                statsTrackIdClassifierConsumer.accept(this.o.getStatsTrackIdClassifier());
            }
        }
        return new w(this.o, z);
    }
}
