package ru.ok.android.webrtc;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.projection.MediaProjection;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import org.webrtc.AudioTrack;
import org.webrtc.EglBase;
import org.webrtc.MediaStream;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.RtpSender;
import org.webrtc.Size;
import org.webrtc.VideoCapturer;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;
import ru.ok.android.webrtc.CameraCapturerAdapter;
import ru.ok.android.webrtc.LocalMediaStreamSource;
import ru.ok.android.webrtc.camera.CameraPreviewSupport;
import ru.ok.android.webrtc.enumerator.camera.CameraParams;
import ru.ok.android.webrtc.mediarecord.AudioRecord;
import ru.ok.android.webrtc.mediarecord.ScreenShareRecord;
import ru.ok.android.webrtc.mediarecord.VideoRecord;
import ru.ok.android.webrtc.protocol.RtcTransport;
import ru.ok.android.webrtc.protocol.screenshare.send.ScreenshareSender;
import ru.ok.android.webrtc.rotation.RotationProvider;
import ru.ok.android.webrtc.screenshare.ScreenCapturePermissionProvider;
import ru.ok.android.webrtc.stat.camera.CameraStatProvider;
import ru.ok.android.webrtc.stat.screenshare.StatsTrackIdClassifier;
import ru.ok.android.webrtc.utils.MiscHelper;
import ru.ok.android.webrtc.utils.VideoRendererProxy;
import ru.ok.android.webrtc.utils.time.TimeProvider;
import xsna.ca6;
import xsna.i5s;
import xsna.y7;
import xsna.zhy0;
import xsna.zy60;

/* loaded from: classes9.dex */
public final class LocalMediaStreamAdapter implements LocalMediaStreamSource.LocalMediaStream, CameraCapturerAdapter.EventListener {
    public static final String DEFAULT_AUDIO_SHARE_TRACK_SUFFIX = "as0";
    public static final String DEFAULT_SCREEN_CAST_TRACK_SUFFIX = "sc0";
    public final RotationProvider C;
    public final o D;
    public final LocalMediaStreamSource.ScreenCaptureStateListener E;
    public final EglBase.Context a;
    public final OutOfBandScreenshareChecker b;
    public final Context d;
    public final VideoCaptureFactory e;
    public final LocalMediaPermissionProvider f;
    public final Executor g;
    public final MediaStream h;
    public final AudioRecord i;
    public final AudioRecord j;
    public final String k;
    public final String l;
    public final String m;
    public final RTCLog n;
    public final boolean o;
    public VideoRendererProxy p;
    public volatile VideoSink q;
    public volatile CameraCapturerAdapter r;
    public volatile CameraParams s;
    public volatile ScreenCapturerAdapter t;
    public volatile ScreenshareSender u;
    public volatile LocalMediaStreamSource.DataChannelScreenCaptureHolder v;
    public final boolean w;
    public f x;
    public final VideoRecord y;
    public final ScreenShareRecord z;
    public final CopyOnWriteArraySet c = new CopyOnWriteArraySet();
    public final DisplayMetrics A = new DisplayMetrics();
    public final Size B = new Size(0, 0);

    public static final class Builder {
        public PeerConnectionFactory a;
        public VideoCaptureFactory b;
        public boolean bindToMediaStream;
        public Executor c;
        public Context d;
        public String e;
        public String f;
        public String g;
        public RTCLog h;
        public EglBase.Context i;
        public OutOfBandScreenshareChecker j;
        public boolean k;
        public RotationProvider l;
        public TimeProvider m;
        public boolean o;
        public LocalMediaPermissionProvider p;
        public LocalMediaStreamSource.ScreenCaptureStateListener q;
        public boolean n = false;
        public Integer r = null;
        public boolean s = false;
        public boolean t = false;
        public boolean u = false;

