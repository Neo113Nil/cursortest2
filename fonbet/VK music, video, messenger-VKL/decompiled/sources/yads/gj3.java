package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class gj3 {
    public final hj3 a(Context context) {
        hj3 hj3Var;
        hj3 hj3Var2 = hj3.d;
        if (hj3Var2 != null) {
            return hj3Var2;
        }
        synchronized (this) {
            hj3Var = hj3.d;
            if (hj3Var == null) {
                hj3Var = new hj3(context);
                hj3.d = hj3Var;
            }
        }
        return hj3Var;
    }
}
