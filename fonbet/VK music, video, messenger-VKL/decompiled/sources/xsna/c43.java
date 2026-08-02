package xsna;

import com.vk.metrics.performance.power.PowerConsumptionChecker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class c43 implements izs {
    public final /* synthetic */ com.vk.metrics.performance.power.a b;

    public /* synthetic */ c43(com.vk.metrics.performance.power.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        com.vk.metrics.performance.power.a aVar = this.b;
        aVar.f.b();
        PowerConsumptionChecker powerConsumptionChecker = aVar.f;
        PowerConsumptionChecker.b e = powerConsumptionChecker.e();
        if (e == null) {
            e = com.vk.metrics.performance.power.a.h;
        }
        powerConsumptionChecker.a();
        return e;
    }
}
