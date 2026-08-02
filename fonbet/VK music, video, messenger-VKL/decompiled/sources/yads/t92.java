package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public abstract class t92 {
    public static final Object a = new Object();
    public static volatile dq2 b;

    public static final dq2 a(Context context) {
        dq2 dq2Var;
        dq2 dq2Var2 = b;
        if (dq2Var2 != null) {
            return dq2Var2;
        }
        synchronized (a) {
            dq2Var = b;
            if (dq2Var == null) {
                dq2Var = eq2.a(context, l92.a(context));
                b = dq2Var;
                dq2Var.a();
            }
        }
        return dq2Var;
    }
}
