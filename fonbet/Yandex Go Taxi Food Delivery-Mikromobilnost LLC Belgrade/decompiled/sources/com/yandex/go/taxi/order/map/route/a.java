package com.yandex.go.taxi.order.map.route;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.mapkit.directions.driving.AvoidanceFlags;
import com.yandex.mapkit.directions.driving.DrivingOptions;
import com.yandex.mapkit.directions.driving.DrivingRoute;
import com.yandex.mapkit.directions.driving.VehicleOptions;
import com.yandex.mapkit.directions.driving.VehicleType;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.passport.internal.ui.YxAuthActivity;
import defpackage.a3y0;
import defpackage.bvf0;
import defpackage.cv00;
import defpackage.czo0;
import defpackage.ffx;
import defpackage.gci0;
import defpackage.h3y;
import defpackage.h8l0;
import defpackage.hbp0;
import defpackage.hst;
import defpackage.i201;
import defpackage.i8l0;
import defpackage.ist;
import defpackage.j8l0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.k8l0;
import defpackage.ke00;
import defpackage.kgl0;
import defpackage.l201;
import defpackage.l3l0;
import defpackage.n201;
import defpackage.nzr;
import defpackage.o2y0;
import defpackage.o7r0;
import defpackage.o8g0;
import defpackage.olm;
import defpackage.ool0;
import defpackage.plm;
import defpackage.q201;
import defpackage.u1s;
import defpackage.vay0;
import defpackage.vqy;
import defpackage.x4s0;
import defpackage.yxf0;
import java.io.IOException;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.SimpleBooleanExperiment;
import ru.yandex.taxi.map_common.map.o;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class a {
    public boolean A;
    public final cv00 a;
    public final olm b;
    public final o7r0 c;
    public final x4s0 d;
    public final o2y0 e;
    public final kgl0 f;
    public final u1s g;
    public final l3l0 h;
    public final h3y i;
    public final a3y0 j = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "RouteProgressTracker");
    public final n0 k;
    public final n0 l;
    public final yxf0 m;
    public final hbp0 n;
    public final r0 o;
    public final gci0 p;
    public h8l0 q;
    public Double r;
    public o8g0 s;
    public nzr t;
    public long u;
    public long v;
    public List w;
    public l201 x;
    public String y;
    public final i8l0 z;

    public a(cv00 cv00Var, olm olmVar, o7r0 o7r0Var, x4s0 x4s0Var, o2y0 o2y0Var, kgl0 kgl0Var, u1s u1sVar, l3l0 l3l0Var, h3y h3yVar) {
        this.a = cv00Var;
        this.b = olmVar;
        this.c = o7r0Var;
        this.d = x4s0Var;
        this.e = o2y0Var;
        this.f = kgl0Var;
        this.g = u1sVar;
        this.h = l3l0Var;
        this.i = h3yVar;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.k = ffx.b(0, 1, bufferOverflow);
        this.l = ffx.b(0, 1, bufferOverflow);
        yxf0 yxf0Var = new yxf0();
        yxf0Var.b = this;
        yxf0Var.a = new PolylinePosition();
        this.m = yxf0Var;
        this.n = new hbp0(new czo0(14), "route-guide", null);
        r0 c = bvf0.c(null);
        this.o = c;
        this.p = e.d(c);
        this.v = System.currentTimeMillis();
        this.w = EmptyList.a;
        this.x = i201.a;
        this.y = "";
        this.z = new i8l0(this);
    }

    public final void a() {
        o8g0 o8g0Var = this.s;
        if (o8g0Var != null) {
            ool0 ool0Var = (ool0) o8g0Var.a;
            yxf0 yxf0Var = this.m;
            yxf0Var.getClass();
            yxf0Var.a = new PolylinePosition();
            ((plm) this.b).a(ool0Var);
            DrivingRoute a = ool0Var.a();
            if (a != null) {
                ((vay0) this.i.get()).a(this.e.b().a).Pf(a);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(List list, q201 q201Var, boolean z) {
        String str;
        String str2;
        n201 n201Var;
        o2y0 o2y0Var;
        DriveState c;
        DriveState driveState;
        if (list.size() < 2) {
            a3y0 a3y0Var = this.j;
            String l = a3y0Var.l(new String[]{"ROUTE_PROGRESS:INVALID_ROUTE_SIZE"});
            hst hstVar = jst.e;
            String str3 = a3y0Var.a;
            hstVar.getClass();
            ist m = hstVar.m(l);
            ke00 a = m.b.a();
            if (a == null || !a.b(15)) {
                return;
            }
            a.a(15, str3, null, "rawRoute should contain at least 2 points", m.a);
            return;
        }
        if (!this.x.equals(i201.a)) {
            return;
        }
        if (z || this.y.length() <= 0) {
            str = (q201Var == null || (n201Var = q201Var.a) == null) ? null : n201Var.a;
            if (str == null) {
                str2 = "";
                o2y0Var = this.e;
                c = o2y0Var.c();
                driveState = DriveState.TRANSPORTING;
                cv00 cv00Var = this.a;
                if (c == driveState || str2.length() <= 0) {
                    this.y = "";
                    if (jl40.l(o2y0Var.b().V().b0, OrderStatusInfo.TollRoads.f)) {
                        ((o) this.a).f(list, null, new k8l0(this, System.currentTimeMillis(), z), null, this.r, VehicleType.TAXI);
                        return;
                    } else {
                        ((o) cv00Var).g(list, o2y0Var.b().V().f(SimpleBooleanExperiment.ROUTE_AVOID_TOLLS) ? Boolean.TRUE : null, new j8l0(System.currentTimeMillis(), this, false, null, z), this.r);
                        return;
                    }
                }
                if (jl40.l(this.y, str2) && z) {
                    return;
                }
                this.y = str2;
                j8l0 j8l0Var = new j8l0(System.currentTimeMillis(), this, false, null, this.s != null);
                Double d = this.r;
                VehicleType vehicleType = VehicleType.TAXI;
                o oVar = (o) cv00Var;
                oVar.getClass();
                if (str2.length() == 0) {
                    j8l0Var.d(new IOException(YxAuthActivity.EMPTY_URI_ERROR_MESSAGE));
                    return;
                } else {
                    oVar.e = j8l0Var;
                    oVar.b.b(new vqy(oVar, str2, new DrivingOptions(d, 1, null, null, null, new AvoidanceFlags(false, false, false, false, false, false, false, false), EmptyList.a), new VehicleOptions(vehicleType, null, null, null, null, null, null, null, null, null, null), 3), true);
                    return;
                }
            }
        } else {
            str = this.y;
        }
        str2 = str;
        o2y0Var = this.e;
        c = o2y0Var.c();
        driveState = DriveState.TRANSPORTING;
        cv00 cv00Var2 = this.a;
        if (c == driveState) {
        }
        this.y = "";
        if (jl40.l(o2y0Var.b().V().b0, OrderStatusInfo.TollRoads.f)) {
        }
    }

    public final void c(List list) {
        hbp0 hbp0Var = this.n;
        hbp0Var.f();
        hbp0.e(hbp0Var, null, null, new RouteProgressTracker$startTracking$1(this, null), 3);
        b(list, null, false);
        this.A = true;
    }
}
