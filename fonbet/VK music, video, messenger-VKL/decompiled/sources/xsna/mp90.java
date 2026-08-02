package xsna;

import com.vk.voip.userid.CallsUserId;

/* compiled from: PastCallViewEvent.kt */
/* loaded from: classes7.dex */
public abstract class mp90 implements j59 {

    /* compiled from: PastCallViewEvent.kt */
    public static abstract class a extends mp90 {

        /* compiled from: PastCallViewEvent.kt */
        /* renamed from: xsna.mp90$a$a, reason: collision with other inner class name */
        public static final class C3363a extends a {
            public final a59 a;

            public C3363a(a59 a59Var) {
                this.a = a59Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3363a) && epx.f(this.a, ((C3363a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Info(call=" + this.a + ')';
            }
        }

        /* compiled from: PastCallViewEvent.kt */
        public static final class b extends a {
            public final a59 a;

            public b(a59 a59Var) {
                this.a = a59Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "InfoFromMore(call=" + this.a + ')';
            }
        }

        /* compiled from: PastCallViewEvent.kt */
        public static final class c extends a {
            public final a59 a;

            public c(a59 a59Var) {
                this.a = a59Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Remove(call=" + this.a + ')';
            }
        }
    }

    /* compiled from: PastCallViewEvent.kt */
    public static abstract class b extends mp90 {

        /* compiled from: PastCallViewEvent.kt */
        public static abstract class a extends b {

            /* compiled from: PastCallViewEvent.kt */
            /* renamed from: xsna.mp90$b$a$a, reason: collision with other inner class name */
            public static final class C3364a extends a {
                public static final C3364a a = new C3364a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof C3364a);
                }

                public final int hashCode() {
                    return 1515080153;
                }

                public final String toString() {
                    return "CallInMax";
                }
            }

            /* compiled from: PastCallViewEvent.kt */
            /* renamed from: xsna.mp90$b$a$b, reason: collision with other inner class name */
            public static final class C3365b extends a {
                public final a59 a;

                public C3365b(a59 a59Var) {
                    this.a = a59Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3365b) && epx.f(this.a, ((C3365b) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "DeleteCall(call=" + this.a + ')';
                }
            }

            /* compiled from: PastCallViewEvent.kt */
            public static final class c extends a {
                public final y49 a;

                public c(y49 y49Var) {
                    this.a = y49Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "JoinWithAudio(call=" + this.a + ')';
                }
            }

            /* compiled from: PastCallViewEvent.kt */
            public static final class d extends a {
                public final y49 a;

                public d(y49 y49Var) {
                    this.a = y49Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "JoinWithVideo(call=" + this.a + ')';
                }
            }

            /* compiled from: PastCallViewEvent.kt */
            public static final class e extends a {
                public final a59 a;
                public final t49 b;
                public final boolean c;

                public e(a59 a59Var, t49 t49Var, boolean z) {
                    this.a = a59Var;
                    this.b = t49Var;
                    this.c = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof e)) {
                        return false;
                    }
                    e eVar = (e) obj;
                    return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && this.c == eVar.c;
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 31;
                    t49 t49Var = this.b;
                    return Boolean.hashCode(this.c) + ((hashCode + (t49Var == null ? 0 : t49Var.hashCode())) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("MakeCallAudio(call=");
                    sb.append(this.a);
                    sb.append(", contact=");
                    sb.append(this.b);
                    sb.append(", isDirectIntent=");
                    return defpackage.q0.a(sb, this.c, ')');
                }
            }

            /* compiled from: PastCallViewEvent.kt */
            public static final class f extends a {
                public final a59 a;
                public final t49 b;
                public final boolean c;

                public f(a59 a59Var, t49 t49Var, boolean z) {
                    this.a = a59Var;
                    this.b = t49Var;
                    this.c = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof f)) {
                        return false;
                    }
                    f fVar = (f) obj;
                    return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b) && this.c == fVar.c;
                }

                public final int hashCode() {
                    int hashCode = this.a.hashCode() * 31;
                    t49 t49Var = this.b;
                    return Boolean.hashCode(this.c) + ((hashCode + (t49Var == null ? 0 : t49Var.hashCode())) * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("MakeCallVideo(call=");
                    sb.append(this.a);
                    sb.append(", contact=");
                    sb.append(this.b);
                    sb.append(", isDirectIntent=");
                    return defpackage.q0.a(sb, this.c, ')');
                }
            }

            /* compiled from: PastCallViewEvent.kt */
            public static final class g extends a {
                public final a59 a;

                public g(a59 a59Var) {
                    this.a = a59Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "ReportCall(call=" + this.a + ')';
                }
            }

            /* compiled from: PastCallViewEvent.kt */
            public static final class h extends a {
                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof h)) {
                        return false;
                    }
                    ((h) obj).getClass();
                    return true;
                }

                public final int hashCode() {
                    throw null;
                }

                public final String toString() {
                    return "ShareJoinLink(call=null)";
                }
            }

            /* compiled from: PastCallViewEvent.kt */
            public static final class i extends a {
                public final a59 a;

                public i(a59 a59Var) {
                    this.a = a59Var;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof i) && epx.f(this.a, ((i) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return "WriteMessage(call=" + this.a + ')';
                }
            }
        }

        /* compiled from: PastCallViewEvent.kt */
        /* renamed from: xsna.mp90$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC3366b extends b {

            /* compiled from: PastCallViewEvent.kt */
            /* renamed from: xsna.mp90$b$b$a */
            public static final class a extends AbstractC3366b {
                public static final a a = new a();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public final int hashCode() {
                    return 1338620466;
                }

                public final String toString() {
                    return "ShowMaxButton";
                }
            }
        }

        /* compiled from: PastCallViewEvent.kt */
        public static final class c extends b {
            public final CallsUserId a;

            public c(CallsUserId callsUserId) {
                this.a = callsUserId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "AvatarClick(uid=" + this.a + ')';
            }
        }

        /* compiled from: PastCallViewEvent.kt */
        public static final class d extends b {
            public static final d a = new d();
        }

        /* compiled from: PastCallViewEvent.kt */
        public static final class e extends b {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                ((e) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "OngoingCallClick(call=null)";
            }
        }

        /* compiled from: PastCallViewEvent.kt */
        public static final class f extends b {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                ((f) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "OngoingCurrentCallClick(call=null)";
            }
        }
    }

    /* compiled from: PastCallViewEvent.kt */
    public static abstract class c extends mp90 {

        /* compiled from: PastCallViewEvent.kt */
        public static final class a extends c {
            public static final a a = new a();
        }

        /* compiled from: PastCallViewEvent.kt */
        public static final class b extends c {
            public static final b a = new b();
        }

        /* compiled from: PastCallViewEvent.kt */
        /* renamed from: xsna.mp90$c$c, reason: collision with other inner class name */
        public static final class C3367c extends c {
            public static final C3367c a = new C3367c();
        }
    }
}
