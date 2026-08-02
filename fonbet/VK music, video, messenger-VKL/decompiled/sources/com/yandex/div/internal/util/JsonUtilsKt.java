package com.yandex.div.internal.util;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsonUtils.kt */
/* loaded from: classes7.dex */
public final class JsonUtilsKt {
    public static final <R> List<R> asList(JSONArray jSONArray) {
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj == null) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final boolean isEmpty(JSONObject jSONObject) {
        return jSONObject.length() == 0;
    }

    public static final String summary(JSONObject jSONObject, int i) {
        return new JsonPrinter(i, 1).print(jSONObject);
    }

    public static /* synthetic */ String summary$default(JSONObject jSONObject, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return summary(jSONObject, i);
    }

    public static final String summary(JSONArray jSONArray, int i) {
        return new JsonPrinter(i, 1).print(jSONArray);
    }

    public static /* synthetic */ String summary$default(JSONArray jSONArray, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return summary(jSONArray, i);
    }
}
