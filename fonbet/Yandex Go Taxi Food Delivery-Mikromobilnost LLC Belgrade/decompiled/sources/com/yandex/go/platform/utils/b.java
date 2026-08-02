package com.yandex.go.platform.utils;

import android.util.Log;
import defpackage.a7e;
import defpackage.c6w;
import defpackage.d6w;
import defpackage.evu0;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.jl40;
import defpackage.qrq0;
import defpackage.tcc;
import defpackage.y6i0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class b {
    public static final Map a(String str) {
        if (evu0.J(str)) {
            return kotlin.collections.b.f();
        }
        try {
            return c(new JSONObject(str));
        } catch (JSONException e) {
            Log.e("SerializationUtils::toJsonMap", "Parse failure, " + str + " couldn't be interpreted as a JSON", e);
            return g8e.z("", str);
        }
    }

    public static final String b(Map map) {
        return kotlin.collections.a.X(map.entrySet(), null, null, null, SerializationUtilsKt$toJsonString$1.w, 31);
    }

    public static final LinkedHashMap c(JSONObject jSONObject) {
        Object obj;
        qrq0 b = kotlin.sequences.a.b(jSONObject.keys());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ((a7e) b).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str = (String) next;
            try {
                obj = new JSONObject(jSONObject.get(str).toString());
            } catch (JSONException unused) {
                obj = jSONObject.get(str);
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                d6w n = y6i0.n(0, jSONArray.length());
                int d = gw00.d(tcc.n(n, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(d);
                c6w it2 = n.iterator();
                while (it2.c) {
                    int nextInt = it2.nextInt();
                    Pair pair = new Pair(String.valueOf(nextInt), jSONArray.get(nextInt));
                    linkedHashMap2.put(pair.c(), pair.f());
                }
                obj = kotlin.collections.a.J0(c(new JSONObject(linkedHashMap2)).values());
            } else if (obj instanceof JSONObject) {
                obj = c((JSONObject) obj);
            } else if (jl40.l(obj, JSONObject.NULL)) {
                obj = null;
            }
            linkedHashMap.put(next, obj);
        }
        return linkedHashMap;
    }
}
