package yads;

import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public abstract class n22 {
    public static o22 a() {
        o22 o22Var;
        o22 o22Var2 = o22.c;
        if (o22Var2 != null) {
            return o22Var2;
        }
        synchronized (o22.b) {
            o22Var = o22.c;
            if (o22Var == null) {
                o22Var = new o22(new WeakHashMap());
                o22.c = o22Var;
            }
        }
        return o22Var;
    }
}
