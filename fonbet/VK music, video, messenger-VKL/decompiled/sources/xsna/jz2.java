package xsna;

/* compiled from: ApiMethodPriorityBackoff.kt */
/* loaded from: classes.dex */
public interface jz2 {
    int a();

    void b(int i, String str);

    boolean c(String str);

    void d(String str);

    boolean isActive();

    /* compiled from: ApiMethodPriorityBackoff.kt */
    public static final class a {
        public static final C3153a a = new C3153a();

        /* compiled from: ApiMethodPriorityBackoff.kt */
        /* renamed from: xsna.jz2$a$a, reason: collision with other inner class name */
        public static final class C3153a implements jz2 {
            @Override // xsna.jz2
            public final int a() {
                return 0;
            }

            @Override // xsna.jz2
            public final boolean c(String str) {
                return false;
            }

            @Override // xsna.jz2
            public final boolean isActive() {
                return false;
            }

            @Override // xsna.jz2
            public final void d(String str) {
            }

            @Override // xsna.jz2
            public final void b(int i, String str) {
            }
        }
    }
}
