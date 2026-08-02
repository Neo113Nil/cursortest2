package defpackage;

import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$RouteOptionsEntryPointSource;

/* loaded from: classes6.dex */
public final class c8n0 extends h55 {
    public final /* synthetic */ int D;
    public final yvf0 E;
    public final yvf0 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c8n0(v7p v7pVar, v7p v7pVar2, int i) {
        super(null);
        this.D = i;
        this.E = v7pVar;
        this.F = v7pVar2;
    }

    @Override // defpackage.h55
    public void G(Object obj) {
        switch (this.D) {
            case 0:
                a8n0 a8n0Var = (a8n0) obj;
                if (!(a8n0Var instanceof z7n0)) {
                    if (!(a8n0Var instanceof y7n0)) {
                        w511.b();
                        break;
                    } else {
                        A((m950) this.E.get(), (y7n0) a8n0Var, new b8n0(this, 0));
                        break;
                    }
                } else {
                    A((m950) this.F.get(), (z7n0) a8n0Var, new b8n0(this, 1));
                    break;
                }
        }
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        switch (this.D) {
            case 1:
                A((m950) this.E.get(), new oh40(TransportRouteAnalytics$RouteOptionsEntryPointSource.Deeplink, 31), new dc01(this));
                break;
        }
    }
}
