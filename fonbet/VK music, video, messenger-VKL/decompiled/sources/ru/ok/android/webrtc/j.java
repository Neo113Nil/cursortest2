package ru.ok.android.webrtc;

import ru.ok.android.webrtc.LocalMediaStreamSource;

/* loaded from: classes9.dex */
public final class j implements LocalMediaStreamSource.ScreenCaptureStateListener {
    public final /* synthetic */ Call a;

    public j(Call call) {
        this.a = call;
    }

    public final void a(boolean z) {
        try {
            Call call = this.a;
            if (call.b() && call.y0.handleMediaOptionsForSetScreenCapture(false)) {
                if (call.m0.enableScreenCapture(false, false)) {
                    call.q();
                    call.b(CallEvents.LOCAL_MEDIA_SETTINGS_CHANGED, (Object) null);
                }
                call.notifyUpdatePeerVideoSettings();
            }
        } catch (Throwable th) {
            this.a.logger.logException("OKRTCCall", com.vk.movika.sdk.android.defaultplayer.interactive.c.a("Error apply screen capture stopped state (fast=", ")", z), th);
        }
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.ScreenCaptureStateListener
    public final void onScreenCaptureStarted(boolean z) {
        this.a.logger.log("OKRTCCall", "Screen capture has started, fast=" + z);
    }

    @Override // ru.ok.android.webrtc.LocalMediaStreamSource.ScreenCaptureStateListener
    public final void onScreenCaptureStopped(final boolean z) {
        this.a.logger.log("OKRTCCall", "Screen capture has stopped, fast=" + z);
        this.a.l.post(new Runnable() { // from class: xsna.g1z0
            @Override // java.lang.Runnable
            public final void run() {
                ru.ok.android.webrtc.j.this.a(z);
            }
        });
    }
}
