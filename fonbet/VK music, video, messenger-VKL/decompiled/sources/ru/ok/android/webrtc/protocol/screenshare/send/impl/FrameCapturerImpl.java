package ru.ok.android.webrtc.protocol.screenshare.send.impl;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import androidx.annotation.NonNull;
import org.webrtc.CapturerObserver;
import org.webrtc.EglBase;
import org.webrtc.ScreenCapturerAndroid;
import org.webrtc.Size;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import ru.ok.android.webrtc.LocalMediaStreamSource;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.protocol.screenshare.send.ControlThread;
import ru.ok.android.webrtc.protocol.screenshare.send.FrameCapturer;
import ru.ok.android.webrtc.protocol.screenshare.send.impl.FrameCapturerImpl;
import ru.ok.android.webrtc.utils.TimedEvent;
import xsna.sj1;
import xsna.tgw;
import xsna.ues;
import xsna.x52;

/* loaded from: classes9.dex */
public class FrameCapturerImpl extends MediaProjection.Callback implements FrameCapturer, CapturerObserver, LocalMediaStreamSource.OnScreenSizeChangedListener {
    public final EglBase.Context a;
    public final Context b;
    public final RTCLog c;
    public volatile SurfaceTextureHelper e;
    public volatile ScreenCapturerAndroid f;
    public VideoSink g;
    public boolean i;
    public boolean j;
    public final LocalMediaStreamSource.ScreenCaptureStateListener k;
    public final ControlThread d = new ControlThread("SSFrameCapturer");
    public final TimedEvent h = new TimedEvent(0.3d);

    public FrameCapturerImpl(EglBase.Context context, Context context2, LocalMediaStreamSource.ScreenCaptureStateListener screenCaptureStateListener, @NonNull RTCLog rTCLog) {
        this.a = context;
        this.b = context2;
        this.c = rTCLog;
        this.k = screenCaptureStateListener;
    }

    public final /* synthetic */ void a(Intent intent, Size size) {
        if (this.e == null) {
            this.e = SurfaceTextureHelper.create("SSFCTextureHelper", this.a);
        }
        this.f = new ScreenCapturerAndroid(intent, this);
        this.f.initialize(this.e, this.b, this);
        this.i = true;
        a(size, 1);
    }

    public final /* synthetic */ void b(Size size, int i) {
        a(size, i + 1);
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameCapturer
    public double fps() {
        return this.h.perSecond();
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameCapturer
    public MediaProjection getMediaProjection() {
        return this.f.getMediaProjection();
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z) {
        LocalMediaStreamSource.ScreenCaptureStateListener screenCaptureStateListener;
        this.c.log("FrameCapturerImpl", "Screen capture did start success=" + z);
        if (!z || (screenCaptureStateListener = this.k) == null) {
            return;
        }
        screenCaptureStateListener.onScreenCaptureStarted(false);
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        this.c.log("FrameCapturerImpl", "Screen capture did stop");
        LocalMediaStreamSource.ScreenCaptureStateListener screenCaptureStateListener = this.k;
        if (screenCaptureStateListener != null) {
            screenCaptureStateListener.onScreenCaptureStopped(false);
        }
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        this.h.fire();
        VideoSink videoSink = this.g;
        if (videoSink != null) {
            videoSink.onFrame(videoFrame);
        }
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.OnScreenSizeChangedListener
    public void onScreenSizeChanged(final int i, final int i2) {
        this.d.run(new Runnable() { // from class: xsna.tes
            @Override // java.lang.Runnable
            public final void run() {
                FrameCapturerImpl.this.a(i, i2);
            }
        });
    }

    @Override // android.media.projection.MediaProjection.Callback
    public void onStop() {
        stopCapturing();
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameCapturer
    public void release() {
        this.g = null;
        this.d.close(new x52(this, 4));
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameCapturer
    public void setFrameConsumer(VideoSink videoSink) {
        this.g = videoSink;
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameCapturer
    public void startCapturing(Size size, Intent intent) {
        this.d.run(new ues(this, intent, size, 0));
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameCapturer
    public void stopCapturing() {
        this.d.run(new sj1(this, 6));
    }

    @Override // ru.ok.android.webrtc.protocol.screenshare.send.FrameCapturer
    public void waitUntilReleased() {
        this.d.awaitClose();
    }

    public final /* synthetic */ void b() {
        this.i = false;
        if (this.f != null) {
            this.f.stopCapture();
        }
        this.j = false;
    }

    public final /* synthetic */ void a(int i, int i2) {
        if (this.i && this.j && this.f != null) {
            try {
                this.f.changeCaptureFormat(i, i2, 0);
            } catch (Throwable th) {
                this.c.reportException("FrameCapturerImpl", "", new ScreenShareException("Error change capture format", th));
            }
        }
    }

    public final void a(final Size size, final int i) {
        if (!this.i || this.j) {
            return;
        }
        try {
            this.f.startCapture(size.width, size.height, 0);
            this.j = true;
        } catch (SecurityException e) {
            this.c.logException("FrameCapturerImpl", "Error starting screen capture", e);
            if (i > 10) {
                this.c.reportException("FrameCapturerImpl", tgw.b(i, "Error: ", "times of restart screen capture did fail"), e);
                stopCapturing();
            } else {
                this.d.run(new Runnable() { // from class: xsna.ses
                    @Override // java.lang.Runnable
                    public final void run() {
                        FrameCapturerImpl.this.b(size, i);
                    }
                }, 400L);
            }
        } catch (RuntimeException e2) {
            this.c.reportException("FrameCapturerImpl", "Error starting screen capture", e2);
            stopCapturing();
        }
    }

    public final /* synthetic */ void a() {
        this.i = false;
        if (this.f != null) {
            this.f.stopCapture();
        }
        this.f = null;
        this.j = false;
        if (this.e != null) {
            this.e.dispose();
        }
        this.e = null;
    }
}
