package xsna;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.contacts.ContactsManager;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.credentials.UserCredentials;
import com.vk.im.log.LogLevel;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.InitializedLazyImpl;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.collections.EmptySet;
import xsna.ihl0;

/* compiled from: ImConfig.kt */
/* loaded from: classes.dex */
public final class pzv implements zwi {
    public static final a x0 = new a();
    public final long A;
    public final long B;
    public final long C;
    public final long D;
    public final long E;
    public final rq6 F;
    public final long G;
    public final long H;
    public final long I;
    public final s63 J;
    public final r63 K;
    public final hu2 L;
    public final gzs<Boolean> M;
    public final boolean N;
    public final pbw O;
    public final LogLevel P;
    public final c13 Q;
    public final jnf R;
    public final List<String> S;
    public final List<String> T;
    public final c13 U;
    public final j2w V;
    public final Lazy<Set<Long>> W;
    public final Lazy<Set<Long>> X;
    public final Lazy<Set<Long>> Y;
    public final Lazy<Set<Long>> Z;
    public final x3w a;
    public final bpn0 a0;
    public final f53 b;
    public final Lazy<Set<Long>> b0;
    public final sq6 c;
    public final Lazy<Set<Long>> c0;
    public final fat d;
    public final Lazy<Set<Long>> d0;
    public final x8w e;
    public final r30 e0;
    public final p9w f;
    public final long f0;
    public final ohp0 g;
    public final long g0;
    public final cau0 h;
    public final knf h0;
    public final sz2 i;
    public final lnf i0;
    public final qew j;
    public final bje0 j0;
    public final ihl0 k;
    public final bje0 k0;
    public final bay l;
    public final List<Integer> l0;
    public final long m;
    public final List<Integer> m0;
    public final long n;
    public final boolean n0;
    public final long o;
    public final boolean o0;
    public final long p;
    public final p03 p0;
    public final long q;
    public final q03 q0;
    public final long r;
    public final Object r0;
    public final long s;
    public final Object s0;
    public final long t;
    public final long t0;
    public final Collection<Long> u;
    public final gat u0;
    public final long v;
    public final gzs<Boolean> v0;
    public final long w;
    public final Object w0;
    public final long x;
    public final long y;
    public final long z;

