package defpackage;

import com.yandex.go.design.BatteryChargeViewV2;
import com.yandex.messaging.ui.timeline.b;

/* loaded from: classes14.dex */
public final /* synthetic */ class mxu implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long w;

    public /* synthetic */ mxu(b bVar, long j, int i) {
        this.a = 2;
        this.b = bVar;
        this.w = j;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.c;
        long j = this.w;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                kxu kxuVar = (kxu) obj2;
                BatteryChargeViewV2 batteryChargeViewV2 = (BatteryChargeViewV2) obj;
                batteryChargeViewV2.setLowAndMediumChargePercents(kxuVar.a, kxuVar.b);
                batteryChargeViewV2.setAppearanceOption(new sf5(true, kxuVar.c, kxuVar.d));
                batteryChargeViewV2.setChargeLevel(i2, i2 + "%");
                batteryChargeViewV2.setTextColor(rzo.X(j));
                break;
            case 1:
                kxu kxuVar2 = (kxu) obj2;
                BatteryChargeViewV2 batteryChargeViewV22 = (BatteryChargeViewV2) obj;
                batteryChargeViewV22.setLowAndMediumChargePercents(kxuVar2.a, kxuVar2.b);
                batteryChargeViewV22.setAppearanceOption(new sf5(true, kxuVar2.c, kxuVar2.d));
                batteryChargeViewV22.setChargeLevel(i2, i2 + "%");
                batteryChargeViewV22.setTextColor(rzo.X(j));
                break;
            default:
                ((b) obj2).a.h("thread search navigate", "thread id", ((j3b) obj).b, "message timestamp", Long.valueOf(j), "result index", Integer.valueOf(i2 + 1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ mxu(kxu kxuVar, int i, long j, int i2) {
        this.a = i2;
        this.b = kxuVar;
        this.c = i;
        this.w = j;
    }
}
