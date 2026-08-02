package com.yandex.go.places.impl.ui.organizations;

import com.yandex.go.places.map.data.repositories.h;
import defpackage.ah00;
import defpackage.bn80;
import defpackage.c5c0;
import defpackage.cn80;
import defpackage.cq;
import defpackage.dp80;
import defpackage.fr;
import defpackage.g8e;
import defpackage.go80;
import defpackage.hn80;
import defpackage.hp80;
import defpackage.ike;
import defpackage.in80;
import defpackage.ip80;
import defpackage.jdj;
import defpackage.jio;
import defpackage.jn80;
import defpackage.juj;
import defpackage.k0b0;
import defpackage.kq;
import defpackage.l76;
import defpackage.mg80;
import defpackage.msy0;
import defpackage.nuj;
import defpackage.nw70;
import defpackage.ny61;
import defpackage.po80;
import defpackage.puj;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.qi80;
import defpackage.qo80;
import defpackage.qu;
import defpackage.qv10;
import defpackage.ri80;
import defpackage.ry;
import defpackage.si80;
import defpackage.svj;
import defpackage.ti80;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uc4;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wbc0;
import defpackage.wfz;
import defpackage.xpb1;
import defpackage.yac0;
import defpackage.ym80;
import defpackage.yp;
import defpackage.yuj;
import defpackage.zr00;
import defpackage.zuj;
import defpackage.zuj0;
import defpackage.zy11;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class d extends com.yandex.go.places.base.ui.common.map.c {
    public final nw70 D;
    public final tse E;
    public final yac0 F;
    public final ru.yandex.taxi.widget.utils.e G;
    public final tt2 H;
    public final ru.yandex.taxi.design.utils.b I;
    public final zuj0 J;
    public final pwy0 K;
    public final e L;
    public final com.yandex.go.places.impl.domain.interactors.a M;
    public final go80 N;
    public final h O;
    public final jdj P;
    public final cn80 Q;
    public final jio R;
    public final com.yandex.go.places.impl.navigation.common.navigator.internal.b S;
    public final wbc0 T;
    public final mg80 U;
    public final com.yandex.go.places.experiments.flex.b V;
    public pzt0 W;
    public pzt0 Z;
    public pzt0 a0;
    public pzt0 b0;

    public d(com.yandex.go.places.impl.domain.interactors.common.a aVar, k0b0 k0b0Var, ah00 ah00Var, nw70 nw70Var, ike ikeVar, yac0 yac0Var, ru.yandex.taxi.widget.utils.e eVar, tt2 tt2Var, ru.yandex.taxi.design.utils.b bVar, zuj0 zuj0Var, pwy0 pwy0Var, e eVar2, com.yandex.go.places.impl.domain.interactors.a aVar2, go80 go80Var, h hVar, jdj jdjVar, cn80 cn80Var, jio jioVar, com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar2, wbc0 wbc0Var, mg80 mg80Var, com.yandex.go.places.experiments.flex.b bVar3) {
        super(qo80.class, aVar, k0b0Var, ah00Var, true);
        this.D = nw70Var;
        this.E = ikeVar;
        this.F = yac0Var;
        this.G = eVar;
        this.H = tt2Var;
        this.I = bVar;
        this.J = zuj0Var;
        this.K = pwy0Var;
        this.L = eVar2;
        this.M = aVar2;
        this.N = go80Var;
        this.O = hVar;
        this.P = jdjVar;
        this.Q = cn80Var;
        this.R = jioVar;
        this.S = bVar2;
        this.T = wbc0Var;
        this.U = mg80Var;
        this.V = bVar3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable Mg(d dVar, ContinuationImpl continuationImpl) {
        OrganizationsPresenter$getCurrentBboxAndZoom$1 organizationsPresenter$getCurrentBboxAndZoom$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof OrganizationsPresenter$getCurrentBboxAndZoom$1) {
            organizationsPresenter$getCurrentBboxAndZoom$1 = (OrganizationsPresenter$getCurrentBboxAndZoom$1) continuationImpl;
            int i2 = organizationsPresenter$getCurrentBboxAndZoom$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsPresenter$getCurrentBboxAndZoom$1.label = i2 - Integer.MIN_VALUE;
                Object obj = organizationsPresenter$getCurrentBboxAndZoom$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsPresenter$getCurrentBboxAndZoom$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!dVar.F.a) {
                        return new Pair(null, null);
                    }
                    r0 r0Var = dVar.N.b;
                    organizationsPresenter$getCurrentBboxAndZoom$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.A(r0Var, organizationsPresenter$getCurrentBboxAndZoom$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                zr00 zr00Var = (zr00) obj;
                return new Pair(zr00Var == null ? zr00Var.a : null, zr00Var != null ? zr00Var.b : null);
            }
        }
        organizationsPresenter$getCurrentBboxAndZoom$1 = new OrganizationsPresenter$getCurrentBboxAndZoom$1(dVar, continuationImpl);
        Object obj2 = organizationsPresenter$getCurrentBboxAndZoom$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsPresenter$getCurrentBboxAndZoom$1.label;
        if (i != 0) {
        }
        zr00 zr00Var2 = (zr00) obj2;
        return new Pair(zr00Var2 == null ? zr00Var2.a : null, zr00Var2 != null ? zr00Var2.b : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Ng(d dVar, bn80 bn80Var, Continuation continuation) {
        OrganizationsPresenter$updateOrganizationsInfo$1 organizationsPresenter$updateOrganizationsInfo$1;
        int i;
        pzt0 pzt0Var;
        dVar.getClass();
        if (continuation instanceof OrganizationsPresenter$updateOrganizationsInfo$1) {
            organizationsPresenter$updateOrganizationsInfo$1 = (OrganizationsPresenter$updateOrganizationsInfo$1) continuation;
            int i2 = organizationsPresenter$updateOrganizationsInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsPresenter$updateOrganizationsInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = organizationsPresenter$updateOrganizationsInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsPresenter$updateOrganizationsInfo$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    jn80 jn80Var = bn80Var.d;
                    if (jn80Var instanceof hn80) {
                        ((qo80) dVar.Dg()).a6(((hn80) bn80Var.d).a);
                    } else if (jn80Var instanceof in80) {
                        msy0 a = com.yandex.go.places.impl.ui.search.utils.a.a(dVar.G, ((in80) jn80Var).a);
                        ((qo80) dVar.Dg()).a6(a.a);
                        tse Jg = dVar.Jg();
                        dVar.H.getClass();
                        tje.N(Jg, uyj.a, null, new OrganizationsPresenter$renderFormattedTextScreenTitle$1(a, dVar, null), 2);
                    } else {
                        if (jn80Var != null) {
                            w511.b();
                            return null;
                        }
                        ((qo80) dVar.Dg()).a6("");
                    }
                    if (!dVar.F.a) {
                        dVar.Og(true, null, null);
                        return zy11.a;
                    }
                    h hVar = dVar.O;
                    organizationsPresenter$updateOrganizationsInfo$1.L$0 = null;
                    organizationsPresenter$updateOrganizationsInfo$1.label = 1;
                    if (hVar.A(organizationsPresenter$updateOrganizationsInfo$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                pzt0Var = dVar.W;
                if (pzt0Var != null) {
                    pzt0Var.a(null);
                }
                go80 go80Var = dVar.N;
                dVar.W = tje.N(dVar.Jg(), null, null, new OrganizationsPresenter$subscribeToBboxUpdates$$inlined$safeCollectIn$1(new com.yandex.go.places.map.data.repositories.d(go80Var.b(), go80Var), null, dVar), 3);
                return zy11.a;
            }
        }
        organizationsPresenter$updateOrganizationsInfo$1 = new OrganizationsPresenter$updateOrganizationsInfo$1(dVar, continuation);
        Object obj2 = organizationsPresenter$updateOrganizationsInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsPresenter$updateOrganizationsInfo$1.label;
        if (i != 0) {
        }
        pzt0Var = dVar.W;
        if (pzt0Var != null) {
        }
        go80 go80Var2 = dVar.N;
        dVar.W = tje.N(dVar.Jg(), null, null, new OrganizationsPresenter$subscribeToBboxUpdates$$inlined$safeCollectIn$1(new com.yandex.go.places.map.data.repositories.d(go80Var2.b(), go80Var2), null, dVar), 3);
        return zy11.a;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        pzt0 pzt0Var = this.W;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.Z;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        pzt0 pzt0Var3 = this.a0;
        if (pzt0Var3 != null) {
            pzt0Var3.a(null);
        }
        pzt0 pzt0Var4 = this.b0;
        if (pzt0Var4 != null) {
            pzt0Var4.a(null);
        }
        e eVar = this.L;
        r0 r0Var = eVar.e.a;
        r0Var.getClass();
        r0Var.m(null, dp80.a);
        com.yandex.go.places.impl.data.repositories.organizations.b bVar = eVar.c;
        bVar.c.l(null);
        r0 r0Var2 = bVar.d;
        r0Var2.getClass();
        r0Var2.m(null, EmptyList.a);
    }

    public final void Og(boolean z, uc4 uc4Var, Float f) {
        if (!z) {
            ip80 a = this.L.a();
            a.getClass();
            if (a instanceof hp80) {
                return;
            }
        }
        pzt0 pzt0Var = this.a0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.Z;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        tse tseVar = this.E;
        if (tseVar == null) {
            tseVar = Jg();
        }
        this.Z = tje.N(tseVar, null, null, new OrganizationsPresenter$loadStartPage$1(this, uc4Var, f, null), 3);
    }

    public final void Pg(fr frVar, boolean z) {
        Pair pair;
        bn80 bn80Var = (bn80) this.Q.a.getValue();
        c5c0 c5c0Var = null;
        String str = bn80Var != null ? bn80Var.a : null;
        boolean z2 = frVar instanceof kq;
        jdj jdjVar = this.P;
        if (z2) {
            ((ry) jdjVar.b).getClass();
            ti80 ti80Var = ((kq) frVar).a;
            if (ti80Var instanceof qi80) {
                pair = new Pair(null, ((qi80) ti80Var).a);
            } else if (ti80Var instanceof ri80) {
                pair = new Pair(((ri80) ti80Var).a, null);
            } else if (!(ti80Var instanceof si80)) {
                w511.b();
                return;
            } else {
                si80 si80Var = (si80) ti80Var;
                pair = new Pair(si80Var.a, si80Var.b);
            }
            String str2 = (String) pair.getSecond();
            MapBuilder y = qv10.y("type", "organization_card");
            if (str2 != null) {
                y.put("oid", str2);
            }
            ((jio) jdjVar.c).e(str, y.j());
        } else {
            jdjVar.getClass();
            if (frVar instanceof cq) {
                ((jio) jdjVar.c).e(str, g8e.z("type", "open_delivery_order_form"));
            }
        }
        if (frVar instanceof yp) {
            Iterator it = ((yp) frVar).a.iterator();
            while (it.hasNext()) {
                Pg((fr) it.next(), z);
            }
        } else {
            if (z2) {
                tje.N(Jg(), null, null, new OrganizationsPresenter$openOrganizationCardWithoutFocusing$1(this, z, (kq) frVar, null), 3);
                return;
            }
            svj a = this.T.a();
            if (a.equals(zuj.b) || a.equals(puj.b)) {
                c5c0Var = xpb1.N;
            } else if (a.equals(yuj.b) || a.equals(nuj.b)) {
                c5c0Var = wfz.M;
            } else if (a.equals(juj.b)) {
                c5c0Var = l76.L;
            }
            this.M.a(frVar, c5c0Var);
        }
    }

    public final void Qg() {
        pzt0 pzt0Var = this.b0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.b0 = tje.N(Jg(), null, null, new OrganizationsPresenter$reloadStartPageApplyingSearchOptions$1(this, null), 3);
    }

    public final void Rg(ym80 ym80Var) {
        Integer a = ym80Var.a();
        if (a == null || a.intValue() <= 0) {
            return;
        }
        pzt0 pzt0Var = this.a0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.a0 = tje.N(Jg(), null, null, new OrganizationsPresenter$tryLoadNextPage$1(this, ym80Var, null), 3);
    }

    public final void a() {
        bn80 bn80Var = (bn80) this.Q.a.getValue();
        String str = bn80Var != null ? bn80Var.a : null;
        jio jioVar = (jio) this.P.c;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("type", "back");
        jioVar.e(str, mapBuilder.j());
        ((po80) this.D.b).r(new qu(9));
    }
}
