package xsna;

/* compiled from: FrescoSystrace.kt */
/* loaded from: classes.dex */
public final class lhs {
    public static final lhs a = new lhs();
    public static a b;

    /* compiled from: FrescoSystrace.kt */
    public interface a {
        void a(String str);

        void b();

        boolean isTracing();
    }

    public static final void a(String str) {
        a.getClass();
        c().a(str);
    }

    public static final void b() {
        a.getClass();
        c().b();
    }

    public static a c() {
        ffl fflVar;
        a aVar = b;
        if (aVar != null) {
            return aVar;
        }
        synchronized (lhs.class) {
            fflVar = new ffl();
            b = fflVar;
        }
        return fflVar;
    }

    public static final boolean d() {
        a.getClass();
        return c().isTracing();
    }
}
