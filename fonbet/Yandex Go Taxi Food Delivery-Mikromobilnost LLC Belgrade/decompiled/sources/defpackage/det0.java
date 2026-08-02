package defpackage;

import com.yandex.go.pin.api.v1.Pin$State;
import com.yandex.go.pin.api.v1.PinV1Component;
import java.util.HashMap;
import ru.yandex.taxi.perf.Milestone;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.perf.b;

/* loaded from: classes6.dex */
public final class det0 implements itb0 {
    public final /* synthetic */ eet0 a;
    public final /* synthetic */ PinV1Component b;

    public det0(eet0 eet0Var, PinV1Component pinV1Component) {
        this.a = eet0Var;
        this.b = pinV1Component;
    }

    @Override // defpackage.itb0
    public final void v6() {
        iub0 iub0Var = this.a.a;
        Pin$State state = this.b.getState();
        b bVar = iub0Var.d;
        ms2 ms2Var = iub0Var.c;
        if (iub0Var.e) {
            return;
        }
        int i = hub0.a[state.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                ms2Var.a(Milestone.Pin);
                return;
            } else {
                if (i == 4 || i == 5) {
                    return;
                }
                w511.b();
                return;
            }
        }
        co40 co40Var = iub0Var.a;
        String analyticsName = bVar.b().getAnalyticsName();
        Boolean valueOf = Boolean.valueOf(state == Pin$State.TEXT);
        Double i2 = avu0.i(bVar.c());
        co40Var.getClass();
        HashMap hashMap = new HashMap();
        if (analyticsName != null) {
            hashMap.put("app_launch_type", analyticsName);
        }
        hashMap.put("hasEta", valueOf);
        if (i2 != null) {
            hashMap.put("time_since_app_launch", i2);
        }
        co40Var.a.a("Pin.TimeAppeared", hashMap, 1, new HashMap());
        iub0Var.e = true;
        fva0.b(iub0Var.b, "Pin.TimeAppeared", PerformanceAnalytics$Type.Loading, null, 4);
        ms2Var.a(Milestone.Pin);
    }
}
