package yads;

import android.content.Context;

/* loaded from: classes10.dex */
public abstract class hr0 {
    public static ir0 a;

    public static final synchronized ir0 a(Context context) {
        ir0 ir0Var;
        synchronized (hr0.class) {
            ir0Var = a;
            if (ir0Var == null) {
                ir0Var = new ir0(context);
                a = ir0Var;
            }
        }
        return ir0Var;
    }
}
