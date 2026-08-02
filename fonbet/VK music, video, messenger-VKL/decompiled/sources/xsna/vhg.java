package xsna;

import com.vk.voip.api.id.CallId;
import com.vk.voip.userid.CallsUserId;

/* compiled from: CommonCallListAction.kt */
/* loaded from: classes7.dex */
public abstract class vhg implements r49 {

    /* compiled from: CommonCallListAction.kt */
    public static final class a extends vhg {
        public static final a b = new a();
    }

    /* compiled from: CommonCallListAction.kt */
    public static abstract class b extends vhg {

        /* compiled from: CommonCallListAction.kt */
        public static final class a extends b {
            public static final a b = new a();
        }

        /* compiled from: CommonCallListAction.kt */
        /* renamed from: xsna.vhg$b$b, reason: collision with other inner class name */
        public static final class C3891b extends b {
            public static final C3891b b = new C3891b();
        }
    }

    /* compiled from: CommonCallListAction.kt */
    public static abstract class c extends vhg {

        /* compiled from: CommonCallListAction.kt */
        public static final class a extends c {
            public final long b;

            public a(long j) {
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b);
            }

            public final String toString() {
                return vu5.a(')', this.b, new StringBuilder("OpenChat(dialogId="));
            }
        }

        /* compiled from: CommonCallListAction.kt */
        public static final class b extends c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1965351306;
            }

            public final String toString() {
                return "OpenMax";
            }
        }

        /* compiled from: CommonCallListAction.kt */
        /* renamed from: xsna.vhg$c$c, reason: collision with other inner class name */
        public static final class C3892c extends c {
            public final String b;
            public final CallId c;

            public C3892c(CallId callId, String str) {
                this.b = str;
                this.c = callId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3892c)) {
                    return false;
                }
                C3892c c3892c = (C3892c) obj;
                return epx.f(this.b, c3892c.b) && epx.f(this.c, c3892c.c);
            }

            public final int hashCode() {
                return this.c.b.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "ShareLink(vkJoinLink=" + this.b + ", callId=" + this.c + ')';
            }
        }

        /* compiled from: CommonCallListAction.kt */
        public static final class d extends c {
            public final String b;

            public d(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("ShareQR(vkJoinLink="), this.b, ')');
            }
        }

        /* compiled from: CommonCallListAction.kt */
        public static final class e extends c {
            public final a59 b;

            public e(a59 a59Var) {
                this.b = a59Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ToChat(call=" + this.b + ')';
            }
        }

        /* compiled from: CommonCallListAction.kt */
        public static final class f extends c {
            public final String b;

            public f(String str) {
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("ToJoinCallByLink(vkJoinLink="), this.b, ')');
            }
        }

        /* compiled from: CommonCallListAction.kt */
        public static final class g extends c {
            public final a59 b;
            public final t49 c;
            public final boolean d;
            public final boolean e;

            public g(a59 a59Var, t49 t49Var, boolean z, boolean z2) {
                this.b = a59Var;
                this.c = t49Var;
                this.d = z;
                this.e = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                return epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c) && this.d == gVar.d && this.e == gVar.e;
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                t49 t49Var = this.c;
                return Boolean.hashCode(this.e) + qoy.b((hashCode + (t49Var == null ? 0 : t49Var.hashCode())) * 31, 31, this.d);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ToMakeCall(call=");
                sb.append(this.b);
                sb.append(", contact=");
                sb.append(this.c);
                sb.append(", isVideoEnabled=");
                sb.append(this.d);
                sb.append(", isFromMore=");
                return defpackage.q0.a(sb, this.e, ')');
            }
        }

        /* compiled from: CommonCallListAction.kt */
        public static final class h extends c {
        }

        /* compiled from: CommonCallListAction.kt */
        public static final class i extends c {
            public final CallsUserId b;

            public i(CallsUserId callsUserId) {
                this.b = callsUserId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "ToProfile(uid=" + this.b + ')';
            }
        }

        /* compiled from: CommonCallListAction.kt */
        public static final class j extends c {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                ((j) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "ToShareJoinLink(call=null)";
            }
        }
    }

    /* compiled from: CommonCallListAction.kt */
    public static final class d extends vhg {
        public static final d b = new d();
    }
}
