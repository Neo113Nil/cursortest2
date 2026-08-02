package xsna;

import android.content.Context;
import com.vk.metrics.performance.power.PowerConsumptionChecker;
import com.vk.stat.scheme.MobileOfficialAppsCoreDeviceStat$DeviceInfoItem;
import com.vk.stat.scheme.SchemeStat$TypePerfPowerConsumption;

/* compiled from: VoipPerformanceChecker.kt */
/* loaded from: classes11.dex */
public final class dvw0 {
    public final PowerConsumptionChecker a;
    public boolean b;
    public boolean c;
    public boolean d;

    public dvw0(Context context) {
        this.a = new PowerConsumptionChecker(context);
    }

    public final void a() {
        PowerConsumptionChecker.b e;
        if (this.c) {
            PowerConsumptionChecker powerConsumptionChecker = this.a;
            powerConsumptionChecker.b();
            MobileOfficialAppsCoreDeviceStat$DeviceInfoItem f = vhk0.f();
            if (f == null || (e = powerConsumptionChecker.e()) == null) {
                return;
            }
            PowerConsumptionChecker.a aVar = e.a;
            PowerConsumptionChecker.a aVar2 = e.b;
            SchemeStat$TypePerfPowerConsumption schemeStat$TypePerfPowerConsumption = new SchemeStat$TypePerfPowerConsumption(this.b ? SchemeStat$TypePerfPowerConsumption.EventType.VOIP_VIDEO : SchemeStat$TypePerfPowerConsumption.EventType.VOIP_AUDIO, f, String.valueOf(aVar.a), String.valueOf(aVar2.a), aVar.b, aVar2.b, aVar.c, aVar2.c, Boolean.valueOf(this.d), Boolean.valueOf(aVar.d || aVar2.d));
            kx6 kx6Var = new kx6();
            kx6Var.f = schemeStat$TypePerfPowerConsumption;
            kx6Var.q();
        }
    }
}
