package xsna;

/* compiled from: BiometricsLockInteractor.kt */
/* loaded from: classes.dex */
public interface v57 {
    public static final a a = a.a;

    boolean a();

    void b();

    void c(boolean z);

    void d();

    io.reactivex.rxjava3.core.q<Boolean> e();

    boolean g();

    boolean h();

    void i();

    /* compiled from: BiometricsLockInteractor.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final v57 STUB = new C3868a();

        public final v57 getSTUB() {
            return STUB;
        }

        /* compiled from: BiometricsLockInteractor.kt */
        /* renamed from: xsna.v57$a$a, reason: collision with other inner class name */
        public static final class C3868a implements v57 {
            @Override // xsna.v57
            public final boolean a() {
                return false;
            }

            @Override // xsna.v57
            public final io.reactivex.rxjava3.core.q<Boolean> e() {
                return io.reactivex.rxjava3.core.q.T(Boolean.FALSE);
            }

            @Override // xsna.v57
            public final boolean g() {
                return false;
            }

            @Override // xsna.v57
            public final boolean h() {
                return false;
            }

            @Override // xsna.v57
            public final void b() {
            }

            @Override // xsna.v57
            public final void d() {
            }

            @Override // xsna.v57
            public final void i() {
            }

            @Override // xsna.v57
            public final void c(boolean z) {
            }

            @Override // xsna.v57
            public final void f(String str, gzs<s3q0> gzsVar) {
            }
        }
    }

    default void f(String str, gzs<s3q0> gzsVar) {
    }
}
