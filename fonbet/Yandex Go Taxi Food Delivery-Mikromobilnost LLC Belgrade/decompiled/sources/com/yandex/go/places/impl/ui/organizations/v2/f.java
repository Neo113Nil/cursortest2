package com.yandex.go.places.impl.ui.organizations.v2;

import com.yandex.go.places.impl.data.entities.network.organizations.OrganizationsListSearchbarDto;
import com.yandex.go.places.map.data.repositories.h;
import com.yandex.go.places.models.data.entities.network.s;
import defpackage.ah00;
import defpackage.ak80;
import defpackage.at20;
import defpackage.bo80;
import defpackage.bvf0;
import defpackage.c8c0;
import defpackage.c9c0;
import defpackage.cn80;
import defpackage.dac0;
import defpackage.epb;
import defpackage.fr;
import defpackage.fyc;
import defpackage.gci0;
import defpackage.go80;
import defpackage.gwk0;
import defpackage.i3h;
import defpackage.i3y;
import defpackage.ike;
import defpackage.jio;
import defpackage.jsj;
import defpackage.k0b0;
import defpackage.lec0;
import defpackage.m1j0;
import defpackage.ny61;
import defpackage.oec0;
import defpackage.oep0;
import defpackage.p370;
import defpackage.pzt0;
import defpackage.q3v;
import defpackage.rec0;
import defpackage.rn80;
import defpackage.s7c0;
import defpackage.sy60;
import defpackage.tec0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.u131;
import defpackage.un80;
import defpackage.v66;
import defpackage.vn80;
import defpackage.w8s0;
import defpackage.wbc0;
import defpackage.yn80;
import defpackage.zsa;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class f extends com.yandex.go.places.base.ui.modals.map.c {
    public final dac0 D;
    public final com.yandex.go.places.impl.domain.interactors.organizations.b E;
    public final tt2 F;
    public final at20 G;
    public final s7c0 H;
    public final jsj I;
    public final h J;
    public final com.yandex.go.places.map.data.mappers.a K;
    public final c8c0 L;
    public final i3h M;
    public final oep0 N;
    public final go80 O;
    public final bo80 P;
    public final com.yandex.go.places.searchbar.impl.domain.a Q;
    public final com.yandex.go.places.impl.domain.interactors.a R;
    public final com.yandex.go.places.models.data.mappers.a S;
    public final jio T;
    public final cn80 U;
    public final wbc0 V;
    public boolean W;
    public boolean Z;
    public pzt0 a0;
    public pzt0 b0;
    public final r0 c0;
    public boolean d0;
    public oec0 e0;
    public pzt0 f0;
    public pzt0 g0;
    public final r0 h0;
    public final gci0 i0;
    public final vn80 j0;
    public w8s0 k0;
    public final fyc l0;
    public final b m0;
    public final b n0;
    public final b o0;
    public final un80 p0;
    public final un80 q0;
    public final c r0;
    public final a s0;
    public final i3y t0;

    public f(dac0 dac0Var, com.yandex.go.places.impl.domain.interactors.organizations.b bVar, tt2 tt2Var, at20 at20Var, q3v q3vVar, s7c0 s7c0Var, jsj jsjVar, h hVar, com.yandex.go.places.map.data.mappers.a aVar, c8c0 c8c0Var, i3h i3hVar, oep0 oep0Var, go80 go80Var, bo80 bo80Var, com.yandex.go.places.searchbar.impl.domain.a aVar2, com.yandex.go.places.impl.domain.interactors.a aVar3, com.yandex.go.places.models.data.mappers.a aVar4, jio jioVar, cn80 cn80Var, wbc0 wbc0Var, k0b0 k0b0Var, ah00 ah00Var) {
        super(rn80.class, q3vVar, k0b0Var, ah00Var, true);
        this.D = dac0Var;
        this.E = bVar;
        this.F = tt2Var;
        this.G = at20Var;
        this.H = s7c0Var;
        this.I = jsjVar;
        this.J = hVar;
        this.K = aVar;
        this.L = c8c0Var;
        this.M = i3hVar;
        this.N = oep0Var;
        this.O = go80Var;
        this.P = bo80Var;
        this.Q = aVar2;
        this.R = aVar3;
        this.S = aVar4;
        this.T = jioVar;
        this.U = cn80Var;
        this.V = wbc0Var;
        this.W = true;
        this.c0 = bvf0.c(null);
        this.e0 = lec0.a;
        r0 c = bvf0.c(tec0.a);
        this.h0 = c;
        this.i0 = kotlinx.coroutines.flow.e.d(c);
        this.j0 = new vn80(this);
        this.l0 = gwk0.b();
        this.m0 = new b(this, 1);
        this.n0 = new b(this, 0);
        this.o0 = new b(this, 2);
        this.p0 = new un80(this, 1);
        this.q0 = new un80(this, 0);
        this.r0 = new c(this);
        this.s0 = new a(this);
        this.t0 = kotlin.a.b(LazyThreadSafetyMode.NONE, new ak80(3, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Lg(f fVar, OrganizationsListSearchbarDto organizationsListSearchbarDto, ContinuationImpl continuationImpl) {
        OrganizationsListV2Presenter$getSearchbarMode$1 organizationsListV2Presenter$getSearchbarMode$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        com.yandex.go.places.searchbar.impl.domain.a aVar;
        String str;
        fr frVar;
        String str2;
        OrganizationsListSearchbarDto organizationsListSearchbarDto2;
        com.yandex.go.places.searchbar.impl.domain.a aVar2;
        fVar.getClass();
        if (continuationImpl instanceof OrganizationsListV2Presenter$getSearchbarMode$1) {
            organizationsListV2Presenter$getSearchbarMode$1 = (OrganizationsListV2Presenter$getSearchbarMode$1) continuationImpl;
            int i2 = organizationsListV2Presenter$getSearchbarMode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationsListV2Presenter$getSearchbarMode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = organizationsListV2Presenter$getSearchbarMode$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationsListV2Presenter$getSearchbarMode$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    aVar = fVar.Q;
                    str = organizationsListSearchbarDto.a;
                    s sVar = organizationsListSearchbarDto.b;
                    if (sVar == null) {
                        frVar = null;
                        boolean z = organizationsListSearchbarDto.c;
                        organizationsListV2Presenter$getSearchbarMode$1.L$0 = null;
                        organizationsListV2Presenter$getSearchbarMode$1.L$1 = null;
                        organizationsListV2Presenter$getSearchbarMode$1.L$2 = null;
                        organizationsListV2Presenter$getSearchbarMode$1.L$3 = null;
                        organizationsListV2Presenter$getSearchbarMode$1.label = 2;
                        Object a = aVar.a(str, frVar, z, organizationsListV2Presenter$getSearchbarMode$1);
                        return a == coroutineSingletons ? coroutineSingletons : a;
                    }
                    com.yandex.go.places.models.data.mappers.a aVar3 = fVar.S;
                    organizationsListV2Presenter$getSearchbarMode$1.L$0 = organizationsListSearchbarDto;
                    organizationsListV2Presenter$getSearchbarMode$1.L$1 = null;
                    organizationsListV2Presenter$getSearchbarMode$1.L$2 = aVar;
                    organizationsListV2Presenter$getSearchbarMode$1.L$3 = str;
                    organizationsListV2Presenter$getSearchbarMode$1.label = 1;
                    Object a2 = aVar3.a(sVar, null, organizationsListV2Presenter$getSearchbarMode$1);
                    if (a2 != coroutineSingletons) {
                        obj = a2;
                        str2 = str;
                        organizationsListSearchbarDto2 = organizationsListSearchbarDto;
                        aVar2 = aVar;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                str2 = (String) organizationsListV2Presenter$getSearchbarMode$1.L$3;
                aVar2 = (com.yandex.go.places.searchbar.impl.domain.a) organizationsListV2Presenter$getSearchbarMode$1.L$2;
                organizationsListSearchbarDto2 = (OrganizationsListSearchbarDto) organizationsListV2Presenter$getSearchbarMode$1.L$0;
                kotlin.b.b(obj);
                OrganizationsListSearchbarDto organizationsListSearchbarDto3 = organizationsListSearchbarDto2;
                str = str2;
                frVar = (fr) obj;
                aVar = aVar2;
                organizationsListSearchbarDto = organizationsListSearchbarDto3;
                boolean z2 = organizationsListSearchbarDto.c;
                organizationsListV2Presenter$getSearchbarMode$1.L$0 = null;
                organizationsListV2Presenter$getSearchbarMode$1.L$1 = null;
                organizationsListV2Presenter$getSearchbarMode$1.L$2 = null;
                organizationsListV2Presenter$getSearchbarMode$1.L$3 = null;
                organizationsListV2Presenter$getSearchbarMode$1.label = 2;
                Object a3 = aVar.a(str, frVar, z2, organizationsListV2Presenter$getSearchbarMode$1);
                if (a3 == coroutineSingletons) {
                }
            }
        }
        organizationsListV2Presenter$getSearchbarMode$1 = new OrganizationsListV2Presenter$getSearchbarMode$1(fVar, continuationImpl);
        Object obj2 = organizationsListV2Presenter$getSearchbarMode$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationsListV2Presenter$getSearchbarMode$1.label;
        if (i != 0) {
        }
        OrganizationsListSearchbarDto organizationsListSearchbarDto32 = organizationsListSearchbarDto2;
        str = str2;
        frVar = (fr) obj2;
        aVar = aVar2;
        organizationsListSearchbarDto = organizationsListSearchbarDto32;
        boolean z22 = organizationsListSearchbarDto.c;
        organizationsListV2Presenter$getSearchbarMode$1.L$0 = null;
        organizationsListV2Presenter$getSearchbarMode$1.L$1 = null;
        organizationsListV2Presenter$getSearchbarMode$1.L$2 = null;
        organizationsListV2Presenter$getSearchbarMode$1.L$3 = null;
        organizationsListV2Presenter$getSearchbarMode$1.label = 2;
        Object a32 = aVar.a(str, frVar, z22, organizationsListV2Presenter$getSearchbarMode$1);
        if (a32 == coroutineSingletons) {
        }
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        pzt0 pzt0Var = this.a0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.a0 = null;
        pzt0 pzt0Var2 = this.b0;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.b0 = null;
        Mg().i();
        Ng();
    }

    public final c9c0 Mg() {
        return (c9c0) this.t0.getValue();
    }

    public final void Ng() {
        pzt0 pzt0Var = this.f0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.f0 = null;
        pzt0 pzt0Var2 = this.g0;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.g0 = null;
        Mg().X(this.j0);
        com.yandex.go.places.searchbar.impl.domain.a aVar = this.Q;
        v66 v66Var = aVar.d;
        if (v66Var != null) {
            v66Var.detach();
        }
        aVar.d = null;
        at20 at20Var = this.G;
        zsa zsaVar = (zsa) at20Var.a;
        if (zsaVar != null) {
            ((yn80) at20Var.b).j(new epb(zsaVar));
            at20Var.a = null;
        }
    }

    public final void Og(OrganizationsListV2ModalView organizationsListV2ModalView, boolean z, v66 v66Var) {
        tse Jg = Jg();
        this.P.a.getClass();
        p370 p370Var = new p370((ike) Jg, this.i0);
        at20 at20Var = this.G;
        at20Var.getClass();
        rec0 rec0Var = new rec0(organizationsListV2ModalView, v66Var, p370Var, z);
        yn80 yn80Var = (yn80) at20Var.b;
        zsa zsaVar = (zsa) yn80Var.S.get();
        yn80Var.B(zsaVar, rec0Var, sy60.Q2, m1j0.a);
        at20Var.a = zsaVar;
        Mg().R(this.j0);
        pzt0 pzt0Var = this.g0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.g0 = tje.N(Jg(), null, null, new OrganizationsListV2Presenter$showSearchbar$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.c((n0) p370Var.b), null, this), 3);
        pzt0 pzt0Var2 = this.f0;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.f0 = tje.N(Jg(), null, null, new OrganizationsListV2Presenter$showSearchbar$$inlined$safeCollectIn$2(kotlinx.coroutines.flow.e.c((n0) p370Var.c), null, this), 3);
    }

    public final void Pg(boolean z) {
        this.D.d.i(new u131("discovery.is_modal_view_expanded", z));
    }
}
