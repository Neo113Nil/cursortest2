package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Lambda;
import xsna.dt1;
import xsna.ty6;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
public final class anp {
    public static final jtp0 a = new jtp0(a.i, b.i);
    public static final xmk0<Float> b = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5);
    public static final xmk0<h9x> c;
    public static final xmk0<q9x> d;

    /* compiled from: EnterExitTransition.kt */
    public static final class a extends Lambda implements izs<lkp0, tq2> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final tq2 invoke(lkp0 lkp0Var) {
            long j = lkp0Var.a;
            return new tq2(lkp0.b(j), lkp0.c(j));
        }
    }

    /* compiled from: EnterExitTransition.kt */
    public static final class b extends Lambda implements izs<tq2, lkp0> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final lkp0 invoke(tq2 tq2Var) {
            tq2 tq2Var2 = tq2Var;
            return new lkp0(f370.i(tq2Var2.a, tq2Var2.b));
        }
    }

    static {
        long j = 1;
        long j2 = (j & 4294967295L) | (j << 32);
        c = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new h9x(j2), 1);
        d = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new q9x(j2), 1);
    }

    public static rpp a() {
        long j = 1;
        xmk0 c2 = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new q9x((j & 4294967295L) | (j << 32)), 1);
        dt1.a.getClass();
        return b(r(dt1.a.p), c2, new lnp(knp.i), true);
    }

    public static final rpp b(dt1 dt1Var, phr phrVar, izs izsVar, boolean z) {
        return new rpp(new gmp0((ciq) null, (b0k0) null, new vsa(dt1Var, phrVar, izsVar, z), (h4h0) null, (LinkedHashMap) null, 123));
    }

    public static rpp c(dt1 dt1Var, int i) {
        long j = 1;
        xmk0 c2 = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new q9x((j & 4294967295L) | (j << 32)), 1);
        if ((i & 2) != 0) {
            dt1.a.getClass();
            dt1Var = dt1.a.j;
        }
        return b(dt1Var, c2, mnp.j, (i & 4) != 0);
    }

    public static rpp d(phr phrVar, dt1.c cVar, izs izsVar, int i) {
        if ((i & 1) != 0) {
            long j = 1;
            phrVar = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new q9x((j & 4294967295L) | (j << 32)), 1);
        }
        if ((i & 2) != 0) {
            dt1.a.getClass();
            cVar = dt1.a.m;
        }
        if ((i & 8) != 0) {
            izsVar = nnp.i;
        }
        return b(q(cVar), phrVar, new onp(izsVar), true);
    }

    public static rpp e(phr phrVar, int i) {
        if ((i & 1) != 0) {
            phrVar = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5);
        }
        return new rpp(new gmp0(new ciq(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, phrVar), (b0k0) null, (vsa) null, (h4h0) null, (LinkedHashMap) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
    }

    public static e5q f(phr phrVar, int i) {
        if ((i & 1) != 0) {
            phrVar = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5);
        }
        return new e5q(new gmp0(new ciq(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, phrVar), (b0k0) null, (vsa) null, (h4h0) null, (LinkedHashMap) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
    }

    public static rpp g(dtp0 dtp0Var) {
        return new rpp(new gmp0((ciq) null, (b0k0) null, (vsa) null, new h4h0(lkp0.b, dtp0Var), (LinkedHashMap) null, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
    }

    public static e5q h() {
        long j = 1;
        xmk0 c2 = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new q9x((j & 4294967295L) | (j << 32)), 1);
        dt1.a.getClass();
        return i(r(dt1.a.p), c2, new qnp(pnp.i), true);
    }

    public static final e5q i(dt1 dt1Var, phr phrVar, izs izsVar, boolean z) {
        return new e5q(new gmp0((ciq) null, (b0k0) null, new vsa(dt1Var, phrVar, izsVar, z), (h4h0) null, (LinkedHashMap) null, 123));
    }

    public static e5q j(dt1 dt1Var, int i) {
        long j = 1;
        xmk0 c2 = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new q9x((j & 4294967295L) | (j << 32)), 1);
        if ((i & 2) != 0) {
            dt1.a.getClass();
            dt1Var = dt1.a.j;
        }
        return i(dt1Var, c2, rnp.i, (i & 4) != 0);
    }

    public static e5q k(phr phrVar, dt1.c cVar, int i) {
        if ((i & 1) != 0) {
            long j = 1;
            phrVar = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new q9x((j & 4294967295L) | (j << 32)), 1);
        }
        if ((i & 2) != 0) {
            dt1.a.getClass();
            cVar = dt1.a.m;
        }
        return i(q(cVar), phrVar, new tnp(snp.i), true);
    }

    public static final rpp l(phr phrVar, izs izsVar) {
        return new rpp(new gmp0((ciq) null, new b0k0(phrVar, new wnp(izsVar)), (vsa) null, (h4h0) null, (LinkedHashMap) null, 125));
    }

    public static rpp m(dtp0 dtp0Var, izs izsVar, int i) {
        phr phrVar = dtp0Var;
        if ((i & 1) != 0) {
            long j = 1;
            phrVar = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new h9x((j & 4294967295L) | (j << 32)), 1);
        }
        if ((i & 2) != 0) {
            izsVar = vnp.i;
        }
        return l(phrVar, izsVar);
    }

    public static final e5q n(phr phrVar, izs izsVar) {
        return new e5q(new gmp0((ciq) null, new b0k0(phrVar, new xnp(izsVar)), (vsa) null, (h4h0) null, (LinkedHashMap) null, 125));
    }

    public static final e5q o(phr phrVar, izs izsVar) {
        return new e5q(new gmp0((ciq) null, new b0k0(phrVar, new znp(izsVar)), (vsa) null, (h4h0) null, (LinkedHashMap) null, 125));
    }

    public static e5q p(int i, izs izsVar) {
        long j = 1;
        xmk0 c2 = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, new h9x((j & 4294967295L) | (j << 32)), 1);
        if ((i & 2) != 0) {
            izsVar = ynp.j;
        }
        return o(c2, izsVar);
    }

    public static final ty6 q(dt1.c cVar) {
        dt1.a.getClass();
        return epx.f(cVar, dt1.a.k) ? dt1.a.c : epx.f(cVar, dt1.a.m) ? dt1.a.i : dt1.a.f;
    }

    public static final ty6 r(ty6.a aVar) {
        dt1.a.getClass();
        return epx.f(aVar, dt1.a.n) ? dt1.a.e : epx.f(aVar, dt1.a.p) ? dt1.a.g : dt1.a.f;
    }
}
