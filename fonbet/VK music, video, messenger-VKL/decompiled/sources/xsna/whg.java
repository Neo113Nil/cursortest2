package xsna;

import com.vk.core.voip.VoipCallSource;
import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.voip.api.id.CallId;
import com.vk.voip.api.join.JoinData;

/* compiled from: CommonCallListNavigationEvent.kt */
/* loaded from: classes7.dex */
public abstract class whg implements x49 {

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class a extends whg {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1021028792;
        }

        public final String toString() {
            return "CreateScheduledCall";
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class a0 extends whg {
        public final String a;

        public a0(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a0) && epx.f(this.a, ((a0) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ToShareQR(vkJoinLink="), this.a, ')');
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class b extends whg {
        public final UserId a;

        public b(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("ReportCall(userId="), this.a, ')');
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class b0 extends whg {
        public final UserId a;

        public b0(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b0) && epx.f(this.a, ((b0) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("ToUserProfile(uid="), this.a, ')');
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class c extends whg {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -160442324;
        }

        public final String toString() {
            return "ToAsrList";
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class c0 extends whg {
        public static final c0 a = new c0();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c0);
        }

        public final int hashCode() {
            return -1179495963;
        }

        public final String toString() {
            return "ToUserRecords";
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class d extends whg {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -801548240;
        }

        public final String toString() {
            return "ToCall";
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class e extends whg {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -2051405561;
        }

        public final String toString() {
            return "ToCallByPhone";
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class f extends whg {
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
            return "ToCallSelectJoinAs(joinData=null, preselectedId=null)";
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class g extends whg {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ToCallSelectJoinAsWithChangeName(requestKey=null, preselectedUser=null, callId=null)";
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class h extends whg {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 517328081;
        }

        public final String toString() {
            return "ToCallsHistory";
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class i extends whg {
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class j extends whg {
        public final boolean a;

        public j(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            jVar.getClass();
            return this.a == jVar.a;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ToGroupCallJoinAsAnonym(anonymJoinData=null, isVideoEnabled="), this.a, ')');
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class k extends whg {
        public final JoinData a;
        public final boolean b;

        public k(JoinData joinData, boolean z) {
            this.a = joinData;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.a, kVar.a) && this.b == kVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToGroupCallJoinAsCurrentUser(joinData=");
            sb.append(this.a);
            sb.append(", isVideoEnabled=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class l extends whg {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            ((l) obj).getClass();
            return epx.f(null, null) && epx.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ToGroupCallJoinAsCurrentUserWithChangedName(joinData=" + ((Object) null) + ", isVideoEnabled=false, changeNameCallParams=" + ((Object) null) + ')';
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class m extends whg {
        public final boolean a;
        public final UserId b;

        public m(UserId userId, boolean z) {
            this.a = z;
            this.b = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            mVar.getClass();
            return this.a == mVar.a && epx.f(this.b, mVar.b);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToGroupCallJoinAsGroup(joinData=null, isVideoEnabled=");
            sb.append(this.a);
            sb.append(", groupId=");
            return gp.b(sb, this.b, ')');
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class n extends whg {
        public final long a;

        public n(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.a == ((n) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("ToGroupChat(chatId="));
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class p extends whg {
        public final UserId a;
        public final boolean b;
        public final VoipCallSource c;

        public p(VoipCallSource voipCallSource, UserId userId, boolean z) {
            this.a = userId;
            this.b = z;
            this.c = voipCallSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return epx.f(this.a, pVar.a) && this.b == pVar.b && epx.f(this.c, pVar.c);
        }

        public final int hashCode() {
            int b = qoy.b(Long.hashCode(this.a.b) * 31, 31, this.b);
            VoipCallSource voipCallSource = this.c;
            return b + (voipCallSource == null ? 0 : voipCallSource.hashCode());
        }

        public final String toString() {
            return "ToMakeCall(uid=" + this.a + ", isVideoEnabled=" + this.b + ", source=" + this.c + ')';
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class q extends whg {
        public final t49 a;
        public final boolean b;
        public final VoipCallSource c;

        public q(t49 t49Var, boolean z, VoipCallSource voipCallSource) {
            this.a = t49Var;
            this.b = z;
            this.c = voipCallSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return epx.f(this.a, qVar.a) && this.b == qVar.b && epx.f(this.c, qVar.c);
        }

        public final int hashCode() {
            int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
            VoipCallSource voipCallSource = this.c;
            return b + (voipCallSource == null ? 0 : voipCallSource.hashCode());
        }

        public final String toString() {
            return "ToMakeContactCall(contact=" + this.a + ", isVideoEnabled=" + this.b + ", source=" + this.c + ')';
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class r extends whg {
        public static final r a = new r();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return -1826962094;
        }

        public final String toString() {
            return "ToMax";
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class s extends whg {
        public final VoipCallSource a;

        public s() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && epx.f(this.a, ((s) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ToNewCallByLink(callSource=" + this.a + ')';
        }

        public s(VoipCallSource voipCallSource) {
            this.a = voipCallSource;
        }

        public /* synthetic */ s(int i) {
            this(new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.HISTORY_CREATE, MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_CREATE_BY_LINK));
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class t extends whg {
        public final long a;

        public t(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && this.a == ((t) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("ToOpenChat(dialogId="));
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class u extends whg {
        public final UserId a;
        public final boolean b;

        public u(UserId userId, boolean z) {
            this.a = userId;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return epx.f(this.a, uVar.a) && this.b == uVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToPeerToPeerCallJoin(uid=");
            sb.append(this.a);
            sb.append(", isVideoEnabled=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class v extends whg {
        public final UserId a;

        public v(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof v) && epx.f(this.a, ((v) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("ToPeerToPeerChat(uid="), this.a, ')');
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class w extends whg {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof w)) {
                return false;
            }
            ((w) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ToQrCodeScanner(vkJoinLink=null)";
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class x extends whg {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof x)) {
                return false;
            }
            ((x) obj).getClass();
            return epx.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ToShareJoinLink(joinLink="), null, ')');
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class y extends whg {
        public final String a;

        public y(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof y) && epx.f(this.a, ((y) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ToShareLink(vkJoinLink="), this.a, ')');
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class z extends whg {
        public final CallId a;

        public z(CallId callId) {
            this.a = callId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof z) && epx.f(this.a, ((z) obj).a);
        }

        public final int hashCode() {
            return this.a.b.hashCode();
        }

        public final String toString() {
            return "ToShareLinkPager(callId=" + this.a + ')';
        }
    }

    /* compiled from: CommonCallListNavigationEvent.kt */
    public static final class o extends whg {
        public final String a;
        public final boolean b;
        public final String c;

        public o(String str, boolean z, String str2) {
            this.a = str;
            this.b = z;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return epx.f(this.a, oVar.a) && this.b == oVar.b && epx.f(this.c, oVar.c);
        }

        public final int hashCode() {
            int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ToJoinCallByLink(vkJoinLink=");
            sb.append(this.a);
            sb.append(", shouldAuthIfNeeded=");
            sb.append(this.b);
            sb.append(", name=");
            return ho8.a(sb, this.c, ')');
        }

        public /* synthetic */ o(String str) {
            this(str, false, null);
        }
    }
}
