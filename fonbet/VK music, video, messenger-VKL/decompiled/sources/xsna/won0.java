package xsna;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import androidx.annotation.NonNull;
import xsna.ub9;

/* compiled from: SynchronizedCaptureSessionBaseImpl.java */
/* loaded from: classes11.dex */
public final class won0 extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ xon0 a;

    public won0(xon0 xon0Var) {
        this.a = xon0Var;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onActive(@NonNull CameraCaptureSession cameraCaptureSession) {
        xon0 xon0Var = this.a;
        xon0Var.n(cameraCaptureSession);
        xon0Var.g(xon0Var);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onCaptureQueueEmpty(@NonNull CameraCaptureSession cameraCaptureSession) {
        xon0 xon0Var = this.a;
        xon0Var.n(cameraCaptureSession);
        xon0Var.h(xon0Var);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(@NonNull CameraCaptureSession cameraCaptureSession) {
        xon0 xon0Var = this.a;
        xon0Var.n(cameraCaptureSession);
        xon0Var.i(xon0Var);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(@NonNull CameraCaptureSession cameraCaptureSession) {
        ub9.a<Void> aVar;
        try {
            this.a.n(cameraCaptureSession);
            xon0 xon0Var = this.a;
            xon0Var.j(xon0Var);
            synchronized (this.a.a) {
                obr.e(this.a.h, "OpenCaptureSession completer should not null");
                xon0 xon0Var2 = this.a;
                aVar = xon0Var2.h;
                xon0Var2.h = null;
            }
            aVar.d(new IllegalStateException("onConfigureFailed"));
        } catch (Throwable th) {
            synchronized (this.a.a) {
                obr.e(this.a.h, "OpenCaptureSession completer should not null");
                xon0 xon0Var3 = this.a;
                ub9.a<Void> aVar2 = xon0Var3.h;
                xon0Var3.h = null;
                aVar2.d(new IllegalStateException("onConfigureFailed"));
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(@NonNull CameraCaptureSession cameraCaptureSession) {
        ub9.a<Void> aVar;
        try {
            this.a.n(cameraCaptureSession);
            xon0 xon0Var = this.a;
            xon0Var.k(xon0Var);
            synchronized (this.a.a) {
                obr.e(this.a.h, "OpenCaptureSession completer should not null");
                xon0 xon0Var2 = this.a;
                aVar = xon0Var2.h;
                xon0Var2.h = null;
            }
            aVar.b(null);
        } catch (Throwable th) {
            synchronized (this.a.a) {
                obr.e(this.a.h, "OpenCaptureSession completer should not null");
                xon0 xon0Var3 = this.a;
                ub9.a<Void> aVar2 = xon0Var3.h;
                xon0Var3.h = null;
                aVar2.b(null);
                throw th;
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onReady(@NonNull CameraCaptureSession cameraCaptureSession) {
        xon0 xon0Var = this.a;
        xon0Var.n(cameraCaptureSession);
        xon0Var.l(xon0Var);
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onSurfacePrepared(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull Surface surface) {
        xon0 xon0Var = this.a;
        xon0Var.n(cameraCaptureSession);
        xon0Var.m(xon0Var, surface);
    }
}