        public LocalMediaStreamAdapter build() {
            if (this.a == null) {
                throw new IllegalStateException("peerConnectionFactory is null");
            }
            if (this.p == null) {
                throw new IllegalStateException("mediaPermissionProvider is null");
            }
            if (this.b == null) {
                throw new IllegalStateException("videoCaptureFactory is null");
            }
            if (TextUtils.isEmpty(this.e)) {
                throw new IllegalStateException("mediaStreamId is null or empty");
            }
            if (TextUtils.isEmpty(this.f)) {
                throw new IllegalStateException("videoTrackId is null or empty");
            }
            if (TextUtils.isEmpty(this.g)) {
                throw new IllegalStateException("audioTrackId is null or empty");
            }
            if (this.h == null) {
                throw new IllegalStateException("log is null");
            }
            if (this.j == null) {
                throw new IllegalStateException("screenshareChecker is null");
            }
            if (this.i == null) {
                throw new IllegalStateException("eglContext is null");
            }
            if (this.l == null) {
                throw new IllegalStateException("rotationProvider is null");
            }
            if (this.m == null) {
                throw new IllegalStateException("timeProvider is null");
            }
            if (this.q != null) {
                return new LocalMediaStreamAdapter(this);
            }
            throw new IllegalStateException("screenCaptureStateListener is null");
        }

        public Builder setAudioRecordEnabledOnStart(boolean z) {
            this.u = z;
            return this;
        }

        public Builder setAudioTrackId(@NonNull String str) {
            this.g = str;
            return this;
        }

        public Builder setBindToMediaStream(boolean z) {
            this.bindToMediaStream = z;
            return this;
        }

        public Builder setCamera2ApiEnabled(Boolean bool) {
            this.s = bool.booleanValue();
            return this;
        }

        public Builder setContext(@NonNull Context context) {
            this.d = context.getApplicationContext();
            return this;
        }

        public Builder setDynamicScreenShareSizeUpdateEnabled(boolean z) {
            this.n = z;
            return this;
        }

        public Builder setEglContext(EglBase.Context context) {
            this.i = context;
            return this;
        }

        public Builder setExecutor(@NonNull Executor executor) {
            this.c = executor;
            return this;
        }

        public Builder setFrameMaxDimension(Integer num) {
            this.r = num;
            return this;
        }

        public Builder setMediaPermissionsProvider(LocalMediaPermissionProvider localMediaPermissionProvider) {
            this.p = localMediaPermissionProvider;
            return this;
        }

        public Builder setMediaStreamId(@NonNull String str) {
            this.e = str;
            return this;
        }

        public Builder setPeerConnectionFactory(@NonNull PeerConnectionFactory peerConnectionFactory) {
            this.a = peerConnectionFactory;
            return this;
        }

        public Builder setRotationProvider(RotationProvider rotationProvider) {
            this.l = rotationProvider;
            return this;
        }

        public Builder setRtcLog(@NonNull RTCLog rTCLog) {
            this.h = rTCLog;
            return this;
        }

        public Builder setScreenCaptureStateListener(LocalMediaStreamSource.ScreenCaptureStateListener screenCaptureStateListener) {
            this.q = screenCaptureStateListener;
            return this;
        }

        public Builder setScreenshareChecker(OutOfBandScreenshareChecker outOfBandScreenshareChecker) {
            this.j = outOfBandScreenshareChecker;
            return this;
        }

        public Builder setShowLocalVideoInOriginalQuality(boolean z) {
            this.k = z;
            return this;
        }

        public Builder setStartCameraCapturerOnDemand(boolean z) {
            this.o = z;
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

        public Builder setVideoFrameTransformV2Enabled(boolean z) {
            this.t = z;
            return this;
        }

        public Builder setVideoTrackId(@NonNull String str) {
            this.f = str;
            return this;
        }
    }

    public interface OutOfBandScreenshareChecker {
        boolean isScreenshareHandled();
    }

