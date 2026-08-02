package xsna;

import xsna.bqx0;

/* compiled from: extensions.kt */
/* loaded from: classes2.dex */
public final class mdq {
    public static final float a(bqx0 bqx0Var) {
        bqx0.q qVar = bqx0Var.a;
        h4x i = qVar.i(8);
        h4x i2 = qVar.i(519);
        h4x c = h4x.c(i.a - i2.a, i.b - i2.b, i.c - i2.c, i.d - i2.d);
        h4x c2 = h4x.c(Math.max(c.a, 0), Math.max(c.b, 0), Math.max(c.c, 0), Math.max(c.d, 0));
        return c2.b - c2.d;
    }
}
