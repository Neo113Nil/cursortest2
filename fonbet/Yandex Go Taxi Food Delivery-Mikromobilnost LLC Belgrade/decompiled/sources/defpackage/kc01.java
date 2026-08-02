package defpackage;

import android.content.Context;
import defpackage.pd01;
import java.util.HashMap;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$RouteOptionsEntryPointSource;
import ru.yandex.taxi.masstransit.trains.search.StationSearchOpenReason;
import ru.yandex.taxi.masstransit.trains.search.a;
import ru.yandex.taxi.masstransit.ui.StationFocus;

/* loaded from: classes6.dex */
public final class kc01 extends pgd {
    public final Context F;
    public final w030 G;
    public final pc01 H;
    public final a I;
    public final mu5 J;

    public kc01(Context context, w030 w030Var, pc01 pc01Var, a aVar) {
        super(0);
        this.F = context;
        this.G = w030Var;
        this.H = pc01Var;
        this.I = aVar;
        this.J = new mu5(new pxy0(19, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pgd, defpackage.h55
    public final void G(Object obj) {
        String str;
        String str2;
        ovi0 ovi0Var;
        kfv kfvVar;
        StationFocus stationFocus;
        String str3;
        pd01.a aVar;
        String str4;
        pd01.a aVar2;
        String str5;
        pd01.a aVar3;
        String str6;
        pd01.a aVar4;
        String str7;
        pd01.a aVar5;
        pd01.a aVar6;
        oh40 oh40Var = (oh40) obj;
        super.G(oh40Var);
        TransportRouteAnalytics$RouteOptionsEntryPointSource transportRouteAnalytics$RouteOptionsEntryPointSource = oh40Var.f;
        String str8 = oh40Var.a;
        String str9 = oh40Var.c;
        a aVar7 = this.I;
        aVar7.e.a();
        b611 b611Var = aVar7.c;
        TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin = aVar7.d;
        HashMap o = smw0.o(b611Var);
        if (str8 != null) {
            o.put("start_stop_id", str8);
        }
        if (str9 != null) {
            o.put("final_stop_id", str9);
        }
        o.put("source", transportRouteAnalytics$RouteOptionsEntryPointSource.getEventValue());
        o.put("origin", transportRouteAnalytics$FlowOrigin.getEventValue());
        b611Var.a.a("TransportRoute.RouteOptions.Shown", o, 3, new HashMap());
        String str10 = oh40Var.a;
        String str11 = oh40Var.b;
        String str12 = oh40Var.c;
        String str13 = oh40Var.d;
        StationSearchOpenReason stationSearchOpenReason = oh40Var.e;
        TransportRouteAnalytics$RouteOptionsEntryPointSource transportRouteAnalytics$RouteOptionsEntryPointSource2 = oh40Var.f;
        pc01 pc01Var = this.H;
        zuj0 zuj0Var = pc01Var.b;
        pd01.b bVar = pc01Var.a.b().c;
        r0 r0Var = pc01Var.d;
        if (str11 == null) {
            str11 = "";
        }
        if (bVar == null || (aVar6 = bVar.b) == null || (str = aVar6.b) == null) {
            str = "";
        }
        if (bVar == null || (aVar5 = bVar.b) == null || (str2 = aVar5.a) == null) {
            str2 = "";
        }
        if (bVar == null || (aVar4 = bVar.b) == null || (str7 = aVar4.c) == null) {
            ovi0Var = null;
            kfvVar = null;
        } else {
            ovi0Var = mja1.a(str7, null, 6);
            kfvVar = null;
        }
        String str14 = str11;
        kfv kfvVar2 = kfvVar;
        vwp0 vwp0Var = new vwp0(str14, str, str2, str10, ovi0Var, tk91.c(), 64);
        vwp0 vwp0Var2 = new vwp0(str13 == null ? "" : str13, (bVar == null || (aVar3 = bVar.a) == null || (str6 = aVar3.b) == null) ? "" : str6, (bVar == null || (aVar2 = bVar.a) == null || (str5 = aVar2.a) == null) ? "" : str5, str12, (bVar == null || (aVar = bVar.a) == null || (str4 = aVar.c) == null) ? kfvVar2 : mja1.a(str4, kfvVar2, 6), xna1.a(), 64);
        String str15 = (bVar == null || (str3 = bVar.c) == null) ? "" : str3;
        avj0 avj0Var = (avj0) zuj0Var;
        String h = avj0Var.h(kyh0.mt_trains_clear_icon_description);
        String h2 = avj0Var.h(kyh0.mt_trains_sorting_icon_description);
        int i = oc01.a[stationSearchOpenReason.ordinal()];
        if (i == 1) {
            stationFocus = StationFocus.SOURCE;
        } else if (i == 2) {
            stationFocus = StationFocus.DESTINATION;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            stationFocus = StationFocus.SOURCE;
        }
        nc01 nc01Var = new nc01(vwp0Var, vwp0Var2, str15, pc01Var.c, h, h2, stationSearchOpenReason, stationFocus, transportRouteAnalytics$RouteOptionsEntryPointSource2, 1152);
        r0Var.getClass();
        r0Var.m(kfvVar2, nc01Var);
    }

    @Override // defpackage.pgd
    public final wfd P() {
        return this.J;
    }

    @Override // defpackage.pgd
    public final Context Q() {
        return this.F;
    }

    @Override // defpackage.pgd
    public final w030 S() {
        return this.G;
    }
}
