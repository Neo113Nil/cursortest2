package defpackage;

import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$ScheduleEntryPointSource;

/* loaded from: classes6.dex */
public final class dc01 implements jc01 {
    public final /* synthetic */ c8n0 a;

    public dc01(c8n0 c8n0Var) {
        this.a = c8n0Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.jc01
    public final void y(String str, String str2) {
        c8n0 c8n0Var = this.a;
        c8n0Var.A((m950) c8n0Var.F.get(), new hh40(str, str2, TransportRouteAnalytics$ScheduleEntryPointSource.StationSearch, 4), new yio0(23, c8n0Var));
    }
}
