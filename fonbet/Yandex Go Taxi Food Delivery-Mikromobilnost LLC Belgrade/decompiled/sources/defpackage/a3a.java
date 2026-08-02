package defpackage;

import com.yandex.go.chargers.data.e;
import com.yandex.go.chargers.data.model.ChargersExperiment;
import com.yandex.go.chargers.push.data.ChargersLowBatteryPushExperiment;
import com.yandex.go.chargers.push.domain.c;
import java.util.Calendar;
import kotlin.time.DurationUnit;
import ru.yandex.taxi.battery.BatteryStateProvider$PluggedState;

/* loaded from: classes.dex */
public final class a3a {
    public final bg5 a;
    public final ysa b;
    public final e c;
    public final c d;

    public a3a(bg5 bg5Var, ysa ysaVar, e eVar, c cVar) {
        this.a = bg5Var;
        this.b = ysaVar;
        this.c = eVar;
        this.d = cVar;
    }

    public final boolean a(ChargersLowBatteryPushExperiment chargersLowBatteryPushExperiment, ChargersExperiment chargersExperiment) {
        int i;
        if (chargersExperiment.b && chargersLowBatteryPushExperiment.h() && (i = Calendar.getInstance().get(11)) < 22 && i >= 8) {
            bg5 bg5Var = this.a;
            if (bg5Var.b() <= chargersLowBatteryPushExperiment.g && bg5Var.c() != BatteryStateProvider$PluggedState.PLUGGED) {
                ysa ysaVar = this.b;
                long currentTimeMillis = System.currentTimeMillis() - ((Number) ysaVar.c.getValue(ysaVar, ysa.e[0])).longValue();
                o430 o430Var = e3n.b;
                if (currentTimeMillis >= e3n.e(kp50.U(chargersLowBatteryPushExperiment.f, DurationUnit.MINUTES)) && this.c.b().isEmpty() && this.d.b.c("chargers-low-battery-local-notification")) {
                    return true;
                }
            }
        }
        return false;
    }
}
