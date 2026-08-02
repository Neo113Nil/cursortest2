package defpackage;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.b;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class nai0 {
    public final SharedPreferences a;
    public final w3c b;

    public nai0(SharedPreferences sharedPreferences, w3c w3cVar) {
        this.a = sharedPreferences;
        this.b = w3cVar;
    }

    public final Map a() {
        String string = this.a.getString("reaction_usage_records", null);
        if (string == null) {
            return b.f();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = new JSONObject(string);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            JSONObject jSONObject2 = jSONObject.getJSONObject(next);
            linkedHashMap.put(Integer.valueOf(Integer.parseInt(next)), new lai0(jSONObject2.getDouble("score"), jSONObject2.getLong("lastUpdatedTimestampMs")));
        }
        return linkedHashMap;
    }
}
