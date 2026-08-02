package yads;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class he1 {
    public static HashMap a(JSONObject jSONObject) {
        Object obj;
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                obj = jSONObject.get(next);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj != null) {
                if (obj instanceof JSONObject) {
                    hashMap.put(next, a((JSONObject) obj));
                } else {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }
}
