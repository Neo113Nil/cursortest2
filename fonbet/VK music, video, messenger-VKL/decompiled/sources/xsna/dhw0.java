package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.voip.api.dto.VoipChatInfo;
import com.vk.voip.dto.call_member.CallMemberId;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.participant.movie.Movie;

/* compiled from: VoipCallInfo.kt */
/* loaded from: classes7.dex */
public final class dhw0 {
    public final xdw0 A;
    public final VoipChatInfo B;
    public final xmw0 C;
    public final boolean D;
    public final boolean E;
    public final int F;
    public final Set<UserId> G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final k8x0 L;
    public final UserId M;
    public final kr5 N;
    public final boolean O;
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final Set<CallMemberId> h;
    public final int i;
    public final Set<CallMemberId> j;
    public final Set<CallMemberId> k;
    public final Set<CallMemberId> l;
    public final CallMemberId m;
    public final Set<CallMemberId> n;
    public final Set<CallMemberId> o;
    public final Set<CallMemberId> p;
    public final Map<CallMemberId, List<Movie>> q;
    public final Set<CallMemberId> r;
    public final Map<CallMemberId, MediaOptionState> s;
    public final Map<CallMemberId, MediaOptionState> t;
    public final Map<CallMemberId, MediaOptionState> u;
    public final Map<CallMemberId, MediaOptionState> v;
    public final Set<CallMemberId> w;
    public final Set<CallMemberId> x;
    public final CallMemberId y;
    public final CallMemberId z;

