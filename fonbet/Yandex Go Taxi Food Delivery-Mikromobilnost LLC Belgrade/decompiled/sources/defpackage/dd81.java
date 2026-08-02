package defpackage;

import java.util.Iterator;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONException;
import org.json.JSONObject;
import yads.mp1;
import yads.vp2;
import yads.w4;
import yads.xp2;
import yads.zp1;

/* loaded from: classes7.dex */
public final class dd81 {
    public static xp2 a(JSONObject jSONObject) {
        Object obj;
        try {
            if (!jSONObject.has("format_parameters")) {
                return null;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("format_parameters");
            if (!jSONObject2.has("bridge_ad_type")) {
                return null;
            }
            String optString = jSONObject2.optString("bridge_ad_type");
            if (optString.length() == 0) {
                return null;
            }
            mp1.c.getClass();
            Iterator<E> it = mp1.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (jl40.l(((mp1) obj).b, optString)) {
                    break;
                }
            }
            mp1 mp1Var = (mp1) obj;
            if (mp1Var == null) {
                return null;
            }
            JSONObject optJSONObject = jSONObject2.optJSONObject("configuration");
            Long valueOf = (optJSONObject == null || !optJSONObject.has("rewarded_delay")) ? null : Long.valueOf(optJSONObject.optLong("rewarded_delay"));
            if (valueOf != null && valueOf.longValue() <= 0) {
                valueOf = null;
            }
            return new xp2(mp1Var, new vp2(valueOf));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static zp1 b(JSONObject jSONObject) {
        String string;
        w4 w4Var;
        try {
            zcx zcxVar = xf71.a;
            String string2 = jSONObject.getString("adapter");
            if (string2 == null || string2.length() == 0 || "null".equals(string2)) {
                throw new JSONException("Json value can not be null or empty");
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("network_data");
            MapBuilder mapBuilder = new MapBuilder();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                mapBuilder.put(next, jSONObject2.getString(next));
            }
            MapBuilder j = mapBuilder.j();
            if (j.isEmpty()) {
                return null;
            }
            ListBuilder d = xf71.d("click_tracking_urls", jSONObject);
            ListBuilder d2 = xf71.d("impression_tracking_urls", jSONObject);
            ListBuilder d3 = xf71.d("ad_response_tracking_urls", jSONObject);
            JSONObject optJSONObject = jSONObject.optJSONObject("bidding_info");
            MapBuilder b = optJSONObject != null ? xf71.b(optJSONObject) : null;
            if (jSONObject.has("impression_data")) {
                try {
                    string = jSONObject.getString("impression_data");
                } catch (Exception unused) {
                }
                if (string.length() == 0 || "null".equals(string)) {
                    throw new JSONException("Json has not required attributes");
                }
                w4Var = new w4(string);
                return new zp1(string2, j, d2, d, d3, w4Var, b, a(jSONObject));
            }
            w4Var = null;
            return new zp1(string2, j, d2, d, d3, w4Var, b, a(jSONObject));
        } catch (JSONException unused2) {
            return null;
        }
    }
}
