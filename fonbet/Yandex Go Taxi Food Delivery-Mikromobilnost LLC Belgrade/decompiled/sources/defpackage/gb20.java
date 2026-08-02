package defpackage;

import ru.yandex.alice.protos.endpoint.capabilities.js.TMetricaCapability;
import ru.yandex.alice.protos.endpoint.platform.utils.TCapability;

/* loaded from: classes8.dex */
public final class gb20 extends hy4 {
    public final ul2 c;
    public final qb20 d;
    public final String b = "QuarkMetricaCapability";
    public final String e = "QuarkJs";

    public gb20(zq6 zq6Var, t830 t830Var, zwf0 zwf0Var) {
        this.c = new ul2(TCapability.ECapabilityType.MetricaCapabilityType, new TMetricaCapability(null, null, null, null, 15, null), t830Var);
        this.d = new qb20(zq6Var, t830Var, zwf0Var);
    }

    @Override // defpackage.u28
    public final String a() {
        return this.b;
    }

    @Override // defpackage.u28
    public final String c() {
        return this.e;
    }

    @Override // defpackage.u28
    public final bnj d() {
        return this.d;
    }

    @Override // defpackage.u28
    public final png getCurrentState() {
        return this.c;
    }
}
