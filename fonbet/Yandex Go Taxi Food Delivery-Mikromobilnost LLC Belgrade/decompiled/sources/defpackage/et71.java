package defpackage;

import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import yads.w4;

/* loaded from: classes7.dex */
public final class et71 {
    public static JSONObject a(String str, Map map) {
        JSONObject jSONObject = new JSONObject();
        Object obj = map.get("ad_type");
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("ad_type", obj);
        Object obj2 = map.get("ad_unit_id");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("ad_unit_id", obj2);
        Object obj3 = map.get("sdk_version");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj3);
        jSONObject.put("ad_network", str != null ? str.toLowerCase(Locale.ROOT) : JSONObject.NULL);
        return jSONObject;
    }

    public static JSONObject b(Map map, w4 w4Var, String str) {
        Object obj;
        Object obj2;
        Object obj3;
        JSONObject jSONObject = new JSONObject();
        Object obj4 = map.get("ad_type");
        if (obj4 == null) {
            obj4 = JSONObject.NULL;
        }
        jSONObject.put("ad_type", obj4);
        Object obj5 = map.get("ad_unit_id");
        if (obj5 == null) {
            obj5 = JSONObject.NULL;
        }
        jSONObject.put("ad_unit_id", obj5);
        Object obj6 = map.get("sdk_version");
        if (obj6 == null) {
            obj6 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj6);
        jSONObject.put("ad_network", str != null ? str.toLowerCase(Locale.ROOT) : JSONObject.NULL);
        Object obj7 = map.get("ad_id");
        if (obj7 != null) {
            jSONObject.put("banner_id", obj7);
        }
        JSONObject jSONObject2 = null;
        String str2 = w4Var != null ? w4Var.b : null;
        if (str2 != null) {
            try {
                jSONObject2 = new JSONObject(str2);
            } catch (Throwable unused) {
            }
        }
        if (jSONObject2 == null || (obj = jSONObject2.optString("revenue")) == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("ad_revenue", obj);
        if (jSONObject2 == null || (obj2 = jSONObject2.optString("currency")) == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("currency", obj2);
        if (jSONObject2 == null || (obj3 = jSONObject2.optString("precision")) == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("precision", obj3);
        return jSONObject;
    }

    public static JSONObject c(String str, Map map) {
        JSONObject jSONObject = new JSONObject();
        Object obj = map.get("ad_type");
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("ad_type", obj);
        Object obj2 = map.get("ad_unit_id");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("ad_unit_id", obj2);
        Object obj3 = map.get("sdk_version");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj3);
        jSONObject.put("ad_network", str != null ? str.toLowerCase(Locale.ROOT) : JSONObject.NULL);
        Object obj4 = map.get("ad_id");
        if (obj4 != null) {
            jSONObject.put("banner_id", obj4);
        }
        return jSONObject;
    }

    public static JSONObject d(String str, Map map) {
        JSONObject jSONObject = new JSONObject();
        Object obj = map.get("ad_type");
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("ad_type", obj);
        Object obj2 = map.get("ad_unit_id");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("ad_unit_id", obj2);
        Object obj3 = map.get("sdk_version");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj3);
        jSONObject.put("ad_network", str != null ? str.toLowerCase(Locale.ROOT) : JSONObject.NULL);
        Object obj4 = map.get("ad_id");
        if (obj4 != null) {
            jSONObject.put("banner_id", obj4);
        }
        return jSONObject;
    }

    public static JSONObject e(String str, Map map) {
        JSONObject jSONObject = new JSONObject();
        Object obj = map.get("ad_type");
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        jSONObject.put("ad_type", obj);
        Object obj2 = map.get("ad_unit_id");
        if (obj2 == null) {
            obj2 = JSONObject.NULL;
        }
        jSONObject.put("ad_unit_id", obj2);
        Object obj3 = map.get("sdk_version");
        if (obj3 == null) {
            obj3 = JSONObject.NULL;
        }
        jSONObject.put("sdk_version", obj3);
        jSONObject.put("ad_network", str != null ? str.toLowerCase(Locale.ROOT) : JSONObject.NULL);
        return jSONObject;
    }
}
