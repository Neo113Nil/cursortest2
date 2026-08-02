package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final class ni71 {
    public static nv71 a(int i, Context context) {
        Integer num;
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
        return new nv71(1.0f, i, (a == null || (num = a.L) == null) ? 0 : num.intValue());
    }
}
