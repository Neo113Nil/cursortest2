package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class ola1 {
    public static g191 a(Context context) {
        if (g191.z == null) {
            synchronized (g191.y) {
                if (g191.z == null) {
                    g191.z = new g191(context, 5);
                }
            }
        }
        g191 g191Var = g191.z;
        if (g191Var != null) {
            return g191Var;
        }
        ny61.r("Required value was null.");
        return null;
    }

    public static final o70 b(hbb0 hbb0Var, lbb0 lbb0Var) {
        return new o70(lbb0Var, hbb0Var, 0);
    }

    public static o70 c(wls wlsVar) {
        return new o70(wlsVar, new c20(5), 0);
    }

    public static final lum d() {
        return new lum(new txk(23), toq.a, new mtw(26), uoq.a);
    }
}
