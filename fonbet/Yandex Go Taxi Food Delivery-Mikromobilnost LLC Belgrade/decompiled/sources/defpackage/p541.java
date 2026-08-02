package defpackage;

import com.yandex.mapkit.navigation.transport.Guidance;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.yandex.mapkit.navigation.transport.RouteChangeReason;
import com.yandex.mapkit.transport.masstransit.Route;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class p541 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ q541 b;

    public /* synthetic */ p541(q541 q541Var, int i) {
        this.a = i;
        this.b = q541Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Guidance guidance;
        Route currentRoute;
        Guidance guidance2;
        Double remainingDistance;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        q541 q541Var = this.b;
        switch (i) {
            case 0:
                Navigation navigation = q541Var.c.c;
                if (navigation != null && (guidance = navigation.getGuidance()) != null && (currentRoute = guidance.getCurrentRoute()) != null) {
                    Navigation navigation2 = q541Var.c.c;
                    if (navigation2 != null && (guidance2 = navigation2.getGuidance()) != null && (remainingDistance = guidance2.getRemainingDistance()) != null) {
                        q541Var.f = remainingDistance.doubleValue();
                    }
                    q541Var.e = currentRoute.getMetadata().getWeight().getWalkingDistance().getValue();
                    break;
                }
                break;
            default:
                int i2 = o541.a[((RouteChangeReason) obj).ordinal()];
                if (i2 == 1) {
                    double d = q541Var.e;
                    r0 r0Var = q541Var.g;
                    double d2 = d - q541Var.f;
                    if (d2 > 0.0d) {
                        double doubleValue = ((Number) r0Var.getValue()).doubleValue() + d2;
                        Double d3 = new Double(doubleValue);
                        r0Var.getClass();
                        r0Var.m(null, d3);
                        q541Var.d.q(Double.doubleToLongBits(doubleValue), "passed_distance");
                    }
                    q541Var.e = 0.0d;
                    q541Var.f = 0.0d;
                    break;
                } else if (i2 == 2) {
                    r0 r0Var2 = q541Var.g;
                    Double valueOf = Double.valueOf(0.0d);
                    r0Var2.getClass();
                    r0Var2.m(null, valueOf);
                    q541Var.e = 0.0d;
                    q541Var.f = 0.0d;
                    q541Var.d.q(Double.doubleToLongBits(0.0d), "passed_distance");
                    break;
                } else if (i2 != 3 && i2 != 4) {
                    w511.b();
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
