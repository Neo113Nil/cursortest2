package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final class fw81 {
    public static boolean a(Context context) {
        a081 a081Var;
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a = a081Var2.a(context);
        return a == null || a.j;
    }

    public static boolean b(Context context) {
        a081 a081Var;
        gg81 a = dha1.f().a(context);
        if (a == null || !a.i || a(context)) {
            return true;
        }
        if (!w681.a(a)) {
            return false;
        }
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        return jl40.l(a081Var2.c(), Boolean.TRUE);
    }
}
