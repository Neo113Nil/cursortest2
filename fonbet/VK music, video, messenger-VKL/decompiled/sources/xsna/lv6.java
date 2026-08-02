package xsna;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.PowerManager;
import com.vk.stat.scheme.SchemeStat$TypeAppStarts;

/* compiled from: BatteryConcentrator.kt */
/* loaded from: classes11.dex */
public final class lv6 implements dyp<SchemeStat$TypeAppStarts> {
    @Override // xsna.dyp
    public final SchemeStat$TypeAppStarts a(SchemeStat$TypeAppStarts schemeStat$TypeAppStarts) {
        Integer valueOf;
        boolean z;
        r6m r6mVar = r6m.a;
        r6mVar.getClass();
        Context context = r6m.e;
        if (context == null) {
            context = null;
        }
        boolean isCharging = ((BatteryManager) context.getSystemService("batterymanager")).isCharging();
        Context context2 = r6m.e;
        if (context2 == null) {
            context2 = null;
        }
        Object systemService = context2.getSystemService("batterymanager");
        BatteryManager batteryManager = systemService instanceof BatteryManager ? (BatteryManager) systemService : null;
        Integer valueOf2 = Integer.valueOf(batteryManager != null ? batteryManager.getIntProperty(4) : -1);
        r6mVar.getClass();
        Context context3 = r6m.e;
        if (context3 == null) {
            context3 = null;
        }
        Boolean valueOf3 = Boolean.valueOf(((PowerManager) context3.getSystemService("power")).isPowerSaveMode());
        Boolean valueOf4 = Boolean.valueOf(isCharging);
        if (isCharging) {
            try {
                Context context4 = r6m.e;
                if (context4 == null) {
                    context4 = null;
                }
                Intent registerReceiver = context4.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                valueOf = registerReceiver != null ? Integer.valueOf(registerReceiver.getIntExtra("plugged", -1)) : null;
            } catch (Exception unused) {
            }
            if (valueOf != null) {
                if (valueOf.intValue() == 2) {
                    z = true;
                    return SchemeStat$TypeAppStarts.a(schemeStat$TypeAppStarts, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, valueOf2, valueOf3, valueOf4, Boolean.valueOf(z), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -961, 1048575);
                }
            }
        }
        z = false;
        return SchemeStat$TypeAppStarts.a(schemeStat$TypeAppStarts, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, valueOf2, valueOf3, valueOf4, Boolean.valueOf(z), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -961, 1048575);
    }
}
