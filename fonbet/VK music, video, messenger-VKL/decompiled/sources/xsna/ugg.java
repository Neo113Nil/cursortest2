package xsna;

import android.content.Context;
import android.os.BatteryManager;
import com.vkontakte.android.data.b;
import org.json.JSONObject;

/* compiled from: CommonAnalytics.kt */
/* loaded from: classes6.dex */
public final class ugg {
    public static void a(b.d dVar) {
        r6m.a.getClass();
        Context context = r6m.e;
        if (context == null) {
            context = null;
        }
        Object systemService = context.getSystemService("batterymanager");
        BatteryManager batteryManager = systemService instanceof BatteryManager ? (BatteryManager) systemService : null;
        dVar.b(Integer.valueOf(batteryManager != null ? batteryManager.getIntProperty(4) : -1), "battery");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("signal", com.vk.core.utils.newtork.b.c().b());
        jSONObject.put("signal_strength", com.vk.core.utils.newtork.b.c().a());
        dVar.b(jSONObject, "signal_info");
        dVar.b(String.valueOf(qni0.a() * 1000), "time");
        int a = r6m.a();
        if (a > 0) {
            dVar.b(Integer.valueOf(a), "brightness");
        }
    }
}
