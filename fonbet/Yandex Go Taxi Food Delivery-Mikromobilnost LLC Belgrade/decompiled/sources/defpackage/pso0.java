package defpackage;

import ru.yandex.taxi.layers.presentation.walkroute.e;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.scooters.presentation.personal_goals.a;

/* loaded from: classes14.dex */
public final class pso0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final n3w c;
    public final xvf0 d;

    public pso0(n3w n3wVar, xvf0 xvf0Var, xvf0 xvf0Var2) {
        this.a = 9;
        this.c = n3wVar;
        this.b = xvf0Var;
        this.d = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.d;
        xvf0 xvf0Var2 = this.b;
        n3w n3wVar = this.c;
        switch (i) {
            case 0:
                return new a((w030) xvf0Var2.get(), xvf0Var, (qso0) n3wVar.a);
            case 1:
                return new emv0((mmv0) xvf0Var2.get(), (lmv0) n3wVar.a, (i130) xvf0Var.get());
            case 2:
                return new bjw0((w030) xvf0Var2.get(), (ziw0) xvf0Var.get(), (fjw0) n3wVar.a);
            case 3:
                return new tjw0((w030) xvf0Var2.get(), (pjw0) xvf0Var.get(), (sjw0) n3wVar.a);
            case 4:
                return new se01(xvf0Var2, xvf0Var, (obg) n3wVar.a);
            case 5:
                return new kz31((w030) xvf0Var2.get(), (ez31) xvf0Var.get(), (fz31) n3wVar.a);
            case 6:
                return new y4c0(xvf0Var2, (i541) xvf0Var.get(), (c241) n3wVar.a, 19);
            case 7:
                return new h641((ney) xvf0Var2.get(), (d641) xvf0Var.get(), (e) n3wVar.a);
            case 8:
                return new mj31(5, (b611) xvf0Var2.get(), (cg40) xvf0Var.get(), (TransportRouteAnalytics$FlowOrigin) n3wVar.a);
            default:
                return new ze61((git0) n3wVar.a, (ah00) xvf0Var2.get(), (a3v) xvf0Var.get());
        }
    }

    public pso0(ad adVar, n3w n3wVar, v0g v0gVar) {
        this.a = 1;
        this.b = adVar;
        this.c = n3wVar;
        this.d = v0gVar;
    }

    public /* synthetic */ pso0(xvf0 xvf0Var, xvf0 xvf0Var2, n3w n3wVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.d = xvf0Var2;
        this.c = n3wVar;
    }

    public pso0(xat xatVar, c4p c4pVar, f9t f9tVar, n3w n3wVar) {
        this.a = 4;
        this.b = xatVar;
        this.d = f9tVar;
        this.c = n3wVar;
    }
}
