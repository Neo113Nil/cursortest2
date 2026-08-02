package xsna;

import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: BatteryNotLowTracker.kt */
/* loaded from: classes.dex */
public final class nv6 extends ei8<Boolean> {
    @Override // xsna.k6j
    public final Object a() {
        String str;
        Intent registerReceiver = this.b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            m100 c = m100.c();
            str = ov6.a;
            c.a(str, "getInitialState - null intent received");
            return Boolean.FALSE;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        float intExtra2 = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        boolean z = true;
        if (intExtra != 1 && intExtra2 <= 0.15f) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // xsna.ei8
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // xsna.ei8
    public final void f(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        m100 c = m100.c();
        String str = ov6.a;
        intent.getAction();
        c.getClass();
        String action = intent.getAction();
        if (action != null) {
            int hashCode = action.hashCode();
            if (hashCode == -1980154005) {
                if (action.equals("android.intent.action.BATTERY_OKAY")) {
                    b(Boolean.TRUE);
                }
            } else if (hashCode == 490310653 && action.equals("android.intent.action.BATTERY_LOW")) {
                b(Boolean.FALSE);
            }
        }
    }
}
