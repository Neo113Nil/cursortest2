package defpackage;

import ru.yandex.taxi.cashback.analytics.CashbackCardContext;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$ScheduleEntryPointSource;
import ru.yandex.taxi.masstransit.trains.schedule.e;

/* loaded from: classes6.dex */
public final class dz30 extends h55 {
    public final /* synthetic */ int D;
    public final h3y E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dz30(h3y h3yVar, int i) {
        super(null);
        this.D = i;
        this.E = h3yVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        int i = this.D;
        h3y h3yVar = this.E;
        switch (i) {
            case 0:
                fe01 fe01Var = ((bz30) obj).a.b;
                A((e) ((cv5) ((ae40) h3yVar.get()).a(TransportRouteAnalytics$FlowOrigin.DetailCard).A).get(), new hh40(fe01Var.a, fe01Var.b, TransportRouteAnalytics$ScheduleEntryPointSource.DetailCard, 4), new cz30(this));
                break;
            default:
                s3d0 s3d0Var = (s3d0) h3yVar.get();
                String value = CashbackCardContext.CHARGERS.getValue();
                v2d0 v2d0Var = new v2d0();
                v2d0Var.c = ((gma) obj).a;
                s3d0Var.a(new qxx0(value, v2d0Var.a(), new e48(17, this)));
                break;
        }
    }
}
