package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import java.util.Set;

/* compiled from: CallSettingsAction.kt */
/* loaded from: classes7.dex */
public abstract class c99 {

    /* compiled from: CallSettingsAction.kt */
    public static final class a extends c99 {
        public static final a a = new a();
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class a0 extends c99 {
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class b extends c99 {
        public final Set<String> a;

        public b(Set<String> set) {
            this.a = set;
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
            return ur.c(new StringBuilder("AddToCallStart(ids="), this.a, ')');
        }
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class b0 extends c99 {
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class c extends c99 {
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class c0 extends c99 {
        public final boolean a = true;
        public final boolean b;
        public final String c;

        public c0(boolean z, String str) {
            this.b = z;
            this.c = str;
        }
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class d extends c99 {
        public final String a;

        public d(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("AddToInviteList(id="), this.a, ')');
        }
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class d0 extends c99 {
        public final CallMemberId a;
        public final boolean b = true;

        public d0(CallMemberId callMemberId) {
            this.a = callMemberId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d0)) {
                return false;
            }
            d0 d0Var = (d0) obj;
            return epx.f(this.a, d0Var.a) && this.b == d0Var.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PromoteWaitingParticipant(id=");
            sb.append(this.a);
            sb.append(", isPromote=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: CallSettingsAction.kt */
    public static abstract class e extends c99 {

        /* compiled from: CallSettingsAction.kt */
        public static final class a extends e {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -463099269;
            }

            public final String toString() {
                return "EndCallForAll";
            }
        }

        /* compiled from: CallSettingsAction.kt */
        public static final class b extends e {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -842322447;
            }

            public final String toString() {
                return "LowerHandsForAll";
            }
        }

        /* compiled from: CallSettingsAction.kt */
        public static final class c extends e {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1484432878;
            }

            public final String toString() {
                return "MuteMicrophonesForAll";
            }
        }

        /* compiled from: CallSettingsAction.kt */
        public static final class d extends e {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -1809017309;
            }

            public final String toString() {
                return "RequestMediaForAll";
            }
        }

        /* compiled from: CallSettingsAction.kt */
        /* renamed from: xsna.c99$e$e, reason: collision with other inner class name */
        public static final class C2650e extends e {
            public static final C2650e a = new C2650e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C2650e);
            }

            public final int hashCode() {
                return 2076217002;
            }

            public final String toString() {
                return "TurnOffCamerasForAll";
            }
        }
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class e0 extends c99 {
        public static final e0 a = new e0();
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class f extends c99 {
        public final boolean a;

        public f(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a == ((f) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("AnonymousJoinChanged(isAnonJoinForbidden="), this.a, ')');
        }
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class f0 extends c99 {
        public final String a;

        public f0(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f0) && epx.f(this.a, ((f0) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("RemoveFromInviteList(id="), this.a, ')');
        }
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class g extends c99 {
        public static final g a = new g();
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class g0 extends c99 {
        public final CallMemberId a;

        public g0(CallMemberId callMemberId) {
            this.a = callMemberId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g0) && epx.f(this.a, ((g0) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "RequestParticipantSettings(id=" + this.a + ')';
        }
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class h extends c99 {
        public static final h a = new h();
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class h0 extends c99 {
        public static final h0 a = new h0();
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class i0 extends c99 {
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class j extends c99 {
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class j0 extends c99 {
        public final String a;

        public j0(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j0) && epx.f(this.a, ((j0) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Search(query="), this.a, ')');
        }
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class k extends c99 {
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class k0 extends c99 {
        public static final k0 a = new k0();
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class l extends c99 {
        public final boolean a;

        public l(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.a == ((l) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("FeedbackChanged(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class l0 extends c99 {
        public static final l0 a = new l0();
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class m extends c99 {
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class m0 extends c99 {
        public final boolean a;

        public m0(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m0) && this.a == ((m0) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ShowQrCodeScanner(show="), this.a, ')');
        }
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class n extends c99 {
        public static final n a = new n();
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class n0 extends c99 {
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class o extends c99 {
        public final boolean a;

        public o(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.a == ((o) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("InviteSelectedMembers(isShowChatHistory="), this.a, ')');
        }
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class o0 extends c99 {
        public final boolean a;

        public o0(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o0) && this.a == ((o0) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("WaitingRoomChanged(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class p extends c99 {
        public final boolean a;

        public p(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.a == ((p) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("IsServiceChatChanged(isService="), this.a, ')');
        }
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class p0 extends c99 {
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class q extends c99 {
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class r extends c99 {
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class s extends c99 {
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class t extends c99 {
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class u extends c99 {
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class v extends c99 {
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class w extends c99 {
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class x extends c99 {
        public static final x a = new x();
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class y extends c99 {
        public static final y a = new y();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof y);
        }

        public final int hashCode() {
            return -584415784;
        }

        public final String toString() {
            return "OnClickInviteSelectedMembers";
        }
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class z extends c99 {
        public static final z a = new z();
    }

    /* compiled from: CallSettingsAction.kt */
    public static final class i extends c99 {
        public final String a;

        public i(String str) {
            this.a = str;
        }

        public i() {
            this(null);
        }
    }
}
