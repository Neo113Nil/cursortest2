package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.fa90;
import xsna.ltv;

/* compiled from: IdeasStoryReducer.kt */
/* loaded from: classes6.dex */
public final class fuv extends dm50<ruv, ltv, juv> {
    public static juv i(juv juvVar, int i, fa90 fa90Var) {
        if (i < 0) {
            return juvVar;
        }
        if (i >= juvVar.b.size()) {
            return juvVar;
        }
        ArrayList arrayList = new ArrayList(juvVar.b);
        nsv nsvVar = (nsv) arrayList.get(i);
        arrayList.set(i, new nsv(nsvVar.a, nsvVar.b, fa90Var));
        return juv.a(juvVar, arrayList, 0, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 254);
    }

    @Override // xsna.dm50
    public final juv c(juv juvVar, ltv ltvVar) {
        juv juvVar2 = juvVar;
        ltv ltvVar2 = ltvVar;
        List<nsv> list = juvVar2.b;
        vya0 vya0Var = juvVar2.d;
        if (ltvVar2 instanceof ltv.a) {
            return juv.a(juvVar2, ((ltv.a) ltvVar2).b, 0, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 252);
        }
        if (ltvVar2 instanceof ltv.c) {
            return i(juvVar2, ((ltv.c) ltvVar2).b, fa90.c.a);
        }
        if (ltvVar2 instanceof ltv.e) {
            ltv.e eVar = (ltv.e) ltvVar2;
            return i(juvVar2, eVar.b, new fa90.d(eVar.c, false));
        }
        if (ltvVar2 instanceof ltv.d) {
            int i = ((ltv.d) ltvVar2).b;
            nsv nsvVar = (nsv) j5g.b0(i, list);
            Object obj = nsvVar != null ? nsvVar.c : null;
            fa90.d dVar = obj instanceof fa90.d ? (fa90.d) obj : null;
            if (dVar != null && !dVar.b) {
                return i(juvVar2, i, new fa90.d(dVar.a, true));
            }
        } else {
            if (ltvVar2 instanceof ltv.b) {
                return i(juvVar2, ((ltv.b) ltvVar2).b, fa90.a.a);
            }
            if (ltvVar2 instanceof ltv.g) {
                return i(juvVar2, ((ltv.g) ltvVar2).b, fa90.b.a);
            }
            if (ltvVar2 instanceof ltv.q) {
                int i2 = ((ltv.q) ltvVar2).b;
                int size = list.size() - 1;
                if (size < 0) {
                    size = 0;
                }
                return juv.a(juvVar2, null, swe0.g(i2, 0, size), null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 253);
            }
            if (!(ltvVar2 instanceof ltv.f)) {
                if (ltvVar2 instanceof ltv.n) {
                    return juv.a(juvVar2, null, 0, vya0.a(vya0Var, ((ltv.n) ltvVar2).b, false, 6), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 251);
                }
                if (ltvVar2 instanceof ltv.o) {
                    return juv.a(juvVar2, null, 0, null, null, ((ltv.o) ltvVar2).b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 239);
                }
                if (ltvVar2 instanceof ltv.m) {
                    ((ltv.m) ltvVar2).getClass();
                    return juv.a(juvVar2, null, 0, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
                }
                if (ltvVar2 instanceof ltv.k) {
                    ltv.k kVar = (ltv.k) ltvVar2;
                    return juv.a(juvVar2, null, 0, null, xqj.a(juvVar2.e, kVar.b, kVar.c, kVar.d, false, false, 24), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 247);
                }
                if (ltvVar2 instanceof ltv.i) {
                    return juv.a(juvVar2, null, 0, null, xqj.a(juvVar2.e, false, false, false, ((ltv.i) ltvVar2).b, false, 23), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 247);
                }
                if (ltvVar2 instanceof ltv.h) {
                    return juv.a(juvVar2, null, 0, null, xqj.a(juvVar2.e, false, false, false, false, ((ltv.h) ltvVar2).b, 15), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 247);
                }
                if (ltvVar2 instanceof ltv.l) {
                    return juv.a(juvVar2, null, 0, null, null, null, ((ltv.l) ltvVar2).b, 191);
                }
                if (ltvVar2 instanceof ltv.j) {
                    ((ltv.j) ltvVar2).getClass();
                    return juv.a(juvVar2, null, 0, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 127);
                }
                if (ltvVar2 instanceof ltv.p) {
                    return juv.a(juvVar2, null, 0, vya0.a(vya0Var, false, ((ltv.p) ltvVar2).b, 5), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 251);
                }
                throw new NoWhenBranchMatchedException();
            }
            int i3 = ((ltv.f) ltvVar2).b;
            if (i3 >= 0) {
                List<nsv> list2 = list;
                if (i3 < list2.size()) {
                    ArrayList arrayList = new ArrayList(list2);
                    arrayList.remove(i3);
                    int i4 = juvVar2.c;
                    int h = e43.h(arrayList);
                    int i5 = h >= 0 ? h : 0;
                    return juv.a(juvVar2, arrayList, i4 > i5 ? i5 : i4, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 252);
                }
            }
        }
        return juvVar2;
    }

    @Override // xsna.dm50
    public final ruv d() {
        return new ruv(e(new y8m(5)));
    }

    @Override // xsna.dm50
    public final void h(juv juvVar, ruv ruvVar) {
        f(ruvVar.a, juvVar);
    }
}
