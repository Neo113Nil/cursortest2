package com.yandex.go.route.experiment;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ibl0;
import defpackage.n96;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/route/experiment/RouteTariffVehicleTypeExperiment;", "Ln96;", "Companion", "com/yandex/go/route/experiment/c", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RouteTariffVehicleTypeExperiment extends n96 {
    public static final c Companion = new c();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ibl0(12))};
    public static final RouteTariffVehicleTypeExperiment e = new RouteTariffVehicleTypeExperiment(0);
    public final boolean b;
    public final Map c;

    public /* synthetic */ RouteTariffVehicleTypeExperiment(Map map, boolean z, int i) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public RouteTariffVehicleTypeExperiment() {
        this(0);
    }

    public RouteTariffVehicleTypeExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
    }
}
