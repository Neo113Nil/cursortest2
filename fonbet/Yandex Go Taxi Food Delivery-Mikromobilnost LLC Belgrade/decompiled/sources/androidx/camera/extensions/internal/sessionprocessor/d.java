package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import defpackage.a3c;
import defpackage.ap7;
import defpackage.azo;
import defpackage.c06;
import defpackage.c94;
import defpackage.d6z;
import defpackage.i8j0;
import defpackage.j8j0;
import defpackage.l0r0;
import defpackage.md6;
import defpackage.q6x0;

/* loaded from: classes10.dex */
public final class d implements i8j0 {
    public final /* synthetic */ l0r0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ h c;

    public d(h hVar, l0r0 l0r0Var, int i) {
        this.c = hVar;
        this.a = l0r0Var;
        this.b = i;
    }

    @Override // defpackage.i8j0
    public final void onCaptureCompleted(j8j0 j8j0Var, ap7 ap7Var) {
        CaptureResult captureResult = (CaptureResult) ((c06) ap7Var).b;
        d6z.m("Cannot get TotalCaptureResult from the cameraCaptureResult ", captureResult instanceof TotalCaptureResult);
        TotalCaptureResult totalCaptureResult = (TotalCaptureResult) captureResult;
        if (this.c.m != null) {
            this.c.m.notifyCaptureResult(totalCaptureResult);
        } else {
            c94 c94Var = c94.A;
            if (a3c.b(c94Var) && azo.f(c94Var) && ((Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP)) != null) {
                this.a.b(new md6(10, q6x0.b, totalCaptureResult));
            }
        }
        if (this.c.n != null && this.c.n.process(totalCaptureResult) != null) {
            this.c.v(this.b, this.a);
        }
        this.a.c();
    }
}