    public LocalMediaStreamAdapter(Builder builder) {
        this.w = false;
        RTCLog rTCLog = builder.h;
        this.n = rTCLog;
        this.d = builder.d;
        PeerConnectionFactory peerConnectionFactory = builder.a;
        this.e = builder.b;
        this.f = builder.p;
        this.g = builder.c;
        String str = builder.g;
        String str2 = builder.f;
        this.m = builder.e;
        this.o = builder.o;
        this.a = builder.i;
        boolean z = builder.bindToMediaStream;
        this.b = builder.j;
        this.w = builder.k;
        String a = i5s.a(new StringBuilder(), builder.e, DEFAULT_SCREEN_CAST_TRACK_SUFFIX);
        this.k = a;
        String a2 = i5s.a(new StringBuilder(), builder.e, DEFAULT_AUDIO_SHARE_TRACK_SUFFIX);
        this.l = a2;
        MediaStream createLocalMediaStream = peerConnectionFactory.createLocalMediaStream(builder.e);
        this.h = createLocalMediaStream;
        MediaStream createLocalMediaStream2 = peerConnectionFactory.createLocalMediaStream(a);
        this.D = builder.n ? new o(this) : null;
        this.E = builder.q;
        createLocalMediaStream = z ? createLocalMediaStream : null;
        AudioRecord audioRecord = new AudioRecord(peerConnectionFactory, str, createLocalMediaStream, rTCLog);
        this.i = audioRecord;
        audioRecord.init();
        if (builder.u) {
            rTCLog.log("OKRTCLmsAdapter", "Will not disable audio record on start");
        } else {
            audioRecord.setEnabled(false);
        }
        AudioRecord audioRecord2 = new AudioRecord(peerConnectionFactory, a2, createLocalMediaStream, rTCLog);
        this.j = audioRecord2;
        audioRecord2.init();
        audioRecord2.setEnabled(false);
        VideoRecord videoRecord = new VideoRecord(peerConnectionFactory, str2, createLocalMediaStream, builder.r, builder.s, false, builder.t, new p(this), rTCLog);
        this.y = videoRecord;
        videoRecord.init();
        ScreenShareRecord screenShareRecord = new ScreenShareRecord(peerConnectionFactory, a, createLocalMediaStream2, rTCLog, builder.q, builder.l);
        this.z = screenShareRecord;
        screenShareRecord.init();
        this.C = builder.l;
    }

