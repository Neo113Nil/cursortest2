package defpackage;

/* loaded from: classes9.dex */
public abstract class byy0 {
    public static final ThreadLocal a = new ThreadLocal();

    public static fgo a() {
        ThreadLocal threadLocal = a;
        fgo fgoVar = (fgo) threadLocal.get();
        if (fgoVar != null) {
            return fgoVar;
        }
        r56 r56Var = new r56(Thread.currentThread());
        threadLocal.set(r56Var);
        return r56Var;
    }
}
