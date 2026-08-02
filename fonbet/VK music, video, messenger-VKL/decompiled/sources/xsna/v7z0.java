package xsna;

import android.text.TextUtils;
import com.ironsource.O6;
import com.ironsource.X3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import xsna.z5z0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes.dex */
public final class v7z0 {
    public static JSONObject a(a aVar) {
        fpy0 fpy0Var = aVar.a;
        HashMap hashMap = aVar.b;
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : hashMap.entrySet()) {
            udz0 udz0Var = (udz0) entry.getKey();
            z5z0.a aVar2 = (z5z0.a) entry.getValue();
            if (!aVar2.a.isEmpty()) {
                jSONArray.put(b(udz0Var, null, aVar2.a));
            }
            for (Map.Entry entry2 : aVar2.b.entrySet()) {
                jSONArray.put(b(udz0Var, ((giy0) entry2.getKey()).b, ((z5z0.b) entry2.getValue()).a));
            }
        }
        JSONObject jSONObject = new JSONObject();
        Objects.requireNonNull(fpy0Var);
        jSONObject.put("sdk_version", "5.50.2");
        jSONObject.put("sdk_version_int", 5050002);
        jSONObject.put("app_bundle_id", fpy0Var.f);
        jSONObject.put(CallAnalyticsApiRequest.KEY_APP_VERSION, fpy0Var.g);
        jSONObject.put("app_build", fpy0Var.h);
        jSONObject.put("sdk_instance_id", fpy0Var.i);
        jSONObject.put(O6.F, X3.d);
        String str = fpy0Var.a;
        if (str == null) {
            str = "";
        }
        jSONObject.put("os_version", str);
        jSONObject.put("os_version_int", fpy0Var.b);
        String str2 = fpy0Var.c;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("device", str2);
        String str3 = fpy0Var.d;
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("model", str3);
        String str4 = fpy0Var.e;
        jSONObject.put("manufacturer", str4 != null ? str4 : "");
        jSONObject.put("logs", jSONArray);
        return jSONObject;
    }

    public static JSONObject b(udz0 udz0Var, g9y0 g9y0Var, List list) {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z5z0.c cVar = (z5z0.c) it.next();
            JSONObject jSONObject = new JSONObject();
            if (g9y0Var != null) {
                List list2 = g9y0Var.f;
                jSONObject.put("banner_id", g9y0Var.a);
                String str = g9y0Var.b;
                if (str != null) {
                    jSONObject.put("impression_id", str);
                }
                String str2 = g9y0Var.c;
                if (str2 != null) {
                    jSONObject.put("pad_id", str2);
                }
                String str3 = g9y0Var.d;
                if (str3 != null) {
                    jSONObject.put("pattern_id", str3);
                }
                Integer num = g9y0Var.e;
                if (num != null) {
                    jSONObject.put("dsp_id", num);
                }
                if (list2 != null && !list2.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        jSONArray2.put(((Integer) it2.next()).intValue());
                    }
                    jSONObject.put("labels", jSONArray2);
                }
            }
            int i = cVar.b;
            String str4 = cVar.f;
            String str5 = cVar.e;
            jSONObject.put(X3.i.q, i);
            jSONObject.put("level", cVar.c);
            jSONObject.put("code", cVar.d);
            if (!TextUtils.isEmpty(str5)) {
                jSONObject.put("message", str5);
            }
            jSONObject.put("client_timestamp", cVar.a);
            if (!TextUtils.isEmpty(str4)) {
                jSONObject.put("add_data", str4);
            }
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_format", udz0Var.c);
        jSONObject2.put("cache_policy", udz0Var.g);
        jSONObject2.put("tag", udz0Var.h);
        Integer num2 = udz0Var.d;
        if (num2.intValue() != -1) {
            jSONObject2.put("slot_id", num2.intValue());
        }
        jSONObject2.put("ad_id", udz0Var.a);
        Object obj = udz0Var.b;
        if (obj != null) {
            jSONObject2.put("handle_data_id", obj);
        }
        jSONObject2.put("source_type", udz0Var.e);
        jSONObject2.put("events", jSONArray);
        return jSONObject2;
    }

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    /* loaded from: classes14.dex */
    public static final class a {
        public final fpy0 a;
        public final HashMap b;

        public a(fpy0 fpy0Var, udz0 udz0Var, List list) {
            z5z0.a aVar = new z5z0.a();
            aVar.a.addAll(list);
            HashMap hashMap = new HashMap();
            hashMap.put(udz0Var, aVar);
            this.a = fpy0Var;
            this.b = hashMap;
        }

        public a(fpy0 fpy0Var, udz0 udz0Var, giy0 giy0Var, List list) {
            z5z0.b bVar = new z5z0.b();
            bVar.a.addAll(list);
            z5z0.a aVar = new z5z0.a();
            aVar.b.put(giy0Var, bVar);
            HashMap hashMap = new HashMap();
            hashMap.put(udz0Var, aVar);
            this.a = fpy0Var;
            this.b = hashMap;
        }
    }
}