    public final /* synthetic */ boolean a(String str) {
        return Objects.equals(str, this.k) || Objects.equals(str, this.l);
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.LocalMediaStream
    public void addEventListener(LocalMediaStreamSource.EventListener eventListener) {
        this.c.add(eventListener);
    }

    public void apply(MutableMediaSettings mutableMediaSettings) {
        this.n.log("OKRTCLmsAdapter", "apply, isVideoEnabled=" + mutableMediaSettings.isVideoEnabled() + ", isAudioEnabled=" + mutableMediaSettings.isAudioEnabled());
        boolean isVideoEnabled = mutableMediaSettings.isVideoEnabled();
        this.n.log("OKRTCLmsAdapter", zhy0.a("startCameraVideoCapture, start=", isVideoEnabled));
        boolean z = false;
        if (this.e == null) {
            this.n.log("OKRTCLmsAdapter", this + ": has no video capturer factory");
        } else if (isVideoEnabled) {
            if (this.r != null) {
                CameraCapturerAdapter cameraCapturerAdapter = this.r;
                if (cameraCapturerAdapter != null) {
                    cameraCapturerAdapter.start();
                    this.y.setEnabled(true);
                }
            } else {
                a();
                c();
                this.r = this.e.createCameraCapturer(this.s);
                if (this.r == null) {
                    this.n.log("OKRTCLmsAdapter", this + ": can't get camera capturer from factory");
                } else {
                    this.r.addEventListener(this);
                    try {
                        a(this.r.getCapturer());
                        CameraCapturerAdapter cameraCapturerAdapter2 = this.r;
                        if (cameraCapturerAdapter2 != null) {
                            cameraCapturerAdapter2.start();
                            this.y.setEnabled(true);
                        }
                    } catch (RuntimeException e) {
                        this.n.reportException("OKRTCLmsAdapter", "camera.video.track.create", e);
                        this.r.release();
                        this.r = null;
                        c();
                    }
                }
                z = true;
            }
        } else if (this.r != null) {
            if (this.o) {
                this.r.stop();
            } else {
                CameraCapturerAdapter cameraCapturerAdapter3 = this.r;
                if (cameraCapturerAdapter3 != null) {
                    cameraCapturerAdapter3.start();
                    this.y.setEnabled(false);
                }
            }
        }
        if (setAudioTrackEnabled(mutableMediaSettings.isAudioEnabled()) || z) {
            Iterator it = this.c.iterator();
            while (it.hasNext()) {
                ((LocalMediaStreamSource.EventListener) it.next()).onLocalMediaStreamChanged(this);
            }
        }
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.LocalMediaStream
    public void applyDataChannelScreenShare(MutableMediaSettings mutableMediaSettings, ScreenCapturePermissionProvider screenCapturePermissionProvider) {
        o oVar;
        boolean isScreenCaptureEnabled = mutableMediaSettings.isScreenCaptureEnabled();
        boolean isFastScreenCaptureEnabled = mutableMediaSettings.isFastScreenCaptureEnabled();
        ScreenshareSender screenshareSender = this.u;
        if (screenshareSender == null) {
            this.n.log("OKRTCLmsAdapter", "Data channel screen share sender doesn't exist");
            return;
        }
        if (!isScreenCaptureEnabled || isFastScreenCaptureEnabled) {
            if (!isScreenCaptureEnabled && (oVar = this.D) != null) {
                oVar.a = null;
                oVar.b.removeCallbacks(oVar.c);
                oVar.d.n.log("OKRTCLmsAdapter", "Periodical screen dimensions check cancelled");
            }
            screenshareSender.stopSharing();
            return;
        }
        b();
        Size size = this.B;
        DisplayMetrics displayMetrics = this.A;
        int i = displayMetrics.widthPixels;
        size.width = i;
        int i2 = displayMetrics.heightPixels;
        size.height = i2;
        screenshareSender.startSharing(new Size(i, i2), screenCapturePermissionProvider);
        a(screenshareSender);
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.LocalMediaStream
    public void applyFastScreenShare(MutableMediaSettings mutableMediaSettings, ScreenCapturePermissionProvider screenCapturePermissionProvider) {
        OutOfBandScreenshareChecker outOfBandScreenshareChecker;
        boolean isScreenCaptureEnabled = mutableMediaSettings.isScreenCaptureEnabled();
        boolean isFastScreenCaptureEnabled = mutableMediaSettings.isFastScreenCaptureEnabled();
        this.n.log("OKRTCLmsAdapter", zy60.c("startScreenVideoCapture, start=", ", isFast=", isScreenCaptureEnabled, isFastScreenCaptureEnabled));
        if (this.e == null) {
            this.n.log("OKRTCLmsAdapter", this + ": has no video capturer factory");
            return;
        }
        if (isScreenCaptureEnabled && (outOfBandScreenshareChecker = this.b) != null) {
            boolean z = true;
            if (!isFastScreenCaptureEnabled ? !outOfBandScreenshareChecker.isScreenshareHandled() : true) {
                if (this.t != null) {
                    return;
                }
                a();
                Intent permissions = screenCapturePermissionProvider.getPermissions();
                if (permissions == null) {
                    return;
                }
                this.t = this.e.createScreenCapturer(permissions, this.g);
                if (this.t == null) {
                    this.n.log("OKRTCLmsAdapter", this + ": cant get screen capturer from factory");
                } else {
                    try {
                        b(this.t.getCapturer());
                    } catch (RuntimeException e) {
                        this.n.reportException("OKRTCLmsAdapter", "screen.video.track.create", e);
                        z = false;
                    }
                    if (z) {
                        d();
                    } else {
                        o oVar = this.D;
                        if (oVar != null) {
                            oVar.a = null;
                            oVar.b.removeCallbacks(oVar.c);
                            oVar.d.n.log("OKRTCLmsAdapter", "Periodical screen dimensions check cancelled");
                        }
                        this.t.release();
                        this.t = null;
                        this.z.setEnabled(false);
                    }
                }
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    ((LocalMediaStreamSource.EventListener) it.next()).onLocalMediaStreamChanged(this);
                }
                return;
            }
        }
        if (this.t != null) {
            o oVar2 = this.D;
            if (oVar2 != null) {
                oVar2.a = null;
                oVar2.b.removeCallbacks(oVar2.c);
                oVar2.d.n.log("OKRTCLmsAdapter", "Periodical screen dimensions check cancelled");
            }
            this.t.release();
            this.t = null;
            this.z.setEnabled(false);
            Iterator it2 = this.c.iterator();
            while (it2.hasNext()) {
                ((LocalMediaStreamSource.EventListener) it2.next()).onLocalMediaStreamChanged(this);
            }
        }
    }

    public final void b() {
        Display[] displays = ((DisplayManager) this.d.getSystemService("display")).getDisplays();
        if (displays.length > 0) {
            displays[0].getRealMetrics(this.A);
        }
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.LocalMediaStream
    public void bindTracksWith(RtpSender rtpSender, RtpSender rtpSender2) {
        this.n.log("OKRTCLmsAdapter", "bindTracksWith, " + this + ", audio sender=" + MiscHelper.identity2(rtpSender) + " & video sender= " + MiscHelper.identity2(rtpSender2));
        this.i.updateSender(rtpSender);
        if (this.f.isCameraPermissionGranted()) {
            this.y.updateSender(rtpSender2);
        }
    }

    public final void c() {
        VideoRendererProxy videoRendererProxy;
        this.n.log("OKRTCLmsAdapter", "releaseCameraVideoTrack");
        a();
        VideoTrack track = this.y.getTrack();
        if (track != null && (videoRendererProxy = this.p) != null) {
            videoRendererProxy.safelyRemoveSelf(track);
            this.n.log("OKRTCLmsAdapter", this + ": " + MiscHelper.identity2(this.p) + " was removed from " + MiscHelper.identity2(track));
        }
        this.p = null;
        this.y.release();
    }

    public final void d() {
        b();
        Size size = this.B;
        DisplayMetrics displayMetrics = this.A;
        int i = displayMetrics.widthPixels;
        size.width = i;
        int i2 = displayMetrics.heightPixels;
        size.height = i2;
        Point calculateScreenSharingDimensions = MiscHelper.calculateScreenSharingDimensions(i, i2);
        this.t.changeFormat(calculateScreenSharingDimensions.x, calculateScreenSharingDimensions.y, 30);
        this.t.start();
        this.z.setEnabled(true);
        a(new ca6(this, 23));
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.LocalMediaStream
    public AudioTrack getAudioShareTrack() {
        return this.j.getTrack();
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.LocalMediaStream
    public AudioTrack getAudioTrack() {
        AudioRecord audioRecord = this.i;
        if (audioRecord != null) {
            return audioRecord.getTrack();
        }
        return null;
    }

    public VideoCapturer getCameraCapturer() {
        CameraCapturerAdapter cameraCapturerAdapter = this.r;
        if (cameraCapturerAdapter != null) {
            return cameraCapturerAdapter.getCapturer();
        }
        return null;
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.LocalMediaStream
    public VideoRecord getCameraRecord() {
        return this.y;
    }

    public CameraStatProvider getCameraStatProvider() {
        CameraCapturerAdapter cameraCapturerAdapter = this.r;
        if (cameraCapturerAdapter != null) {
            return cameraCapturerAdapter.getCameraStatProvider();
        }
        return null;
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.LocalMediaStream
    public VideoTrack getCameraTrack() {
        return this.y.getTrack();
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.LocalMediaStream
    public Size getCameraVideoSize() {
        CameraCapturerAdapter cameraCapturerAdapter = this.r;
        if (cameraCapturerAdapter == null) {
            return new Size(0, 0);
        }
        return this.y.getCameraDimensions(new Size(cameraCapturerAdapter.getWidth(), cameraCapturerAdapter.getHeight()));
    }

    public MediaProjection getScreenShareMediaProjection(boolean z) {
        if (z) {
            ScreenCapturerAdapter screenCapturerAdapter = this.t;
            if (screenCapturerAdapter != null) {
                return screenCapturerAdapter.getMediaProjection();
            }
            return null;
        }
        ScreenshareSender screenshareSender = this.u;
        if (screenshareSender == null) {
            return null;
        }
        return screenshareSender.getMediaProjection();
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.LocalMediaStream
    public ScreenShareRecord getScreenShareRecord() {
        return this.z;
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.LocalMediaStream
    public VideoTrack getScreenShareTrack() {
        return this.z.getTrack();
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.LocalMediaStream
    public int getScreenShareVideoHeight() {
        ScreenCapturerAdapter screenCapturerAdapter = this.t;
        if (screenCapturerAdapter != null) {
            return screenCapturerAdapter.getHeight();
        }
        return 0;
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.LocalMediaStream
    public int getScreenShareVideoWidth() {
        ScreenCapturerAdapter screenCapturerAdapter = this.t;
        if (screenCapturerAdapter != null) {
            return screenCapturerAdapter.getWidth();
        }
        return 0;
    }

    public StatsTrackIdClassifier getStatsTrackIdClassifier() {
        return new y7(this, 28);
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.LocalMediaStream
    public String getStreamId() {
        return this.m;
    }

    public int getVideoCaptureState() {
        CameraCapturerAdapter cameraCapturerAdapter = this.r;
        if (cameraCapturerAdapter != null && cameraCapturerAdapter.isStarted() && this.y.getEnabled()) {
            return cameraCapturerAdapter.isFrontCamera() ? 1 : 2;
        }
        ScreenCapturerAdapter screenCapturerAdapter = this.t;
        return (screenCapturerAdapter != null && screenCapturerAdapter.isStarted() && this.z.getEnabled()) ? 3 : 0;
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.LocalMediaStream
    public void initDataChannelScreenShareSender(LocalMediaStreamSource.DataChannelScreenCaptureHolder dataChannelScreenCaptureHolder, RtcTransport rtcTransport) {
        if (dataChannelScreenCaptureHolder == null) {
            return;
        }
        LocalMediaStreamSource.DataChannelScreenCaptureHolder dataChannelScreenCaptureHolder2 = this.v;
        if (dataChannelScreenCaptureHolder2 != null) {
            dataChannelScreenCaptureHolder2.onDataChannelScreenCapturerUnbound();
        }
        this.v = dataChannelScreenCaptureHolder;
        dataChannelScreenCaptureHolder.onDataChannelScreenCapturerBound();
        ScreenshareSender screenshareSender = this.u;
        if (screenshareSender == null) {
            ScreenshareSender screenshareSender2 = new ScreenshareSender(this.a, this.d.getApplicationContext(), this.n, this.E, this.C);
            this.u = screenshareSender2;
            screenshareSender = screenshareSender2;
        }
        screenshareSender.setTransport(rtcTransport);
    }

    @Override // ru.ok.android.webrtc.CameraCapturerAdapter.EventListener
    public void onCameraCapturerSwitchDone(CameraCapturerAdapter cameraCapturerAdapter, boolean z) {
        this.n.log("OKRTCLmsAdapter", zhy0.a("onCameraCapturerSwitchDone, switched ? ", z));
        if (z) {
            f fVar = this.x;
            if (fVar != null) {
                fVar.a.b(CallEvents.CAMERA_CHANGED, Boolean.TRUE);
            }
            if (cameraCapturerAdapter != this.r) {
                IllegalStateException illegalStateException = new IllegalStateException("Wrong camera capturer on camera switch done");
                if (this.r == null) {
                    this.n.logException("OKRTCLmsAdapter", "No camera capturer when switch done", illegalStateException);
                } else {
                    this.n.reportException("OKRTCLmsAdapter", "camera.switch.check", illegalStateException);
                }
            }
        }
    }

    @Override // ru.ok.android.webrtc.CameraCapturerAdapter.EventListener
    public void onCaptureFormatChanged(CameraCapturerAdapter cameraCapturerAdapter, int i, int i2) {
        if (cameraCapturerAdapter != this.r) {
            this.n.reportException("OKRTCLmsAdapter", "camera.format.change", new RuntimeException("Wrong camera capturer"));
        }
        this.y.onCaptureFormatChanged(i, i2);
    }

    public void release() {
        this.n.log("OKRTCLmsAdapter", "release");
        o oVar = this.D;
        if (oVar != null) {
            oVar.a = null;
            oVar.b.removeCallbacks(oVar.c);
            oVar.d.n.log("OKRTCLmsAdapter", "Periodical screen dimensions check cancelled");
        }
        this.c.clear();
        this.q = null;
        a();
        if (this.r != null) {
            this.r.release();
            this.r = null;
        }
        if (this.t != null) {
            this.t.release();
            this.t = null;
        }
        if (this.u != null) {
            this.u.release();
            this.u = null;
        }
        this.n.log("OKRTCLmsAdapter", "releaseScreenCastVideoTrack");
        this.z.release();
        c();
        this.i.release();
        this.h.dispose();
        this.n.log("OKRTCLmsAdapter", this + ": " + MiscHelper.identity2(this.h) + " was disposed");
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.LocalMediaStream
    public void releaseDataChannelScreenShareSender(LocalMediaStreamSource.DataChannelScreenCaptureHolder dataChannelScreenCaptureHolder) {
        if (this.v != dataChannelScreenCaptureHolder) {
            return;
        }
        this.v = null;
        ScreenshareSender screenshareSender = this.u;
        if (screenshareSender != null) {
            screenshareSender.setTransport(null);
        }
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.LocalMediaStream
    public void removeEventListener(LocalMediaStreamSource.EventListener eventListener) {
        this.c.remove(eventListener);
    }

    public boolean setAudioShareTrackEnabled(boolean z) {
        if (this.j.getEnabled() == z) {
            return false;
        }
        this.n.log("OKRTCLmsAdapter", zhy0.a("setAudioShareTrackEnabled, enabled=", z));
        this.j.setEnabled(z);
        return true;
    }

    public boolean setAudioTrackEnabled(boolean z) {
        if (this.i.getEnabled() == z) {
            return false;
        }
        this.n.log("OKRTCLmsAdapter", zhy0.a("setAudioTrackEnabled, enabled=", z));
        this.i.setEnabled(z);
        return true;
    }

    public void setVideoRenderer(VideoSink videoSink) {
        this.n.log("OKRTCLmsAdapter", "setVideoRenderer, " + MiscHelper.identity2(videoSink));
        this.q = videoSink;
        if (this.w) {
            VideoCapturer cameraCapturer = getCameraCapturer();
            if (cameraCapturer instanceof CameraPreviewSupport) {
                ((CameraPreviewSupport) cameraCapturer).setPreviewRenderer(videoSink);
            } else if (cameraCapturer != null) {
                throw new IllegalArgumentException("Video capturer is expected to be an implementation of ".concat(CameraPreviewSupport.class.getName()));
            }
        }
        VideoRendererProxy videoRendererProxy = this.p;
        if (videoRendererProxy != null) {
            videoRendererProxy.setDelegate(videoSink);
        }
    }

    public void switchCamera(@Nullable CameraParams cameraParams) {
        this.n.log("OKRTCLmsAdapter", "switchCamera, " + this);
        if (this.r != null) {
            this.r.switchCamera(cameraParams);
            return;
        }
        if (cameraParams != null) {
            this.n.log("OKRTCLmsAdapter", "Got cameraParams while no capturer created yet. Remember for future use");
            this.s = cameraParams;
            return;
        }
        this.n.log("OKRTCLmsAdapter", this + ": has no camera capturer");
    }

    public String toString() {
        return MiscHelper.identity2(this);
    }

    public final void a() {
        VideoRendererProxy videoRendererProxy = this.p;
        if (videoRendererProxy != null) {
            videoRendererProxy.setDelegate(null);
            this.n.log("OKRTCLmsAdapter", this + ": " + MiscHelper.identity2(this.p) + " was cleared");
        }
    }

    public final void b(VideoCapturer videoCapturer) {
        this.n.log("OKRTCLmsAdapter", "createVideoTrackForScreenCapture for " + MiscHelper.identity2(videoCapturer));
        if (videoCapturer != null) {
            this.z.init();
            this.z.setCapturer(this.d.getApplicationContext(), this.a, videoCapturer);
            return;
        }
        throw new IllegalArgumentException("videoCapturer must not be null");
    }

    public final void a(VideoCapturer videoCapturer) {
        this.n.log("OKRTCLmsAdapter", "createVideoTrackForCamera for " + MiscHelper.identity2(videoCapturer));
        if (videoCapturer != null) {
            this.y.init();
            this.y.setCapturer(this.d, this.a, videoCapturer);
            if (this.w) {
                if (videoCapturer instanceof CameraPreviewSupport) {
                    ((CameraPreviewSupport) videoCapturer).setPreviewRenderer(this.q);
                    return;
                }
                throw new IllegalArgumentException("Video capturer is expected to be an implementation of ".concat(CameraPreviewSupport.class.getName()));
            }
            VideoTrack track = this.y.getTrack();
            if (track != null) {
                if (this.p == null) {
                    VideoRendererProxy videoRendererProxy = new VideoRendererProxy();
                    this.p = videoRendererProxy;
                    videoRendererProxy.setDelegate(this.q);
                }
                track.addSink(this.p);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Video capturer is expected to be not null");
    }

    public interface OnCameraStreamListener {
        default void onCameraStreamChanged(boolean z) {
            if (z) {
                onCameraStreamStarted();
            }
        }

        @Deprecated
        default void onCameraStreamStarted() {
        }
    }

    @Override // ru.ok.android.webrtc.CameraCapturerAdapter.EventListener
    public void onCameraCapturerStreamStarted() {
    }

    public final /* synthetic */ void a(int i, int i2) {
        ScreenCapturerAdapter screenCapturerAdapter = this.t;
        if (screenCapturerAdapter != null) {
            Point calculateScreenSharingDimensions = MiscHelper.calculateScreenSharingDimensions(i, i2);
            screenCapturerAdapter.changeFormat(calculateScreenSharingDimensions.x, calculateScreenSharingDimensions.y, 30);
        }
    }

    public final void a(LocalMediaStreamSource.OnScreenSizeChangedListener onScreenSizeChangedListener) {
        o oVar = this.D;
        if (oVar == null || onScreenSizeChangedListener == null) {
            return;
        }
        oVar.a = onScreenSizeChangedListener;
        oVar.b.removeCallbacks(oVar.c);
        oVar.d.n.log("OKRTCLmsAdapter", "Schedule check screen dimensions in 1500ms");
        oVar.b.postDelayed(oVar.c, 1500L);
    }
}