    public dhw0(String str, long j, String str2, String str3, String str4, boolean z, boolean z2, Set set, int i, Set set2, Set set3, Set set4, CallMemberId callMemberId, Set set5, Set set6, Set set7, Map map, Set set8, Map map2, Map map3, Map map4, Map map5, Set set9, Set set10, CallMemberId callMemberId2, CallMemberId callMemberId3, xdw0 xdw0Var, VoipChatInfo voipChatInfo, xmw0 xmw0Var, boolean z3, boolean z4, int i2, Set set11, boolean z5, boolean z6, boolean z7, boolean z8, k8x0 k8x0Var, UserId userId, kr5 kr5Var) {
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.h = set;
        this.i = i;
        this.j = set2;
        this.k = set3;
        this.l = set4;
        this.m = callMemberId;
        this.n = set5;
        this.o = set6;
        this.p = set7;
        this.q = map;
        this.r = set8;
        this.s = map2;
        this.t = map3;
        this.u = map4;
        this.v = map5;
        this.w = set9;
        this.x = set10;
        this.y = callMemberId2;
        this.z = callMemberId3;
        this.A = xdw0Var;
        this.B = voipChatInfo;
        this.C = xmw0Var;
        this.D = z3;
        this.E = z4;
        this.F = i2;
        this.G = set11;
        this.H = z5;
        this.I = z6;
        this.J = z7;
        this.K = z8;
        this.L = k8x0Var;
        this.M = userId;
        this.N = kr5Var;
        this.O = fkq0.b(userId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static dhw0 a(dhw0 dhw0Var, String str, long j, String str2, String str3, String str4, LinkedHashSet linkedHashSet, int i, LinkedHashSet linkedHashSet2, LinkedHashSet linkedHashSet3, LinkedHashSet linkedHashSet4, CallMemberId callMemberId, LinkedHashSet linkedHashSet5, LinkedHashSet linkedHashSet6, LinkedHashSet linkedHashSet7, HashMap hashMap, LinkedHashSet linkedHashSet8, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, LinkedHashSet linkedHashSet9, LinkedHashSet linkedHashSet10, CallMemberId callMemberId2, CallMemberId callMemberId3, xdw0 xdw0Var, VoipChatInfo voipChatInfo, boolean z, boolean z2, int i2, Set set, boolean z3, boolean z4, boolean z5, boolean z6, k8x0 k8x0Var, kr5 kr5Var, int i3, int i4) {
        String str5 = (i3 & 1) != 0 ? dhw0Var.a : str;
        long j2 = (i3 & 2) != 0 ? dhw0Var.b : j;
        String str6 = (i3 & 4) != 0 ? dhw0Var.c : str2;
        String str7 = (i3 & 8) != 0 ? dhw0Var.d : str3;
        String str8 = (i3 & 16) != 0 ? dhw0Var.e : str4;
        boolean z7 = (i3 & 32) != 0 ? dhw0Var.f : false;
        boolean z8 = (i3 & 64) != 0 ? dhw0Var.g : false;
        Set set2 = (i3 & 128) != 0 ? dhw0Var.h : linkedHashSet;
        int i5 = (i3 & 256) != 0 ? dhw0Var.i : i;
        Set set3 = (i3 & 512) != 0 ? dhw0Var.j : linkedHashSet2;
        Set set4 = (i3 & 1024) != 0 ? dhw0Var.k : linkedHashSet3;
        Set set5 = (i3 & 2048) != 0 ? dhw0Var.l : linkedHashSet4;
        CallMemberId callMemberId4 = (i3 & 4096) != 0 ? dhw0Var.m : callMemberId;
        Set set6 = (i3 & 8192) != 0 ? dhw0Var.n : linkedHashSet5;
        Set set7 = (i3 & 16384) != 0 ? dhw0Var.o : linkedHashSet6;
        Set set8 = (32768 & i3) != 0 ? dhw0Var.p : linkedHashSet7;
        Map map = (65536 & i3) != 0 ? dhw0Var.q : hashMap;
        Set set9 = (131072 & i3) != 0 ? dhw0Var.r : linkedHashSet8;
        Map map2 = (262144 & i3) != 0 ? dhw0Var.s : linkedHashMap;
        Map map3 = (524288 & i3) != 0 ? dhw0Var.t : linkedHashMap2;
        Map map4 = (1048576 & i3) != 0 ? dhw0Var.u : linkedHashMap3;
        Map map5 = (2097152 & i3) != 0 ? dhw0Var.v : linkedHashMap4;
        Set set10 = (4194304 & i3) != 0 ? dhw0Var.w : linkedHashSet9;
        Set set11 = (8388608 & i3) != 0 ? dhw0Var.x : linkedHashSet10;
        CallMemberId callMemberId5 = (16777216 & i3) != 0 ? dhw0Var.y : callMemberId2;
        CallMemberId callMemberId6 = (33554432 & i3) != 0 ? dhw0Var.z : callMemberId3;
        xdw0 xdw0Var2 = (67108864 & i3) != 0 ? dhw0Var.A : xdw0Var;
        VoipChatInfo voipChatInfo2 = (134217728 & i3) != 0 ? dhw0Var.B : voipChatInfo;
        xmw0 xmw0Var = (268435456 & i3) != 0 ? dhw0Var.C : null;
        boolean z9 = (536870912 & i3) != 0 ? dhw0Var.D : z;
        boolean z10 = (1073741824 & i3) != 0 ? dhw0Var.E : z2;
        int i6 = (i3 & Integer.MIN_VALUE) != 0 ? dhw0Var.F : i2;
        Set set12 = (i4 & 1) != 0 ? dhw0Var.G : set;
        boolean z11 = (i4 & 2) != 0 ? dhw0Var.H : z3;
        boolean z12 = (i4 & 4) != 0 ? dhw0Var.I : z4;
        boolean z13 = (i4 & 8) != 0 ? dhw0Var.J : z5;
        boolean z14 = (i4 & 16) != 0 ? dhw0Var.K : z6;
        k8x0 k8x0Var2 = (i4 & 32) != 0 ? dhw0Var.L : k8x0Var;
        UserId userId = dhw0Var.M;
        dhw0Var.getClass();
        kr5 kr5Var2 = (i4 & 256) != 0 ? dhw0Var.N : kr5Var;
        dhw0Var.getClass();
        return new dhw0(str5, j2, str6, str7, str8, z7, z8, set2, i5, set3, set4, set5, callMemberId4, set6, set7, set8, map, set9, map2, map3, map4, map5, set10, set11, callMemberId5, callMemberId6, xdw0Var2, voipChatInfo2, xmw0Var, z9, z10, i6, set12, z11, z12, z13, z14, k8x0Var2, userId, kr5Var2);
    }

    public final xdw0 b() {
        return this.A;
    }

    public final boolean c() {
        return r() || this.a != null;
    }

    public final kr5 d() {
        return this.N;
    }

    public final VoipChatInfo e() {
        return this.B;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhw0)) {
            return false;
        }
        dhw0 dhw0Var = (dhw0) obj;
        return epx.f(this.a, dhw0Var.a) && this.b == dhw0Var.b && epx.f(this.c, dhw0Var.c) && epx.f(this.d, dhw0Var.d) && epx.f(this.e, dhw0Var.e) && this.f == dhw0Var.f && this.g == dhw0Var.g && epx.f(this.h, dhw0Var.h) && this.i == dhw0Var.i && epx.f(this.j, dhw0Var.j) && epx.f(this.k, dhw0Var.k) && epx.f(this.l, dhw0Var.l) && epx.f(this.m, dhw0Var.m) && epx.f(this.n, dhw0Var.n) && epx.f(this.o, dhw0Var.o) && epx.f(this.p, dhw0Var.p) && epx.f(this.q, dhw0Var.q) && epx.f(this.r, dhw0Var.r) && epx.f(this.s, dhw0Var.s) && epx.f(this.t, dhw0Var.t) && epx.f(this.u, dhw0Var.u) && epx.f(this.v, dhw0Var.v) && epx.f(this.w, dhw0Var.w) && epx.f(this.x, dhw0Var.x) && epx.f(this.y, dhw0Var.y) && epx.f(this.z, dhw0Var.z) && epx.f(this.A, dhw0Var.A) && epx.f(this.B, dhw0Var.B) && epx.f(this.C, dhw0Var.C) && this.D == dhw0Var.D && this.E == dhw0Var.E && this.F == dhw0Var.F && epx.f(this.G, dhw0Var.G) && this.H == dhw0Var.H && this.I == dhw0Var.I && this.J == dhw0Var.J && this.K == dhw0Var.K && epx.f(this.L, dhw0Var.L) && epx.f(this.M, dhw0Var.M) && epx.f(this.N, dhw0Var.N);
    }

