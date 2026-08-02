package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public abstract class lm0 {
    public static mm0 a(Context context) {
        mm0 mm0Var;
        mm0 mm0Var2 = mm0.c;
        if (mm0Var2 != null) {
            return mm0Var2;
        }
        synchronized (mm0.d) {
            mm0Var = mm0.c;
            if (mm0Var == null) {
                mm0Var = new mm0(new km0(), xg.a(context.getApplicationContext()));
                mm0.c = mm0Var;
            }
        }
        return mm0Var;
    }
}
