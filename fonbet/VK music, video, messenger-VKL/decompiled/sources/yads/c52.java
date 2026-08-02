package yads;

import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class c52 {
    public static final boolean a(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            if (!jSONObject.has(str)) {
                return false;
            }
        }
        return true;
    }
}
