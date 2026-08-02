package xsna;

import com.vk.core.voip.VoipCallSource;
import com.vk.voip.api.id.CallId;

/* compiled from: CallLifecycleAnalytics.kt */
/* loaded from: classes11.dex */
public interface e49 {

    /* compiled from: CallLifecycleAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        public final boolean a;
        public final CallId b;

        public a(CallId callId, boolean z) {
            this.a = z;
            this.b = callId;
        }

        public final CallId a() {
            return this.b;
        }

        public final boolean b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.b.hashCode() + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            return "CallConnectedParams(isGroupCall=" + this.a + ", callId=" + this.b + ')';
        }
    }

    /* compiled from: CallLifecycleAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final class b {
        public final boolean a;
        public final long b;
        public final boolean c;
        public final Integer d;
        public final CallId e;
        public final boolean f;
        public final boolean g;

        public /* synthetic */ b(long j, boolean z, Integer num, CallId callId) {
            this(true, j, z, num, callId, false, false);
        }

        public final CallId a() {
            return this.e;
        }

        public final Integer b() {
            return this.d;
        }

        public final long c() {
            return this.b;
        }

        public final boolean d() {
            return this.a;
        }

        public final boolean e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e) && this.f == bVar.f && this.g == bVar.g;
        }

        public final int hashCode() {
            int b = qoy.b(bh10.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
            Integer num = this.d;
            return Boolean.hashCode(this.g) + qoy.b(urd0.a((b + (num == null ? 0 : num.hashCode())) * 31, 31, this.e.b), 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallDeclinedOrHangedLocallyParams(isBusy=");
            sb.append(this.a);
            sb.append(", peerId=");
            sb.append(this.b);
            sb.append(", isGroupCall=");
            sb.append(this.c);
            sb.append(", groupCallUsersCount=");
            sb.append(this.d);
            sb.append(", callId=");
            sb.append(this.e);
            sb.append(", fromUser=");
            sb.append(this.f);
            sb.append(", isDecline=");
            return defpackage.q0.a(sb, this.g, ')');
        }

        public b(boolean z, long j, boolean z2, Integer num, CallId callId, boolean z3, boolean z4) {
            this.a = z;
            this.b = j;
            this.c = z2;
            this.d = num;
            this.e = callId;
            this.f = z3;
            this.g = z4;
        }
    }

    /* compiled from: CallLifecycleAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final class c {
        public final CallId a;
        public final boolean b;
        public final boolean c;
        public final boolean d;

        public c(CallId callId, boolean z, boolean z2, boolean z3) {
            this.a = callId;
            this.b = z;
            this.c = z2;
            this.d = z3;
        }

        public final CallId a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public final boolean c() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && this.d == cVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(qoy.b(this.a.b.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallDeclinedOrHangedRemotelyParams(callId=");
            sb.append(this.a);
            sb.append(", isBusy=");
            sb.append(this.b);
            sb.append(", isTimeout=");
            sb.append(this.c);
            sb.append(", isGroupCall=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: CallLifecycleAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final class d {
        public final boolean a;
        public final Integer b;
        public final CallId c;

        public d(boolean z, Integer num, CallId callId) {
            this.a = z;
            this.b = num;
            this.c = callId;
        }

        public final CallId a() {
            return this.c;
        }

        public final Integer b() {
            return this.b;
        }

        public final boolean c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && epx.f(this.b, dVar.b) && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            Integer num = this.b;
            return this.c.b.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            return "CallDisconnectedParams(isGroupCall=" + this.a + ", groupCallUsersCount=" + this.b + ", callId=" + this.c + ')';
        }
    }

    /* compiled from: CallLifecycleAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final class e {
        public final long a;
        public final boolean b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final Throwable f;

        public e(long j, boolean z, long j2, boolean z2, boolean z3, Throwable th) {
            this.a = j;
            this.b = z;
            this.c = j2;
            this.d = z2;
            this.e = z3;
            this.f = th;
        }

        public final long a() {
            return this.c;
        }

        public final Throwable b() {
            return this.f;
        }

        public final boolean c() {
            return this.e;
        }

        public final long d() {
            return this.a;
        }

        public final boolean e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d && this.e == eVar.e && epx.f(this.f, eVar.f);
        }

        public final boolean f() {
            return this.d;
        }

        public final int hashCode() {
            return this.f.hashCode() + qoy.b(qoy.b(bh10.a(qoy.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallFailureParams(peerId=");
            sb.append(this.a);
            sb.append(", isGroupCall=");
            sb.append(this.b);
            sb.append(", currentUid=");
            sb.append(this.c);
            sb.append(", isIncoming=");
            sb.append(this.d);
            sb.append(", hasNetwork=");
            sb.append(this.e);
            sb.append(", e=");
            return oq.c(sb, this.f, ')');
        }
    }

    /* compiled from: CallLifecycleAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final class f {
        public final boolean a;
        public final boolean b;

        public f(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean a() {
            return this.b;
        }

        public final boolean b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && this.b == fVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IncomingCallAcceptedParams(isVideo=");
            sb.append(this.a);
            sb.append(", isGroupCall=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: CallLifecycleAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final class g {
        public final int a;
        public final String b;
        public final boolean c;
        public final CallId d;

        public g(int i, String str, boolean z, CallId callId) {
            this.a = i;
            this.b = str;
            this.c = z;
            this.d = callId;
        }

        public static g a(g gVar, CallId callId) {
            return new g(gVar.a, gVar.b, gVar.c, callId);
        }

        public final CallId b() {
            return this.d;
        }

        public final int c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final boolean e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a == gVar.a && epx.f(this.b, gVar.b) && this.c == gVar.c && epx.f(this.d, gVar.d);
        }

        public final int hashCode() {
            return this.d.b.hashCode() + qoy.b(urd0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "IncomingCallFailedParams(error=" + this.a + ", errorType=" + this.b + ", isGroupCall=" + this.c + ", callId=" + this.d + ')';
        }
    }

    /* compiled from: CallLifecycleAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final class h {
        public final boolean a;
        public final Long b;
        public final boolean c;
        public final CallId d;

        public h(boolean z, Long l, boolean z2, CallId callId) {
            this.a = z;
            this.b = l;
            this.c = z2;
            this.d = callId;
        }

        public final CallId a() {
            return this.d;
        }

        public final Long b() {
            return this.b;
        }

        public final boolean c() {
            return this.c;
        }

        public final boolean d() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a == hVar.a && epx.f(this.b, hVar.b) && this.c == hVar.c && epx.f(this.d, hVar.d);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.a) * 31;
            Long l = this.b;
            return this.d.b.hashCode() + qoy.b((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            return "IncomingCallReceivedParams(isVideo=" + this.a + ", peerId=" + this.b + ", isGroupCall=" + this.c + ", callId=" + this.d + ')';
        }
    }

    /* compiled from: CallLifecycleAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final class i {
        public final int a;
        public final String b;
        public final CallId c;

        public i(int i, String str, CallId callId) {
            this.a = i;
            this.b = str;
            this.c = callId;
        }

        public static i a(i iVar, CallId callId) {
            return new i(iVar.a, iVar.b, callId);
        }

        public final CallId b() {
            return this.c;
        }

        public final int c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a == iVar.a && epx.f(this.b, iVar.b) && epx.f(this.c, iVar.c);
        }

        public final int hashCode() {
            return this.c.b.hashCode() + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return "JoinToGroupCallFailedParams(error=" + this.a + ", errorType=" + this.b + ", callId=" + this.c + ')';
        }
    }

    /* compiled from: CallLifecycleAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final class j {
        public final CallId a;

        public j(CallId callId) {
            this.a = callId;
        }

        public final CallId a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.a, ((j) obj).a);
        }

        public final int hashCode() {
            return this.a.b.hashCode();
        }

        public final String toString() {
            return "JoinToGroupCallParams(callId=" + this.a + ')';
        }
    }

    /* compiled from: CallLifecycleAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final class k {
        public final boolean a;
        public final boolean b;
        public final CallId c;

        public k(CallId callId, boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
            this.c = callId;
        }

        public final CallId a() {
            return this.c;
        }

        public final boolean b() {
            return this.b;
        }

        public final boolean c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.a == kVar.a && this.b == kVar.b && epx.f(this.c, kVar.c);
        }

        public final int hashCode() {
            return this.c.b.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            return "OutgoingCallAcceptedRemotelyParams(isVideo=" + this.a + ", isGroupCall=" + this.b + ", callId=" + this.c + ')';
        }
    }

    /* compiled from: CallLifecycleAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final class l {
        public final int a;
        public final String b;
        public final boolean c;
        public final CallId d;
        public final VoipCallSource e;
        public final String f;

        public /* synthetic */ l(int i, String str, boolean z, CallId callId) {
            this(i, str, z, callId, null, null);
        }

        public static l a(l lVar, CallId callId) {
            return new l(lVar.a, lVar.b, lVar.c, callId, lVar.e, lVar.f);
        }

        public final CallId b() {
            return this.d;
        }

        public final int c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final String e() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.a == lVar.a && epx.f(this.b, lVar.b) && this.c == lVar.c && epx.f(this.d, lVar.d) && epx.f(this.e, lVar.e) && epx.f(this.f, lVar.f);
        }

        public final VoipCallSource f() {
            return this.e;
        }

        public final boolean g() {
            return this.c;
        }

        public final int hashCode() {
            int a = urd0.a(qoy.b(urd0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d.b);
            VoipCallSource voipCallSource = this.e;
            int hashCode = (a + (voipCallSource == null ? 0 : voipCallSource.hashCode())) * 31;
            String str = this.f;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OutgoingCallFailedParams(error=");
            sb.append(this.a);
            sb.append(", errorType=");
            sb.append(this.b);
            sb.append(", isGroupCall=");
            sb.append(this.c);
            sb.append(", callId=");
            sb.append(this.d);
            sb.append(", source=");
            sb.append(this.e);
            sb.append(", peerId=");
            return ho8.a(sb, this.f, ')');
        }

        public l(int i, String str, boolean z, CallId callId, VoipCallSource voipCallSource, String str2) {
            this.a = i;
            this.b = str;
            this.c = z;
            this.d = callId;
            this.e = voipCallSource;
            this.f = str2;
        }
    }

    /* compiled from: CallLifecycleAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final class m {
        public final boolean a;

        public m(boolean z) {
            this.a = z;
        }

        public final boolean a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.a == ((m) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("OutgoingCallRemoteRingingParams(isGroupCall="), this.a, ')');
        }
    }

    /* compiled from: CallLifecycleAnalytics.kt */
    /* loaded from: classes7.dex */
    public static final class n {
        public final boolean a;
        public final boolean b;
        public final Integer c;
        public final CallId d;
        public final VoipCallSource e;
        public final String f;

        public /* synthetic */ n(boolean z, boolean z2, Integer num, CallId callId) {
            this(z, z2, num, callId, null, null);
        }

        public final CallId a() {
            return this.d;
        }

        public final Integer b() {
            return this.c;
        }

        public final String c() {
            return this.f;
        }

        public final VoipCallSource d() {
            return this.e;
        }

        public final boolean e() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.a == nVar.a && this.b == nVar.b && epx.f(this.c, nVar.c) && epx.f(this.d, nVar.d) && epx.f(this.e, nVar.e) && epx.f(this.f, nVar.f);
        }

        public final boolean f() {
            return this.a;
        }

        public final int hashCode() {
            int b = qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
            Integer num = this.c;
            int a = urd0.a((b + (num == null ? 0 : num.hashCode())) * 31, 31, this.d.b);
            VoipCallSource voipCallSource = this.e;
            int hashCode = (a + (voipCallSource == null ? 0 : voipCallSource.hashCode())) * 31;
            String str = this.f;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OutgoingCallStartedParams(isVideo=");
            sb.append(this.a);
            sb.append(", isGroupCall=");
            sb.append(this.b);
            sb.append(", groupCallUsersCount=");
            sb.append(this.c);
            sb.append(", callId=");
            sb.append(this.d);
            sb.append(", source=");
            sb.append(this.e);
            sb.append(", peerId=");
            return ho8.a(sb, this.f, ')');
        }

        public n(boolean z, boolean z2, Integer num, CallId callId, VoipCallSource voipCallSource, String str) {
            this.a = z;
            this.b = z2;
            this.c = num;
            this.d = callId;
            this.e = voipCallSource;
            this.f = str;
        }
    }

    default void B0(e eVar) {
    }

    default void D0(l lVar) {
    }

    default void E(j jVar) {
    }

    default void J(m mVar) {
    }

    default void K0(i iVar) {
    }

    default void U(d dVar) {
    }

    default void V(a aVar) {
    }

    default void f0(g gVar) {
    }

    default void h(n nVar) {
    }

    default void u(h hVar) {
    }

    default void v(f fVar) {
    }

    default void y(c cVar) {
    }

    default void z(k kVar) {
    }

    default void K(String str, b bVar) {
    }
}
