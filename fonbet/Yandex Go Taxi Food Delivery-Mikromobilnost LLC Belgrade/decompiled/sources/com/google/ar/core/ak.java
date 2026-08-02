package com.google.ar.core;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;

/* loaded from: classes11.dex */
final class ak extends CameraDevice.StateCallback {
    public static final /* synthetic */ int d = 0;
    final /* synthetic */ Handler a;
    final /* synthetic */ CameraDevice.StateCallback b;
    final /* synthetic */ SharedCamera c;

    public ak(SharedCamera sharedCamera, Handler handler, CameraDevice.StateCallback stateCallback) {
        this.a = handler;
        this.b = stateCallback;
        this.c = sharedCamera;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        this.a.post(new k(this.b, cameraDevice, 3, 0));
        this.c.e(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        this.a.post(new k(this.b, cameraDevice, 2, 0));
        this.c.f(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        this.a.post(new k(this.b, cameraDevice, i, 1));
        this.c.b();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.c.n().a = cameraDevice;
        int i = 0;
        this.a.post(new k(this.b, cameraDevice, i, i));
        this.c.d(cameraDevice);
        SharedCamera sharedCamera = this.c;
        sharedCamera.n().c = sharedCamera.l();
        SharedCamera sharedCamera2 = this.c;
        sharedCamera2.n().d = sharedCamera2.m();
    }
}
