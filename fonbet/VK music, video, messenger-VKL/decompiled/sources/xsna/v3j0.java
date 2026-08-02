package xsna;

import org.json.JSONException;
import org.json.JSONObject;
import xsna.d0j0;

/* compiled from: SettingsV3JsonTransform.java */
/* loaded from: classes13.dex */
public final class v3j0 implements u2j0 {
    @Override // xsna.u2j0
    public final d0j0 a(ozg0 ozg0Var, JSONObject jSONObject) throws JSONException {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        d0j0.b bVar = jSONObject.has("session") ? new d0j0.b(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new d0j0.b(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new d0j0(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), bVar, new d0j0.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }
}
