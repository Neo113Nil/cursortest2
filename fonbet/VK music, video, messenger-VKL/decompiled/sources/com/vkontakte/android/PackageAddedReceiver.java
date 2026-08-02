package com.vkontakte.android;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.vk.core.preference.Preference;
import com.vkontakte.android.data.b;

/* loaded from: classes7.dex */
public class PackageAddedReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.PACKAGE_ADDED".equals(intent.getAction())) {
            String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
            SharedPreferences f = Preference.f("pending_installs");
            if (f.contains(schemeSpecificPart)) {
                String[] split = f.getString(schemeSpecificPart, null).split("~", 2);
                if (Integer.parseInt(split[0]) * 1000 > System.currentTimeMillis()) {
                    b.d dVar = new b.d("ads/install");
                    dVar.b(split[1], "ad_data");
                    dVar.h();
                }
                f.edit().remove(schemeSpecificPart).apply();
            }
            for (String str : f.getAll().keySet()) {
                if (Integer.parseInt(f.getString(str, null).split("~", 2)[0]) * 1000 < System.currentTimeMillis()) {
                    f.edit().remove(str).apply();
                }
            }
            if (f.getAll().size() == 0) {
                context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, getClass()), 2, 1);
            }
        }
    }
}
