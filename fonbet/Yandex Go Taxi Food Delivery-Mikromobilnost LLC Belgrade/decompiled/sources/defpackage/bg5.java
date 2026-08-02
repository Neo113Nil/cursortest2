package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import kotlinx.coroutines.flow.b;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.battery.BatteryStateProvider$PluggedState;
import ru.yandex.taxi.battery.BatteryStateProvider$special$$inlined$simpleCallbackApiToFlow$1;

/* loaded from: classes9.dex */
public final class bg5 {
    public final Context a;
    public final b b = e.g(new BatteryStateProvider$special$$inlined$simpleCallbackApiToFlow$1(new d8(7, this), null));

    public bg5(Context context) {
        this.a = context;
    }

    public final int a() {
        Intent registerReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return 1;
        }
        return registerReceiver.getIntExtra("level", 0);
    }

    public final int b() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Context context = this.a;
        Intent registerReceiver = context.registerReceiver(null, intentFilter);
        int intExtra = registerReceiver == null ? 0 : registerReceiver.getIntExtra("scale", 0);
        int a = a();
        if (intExtra == 0) {
            return a;
        }
        int i = a * 100;
        Intent registerReceiver2 = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return i / (registerReceiver2 != null ? registerReceiver2.getIntExtra("scale", 0) : 0);
    }

    public final BatteryStateProvider$PluggedState c() {
        Intent registerReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null && registerReceiver.getIntExtra("plugged", 0) != 0) {
            return BatteryStateProvider$PluggedState.PLUGGED;
        }
        return BatteryStateProvider$PluggedState.UNPLUGGED;
    }
}
