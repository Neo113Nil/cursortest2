package xsna;

import com.vk.im.engine.models.ProfilesInfo;

/* compiled from: CommonEngineCommandsFactory.kt */
/* loaded from: classes2.dex */
public interface mjg {

    /* compiled from: CommonEngineCommandsFactory.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final mjg STUB = new C3348a();

        /* compiled from: CommonEngineCommandsFactory.kt */
        /* renamed from: xsna.mjg$a$a, reason: collision with other inner class name */
        public static final class C3348a implements mjg {
            @Override // xsna.mjg
            public final e1w<d5w> a(i5w i5wVar) {
                return new b(new a44(10));
            }

            @Override // xsna.mjg
            public final e1w b(aem aemVar) {
                return new b(new c6(7));
            }

            @Override // xsna.mjg
            public final e1w<m5w> c(g5w g5wVar) {
                return new b(new te0(9));
            }

            @Override // xsna.mjg
            public final e1w d(e1e0 e1e0Var) {
                return new b(new z34(6));
            }

            @Override // xsna.mjg
            public final e1w<s3q0> e() {
                return new b(new n1(13));
            }

            @Override // xsna.mjg
            public final e1w<Boolean> f() {
                return new b(new c24(0));
            }
        }

        public final mjg getSTUB() {
            return STUB;
        }
    }

    /* compiled from: CommonEngineCommandsFactory.kt */
    public static final class b<T> extends le6<T> {
        public final gzs<T> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(gzs<? extends T> gzsVar) {
            this.b = gzsVar;
        }

        @Override // xsna.le6
        public final T e(w2w w2wVar) {
            return this.b.invoke();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        @Override // xsna.le6, xsna.e1w
        public final int hashCode() {
            return this.b.hashCode();
        }

        @Override // xsna.e1w
        public final String toString() {
            return uf3.d(new StringBuilder("StubCmd(execute="), this.b, ')');
        }
    }

    e1w<d5w> a(i5w i5wVar);

    e1w<dem> b(aem aemVar);

    e1w<m5w> c(g5w g5wVar);

    e1w<ProfilesInfo> d(e1e0 e1e0Var);

    e1w<s3q0> e();

    e1w<Boolean> f();
}
