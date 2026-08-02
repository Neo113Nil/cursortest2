package sg.bigo.ads.b;

import android.content.Context;
import android.provider.Settings;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class b implements g<JSONObject> {
    private static JSONObject b(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) == 1) {
                jSONObject.put("adb_enabled", 1);
            }
        } catch (Throwable unused) {
        }
        String str = sg.bigo.ads.a.a.au;
        String str2 = sg.bigo.ads.a.a.N;
        if (str.equalsIgnoreCase(sg.bigo.ads.c.e.a(str2))) {
            jSONObject.put(str2, 1);
        }
        if (jSONObject.length() == 0) {
            return null;
        }
        return jSONObject;
    }

    @Override // sg.bigo.ads.b.g
    public final /* synthetic */ JSONObject a(Context context) {
        return b(context);
    }

    @Override // sg.bigo.ads.b.g
    public final String a() {
        return sg.bigo.ads.a.a.q;
    }
}
