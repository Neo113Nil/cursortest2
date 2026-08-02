package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import defpackage.ap7;
import defpackage.c06;
import defpackage.d6z;
import defpackage.i8j0;
import defpackage.j8j0;
import defpackage.k8j0;
import defpackage.md6;
import defpackage.o3;
import defpackage.o5j0;
import defpackage.q6x0;
import defpackage.xo7;

/* loaded from: classes10.dex */
public final class e implements i8j0 {
    public boolean a = false;
    public boolean b = false;
    public final /* synthetic */ o3 c;
    public final /* synthetic */ int w;
    public final /* synthetic */ q6x0 x;
    public final /* synthetic */ h y;

    public e(int i, o3 o3Var, q6x0 q6x0Var, h hVar) {
        this.y = hVar;
        this.c = o3Var;
        this.w = i;
        this.x = q6x0Var;
    }

    @Override // defpackage.i8j0
    public final void onCaptureCompleted(j8j0 j8j0Var, ap7 ap7Var) {
        c06 c06Var = (c06) ap7Var;
        CaptureResult captureResult = (CaptureResult) c06Var.b;
        d6z.m("Cannot get capture TotalCaptureResult from the cameraCaptureResult ", captureResult instanceof TotalCaptureResult);
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) captureResult;
        o5j0 o5j0Var = (o5j0) j8j0Var;
        StillCaptureProcessor stillCaptureProcessor = this.y.l;
        h hVar = this.y;
        if (stillCaptureProcessor != null) {
            synchronized (hVar.e) {
                try {
                    if (!this.y.x.containsKey(Integer.valueOf(this.w))) {
                        this.y.x.put(Integer.valueOf(this.w), Long.valueOf(((c06) ap7Var).getTimestamp()));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.y.l.notifyCaptureResult(totalCaptureResult, o5j0Var.d);
            return;
        }
        hVar.u = false;
        k8j0 k8j0Var = this.y.t;
        o3 o3Var = this.c;
        if (k8j0Var == null) {
            return;
        }
        c06Var.getTimestamp();
        o3Var.c = new md6(10, this.x, (CaptureResult) c06Var.b);
        this.c.c();
    }

    @Override // defpackage.i8j0
    public final void onCaptureFailed(j8j0 j8j0Var, xo7 xo7Var) {
        if (this.a) {
            return;
        }
        this.a = true;
        this.c.g();
        this.y.u = false;
    }

    @Override // defpackage.i8j0
    public final void onCaptureSequenceAborted(int i) {
        this.y.u = false;
    }

    @Override // defpackage.i8j0
    public final void onCaptureStarted(j8j0 j8j0Var, long j, long j2) {
        if (this.b) {
            return;
        }
        this.b = true;
        this.c.j();
    }
}