    public final xmw0 f() {
        return this.C;
    }

    public final long g() {
        return this.b;
    }

    public final String h() {
        return this.d;
    }

    public final int hashCode() {
        String str = this.a;
        int b = fw3.b(fw3.b(fw3.b(shy.a(this.i, fw3.b(qoy.b(qoy.b(urd0.a(urd0.a(urd0.a(bh10.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31, this.j), 31, this.k), 31, this.l);
        CallMemberId callMemberId = this.m;
        int b2 = fw3.b(fw3.b(v11.a(v11.a(v11.a(v11.a(fw3.b(v11.a(fw3.b(fw3.b(fw3.b((b + (callMemberId == null ? 0 : callMemberId.hashCode())) * 31, 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x);
        CallMemberId callMemberId2 = this.y;
        int hashCode = (b2 + (callMemberId2 == null ? 0 : callMemberId2.hashCode())) * 31;
        CallMemberId callMemberId3 = this.z;
        int hashCode2 = (hashCode + (callMemberId3 == null ? 0 : callMemberId3.hashCode())) * 31;
        xdw0 xdw0Var = this.A;
        int hashCode3 = (hashCode2 + (xdw0Var == null ? 0 : xdw0Var.hashCode())) * 31;
        VoipChatInfo voipChatInfo = this.B;
        int hashCode4 = (hashCode3 + (voipChatInfo == null ? 0 : voipChatInfo.hashCode())) * 31;
        xmw0 xmw0Var = this.C;
        return this.N.hashCode() + shy.a(0, bh10.a((this.L.hashCode() + qoy.b(qoy.b(qoy.b(qoy.b(fw3.b(shy.a(this.F, qoy.b(qoy.b((hashCode4 + (xmw0Var == null ? 0 : xmw0Var.hashCode())) * 31, 31, this.D), 31, this.E), 31), 31, this.G), 31, this.H), 31, this.I), 31, this.J), 31, this.K)) * 31, 31, this.M.b), 31);
    }

    public final String i() {
        return this.a;
    }

    public final int j() {
        return this.i;
    }

    public final Set<CallMemberId> k() {
        return this.h;
    }

    public final String l() {
        return this.e;
    }

    public final CallMemberId m() {
        return this.z;
    }

    public final CallMemberId n() {
        return this.m;
    }

    public final UserId o() {
        return this.M;
    }

    public final k8x0 p() {
        return this.L;
    }

    public final Set<CallMemberId> q() {
        return this.o;
    }

    public final boolean r() {
        return this.A != null;
    }

    public final boolean s() {
        return this.D;
    }

    public final boolean t() {
        return fkq0.c(this.M) && this.D;
    }

    public final String toString() {
        return "VoipCallInfo(joinLink=" + this.a + ", dialogId=" + this.b + ", shortName=" + this.c + ", fullName=" + this.d + ", photoMax=" + this.e + ", isFemale=" + this.f + ", isVerified=" + this.g + ", membersIds=" + this.h + ", maxMembersCount=" + this.i + ", acceptingIds=" + this.j + ", connectingIds=" + this.k + ", talkingIds=" + this.l + ", speakerId=" + this.m + ", withAudioIds=" + this.n + ", withVideoIds=" + this.o + ", withAnimojiIds=" + this.p + ", movies=" + this.q + ", withScreencastIds=" + this.r + ", audioOptionStates=" + this.s + ", videoOptionStates=" + this.t + ", watchTogetherOptionStates=" + this.u + ", screencastOptionStates=" + this.v + ", creatorIds=" + this.w + ", adminIds=" + this.x + ", pinnedForMeId=" + this.y + ", pinnedForAllId=" + this.z + ", anonymousUserInfo=" + this.A + ", chatInfo=" + this.B + ", contactInfo=" + this.C + ", isGroupCall=" + this.D + ", isServerTopology=" + this.E + ", unreadMsgCount=" + this.F + ", chatAdminsVkIds=" + this.G + ", canModifyLink=" + this.H + ", isAnonJoinForbidden=" + this.I + ", waitingRoomEnabled=" + this.J + ", isRecurrent=" + this.K + ", waitingRoomParticipantsData=" + this.L + ", tokenizedCallerId=" + this.M + ", currentDeviceIdx=0, avatar=" + this.N + ')';
    }

    public final boolean u() {
        return this.E;
    }

    public final boolean v() {
        return fkq0.c(this.M);
    }

    public final dhw0 w(VoipChatInfo voipChatInfo) {
        if (voipChatInfo == null) {
            return a(this, null, 0L, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, false, false, false, false, null, null, -134217731, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
        }
        long j = voipChatInfo.b;
        String str = voipChatInfo.c;
        return a(this, null, j, str, str, voipChatInfo.d, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, voipChatInfo, true, false, 0, null, false, false, false, false, null, null, -671088767, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
    }
}
