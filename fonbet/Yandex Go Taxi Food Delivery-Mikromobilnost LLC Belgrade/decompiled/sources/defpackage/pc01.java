package defpackage;

import defpackage.pd01;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.trains.config.a;

/* loaded from: classes6.dex */
public final class pc01 {
    public final a a;
    public final zuj0 b;
    public final TransportRouteAnalytics$FlowOrigin c;
    public final r0 d;
    public final n0 e;

    public pc01(a aVar, zuj0 zuj0Var, TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin) {
        String str;
        pd01.a aVar2;
        String str2;
        pd01.a aVar3;
        String str3;
        pd01.a aVar4;
        String str4;
        pd01.a aVar5;
        String str5;
        pd01.a aVar6;
        String str6;
        pd01.a aVar7;
        String str7;
        this.a = aVar;
        this.b = zuj0Var;
        this.c = transportRouteAnalytics$FlowOrigin;
        pd01.b bVar = aVar.b().c;
        ovi0 ovi0Var = null;
        vwp0 vwp0Var = new vwp0(null, (bVar == null || (aVar7 = bVar.b) == null || (str7 = aVar7.b) == null) ? "" : str7, (bVar == null || (aVar6 = bVar.b) == null || (str6 = aVar6.a) == null) ? "" : str6, null, (bVar == null || (aVar5 = bVar.b) == null || (str5 = aVar5.c) == null) ? null : mja1.a(str5, null, 6), tk91.c(), 89);
        String str8 = (bVar == null || (aVar4 = bVar.a) == null || (str4 = aVar4.b) == null) ? "" : str4;
        String str9 = (bVar == null || (aVar3 = bVar.a) == null || (str3 = aVar3.a) == null) ? "" : str3;
        if (bVar != null && (aVar2 = bVar.a) != null && (str2 = aVar2.c) != null) {
            ovi0Var = mja1.a(str2, null, 6);
        }
        avj0 avj0Var = (avj0) zuj0Var;
        this.d = bvf0.c(new nc01(vwp0Var, new vwp0(null, str8, str9, null, ovi0Var, xna1.a(), 89), (bVar == null || (str = bVar.c) == null) ? "" : str, transportRouteAnalytics$FlowOrigin, avj0Var.h(kyh0.mt_trains_clear_icon_description), avj0Var.h(kyh0.mt_trains_sorting_icon_description), null, null, null, 3840));
        this.e = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
    }
}
