package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class u92 {
    public final x92 a(Context context) {
        x92 x92Var;
        x92 x92Var2 = x92.e;
        if (x92Var2 != null) {
            return x92Var2;
        }
        synchronized (this) {
            x92Var = x92.e;
            if (x92Var == null) {
                x92Var = new x92(context, new m31());
                x92.e = x92Var;
            }
        }
        return x92Var;
    }
}
