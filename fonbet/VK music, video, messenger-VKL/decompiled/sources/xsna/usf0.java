package xsna;

/* compiled from: RelatedUserPinInputViewState.kt */
/* loaded from: classes6.dex */
public final class usf0 implements ao50 {
    public final fi50 a;

    /* compiled from: RelatedUserPinInputViewState.kt */
    public static final class a implements fm50<tsf0> {
        public final yzt0<InterfaceC3823a> a;

        /* compiled from: RelatedUserPinInputViewState.kt */
        /* renamed from: xsna.usf0$a$a, reason: collision with other inner class name */
        public interface InterfaceC3823a {

            /* compiled from: RelatedUserPinInputViewState.kt */
            /* renamed from: xsna.usf0$a$a$a, reason: collision with other inner class name */
            public static final class C3824a implements InterfaceC3823a {
                public static final C3824a a = new C3824a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3824a);
                }

                public final int hashCode() {
                    return 1387247124;
                }

                public final String toString() {
                    return "Data";
                }
            }

            /* compiled from: RelatedUserPinInputViewState.kt */
            /* renamed from: xsna.usf0$a$a$b */
            public static abstract class b implements InterfaceC3823a {

                /* compiled from: RelatedUserPinInputViewState.kt */
                /* renamed from: xsna.usf0$a$a$b$a, reason: collision with other inner class name */
                public static final class C3825a extends b {
                    public static final C3825a a = new C3825a();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof C3825a);
                    }

                    public final int hashCode() {
                        return -1918562899;
                    }

                    public final String toString() {
                        return "CommonError";
                    }
                }

                /* compiled from: RelatedUserPinInputViewState.kt */
                /* renamed from: xsna.usf0$a$a$b$b, reason: collision with other inner class name */
                public static final class C3826b extends b {
                    public final String a;

                    public C3826b(String str) {
                        this.a = str;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C3826b) && epx.f(this.a, ((C3826b) obj).a);
                    }

                    public final int hashCode() {
                        String str = this.a;
                        if (str == null) {
                            return 0;
                        }
                        return str.hashCode();
                    }

                    public final String toString() {
                        return ho8.a(new StringBuilder("NetworkError(message="), this.a, ')');
                    }
                }

                /* compiled from: RelatedUserPinInputViewState.kt */
                /* renamed from: xsna.usf0$a$a$b$c */
                public static final class c extends b {
                    public static final c a = new c();

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof c);
                    }

                    public final int hashCode() {
                        return -1299031882;
                    }

                    public final String toString() {
                        return "TooManyTries";
                    }
                }
            }

            /* compiled from: RelatedUserPinInputViewState.kt */
            /* renamed from: xsna.usf0$a$a$c */
            public static final class c implements InterfaceC3823a {
                public static final c a = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return 197298834;
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
            return tr.c(new StringBuilder("RelatedUserPinInputRender(content="), this.a, ')');
        }
    }

    public usf0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
