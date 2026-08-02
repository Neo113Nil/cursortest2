package ru.mail.libverify.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.libverify.p0.a;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.d;

/* loaded from: classes9.dex */
public class BatteryLevelReceiver extends BroadcastReceiver {
    private static volatile boolean a = false;

    public static boolean a() {
        return a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@Nullable Context context, @Nullable Intent intent) {
        char c;
        Intent intent2;
        if (context == null || intent == null || TextUtils.isEmpty(intent.getAction()) || !VerificationFactory.hasInstallation(context)) {
            return;
        }
        FileLog.d("BatteryLevelReceiver", "onReceive %s", intent.getAction());
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode == -1980154005) {
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                c = 2;
            }
            c = 65535;
        } else if (hashCode == -1886648615) {
            if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                c = 3;
            }
            c = 65535;
        } else if (hashCode != 490310653) {
            if (hashCode == 1019184907 && action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (action.equals("android.intent.action.BATTERY_LOW")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0) {
            a = true;
            intent2 = new Intent(a.SERVICE_SETTINGS_BATTERY_STATE_CHANGED.name());
            intent2.putExtra("battery_level_low", true);
        } else if (c == 1 || c == 2) {
            a = false;
            intent2 = new Intent(a.SERVICE_SETTINGS_BATTERY_STATE_CHANGED.name());
            intent2.putExtra("battery_level_low", false);
        } else {
            intent2 = null;
        }
        if (intent2 != null) {
            d.a(context, intent2);
        }
    }
}
