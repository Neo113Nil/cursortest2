package xsna;

import xsna.zqx0;

/* compiled from: WindowInsetsRulers.android.kt */
/* loaded from: classes11.dex */
public final class brx0 {
    public static final pg50 a;
    public static final zqx0[] b;

    static {
        pg50 pg50Var = new pg50(8);
        zqx0.a.getClass();
        arx0 arx0Var = zqx0.a.g;
        pg50Var.k(1, arx0Var);
        arx0 arx0Var2 = zqx0.a.f;
        pg50Var.k(2, arx0Var2);
        arx0 arx0Var3 = zqx0.a.b;
        pg50Var.k(4, arx0Var3);
        arx0 arx0Var4 = zqx0.a.d;
        pg50Var.k(8, arx0Var4);
        arx0 arx0Var5 = zqx0.a.h;
        pg50Var.k(16, arx0Var5);
        arx0 arx0Var6 = zqx0.a.e;
        pg50Var.k(32, arx0Var6);
        arx0 arx0Var7 = zqx0.a.i;
        pg50Var.k(64, arx0Var7);
        arx0 arx0Var8 = zqx0.a.c;
        pg50Var.k(128, arx0Var8);
        a = pg50Var;
        b = new zqx0[]{arx0Var, arx0Var2, arx0Var3, arx0Var7, arx0Var5, arx0Var6, arx0Var4, zqx0.a.j, arx0Var8};
    }

    public static final void a(srg0 srg0Var, iif0 iif0Var, long j, int i, int i2) {
        if (w65.e(j, -1L)) {
            return;
        }
        srg0Var.e1(iif0Var.getLeft(), (int) ((j >>> 48) & 65535));
        srg0Var.e1(iif0Var.getTop(), (int) ((j >>> 32) & 65535));
        srg0Var.e1(iif0Var.getRight(), i - ((int) ((j >>> 16) & 65535)));
        srg0Var.e1(iif0Var.getBottom(), i2 - ((int) (j & 65535)));
    }
}
