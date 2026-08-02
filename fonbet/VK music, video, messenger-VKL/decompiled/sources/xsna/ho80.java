package xsna;

/* compiled from: OngoingCallAction.kt */
/* loaded from: classes7.dex */
public abstract class ho80 implements r49 {

    /* compiled from: OngoingCallAction.kt */
    public static abstract class a extends ho80 {

        /* compiled from: OngoingCallAction.kt */
        /* renamed from: xsna.ho80$a$a, reason: collision with other inner class name */
        public static final class C3012a extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3012a)) {
                    return false;
                }
                ((C3012a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "OpenModernJoinCallScreen(call=null)";
            }
        }

        /* compiled from: OngoingCallAction.kt */
        public static final class b extends a {
        }

        /* compiled from: OngoingCallAction.kt */
        public static final class c extends a {
        }

        /* compiled from: OngoingCallAction.kt */
        public static final class d extends a {
        }

        /* compiled from: OngoingCallAction.kt */
        public static final class e extends a {
        }

        /* compiled from: OngoingCallAction.kt */
        public static abstract class f extends a {

            /* compiled from: OngoingCallAction.kt */
            /* renamed from: xsna.ho80$a$f$a, reason: collision with other inner class name */
            public static final class C3013a extends f {
                public final y49 b;
                public final boolean c;

                public C3013a(y49 y49Var, boolean z) {
                    this.b = y49Var;
                    this.c = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C3013a)) {
                        return false;
                    }
                    C3013a c3013a = (C3013a) obj;
                    return epx.f(this.b, c3013a.b) && this.c == c3013a.c;
                }

                public final int hashCode() {
                    return qoy.b(this.b.hashCode() * 31, 31, this.c);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Join(call=");
                    sb.append(this.b);
                    sb.append(", isVideoEnabled=");
                    return n23.b(sb, this.c, ", changeNameModel=null)");
                }
            }

            /* compiled from: OngoingCallAction.kt */
            public static final class b extends f {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    ((b) obj).getClass();
                    return true;
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    return "Open(call=null)";
                }
            }
        }

        /* compiled from: OngoingCallAction.kt */
        public static final class g extends a {
        }

        /* compiled from: OngoingCallAction.kt */
        public static final class h extends a {
        }
    }
}
