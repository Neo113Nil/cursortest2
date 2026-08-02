package ru.ok.android.webrtc.protocol.screenshare.send;

import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;
import com.vk.movika.sdk.android.defaultplayer.view.a;
import org.webrtc.EglBase;
import org.webrtc.Size;
import ru.ok.android.webrtc.LocalMediaStreamSource;
import ru.ok.android.webrtc.RTCLog;
import ru.ok.android.webrtc.protocol.RtcTransport;
import ru.ok.android.webrtc.protocol.screenshare.send.ScreenshareSender;
import ru.ok.android.webrtc.protocol.screenshare.send.impl.FrameCapturerImpl;
import ru.ok.android.webrtc.protocol.screenshare.send.impl.FrameEncoderImpl;
import ru.ok.android.webrtc.protocol.screenshare.send.impl.FrameSenderImpl;
import ru.ok.android.webrtc.rotation.RotationProvider;
import ru.ok.android.webrtc.screenshare.ScreenCapturePermissionProvider;
import xsna.fs2;
import xsna.gq4;
import xsna.hod;
import xsna.ic3;
import xsna.lby;

/* loaded from: classes9.dex */
public class ScreenshareSender implements LocalMediaStreamSource.OnScreenSizeChangedListener {
    public final RTCLog a;
    public final ControlThread b;
    public volatile boolean c;
    public FrameCapturerImpl d;
    public FrameEncoderImpl e;
    public volatile FrameSenderImpl f;
    public volatile boolean g = false;
    public final Runnable h = new ic3(this, 9);

    public ScreenshareSender(final EglBase.Context context, final Context context2, final RTCLog rTCLog, final LocalMediaStreamSource.ScreenCaptureStateListener screenCaptureStateListener, final RotationProvider rotationProvider) {
        ControlThread controlThread = new ControlThread("SSSendControl");
        this.b = controlThread;
        this.a = rTCLog;
        controlThread.run(new Runnable() { // from class: xsna.xdh0
            @Override // java.lang.Runnable
            public final void run() {
                ScreenshareSender.this.a(context, context2, screenCaptureStateListener, rTCLog, rotationProvider);
            }
        });
    }

    public final /* synthetic */ void a(EglBase.Context context, Context context2, LocalMediaStreamSource.ScreenCaptureStateListener screenCaptureStateListener, RTCLog rTCLog, RotationProvider rotationProvider) {
        this.d = new FrameCapturerImpl(context, context2, screenCaptureStateListener, rTCLog);
        this.e = new FrameEncoderImpl(rTCLog, rotationProvider);
        this.f = new FrameSenderImpl();
        this.d.setFrameConsumer(this.e);
        this.e.setEncodedImageConsumer(this.f);
        this.e.setSenderBackpressure(this.f);
    }

    public final /* synthetic */ void b() {
        double fps = this.d.fps();
        double fps2 = this.e.fps();
        double droppedFps = this.e.droppedFps();
        double fps3 = this.f.fps();
        RTCLog rTCLog = this.a;
        StringBuilder a = lby.a("capturer: ", fps, " , encoder: ");
        a.append(fps2);
        a.a(a, " | ", droppedFps, " , sender: ");
        a.append(fps3);
        rTCLog.log("SSStat", a.toString());
        this.b.run(this.h, 1000L);
    }

    public final void c() {
        if (this.g) {
            a();
        }
        FrameCapturerImpl frameCapturerImpl = this.d;
        if (frameCapturerImpl != null) {
            frameCapturerImpl.release();
        }
        FrameEncoderImpl frameEncoderImpl = this.e;
        if (frameEncoderImpl != null) {
            frameEncoderImpl.release();
        }
        if (this.f != null) {
            this.f.release();
        }
        FrameCapturerImpl frameCapturerImpl2 = this.d;
        if (frameCapturerImpl2 != null) {
            frameCapturerImpl2.waitUntilReleased();
        }
        this.d = null;
        this.e = null;
        this.f = null;
        this.c = true;
    }

    public MediaProjection getMediaProjection() {
        return this.d.getMediaProjection();
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.OnScreenSizeChangedListener
    public void onScreenSizeChanged(final int i, final int i2) {
        this.b.run(new Runnable() { // from class: xsna.vdh0
            @Override // java.lang.Runnable
            public final void run() {
                ScreenshareSender.this.a(i, i2);
            }
        });
    }

    public void release() {
        if (this.c) {
            return;
        }
        if (this.f != null) {
            this.f.setTransport(null);
        }
        this.b.close(new fs2(this, 10));
        this.b.awaitClose();
    }

    public void setTransport(RtcTransport rtcTransport) {
        this.b.run(new gq4(5, this, rtcTransport));
    }

    public void startSharing(final Size size, ScreenCapturePermissionProvider screenCapturePermissionProvider) {
        final Intent permissions;
        if (this.g || screenCapturePermissionProvider == null || (permissions = screenCapturePermissionProvider.getPermissions()) == null) {
            return;
        }
        this.g = true;
        this.b.run(new Runnable() { // from class: xsna.wdh0
            @Override // java.lang.Runnable
            public final void run() {
                ScreenshareSender.this.a(size, permissions);
            }
        });
        this.b.run(this.h, 1000L);
    }

    public void stopSharing() {
        if (this.g) {
            this.g = false;
            this.b.run(new hod(this, 11));
            this.b.remove(this.h);
        }
    }

    public final /* synthetic */ void a(RtcTransport rtcTransport) {
        this.f.setTransport(rtcTransport);
        if (!this.g || rtcTransport == null) {
            return;
        }
        this.f.startSending();
    }

    public final /* synthetic */ void a(Size size, Intent intent) {
        this.f.startSending();
        this.e.startEncoding();
        this.d.startCapturing(size, intent);
    }

    public final void a() {
        FrameCapturerImpl frameCapturerImpl = this.d;
        if (frameCapturerImpl != null) {
            frameCapturerImpl.stopCapturing();
        }
        FrameEncoderImpl frameEncoderImpl = this.e;
        if (frameEncoderImpl != null) {
            frameEncoderImpl.stopEncoding();
        }
        if (this.f != null) {
            this.f.stopSending();
        }
    }

    public final /* synthetic */ void a(int i, int i2) {
        FrameCapturerImpl frameCapturerImpl = this.d;
        if (frameCapturerImpl != null) {
            frameCapturerImpl.onScreenSizeChanged(i, i2);
        }
    }
}
