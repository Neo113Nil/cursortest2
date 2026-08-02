package defpackage;

import ru.yandex.taxi.masstransit.stoproute.router.ComposableSingletons$MtStopRouteRouterKt;
import ru.yandex.taxi.masstransit.stoproute.router.b;
import ru.yandex.taxi.masstransit.stoproute.ui.g;

/* loaded from: classes6.dex */
public final /* synthetic */ class i340 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ i340(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).c = ((g) bVar.R.getValue()).q;
                agd agdVar = (agd) yfdVar;
                agdVar.e = new i340(bVar, 1);
                ComposableSingletons$MtStopRouteRouterKt.a.getClass();
                agdVar.g = ComposableSingletons$MtStopRouteRouterKt.b;
                break;
            default:
                q240 q240Var = (q240) obj;
                oe61 oe61Var = bVar.K;
                g gVar = (g) bVar.R.getValue();
                if (!(q240Var instanceof p240)) {
                    gVar.c(q240Var);
                    break;
                } else {
                    oe61Var.a(((p240) q240Var).a);
                    gVar.c(q240Var);
                    break;
                }
        }
        return zy11Var;
    }
}
