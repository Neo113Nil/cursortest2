package defpackage;

import kotlin.collections.EmptySet;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.utils.b;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$VehicleType;
import ru.yandex.taxi.masstransit.datasource.routing.f;
import ru.yandex.taxi.masstransit.domain.g;
import ru.yandex.taxi.masstransit.utils.VehicleType;

/* loaded from: classes6.dex */
public final class lj30 extends ad5 {
    public final f A;
    public final yw30 B;
    public final b C;
    public final g D;
    public final wr30 E;
    public final v011 F;
    public final s111 G;
    public final mb11 H;
    public final wu30 I;
    public final r0 J;
    public final r0 K;
    public boolean L;
    public final fl10 x;
    public final tt2 y;
    public final ru.yandex.taxi.masstransit.mapper.b z;

    public lj30(fl10 fl10Var, tt2 tt2Var, ru.yandex.taxi.masstransit.mapper.b bVar, f fVar, yw30 yw30Var, b bVar2, g gVar, wr30 wr30Var, v011 v011Var, s111 s111Var, mb11 mb11Var, wu30 wu30Var) {
        super(ij30.class);
        this.x = fl10Var;
        this.y = tt2Var;
        this.z = bVar;
        this.A = fVar;
        this.B = yw30Var;
        this.C = bVar2;
        this.D = gVar;
        this.E = wr30Var;
        this.F = v011Var;
        this.G = s111Var;
        this.H = mb11Var;
        this.I = wu30Var;
        this.J = bvf0.c(EmptySet.a);
        this.K = bvf0.c(Boolean.FALSE);
    }

    public static TransportRouteAnalytics$VehicleType Kg(VehicleType vehicleType) {
        int i = vehicleType == null ? -1 : jj30.a[vehicleType.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i == 1) {
            return TransportRouteAnalytics$VehicleType.Bus;
        }
        if (i == 2) {
            return TransportRouteAnalytics$VehicleType.Aeroexpress;
        }
        if (i == 3) {
            return TransportRouteAnalytics$VehicleType.Suburban;
        }
        w511.b();
        return null;
    }
}
