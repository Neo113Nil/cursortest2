package ru.ok.android.sdk.util;

import com.ironsource.adapters.vungle.VungleConstants;
import java.util.Collection;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class StatsBuilder {
    private String version = VungleConstants.META_DATA_VUNGLE_CONSENT_MESSAGE_VERSION;
    private long time = System.currentTimeMillis();
    private final JSONArray stats = new JSONArray();

    public enum Type {
        COUNTER,
        SELECT,
        INTERVAL,
        STATUS
    }

    public StatsBuilder addCounter(Type type, String str, long j, Collection<String> collection) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", type.name().toLowerCase());
        jSONObject.put("id", str);
        jSONObject.put("time", j);
        jSONObject.put("data", new JSONArray((Collection) collection));
        this.stats.put(jSONObject);
        return this;
    }

    public JSONObject build() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", this.version);
        jSONObject.put("time", this.time);
        jSONObject.put("stats", this.stats);
        return jSONObject;
    }

    public StatsBuilder withTime(long j) {
        this.time = j;
        return this;
    }

    public StatsBuilder withVersion(String str) {
        this.version = str;
        return this;
    }

    public StatsBuilder addCounter(Type type, String str, long j, String str2) throws JSONException {
        return addCounter(type, str, j, Collections.singleton(str2));
    }
}
