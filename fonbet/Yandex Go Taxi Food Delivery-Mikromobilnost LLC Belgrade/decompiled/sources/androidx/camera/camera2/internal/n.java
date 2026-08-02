package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import defpackage.a48;
import defpackage.q38;
import defpackage.r38;
import defpackage.s38;
import defpackage.ug70;
import defpackage.wn7;
import defpackage.x34;
import defpackage.xi21;
import defpackage.yy40;

/* loaded from: classes10.dex */
public class n {
    public static final n a = new n();

    public void a(xi21 xi21Var, r38 r38Var) {
        s38 s38Var = (s38) xi21Var.g(xi21.k4, null);
        ug70 ug70Var = ug70.c;
        x34 x34Var = s38.i;
        int i = new r38().e().c;
        if (s38Var != null) {
            i = s38Var.c;
            r38Var.a(s38Var.e);
            ug70Var = s38Var.b;
        }
        r38Var.b = yy40.p(ug70Var);
        r38Var.c = ((Integer) xi21Var.g(wn7.b, Integer.valueOf(i))).intValue();
        r38Var.b(new q38((CameraCaptureSession.CaptureCallback) xi21Var.g(wn7.y, new Camera2CaptureCallbacks$NoOpSessionCaptureCallback())));
        r38Var.c(a48.b(xi21Var).a());
    }
}