    /* compiled from: ImConfig.kt */
    public static final class a {
        public static String a() {
            return "https://" + "api.".concat(a0a.d) + "/pushsse/ruim";
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x004b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static String b(String str, String str2) {
            Object failure;
            Uri parse;
            String host;
            try {
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (str.length() != 0 && (host = (parse = Uri.parse(str)).getHost()) != null) {
                Uri.Builder builder = new Uri.Builder();
                String scheme = parse.getScheme();
                if (scheme == null) {
                    scheme = HttpRequest.DEFAULT_SCHEME;
                }
                failure = builder.scheme(scheme).authority(host).appendPath("pushsse").appendPath(str2).build().toString();
                return (String) (failure instanceof Result.Failure ? null : failure);
            }
            failure = null;
            return (String) (failure instanceof Result.Failure ? null : failure);
        }
    }

    /* compiled from: ImConfig.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        public final gzs<Boolean> a;
        public final gzs<Long> b;
        public final gzs<Long> c;

        public b(gzs<Boolean> gzsVar, gzs<Long> gzsVar2, gzs<Long> gzsVar3) {
            this.a = gzsVar;
            this.b = gzsVar2;
            this.c = gzsVar3;
        }

        public final gzs<Boolean> a() {
            return this.a;
        }

        public final gzs<Long> b() {
            return this.c;
        }

        public final String toString() {
            return "{applySpacesOnColdStartr=" + this.a.invoke().booleanValue() + ", applySpacesOnColdStartForChat=" + this.b.invoke().longValue() + ", delayLpSyncStartMs=" + this.c.invoke().longValue() + '}';
        }
    }

    static {
        new InitializedLazyImpl(EmptySet.b);
    }

    public pzv(x3w x3wVar, f53 f53Var, sq6 sq6Var, fat fatVar, x8w x8wVar, p9w p9wVar, ohp0 ohp0Var, cau0 cau0Var, sz2 sz2Var, qew qewVar, ihl0 ihl0Var, bay bayVar, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, Collection collection, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, rq6 rq6Var, long j19, long j20, long j21, s63 s63Var, r63 r63Var, hu2 hu2Var, gzs gzsVar, boolean z, pbw pbwVar, LogLevel logLevel, c13 c13Var, jnf jnfVar, List list, List list2, c13 c13Var2, j2w j2wVar, Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, bpn0 bpn0Var, Lazy lazy5, Lazy lazy6, Lazy lazy7, r30 r30Var, long j22, long j23, knf knfVar, lnf lnfVar, bje0 bje0Var, bje0 bje0Var2, List list3, List list4, boolean z2, boolean z3, p03 p03Var, q03 q03Var, Map map, Map map2, long j24, gat gatVar, gzs gzsVar2) {
        vdw vdwVar = vdw.a;
        this.a = x3wVar;
        this.b = f53Var;
        this.c = sq6Var;
        this.d = fatVar;
        this.e = x8wVar;
        this.f = p9wVar;
        this.g = ohp0Var;
        this.h = cau0Var;
        this.i = sz2Var;
        this.j = qewVar;
        this.k = ihl0Var;
        this.l = bayVar;
        this.m = j;
        this.n = j2;
        this.o = j3;
        this.p = j4;
        this.q = j5;
        this.r = j6;
        this.s = j7;
        this.t = j8;
        this.u = collection;
        this.v = j9;
        this.w = j10;
        this.x = j11;
        this.y = j12;
        this.z = j13;
        this.A = j14;
        this.B = j15;
        this.C = j16;
        this.D = j17;
        this.E = j18;
        this.F = rq6Var;
        this.G = j19;
        this.H = j20;
        this.I = j21;
        this.J = s63Var;
        this.K = r63Var;
        this.L = hu2Var;
        this.M = gzsVar;
        this.N = z;
        this.O = pbwVar;
        this.P = logLevel;
        this.Q = c13Var;
        this.R = jnfVar;
        this.S = list;
        this.T = list2;
        this.U = c13Var2;
        this.V = j2wVar;
        this.W = lazy;
        this.X = lazy2;
        this.Y = lazy3;
        this.Z = lazy4;
        this.a0 = bpn0Var;
        this.b0 = lazy5;
        this.c0 = lazy6;
        this.d0 = lazy7;
        this.e0 = r30Var;
        this.f0 = j22;
        this.g0 = j23;
        this.h0 = knfVar;
        this.i0 = lnfVar;
        this.j0 = bje0Var;
        this.k0 = bje0Var2;
        this.l0 = list3;
        this.m0 = list4;
        this.n0 = z2;
        this.o0 = z3;
        this.p0 = p03Var;
        this.q0 = q03Var;
        this.r0 = map;
        this.s0 = map2;
        this.t0 = j24;
        this.u0 = gatVar;
        this.v0 = gzsVar2;
        this.w0 = msy.a(LazyThreadSafetyMode.NONE, new t03(7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object, java.util.Map] */
    public static pzv a(pzv pzvVar, x3w x3wVar, ihl0 ihl0Var, long j, wv0 wv0Var, c24 c24Var, int i, int i2, int i3) {
        pzvVar.getClass();
        pzvVar.getClass();
        x3w x3wVar2 = (i & 4) != 0 ? pzvVar.a : x3wVar;
        f53 f53Var = pzvVar.b;
        sq6 sq6Var = pzvVar.c;
        fat fatVar = pzvVar.d;
        pzvVar.getClass();
        x8w x8wVar = pzvVar.e;
        p9w p9wVar = pzvVar.f;
        pzvVar.getClass();
        vdw vdwVar = vdw.a;
        ohp0 ohp0Var = pzvVar.g;
        cau0 cau0Var = pzvVar.h;
        sz2 sz2Var = pzvVar.i;
        qew qewVar = pzvVar.j;
        ihl0 ihl0Var2 = (i & 16384) != 0 ? pzvVar.k : ihl0Var;
        bay bayVar = pzvVar.l;
        long j2 = pzvVar.m;
        pzvVar.getClass();
        pzvVar.getClass();
        long j3 = pzvVar.n;
        pzvVar.getClass();
        pzvVar.getClass();
        long j4 = pzvVar.o;
        pzvVar.getClass();
        pzvVar.getClass();
        long j5 = pzvVar.p;
        long j6 = pzvVar.q;
        pzvVar.getClass();
        pzvVar.getClass();
        long j7 = pzvVar.r;
        long j8 = pzvVar.s;
        pzvVar.getClass();
        pzvVar.getClass();
        pzvVar.getClass();
        long j9 = pzvVar.t;
        Collection<Long> collection = pzvVar.u;
        long j10 = pzvVar.v;
        long j11 = pzvVar.w;
        long j12 = pzvVar.x;
        long j13 = (i2 & 128) != 0 ? pzvVar.y : j;
        long j14 = pzvVar.z;
        long j15 = pzvVar.A;
        long j16 = pzvVar.B;
        long j17 = pzvVar.C;
        long j18 = pzvVar.D;
        long j19 = pzvVar.E;
        rq6 rq6Var = pzvVar.F;
        long j20 = pzvVar.G;
        long j21 = pzvVar.H;
        long j22 = pzvVar.I;
        s63 s63Var = pzvVar.J;
        r63 r63Var = pzvVar.K;
        pzvVar.getClass();
        hu2 hu2Var = pzvVar.L;
        gzs gzsVar = (i2 & 4194304) != 0 ? pzvVar.M : wv0Var;
        boolean z = (i2 & 8388608) != 0 ? pzvVar.N : true;
        pbw pbwVar = pzvVar.O;
        LogLevel logLevel = pzvVar.P;
        pzvVar.getClass();
        c13 c13Var = pzvVar.Q;
        jnf jnfVar = pzvVar.R;
        pzvVar.getClass();
        List<String> list = pzvVar.S;
        List<String> list2 = pzvVar.T;
        c13 c13Var2 = pzvVar.U;
        j2w j2wVar = pzvVar.V;
        Lazy<Set<Long>> lazy = pzvVar.W;
        Lazy<Set<Long>> lazy2 = pzvVar.X;
        Lazy<Set<Long>> lazy3 = pzvVar.Y;
        Lazy<Set<Long>> lazy4 = pzvVar.Z;
        bpn0 bpn0Var = pzvVar.a0;
        Lazy<Set<Long>> lazy5 = pzvVar.b0;
        Lazy<Set<Long>> lazy6 = pzvVar.c0;
        Lazy<Set<Long>> lazy7 = pzvVar.d0;
        r30 r30Var = pzvVar.e0;
        long j23 = pzvVar.f0;
        long j24 = pzvVar.g0;
        knf knfVar = pzvVar.h0;
        lnf lnfVar = pzvVar.i0;
        bje0 bje0Var = pzvVar.j0;
        pzvVar.getClass();
        bje0 bje0Var2 = pzvVar.k0;
        List<Integer> list3 = pzvVar.l0;
        List<Integer> list4 = pzvVar.m0;
        boolean z2 = pzvVar.n0;
        pzvVar.getClass();
        boolean z3 = pzvVar.o0;
        p03 p03Var = pzvVar.p0;
        q03 q03Var = pzvVar.q0;
        pzvVar.getClass();
        pzvVar.getClass();
        ?? r1 = pzvVar.r0;
        ?? r12 = pzvVar.s0;
        long j25 = pzvVar.t0;
        gat gatVar = pzvVar.u0;
        gzs gzsVar2 = (i3 & Integer.MIN_VALUE) != 0 ? pzvVar.v0 : c24Var;
        pzvVar.getClass();
        return new pzv(x3wVar2, f53Var, sq6Var, fatVar, x8wVar, p9wVar, ohp0Var, cau0Var, sz2Var, qewVar, ihl0Var2, bayVar, j2, j3, j4, j5, j6, j7, j8, j9, collection, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, rq6Var, j20, j21, j22, s63Var, r63Var, hu2Var, gzsVar, z, pbwVar, logLevel, c13Var, jnfVar, list, list2, c13Var2, j2wVar, lazy, lazy2, lazy3, lazy4, bpn0Var, lazy5, lazy6, lazy7, r30Var, j23, j24, knfVar, lnfVar, bje0Var, bje0Var2, list3, list4, z2, z3, p03Var, q03Var, r1, r12, j25, gatVar, gzsVar2);
    }

    public final pzv b(UserCredentials userCredentials, Peer peer) {
        x3w x3wVar = this.a;
        bib bibVar = x3wVar.q;
        fpo fpoVar = new fpo(userCredentials);
        return a(this, x3w.a(x3wVar, fpoVar, peer), new ihl0.a(fpoVar, peer), 0L, null, null, -16389, -1, -1);
    }

    @Override // xsna.zwi
    public final String c() {
        return ply.a();
    }

    @Override // xsna.zwi
    public final int d() {
        return 30;
    }

    @Override // xsna.zwi
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzv)) {
            return false;
        }
        pzv pzvVar = (pzv) obj;
        pzvVar.getClass();
        if (!epx.f(this.a, pzvVar.a) || !this.b.equals(pzvVar.b) || !this.c.equals(pzvVar.c) || !this.d.equals(pzvVar.d)) {
            return false;
        }
        Object obj2 = i2w.f;
        if (!obj2.equals(obj2) || !this.e.equals(pzvVar.e) || !this.f.equals(pzvVar.f)) {
            return false;
        }
        Object obj3 = vdw.a;
        return obj3.equals(obj3) && epx.f(this.g, pzvVar.g) && this.h.equals(pzvVar.h) && this.i.equals(pzvVar.i) && this.j.equals(pzvVar.j) && epx.f(this.k, pzvVar.k) && this.l.equals(pzvVar.l) && this.m == pzvVar.m && this.n == pzvVar.n && this.o == pzvVar.o && this.p == pzvVar.p && this.q == pzvVar.q && this.r == pzvVar.r && this.s == pzvVar.s && this.t == pzvVar.t && epx.f(this.u, pzvVar.u) && this.v == pzvVar.v && this.w == pzvVar.w && this.x == pzvVar.x && this.y == pzvVar.y && this.z == pzvVar.z && this.A == pzvVar.A && this.B == pzvVar.B && this.C == pzvVar.C && this.D == pzvVar.D && this.E == pzvVar.E && this.F.equals(pzvVar.F) && this.G == pzvVar.G && this.H == pzvVar.H && this.I == pzvVar.I && this.J.equals(pzvVar.J) && this.K.equals(pzvVar.K) && this.L.equals(pzvVar.L) && epx.f(this.M, pzvVar.M) && this.N == pzvVar.N && epx.f(this.O, pzvVar.O) && this.P == pzvVar.P && this.Q.equals(pzvVar.Q) && this.R.equals(pzvVar.R) && epx.f(this.S, pzvVar.S) && this.T.equals(pzvVar.T) && this.U.equals(pzvVar.U) && this.V.equals(pzvVar.V) && epx.f(this.W, pzvVar.W) && epx.f(this.X, pzvVar.X) && epx.f(this.Y, pzvVar.Y) && epx.f(this.Z, pzvVar.Z) && this.a0.equals(pzvVar.a0) && epx.f(this.b0, pzvVar.b0) && epx.f(this.c0, pzvVar.c0) && epx.f(this.d0, pzvVar.d0) && this.e0.equals(pzvVar.e0) && this.f0 == pzvVar.f0 && this.g0 == pzvVar.g0 && this.h0.equals(pzvVar.h0) && this.i0.equals(pzvVar.i0) && epx.f(this.j0, pzvVar.j0) && epx.f(this.k0, pzvVar.k0) && epx.f(this.l0, pzvVar.l0) && epx.f(this.m0, pzvVar.m0) && this.n0 == pzvVar.n0 && this.o0 == pzvVar.o0 && this.p0.equals(pzvVar.p0) && this.q0.equals(pzvVar.q0) && this.r0.equals(pzvVar.r0) && this.s0.equals(pzvVar.s0) && this.t0 == pzvVar.t0 && this.u0.equals(pzvVar.u0) && epx.f(this.v0, pzvVar.v0);
    }

    @Override // xsna.zwi
    public final Set<Long> f() {
        return this.X.getValue();
    }

    @Override // xsna.zwi
    public final zwi g(Peer peer) {
        x3w x3wVar = this.a;
        fpo a2 = x3wVar.q.a();
        return a(this, x3w.a(x3wVar, a2, peer), new ihl0.a(a2, peer), 0L, null, null, -16389, -1, -1);
    }

    @Override // xsna.zwi
    public final int h() {
        return 10;
    }

    public final int hashCode() {
        return this.v0.hashCode() + ((this.u0.hashCode() + bh10.a(vul0.a(vul0.a(qoy.b((this.q0.hashCode() + ((this.p0.hashCode() + qoy.b(qoy.b(qoy.b(fw3.a(fw3.a((this.k0.hashCode() + qoy.b((this.j0.hashCode() + ((this.i0.hashCode() + ((this.h0.hashCode() + bh10.a(bh10.a((this.e0.hashCode() + g7r0.a(this.d0, g7r0.a(this.c0, g7r0.a(this.b0, tq.b(this.a0, g7r0.a(this.Z, g7r0.a(this.Y, g7r0.a(this.X, g7r0.a(this.W, (this.V.hashCode() + ((this.U.hashCode() + fw3.a(fw3.a(shy.a(6, (this.R.hashCode() + ((this.Q.hashCode() + shy.a(5, (this.P.hashCode() + ((this.O.hashCode() + qoy.b(sf3.a((this.L.hashCode() + qoy.b((this.K.hashCode() + ((this.J.hashCode() + bh10.a(bh10.a(bh10.a((this.F.hashCode() + bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(bh10.a(s3j0.a(bh10.a(shy.a(99, shy.a(10, shy.a(4000, bh10.a(bh10.a(qoy.b(shy.a(10, bh10.a(bh10.a(shy.a(5, shy.a(20, bh10.a(shy.a(10, shy.a(30, bh10.a(shy.a(250, shy.a(1000, bh10.a((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((vdw.a.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((i2w.f.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + qoy.b(Boolean.hashCode(false) * 31, 31, true)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.m), 31), 31), 31, this.n), 31), 31), 31, this.o), 31), 31), 31, this.p), 31, this.q), 31), 31, true), 31, this.r), 31, this.s), 31), 31), 31), 31, this.t), this.u, 31), 31, this.v), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C), 31, this.D), 31, this.E)) * 31, 31, this.G), 31, this.H), 31, this.I)) * 31)) * 31, 31, false)) * 31, 31, this.M), 31, this.N)) * 31)) * 31, 31)) * 31)) * 31, 31), 31, this.S), 31, this.T)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31, this.f0), 31, this.g0)) * 31)) * 31)) * 31, 31, true)) * 31, 31, this.l0), 31, this.m0), 31, this.n0), 31, true), 31, this.o0)) * 31)) * 961, 31, true), 31, this.r0), 31, this.s0), 31, this.t0)) * 31);
    }

    @Override // xsna.zwi
    public final int i() {
        return 250;
    }

    @Override // xsna.zwi
    public final Set<UserId> j() {
        return (Set) this.a0.getValue();
    }

    public final boolean k() {
        return ((b) this.J.invoke()).a().invoke().booleanValue();
    }

    public final ContactsManager l() {
        sw1 sw1Var = this.a.n;
        return com.vk.contacts.d.a;
    }

    public final UserCredentials m() {
        return this.a.b.a();
    }

    public final long n() {
        return ((b) this.J.invoke()).b().invoke().longValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.Integer, java.lang.Integer>] */
    public final Map<Integer, Integer> o() {
        return this.r0;
    }

    public final String toString() {
        return "ImConfig(vkMe=false, nameProvider=" + this.k + ", blockingCmdTimeout=" + this.H + ", lpSyncDebugConfig=" + this.J.invoke() + ", simulateDelaysForCmds=" + ((Boolean) this.K.invoke()).booleanValue() + ", allowSyncAccountOnBgSync=" + this.N + ", logLevel=" + this.P + ')';
    }
}
