package xsna;

/* compiled from: NoOpMemoryTrimmableRegistry.java */
/* loaded from: classes.dex */
public final class n370 implements g320 {
    public static n370 b;
    public static final n370 c = new n370();

    public static synchronized n370 b() {
        n370 n370Var;
        synchronized (n370.class) {
            try {
                if (b == null) {
                    b = new n370();
                }
                n370Var = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return n370Var;
    }

    @Override // xsna.g320
    public void a(f320 f320Var) {
    }
}
