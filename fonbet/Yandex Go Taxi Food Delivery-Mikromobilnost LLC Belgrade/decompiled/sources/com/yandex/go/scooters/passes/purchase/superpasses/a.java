package com.yandex.go.scooters.passes.purchase.superpasses;

import defpackage.agd;
import defpackage.d1p0;
import defpackage.dfo0;
import defpackage.i1p0;
import defpackage.qxm0;
import defpackage.t0p0;
import defpackage.t1p0;
import defpackage.tcd;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.uyj;
import defpackage.yfd;
import defpackage.zy11;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ c b;
    public final /* synthetic */ d c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ a(c cVar, t1p0 t1p0Var, qxm0 qxm0Var, d dVar) {
        this.b = cVar;
        this.w = t1p0Var;
        this.x = qxm0Var;
        this.c = dVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        tpr d;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.x;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                t1p0 t1p0Var = (t1p0) obj3;
                yfd yfdVar = (yfd) obj;
                c cVar = this.b;
                t0p0 t0p0Var = new t0p0(cVar);
                String str = ((dfo0) ((agd) yfdVar).a).c;
                d1p0 d1p0Var = cVar.L;
                g gVar = new g(kotlinx.coroutines.flow.e.d((r0) t1p0Var.c.b));
                d = t1p0Var.d.d(null, true);
                tpr t = kotlinx.coroutines.flow.e.t(new e(new tpr[]{gVar, d, com.yandex.go.coroutines.b.d(d1p0Var.a, new ScootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$start$1(str, null)), d1p0Var.b, kotlinx.coroutines.flow.e.d(((com.yandex.go.scooters.passes.data.b) t1p0Var.e).b), com.yandex.go.coroutines.b.d(t1p0Var.g.a.a(), new ScootersSuperPassesPurchaseUiStateInteractor$uiStateFlow$$inlined$start$2(null, null)), t1p0Var.b.a()}, t1p0Var));
                t1p0Var.a.getClass();
                agd agdVar = (agd) yfdVar;
                agdVar.c = com.yandex.go.coroutines.b.c(kotlinx.coroutines.flow.e.F(t, uyj.a), new ScootersSuperPassesPurchaseRouter$content$1$1(yfdVar, (qxm0) obj2, null));
                agdVar.e = new a(cVar, this.c, yfdVar, t0p0Var);
                tcd.a.getClass();
                agdVar.g = tcd.b;
                break;
            default:
                c cVar2 = this.b;
                tje.N(cVar2.o(), null, null, new ScootersSuperPassesPurchaseRouter$content$1$2$1(this.c, (yfd) obj3, (i1p0) obj, (t0p0) obj2, cVar2, null), 3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ a(c cVar, d dVar, yfd yfdVar, t0p0 t0p0Var) {
        this.b = cVar;
        this.c = dVar;
        this.w = yfdVar;
        this.x = t0p0Var;
    }
}
