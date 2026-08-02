package defpackage;

import com.yandex.mapkit.traffic.TrafficLayer;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes7.dex */
public final /* synthetic */ class l901 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ m901 b;

    public /* synthetic */ l901(m901 m901Var, int i) {
        this.a = i;
        this.b = m901Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        m901 m901Var = this.b;
        TrafficLayer trafficLayer = (TrafficLayer) obj;
        switch (i) {
            case 0:
                m901Var.b.c(trafficLayer.isTrafficVisible());
                break;
            case 1:
                trafficLayer.addTrafficListener(m901Var.d);
                trafficLayer.setTrafficVisible(true);
                break;
            default:
                trafficLayer.removeTrafficListener(m901Var.d);
                r0 r0Var = m901Var.c;
                r0Var.getClass();
                r0Var.m(null, n901.a);
                trafficLayer.setTrafficVisible(false);
                break;
        }
        return zy11Var;
    }
}
