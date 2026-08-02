package com.google.ar.core;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import com.google.ar.core.ArCoreApk;
import java.util.function.Consumer;

/* loaded from: classes11.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ k(Consumer consumer, ArCoreApk.Availability availability) {
        this.a = 0;
        this.b = 1;
        this.w = consumer;
        this.c = availability;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.function.Consumer] */
    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        int i = this.a;
        int i2 = this.b;
        ?? r2 = this.w;
        Object obj = this.c;
        switch (i) {
            case 0:
                switch (i2) {
                    case 0:
                        int i3 = ak.d;
                        ((CameraDevice.StateCallback) obj).onOpened((CameraDevice) r2);
                        break;
                    case 1:
                        r2.accept(obj);
                        break;
                    case 2:
                        int i4 = ak.d;
                        ((CameraDevice.StateCallback) obj).onDisconnected((CameraDevice) r2);
                        break;
                    case 3:
                        int i5 = ak.d;
                        ((CameraDevice.StateCallback) obj).onClosed((CameraDevice) r2);
                        break;
                    case 4:
                        int i6 = an.d;
                        ((CameraCaptureSession.StateCallback) obj).onConfigured((CameraCaptureSession) r2);
                        break;
                    case 5:
                        int i7 = an.d;
                        ((CameraCaptureSession.StateCallback) obj).onConfigureFailed((CameraCaptureSession) r2);
                        break;
                    case 6:
                        int i8 = an.d;
                        ((CameraCaptureSession.StateCallback) obj).onReady((CameraCaptureSession) r2);
                        break;
                    case 7:
                        int i9 = an.d;
                        ((CameraCaptureSession.StateCallback) obj).onActive((CameraCaptureSession) r2);
                        break;
                    default:
                        int i10 = an.d;
                        ((CameraCaptureSession.StateCallback) obj).onClosed((CameraCaptureSession) r2);
                        break;
                }
            default:
                int i11 = ak.d;
                ((CameraDevice.StateCallback) obj).onError((CameraDevice) r2, i2);
                break;
        }
    }

    public /* synthetic */ k(Object obj, AutoCloseable autoCloseable, int i, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.w = autoCloseable;
    }
}
