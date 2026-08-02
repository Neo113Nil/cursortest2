package xsna;

/* compiled from: AvitoViewState.kt */
/* loaded from: classes18.dex */
public final class au5 implements ao50 {
    public final fi50 a;

    /* compiled from: AvitoViewState.kt */
    public static final class a implements fm50<zt5> {
        public final yzt0<InterfaceC2575a> a;

        /* compiled from: AvitoViewState.kt */
        /* renamed from: xsna.au5$a$a, reason: collision with other inner class name */
        public interface InterfaceC2575a {

            /* compiled from: AvitoViewState.kt */
            /* renamed from: xsna.au5$a$a$a, reason: collision with other inner class name */
            public static final class C2576a implements InterfaceC2575a {
                public final ot5 a;

                public C2576a(ot5 ot5Var) {
                    this.a = ot5Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C2576a) && epx.f(this.a, ((C2576a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "Data(data=" + this.a + ')';
                }
            }

            /* compiled from: AvitoViewState.kt */
            /* renamed from: xsna.au5$a$a$b */
            public static final class b implements InterfaceC2575a {
                public static final b a = new b();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public final int hashCode() {
                    return -1658425514;
                }

                public final String toString() {
                    return "Error";
                }
            }

            /* compiled from: AvitoViewState.kt */
            /* renamed from: xsna.au5$a$a$c */
            public static final class c implements InterfaceC2575a {
                public static final c a = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return 1501586186;
                }

                public final String toString() {
                    return "Loading";
                }
            }
        }

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("AvitoSceneRender(content="), this.a, ')');
        }
    }

    public au5(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
