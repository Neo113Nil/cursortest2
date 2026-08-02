package yads;

/* loaded from: classes10.dex */
public final class ck1 {
    public static final Object c = new Object();
    public final dk1 a;
    public final bk1 b = new bk1();

    public ck1(sh1 sh1Var) {
        this.a = new dk1(sh1Var);
    }

    public final String a() {
        String a;
        synchronized (c) {
            a = this.a.a();
            if (a == null) {
                this.b.getClass();
                a = bk1.a();
                this.a.a(a);
            }
        }
        return a;
    }
}
