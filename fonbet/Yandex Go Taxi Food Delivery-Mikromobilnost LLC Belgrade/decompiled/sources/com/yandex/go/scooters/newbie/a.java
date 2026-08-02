package com.yandex.go.scooters.newbie;

import defpackage.agd;
import defpackage.e2o0;
import defpackage.fcd;
import defpackage.g2o0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tpr;
import defpackage.u1o0;
import defpackage.uyj;
import defpackage.yfd;
import defpackage.z1o0;
import defpackage.zy11;

/* loaded from: classes13.dex */
public final /* synthetic */ class a implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ d b;
    public final /* synthetic */ f c;
    public final /* synthetic */ Object w;

    public /* synthetic */ a(d dVar, g2o0 g2o0Var, f fVar) {
        this.b = dVar;
        this.w = g2o0Var;
        this.c = fVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.w;
        f fVar = this.c;
        d dVar = this.b;
        switch (i) {
            case 0:
                g2o0 g2o0Var = (g2o0) obj2;
                yfd yfdVar = (yfd) obj;
                z1o0 z1o0Var = new z1o0(dVar);
                tpr a = g2o0Var.b.a();
                u1o0 u1o0Var = g2o0Var.d;
                tpr t = kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(a, u1o0Var.a.a(), new j(new h(u1o0Var.a.a())), new ScootersNewbieUiStateInteractor$uiStateFlow$3(g2o0Var, null)));
                g2o0Var.a.getClass();
                ((agd) yfdVar).c = kotlinx.coroutines.flow.e.F(t, uyj.a);
                agd agdVar = (agd) yfdVar;
                agdVar.e = new a(dVar, fVar, z1o0Var);
                fcd.a.getClass();
                agdVar.g = fcd.b;
                break;
            default:
                tje.N(dVar.o(), null, null, new ScootersNewbieRouter$content$1$1$1(fVar, (e2o0) obj, (z1o0) obj2, null), 3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ a(d dVar, f fVar, z1o0 z1o0Var) {
        this.b = dVar;
        this.c = fVar;
        this.w = z1o0Var;
    }
}
