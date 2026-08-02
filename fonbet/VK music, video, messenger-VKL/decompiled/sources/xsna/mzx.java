package xsna;

import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.change_name.VoipChangeNameConfig;

/* compiled from: JoinCallNavigationEvent.kt */
/* loaded from: classes7.dex */
public interface mzx {

    /* compiled from: JoinCallNavigationEvent.kt */
    public static final class a implements mzx {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1576984914;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: JoinCallNavigationEvent.kt */
    public static final class b implements mzx {
        public final s0y a;

        public b(s0y s0yVar) {
            this.a = s0yVar;
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
            return "JoinToCall(joinCallParams=" + this.a + ')';
        }
    }

    /* compiled from: JoinCallNavigationEvent.kt */
    public static final class c implements mzx {
        public final VoipChangeNameConfig.PreselectedUser a;
        public final CallId b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public c(VoipChangeNameConfig.PreselectedUser preselectedUser, CallId callId, boolean z, boolean z2, boolean z3) {
            this.a = preselectedUser;
            this.b = callId;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + qoy.b(qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenJoinAsScreen(preselectedUser=");
            sb.append(this.a);
            sb.append(", callId=");
            sb.append(this.b);
            sb.append(", withGroups=");
            sb.append(this.c);
            sb.append(", withAnonym=");
            sb.append(this.d);
            sb.append(", withChangeName=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: JoinCallNavigationEvent.kt */
    public static final class d implements mzx {
        public final String a;
        public final MobileOfficialAppsCoreNavStat$EventScreen b;

        public d(MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, String str) {
            this.a = str;
            this.b = mobileOfficialAppsCoreNavStat$EventScreen;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenQrCodeScreen(joinLink=" + this.a + ", eventScreen=" + this.b + ')';
        }
    }

    /* compiled from: JoinCallNavigationEvent.kt */
    public static final class e implements mzx {
        public final String a;

        public e(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ShareLink(joinLink="), this.a, ')');
        }
    }

    /* compiled from: JoinCallNavigationEvent.kt */
    public static final class f implements mzx {
        public final CallId a;
        public final String b;

        public f(CallId callId, String str) {
            this.a = callId;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShareLinkNew(callId=");
            sb.append(this.a);
            sb.append(", joinLink=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: JoinCallNavigationEvent.kt */
    public static final class g implements mzx {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1856691906;
        }

        public final String toString() {
            return "ShowAnonForbiddenError";
        }
    }
}
