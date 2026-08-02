package com.yandex.go.chargers.passes.offer_screen;

import defpackage.agd;
import defpackage.eha;
import defpackage.ila;
import defpackage.l0;
import defpackage.oga;
import defpackage.tje;
import defpackage.tla;
import defpackage.tls;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.xga;
import defpackage.yfd;
import defpackage.yga;
import defpackage.zy11;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ yga b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(yga ygaVar, Object obj, int i) {
        this.a = i;
        this.b = ygaVar;
        this.c = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.c;
        yga ygaVar = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                xga xgaVar = new xga(ygaVar);
                eha ehaVar = ygaVar.L;
                tpr t = e.t(e.l(ehaVar.b.a(), e.X(com.yandex.go.coroutines.b.d(ehaVar.h, new ChargersPassesOfferUiStateInteractor$offerResultFlow$$inlined$start$1(zy11Var, null)), new ChargersPassesOfferUiStateInteractor$offerResultFlow$1(ehaVar, ((oga) ((agd) yfdVar).a).a, null)), ehaVar.f.e(), ehaVar.g.b, ehaVar.e.c(), new ChargersPassesOfferUiStateInteractor$getUiStateFlow$1(ehaVar, null)));
                ehaVar.a.getClass();
                agd agdVar = (agd) yfdVar;
                agdVar.c = e.F(t, uyj.a);
                agdVar.e = new a(ygaVar, xgaVar, 1);
                agdVar.g = new androidx.compose.runtime.internal.a(-161164866, new l0(8, (tla) obj2, ygaVar), true);
                break;
            default:
                tje.N(ygaVar.o(), null, null, new ChargersPassesOfferRouter$content$1$1$1(ygaVar, (ila) obj, (xga) obj2, null), 3);
                break;
        }
        return zy11Var;
    }
}
