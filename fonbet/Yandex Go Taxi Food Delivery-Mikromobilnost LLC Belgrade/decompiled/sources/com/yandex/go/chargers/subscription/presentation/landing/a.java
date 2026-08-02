package com.yandex.go.chargers.subscription.presentation.landing;

import defpackage.agd;
import defpackage.i5d;
import defpackage.n12;
import defpackage.nta;
import defpackage.rol0;
import defpackage.tje;
import defpackage.tls;
import defpackage.uta;
import defpackage.yfd;
import defpackage.zta;
import defpackage.zy11;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ n12 b;
    public final /* synthetic */ d c;
    public final /* synthetic */ Object w;

    public /* synthetic */ a(n12 n12Var, zta ztaVar, d dVar) {
        this.b = n12Var;
        this.w = ztaVar;
        this.c = dVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.w;
        d dVar = this.c;
        n12 n12Var = this.b;
        switch (i) {
            case 0:
                zta ztaVar = (zta) obj2;
                yfd yfdVar = (yfd) obj;
                nta ntaVar = new nta(n12Var);
                ztaVar.getClass();
                ((agd) yfdVar).c = new m0(kotlinx.coroutines.flow.e.t(new rol0(new ChargersSubscriptionLandingUiStateInteractor$uiStateFlow$1(ztaVar, null))), ztaVar.b.a, new ChargersSubscriptionLandingUiStateInteractor$uiStateFlow$2(3, null));
                agd agdVar = (agd) yfdVar;
                agdVar.e = new a(n12Var, dVar, ntaVar);
                i5d.a.getClass();
                agdVar.g = i5d.b;
                break;
            default:
                tje.N(n12Var.o(), null, null, new ChargersSubscriptionLandingRouter$content$1$1$1(dVar, (uta) obj, (nta) obj2, null), 3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ a(n12 n12Var, d dVar, nta ntaVar) {
        this.b = n12Var;
        this.c = dVar;
        this.w = ntaVar;
    }
}
