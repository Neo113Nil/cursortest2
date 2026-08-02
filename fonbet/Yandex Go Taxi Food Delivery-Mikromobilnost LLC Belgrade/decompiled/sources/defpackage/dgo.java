package defpackage;

import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class dgo {
    public static final Object a = new Object();
    public static final WeakHashMap b = new WeakHashMap();

    public static ev5 a(String str) {
        ev5 ev5Var;
        synchronized (a) {
            ev5Var = (ev5) b.get(str);
        }
        return ev5Var;
    }
}
