package defpackage;

import android.os.SystemClock;
import com.yandex.mapkit.directions.driving.DrivingOptions;
import com.yandex.mapkit.directions.driving.DrivingSession;
import com.yandex.mapkit.directions.driving.VehicleOptions;
import com.yandex.mapkit.directions.driving.VehicleType;
import com.yandex.mapkit.geometry.Point;
import java.util.List;
import java.util.Objects;
import kotlin.collections.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class jel0 {
    public final vlm a;
    public ixa0 d;
    public List e;
    public long f;
    public DrivingSession g;
    public String b = "not_set";
    public final r0 c = bvf0.c(qal0.a);
    public int h = 1;

    public jel0(vlm vlmVar) {
        this.a = vlmVar;
    }

    public final void a() {
        this.b.length();
        jst.e.getClass();
    }

    public final void b(ixa0 ixa0Var) {
        ixa0 ixa0Var2;
        Objects.toString(ixa0Var);
        a();
        r0 r0Var = this.c;
        ual0 ual0Var = (ual0) r0Var.getValue();
        ixa0 ixa0Var3 = this.d;
        boolean z = false;
        if (ixa0Var3 != null && (ual0Var instanceof sal0)) {
            Point point = ((sal0) ual0Var).a.getRoutePosition().getPoint();
            if (srb1.c(point.getLatitude(), point.getLongitude(), ixa0Var3.c, ixa0Var3.d) > 100.0d) {
                z = true;
            }
        }
        ixa0 ixa0Var4 = this.d;
        this.d = ixa0Var;
        if (jl40.l(ixa0Var, ixa0Var4) || (r0Var.getValue() instanceof pal0)) {
            return;
        }
        List list = this.e;
        if (list != null && (ixa0Var2 = this.d) != null && !list.isEmpty()) {
            doe doeVar = ((axa0) a.Z(list)).a;
            if (srb1.c(doeVar.a, doeVar.b, ixa0Var2.c, ixa0Var2.d) < 15.0d) {
                a();
                qal0 qal0Var = qal0.b;
                r0Var.getClass();
                r0Var.m(null, qal0Var);
                return;
            }
        }
        if (ixa0Var4 == null) {
            a();
            c();
        } else if (ixa0Var == null) {
            a();
            c();
        } else if (z) {
            a();
            c();
        }
    }

    public final void c() {
        if (SystemClock.elapsedRealtime() - this.f < 10000) {
            a();
            return;
        }
        DrivingSession drivingSession = this.g;
        if (drivingSession != null) {
            drivingSession.cancel();
        }
        ixa0 ixa0Var = this.d;
        List list = this.e;
        r0 r0Var = this.c;
        if (ixa0Var == null || list == null || list.isEmpty()) {
            qal0 qal0Var = qal0.a;
            r0Var.getClass();
            r0Var.m(null, qal0Var);
            return;
        }
        r0Var.getClass();
        r0Var.m(null, pal0.a);
        DrivingOptions drivingOptions = new DrivingOptions();
        drivingOptions.setRoutesCount(1);
        VehicleOptions vehicleOptions = new VehicleOptions();
        vehicleOptions.setVehicleType(VehicleType.TAXI);
        iel0 iel0Var = new iel0(this);
        a();
        this.a.b(new at5(ixa0Var, list, this, drivingOptions, vehicleOptions, iel0Var, 11), true);
    }
}
