package com.google.ar.core;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;

/* loaded from: classes11.dex */
final class an extends CameraCaptureSession.StateCallback {
    public static final /* synthetic */ int d = 0;
    final /* synthetic */ Handler a;
    final /* synthetic */ CameraCaptureSession.StateCallback b;
    final /* synthetic */ SharedCamera c;

    public an(SharedCamera sharedCamera, Handler handler, CameraCaptureSession.StateCallback stateCallback) {
        this.a = handler;
        this.b = stateCallback;
        this.c = sharedCamera;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(CameraCaptureSession cameraCaptureSession) {
        this.a.post(new k(this.b, cameraCaptureSession, 7, 0));
        this.c.g(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        this.a.post(new k(this.b, cameraCaptureSession, 8, 0));
        this.c.h(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.a.post(new k(this.b, cameraCaptureSession, 5, 0));
        this.c.i(cameraCaptureSession);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        this.a.post(new k(this.b, cameraCaptureSession, 4, 0));
        this.c.j(cameraCaptureSession);
        if (this.c.n().a != null) {
            this.c.c();
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(CameraCaptureSession cameraCaptureSession) {
        this.a.post(new k(this.b, cameraCaptureSession, 6, 0));
        this.c.k(cameraCaptureSession);
    }
}
