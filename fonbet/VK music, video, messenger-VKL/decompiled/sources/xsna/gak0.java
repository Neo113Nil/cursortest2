package xsna;

import android.graphics.Canvas;
import android.graphics.PorterDuff;

/* compiled from: snapshot.kt */
/* loaded from: classes4.dex */
public final class gak0 implements mlo {
    public static final gak0 b = new gak0();
    public static final pb7 c = new pb7();
    public static final pb7 d = new pb7();

    @Override // xsna.mlo
    public final void b(izs<? super Canvas, s3q0> izsVar) {
        c.c(izsVar);
    }

    @Override // xsna.mlo
    public final void clear() {
        pb7 pb7Var = c;
        pb7Var.b();
        Canvas canvas = pb7Var.b;
        if (canvas != null) {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            s3q0 s3q0Var = s3q0.a;
        }
        pb7 pb7Var2 = d;
        pb7Var2.b();
        Canvas canvas2 = pb7Var2.b;
        if (canvas2 != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            s3q0 s3q0Var2 = s3q0.a;
        }
    }
}
