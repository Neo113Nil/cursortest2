package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yads.ii0;
import yads.yh0;

/* loaded from: classes7.dex */
public final class nj71 {
    public static final List a = scc.g("native_ad_view", "timer_container", "timer_value", "skip_button", "linear_progress_view", "video_progress", "mute_button");

    public static void b(JSONArray jSONArray, yh0 yh0Var, ii0 ii0Var) {
        Object obj;
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                obj = jSONArray.get(i);
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                c((JSONObject) obj, yh0Var, ii0Var);
            } else if (obj instanceof JSONArray) {
                b((JSONArray) obj, yh0Var, ii0Var);
            }
        }
    }

    public static void c(JSONObject jSONObject, yh0 yh0Var, ii0 ii0Var) {
        Object obj;
        JSONObject optJSONObject;
        JSONArray optJSONArray = jSONObject.optJSONArray("extensions");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (jl40.l((optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("params")) == null) ? null : optJSONObject.optString("view_name"), "native_ad_view")) {
                    yh0Var = yh0.c;
                    break;
                }
                i++;
            }
        }
        ii0Var.invoke(jSONObject, yh0Var);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                obj = jSONObject.get(keys.next());
            } catch (JSONException unused) {
                obj = null;
            }
            if (obj instanceof JSONObject) {
                c((JSONObject) obj, yh0Var, ii0Var);
            } else if (obj instanceof JSONArray) {
                b((JSONArray) obj, yh0Var, ii0Var);
            }
        }
    }

    public final Set a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        c(jSONObject, yh0.b, new ii0(this, arrayList));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!a.contains(((os81) next).b)) {
                arrayList2.add(next);
            }
        }
        return a.N0(arrayList2);
    }
}
