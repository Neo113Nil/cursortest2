package defpackage;

import android.content.Context;
import com.yandex.go.design.BatteryChargeViewV2;

/* loaded from: classes14.dex */
public final /* synthetic */ class lxu implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ kxu b;
    public final /* synthetic */ int c;

    public /* synthetic */ lxu(kxu kxuVar, int i, int i2) {
        this.a = i2;
        this.b = kxuVar;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        kxu kxuVar = this.b;
        switch (i) {
            case 0:
                BatteryChargeViewV2 batteryChargeViewV2 = new BatteryChargeViewV2((Context) obj, null, 0, 6, null);
                batteryChargeViewV2.disableAutoSize();
                batteryChargeViewV2.setLowAndMediumChargePercents(kxuVar.a, kxuVar.b);
                batteryChargeViewV2.setAppearanceOption(new sf5(true, kxuVar.c, kxuVar.d));
                batteryChargeViewV2.setChargeLevel(i2, i2 + "%");
                return batteryChargeViewV2;
            default:
                BatteryChargeViewV2 batteryChargeViewV22 = new BatteryChargeViewV2((Context) obj, null, 0, 6, null);
                batteryChargeViewV22.disableAutoSize();
                batteryChargeViewV22.setLowAndMediumChargePercents(kxuVar.a, kxuVar.b);
                batteryChargeViewV22.setAppearanceOption(new sf5(true, kxuVar.c, kxuVar.d));
                batteryChargeViewV22.setChargeLevel(i2, i2 + "%");
                return batteryChargeViewV22;
        }
    }
}
