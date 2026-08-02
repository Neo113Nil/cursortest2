package xsna;

/* compiled from: RelatedUserPinInputState.kt */
/* loaded from: classes6.dex */
public final class tsf0 implements km50 {
    public final a b;
    public final boolean c;

    /* compiled from: RelatedUserPinInputState.kt */
    public interface a {

        /* compiled from: RelatedUserPinInputState.kt */
        /* renamed from: xsna.tsf0$a$a, reason: collision with other inner class name */
        public static final class C3765a implements a {
            public static final C3765a a = new C3765a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C3765a);
            }

            public final int hashCode() {
                return 382290487;
            }

            public final String toString() {
                return "Data";
            }
        }

        /* compiled from: RelatedUserPinInputState.kt */
        public static abstract class b implements a {

            /* compiled from: RelatedUserPinInputState.kt */
            /* renamed from: xsna.tsf0$a$b$a, reason: collision with other inner class name */
            public static final class C3766a extends b {
                public static final C3766a a = new C3766a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3766a);
                }

                public final int hashCode() {
                    return 336497258;
                }

                public final String toString() {
                    return "CommonError";
                }
            }

            /* compiled from: RelatedUserPinInputState.kt */
            /* renamed from: xsna.tsf0$a$b$b, reason: collision with other inner class name */
            public static final class C3767b extends b {
                public final String a;

                public C3767b(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3767b) && epx.f(this.a, ((C3767b) obj).a);
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

            /* compiled from: RelatedUserPinInputState.kt */
            public static final class c extends b {
                public static final c a = new c();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof c);
                }

                public final int hashCode() {
                    return 1678689775;
                }

                public final String toString() {
                    return "TooManyTriesError";
                }
            }
        }

        /* compiled from: RelatedUserPinInputState.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 1751146383;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    public tsf0(a aVar, boolean z) {
        this.b = aVar;
        this.c = z;
    }

    public static tsf0 a(tsf0 tsf0Var, a aVar, int i) {
        if ((i & 1) != 0) {
            aVar = tsf0Var.b;
        }
        boolean z = (i & 2) != 0 ? tsf0Var.c : false;
        tsf0Var.getClass();
        return new tsf0(aVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsf0)) {
            return false;
        }
        tsf0 tsf0Var = (tsf0) obj;
        return epx.f(this.b, tsf0Var.b) && this.c == tsf0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelatedUserPinInputState(sceneState=");
        sb.append(this.b);
        sb.append(", isFistInteraction=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
