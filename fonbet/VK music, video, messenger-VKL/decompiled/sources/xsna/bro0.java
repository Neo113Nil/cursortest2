package xsna;

/* compiled from: EventLoop.common.kt */
/* loaded from: classes11.dex */
public final class bro0 {
    public static final ThreadLocal<c0q> a = new ThreadLocal<>();

    public static c0q a() {
        ThreadLocal<c0q> threadLocal = a;
        c0q c0qVar = threadLocal.get();
        if (c0qVar != null) {
            return c0qVar;
        }
        tf7 tf7Var = new tf7(Thread.currentThread());
        threadLocal.set(tf7Var);
        return tf7Var;
    }
}
