package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public final class wa2 {
    public final ya2 a(Context context) {
        ya2 ya2Var;
        ya2 ya2Var2 = ya2.i;
        if (ya2Var2 != null) {
            return ya2Var2;
        }
        synchronized (this) {
            ya2Var = ya2.i;
            if (ya2Var == null) {
                ya2Var = new ya2(context);
                ya2.i = ya2Var;
            }
        }
        return ya2Var;
    }
}
