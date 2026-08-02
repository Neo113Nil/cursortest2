package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.voip.api.id.CallId;
import com.vk.voip.dto.call_member.CallMemberId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.android.webrtc.media_options.MediaOptionState;
import ru.ok.android.webrtc.sessionroom.SessionRoomId;

/* compiled from: CallState.kt */
/* loaded from: classes7.dex */
public abstract class ca9 {

    /* compiled from: CallState.kt */
    public static final class a extends ca9 {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
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
            return oq.c(new StringBuilder("Error(error="), this.a, ')');
        }
    }

    /* compiled from: CallState.kt */
    public static final class b extends ca9 {
        public static final b a = new b();
    }

    /* compiled from: CallState.kt */
    public static final class d extends ca9 {
        public static final d a = new d();
    }

    /* compiled from: CallState.kt */
    public static final class c extends ca9 {
        public final boolean A;
        public final boolean B;
        public final Set<CallMemberId> C;
        public final Set<CallMemberId> D;
        public final CallMemberId E;
        public final CallMemberId F;
        public final boolean G;
        public final boolean H;
        public final boolean I;
        public final FeatureRoles J;
        public final boolean K;
        public final boolean L;
        public final SessionRoomId M;
        public final boolean N;
        public final Boolean O;
        public final CallId a;
        public final CallMemberId b;
        public final Dialog c;
        public final Set<CallMemberId> d;
        public final List<CallMemberId> e;
        public final Set<String> f;
        public final Set<String> g;
        public final Set<String> h;
        public final Set<String> i;
        public final boolean j;
        public final Collection<CallMemberId> k;
        public final boolean l;
        public final Map<String, whr0> m;
        public final Set<CallMemberId> n;
        public final Set<CallMemberId> o;
        public final Set<CallMemberId> p;
        public final Set<CallMemberId> q;
        public final Set<CallMemberId> r;
        public final Set<CallMemberId> s;
        public final Map<CallMemberId, MediaOptionState> t;
        public final Map<CallMemberId, MediaOptionState> u;
        public final Map<CallMemberId, MediaOptionState> v;
        public final boolean w;
        public final boolean x;
        public final boolean y;
        public final boolean z;

        /* JADX WARN: Multi-variable type inference failed */
        public c(CallId callId, CallMemberId callMemberId, Dialog dialog, Set<CallMemberId> set, List<CallMemberId> list, Set<String> set2, Set<String> set3, Set<String> set4, Set<String> set5, boolean z, Collection<CallMemberId> collection, boolean z2, Map<String, whr0> map, Set<CallMemberId> set6, Set<CallMemberId> set7, Set<CallMemberId> set8, Set<CallMemberId> set9, Set<CallMemberId> set10, Set<CallMemberId> set11, Map<CallMemberId, ? extends MediaOptionState> map2, Map<CallMemberId, ? extends MediaOptionState> map3, Map<CallMemberId, ? extends MediaOptionState> map4, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, Set<CallMemberId> set12, Set<CallMemberId> set13, CallMemberId callMemberId2, CallMemberId callMemberId3, boolean z9, boolean z10, boolean z11, FeatureRoles featureRoles, boolean z12, boolean z13, SessionRoomId sessionRoomId, boolean z14, Boolean bool) {
            this.a = callId;
            this.b = callMemberId;
            this.c = dialog;
            this.d = set;
            this.e = list;
            this.f = set2;
            this.g = set3;
            this.h = set4;
            this.i = set5;
            this.j = z;
            this.k = collection;
            this.l = z2;
            this.m = map;
            this.n = set6;
            this.o = set7;
            this.p = set8;
            this.q = set9;
            this.r = set10;
            this.s = set11;
            this.t = map2;
            this.u = map3;
            this.v = map4;
            this.w = z3;
            this.x = z4;
            this.y = z5;
            this.z = z6;
            this.A = z7;
            this.B = z8;
            this.C = set12;
            this.D = set13;
            this.E = callMemberId2;
            this.F = callMemberId3;
            this.G = z9;
            this.H = z10;
            this.I = z11;
            this.J = featureRoles;
            this.K = z12;
            this.L = z13;
            this.M = sessionRoomId;
            this.N = z14;
            this.O = bool;
        }

        public static c a(c cVar, Map map, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, Map map2, Map map3, Map map4, boolean z, Set set7, Set set8, CallMemberId callMemberId, CallMemberId callMemberId2, boolean z2, FeatureRoles featureRoles, boolean z3, SessionRoomId sessionRoomId, boolean z4, Boolean bool, int i, int i2) {
            boolean z5;
            boolean z6;
            boolean z7;
            Set set9;
            boolean z8;
            FeatureRoles featureRoles2;
            boolean z9;
            boolean z10;
            CallId callId = cVar.a;
            CallMemberId callMemberId3 = cVar.b;
            Dialog dialog = cVar.c;
            Set<CallMemberId> set10 = cVar.d;
            List<CallMemberId> list = cVar.e;
            Set<String> set11 = cVar.f;
            Set<String> set12 = cVar.g;
            Set<String> set13 = cVar.h;
            Set<String> set14 = cVar.i;
            boolean z11 = cVar.j;
            Collection<CallMemberId> collection = cVar.k;
            boolean z12 = cVar.l;
            Map map5 = (i & 4096) != 0 ? cVar.m : map;
            Set set15 = (i & 8192) != 0 ? cVar.n : set;
            Set set16 = (i & 16384) != 0 ? cVar.o : set2;
            Set set17 = (i & 32768) != 0 ? cVar.p : set3;
            Set set18 = (i & 65536) != 0 ? cVar.q : set4;
            Set set19 = (i & 131072) != 0 ? cVar.r : set5;
            Set set20 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? cVar.s : set6;
            Map map6 = (i & 524288) != 0 ? cVar.t : map2;
            Map map7 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? cVar.u : map3;
            Map map8 = (i & 2097152) != 0 ? cVar.v : map4;
            boolean z13 = cVar.w;
            boolean z14 = cVar.x;
            boolean z15 = cVar.y;
            boolean z16 = cVar.z;
            if ((i & 67108864) != 0) {
                z5 = z16;
                z6 = cVar.A;
            } else {
                z5 = z16;
                z6 = z;
            }
            boolean z17 = cVar.B;
            if ((i & 268435456) != 0) {
                z7 = z17;
                set9 = cVar.C;
            } else {
                z7 = z17;
                set9 = set7;
            }
            Set set21 = (i & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? cVar.D : set8;
            CallMemberId callMemberId4 = (i & 1073741824) != 0 ? cVar.E : callMemberId;
            CallMemberId callMemberId5 = (i & Integer.MIN_VALUE) != 0 ? cVar.F : callMemberId2;
            boolean z18 = (i2 & 1) != 0 ? cVar.G : z2;
            boolean z19 = cVar.H;
            boolean z20 = cVar.I;
            if ((i2 & 8) != 0) {
                z8 = z20;
                featureRoles2 = cVar.J;
            } else {
                z8 = z20;
                featureRoles2 = featureRoles;
            }
            boolean z21 = cVar.K;
            if ((i2 & 32) != 0) {
                z9 = z21;
                z10 = cVar.L;
            } else {
                z9 = z21;
                z10 = z3;
            }
            SessionRoomId sessionRoomId2 = (i2 & 64) != 0 ? cVar.M : sessionRoomId;
            boolean z22 = (i2 & 128) != 0 ? cVar.N : z4;
            Boolean bool2 = (i2 & 256) != 0 ? cVar.O : bool;
            cVar.getClass();
            return new c(callId, callMemberId3, dialog, set10, list, set11, set12, set13, set14, z11, collection, z12, (Map<String, whr0>) map5, (Set<CallMemberId>) set15, (Set<CallMemberId>) set16, (Set<CallMemberId>) set17, (Set<CallMemberId>) set18, (Set<CallMemberId>) set19, (Set<CallMemberId>) set20, (Map<CallMemberId, ? extends MediaOptionState>) map6, (Map<CallMemberId, ? extends MediaOptionState>) map7, (Map<CallMemberId, ? extends MediaOptionState>) map8, z13, z14, z15, z5, z6, z7, (Set<CallMemberId>) set9, (Set<CallMemberId>) set21, callMemberId4, callMemberId5, z18, z19, z8, featureRoles2, z9, z10, sessionRoomId2, z22, bool2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d) && epx.f(this.e, cVar.e) && epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g) && epx.f(this.h, cVar.h) && epx.f(this.i, cVar.i) && this.j == cVar.j && epx.f(this.k, cVar.k) && this.l == cVar.l && epx.f(this.m, cVar.m) && epx.f(this.n, cVar.n) && epx.f(this.o, cVar.o) && epx.f(this.p, cVar.p) && epx.f(this.q, cVar.q) && epx.f(this.r, cVar.r) && epx.f(this.s, cVar.s) && epx.f(this.t, cVar.t) && epx.f(this.u, cVar.u) && epx.f(this.v, cVar.v) && this.w == cVar.w && this.x == cVar.x && this.y == cVar.y && this.z == cVar.z && this.A == cVar.A && this.B == cVar.B && epx.f(this.C, cVar.C) && epx.f(this.D, cVar.D) && epx.f(this.E, cVar.E) && epx.f(this.F, cVar.F) && this.G == cVar.G && this.H == cVar.H && this.I == cVar.I && epx.f(this.J, cVar.J) && this.K == cVar.K && this.L == cVar.L && epx.f(this.M, cVar.M) && this.N == cVar.N && epx.f(this.O, cVar.O);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (this.a.b.hashCode() * 31)) * 31;
            Dialog dialog = this.c;
            int b = fw3.b(fw3.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(v11.a(v11.a(v11.a(fw3.b(fw3.b(fw3.b(fw3.b(fw3.b(fw3.b(v11.a(qoy.b(s3j0.a(qoy.b(fw3.b(fw3.b(fw3.b(fw3.b(fw3.a(fw3.b((hashCode + (dialog == null ? 0 : dialog.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), this.k, 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31, this.D);
            CallMemberId callMemberId = this.E;
            int hashCode2 = (b + (callMemberId == null ? 0 : callMemberId.hashCode())) * 31;
            CallMemberId callMemberId2 = this.F;
            int b2 = qoy.b((this.M.hashCode() + qoy.b(qoy.b((this.J.hashCode() + qoy.b(qoy.b(qoy.b((hashCode2 + (callMemberId2 == null ? 0 : callMemberId2.hashCode())) * 31, 31, this.G), 31, this.H), 31, this.I)) * 31, 31, this.K), 31, this.L)) * 31, 31, this.N);
            Boolean bool = this.O;
            return b2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Info(callId=");
            sb.append(this.a);
            sb.append(", currentMemberId=");
            sb.append(this.b);
            sb.append(", dialog=");
            sb.append(this.c);
            sb.append(", callMemberIds=");
            sb.append(this.d);
            sb.append(", filteredInCallIds=");
            sb.append(this.e);
            sb.append(", chatMemberIds=");
            sb.append(this.f);
            sb.append(", filteredInviteFromChatIds=");
            sb.append(this.g);
            sb.append(", filteredInviteFromOthersIds=");
            sb.append(this.h);
            sb.append(", filteredInviteFromContacts=");
            sb.append(this.i);
            sb.append(", inviteFromFriends=");
            sb.append(this.j);
            sb.append(", waitingRoomParticipants=");
            sb.append(this.k);
            sb.append(", inviteWillCreateChat=");
            sb.append(this.l);
            sb.append(", profiles=");
            sb.append(this.m);
            sb.append(", connectingIds=");
            sb.append(this.n);
            sb.append(", talkingIds=");
            sb.append(this.o);
            sb.append(", raiseHandIds=");
            sb.append(this.p);
            sb.append(", withScreencastIds=");
            sb.append(this.q);
            sb.append(", withAudioIds=");
            sb.append(this.r);
            sb.append(", withVideoIds=");
            sb.append(this.s);
            sb.append(", audioOptionStates=");
            sb.append(this.t);
            sb.append(", videoOptionStates=");
            sb.append(this.u);
            sb.append(", watchTogetherOptionStates=");
            sb.append(this.v);
            sb.append(", canInviteParticipantsFromFriends=");
            sb.append(this.w);
            sb.append(", canInviteParticipantsFromContacts=");
            sb.append(this.x);
            sb.append(", canExcludeParticipants=");
            sb.append(this.y);
            sb.append(", canShareLink=");
            sb.append(this.z);
            sb.append(", canModifyLink=");
            sb.append(this.A);
            sb.append(", canInviteByQrCode=");
            sb.append(this.B);
            sb.append(", creatorIds=");
            sb.append(this.C);
            sb.append(", adminIds=");
            sb.append(this.D);
            sb.append(", pinnedForAllId=");
            sb.append(this.E);
            sb.append(", pinnedForMeId=");
            sb.append(this.F);
            sb.append(", isAnonJoinForbidden=");
            sb.append(this.G);
            sb.append(", waitingRoomFeatureActivated=");
            sb.append(this.H);
            sb.append(", waitingRoomEnabled=");
            sb.append(this.I);
            sb.append(", watchTogetherFeatureRoles=");
            sb.append(this.J);
            sb.append(", feedbackFeatureActivated=");
            sb.append(this.K);
            sb.append(", feedbackEnabled=");
            sb.append(this.L);
            sb.append(", sessionRoomId=");
            sb.append(this.M);
            sb.append(", isShowChatHistoryEnabled=");
            sb.append(this.N);
            sb.append(", isServiceChatEnabled=");
            return tn.a(sb, this.O, ')');
        }

        public c(CallId callId, CallMemberId callMemberId, Dialog dialog, Set set, List list, Set set2, Set set3, Set set4, Set set5, boolean z, Collection collection, boolean z2, Map map, Set set6, Set set7, Set set8, Set set9, Set set10, Set set11, Map map2, Map map3, Map map4, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Set set12, Set set13, CallMemberId callMemberId2, CallMemberId callMemberId3, boolean z8, boolean z9, boolean z10, FeatureRoles featureRoles, boolean z11, boolean z12, SessionRoomId sessionRoomId, boolean z13, Boolean bool, int i) {
            this(callId, callMemberId, dialog, (Set<CallMemberId>) set, (List<CallMemberId>) list, (Set<String>) set2, (Set<String>) set3, (Set<String>) set4, (Set<String>) set5, z, (Collection<CallMemberId>) ((i & 1024) != 0 ? EmptyList.b : collection), z2, (Map<String, whr0>) map, (Set<CallMemberId>) set6, (Set<CallMemberId>) set7, (Set<CallMemberId>) set8, (Set<CallMemberId>) set9, (Set<CallMemberId>) set10, (Set<CallMemberId>) set11, (Map<CallMemberId, ? extends MediaOptionState>) map2, (Map<CallMemberId, ? extends MediaOptionState>) map3, (Map<CallMemberId, ? extends MediaOptionState>) map4, z3, z4, z5, z6, z7, (i & 134217728) != 0, (Set<CallMemberId>) set12, (Set<CallMemberId>) set13, callMemberId2, callMemberId3, z8, z9, z10, featureRoles, z11, z12, sessionRoomId, z13, bool);
        }
    }
}
