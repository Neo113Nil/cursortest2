package com.yandex.div.internal.util;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.zcl;

/* compiled from: JsonPrinter.kt */
/* loaded from: classes7.dex */
public final class JsonPrinter {
    private static final Companion Companion = new Companion(null);
    private final int indentSpaces;
    private final int nestingLimit;

    /* compiled from: JsonPrinter.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public JsonPrinter(int i, int i2) {
        this.indentSpaces = i;
        this.nestingLimit = i2;
    }

    private final JSONObject deepCopy(JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object opt = jSONObject.opt(next);
            if (opt instanceof JSONObject) {
                if (i != 0) {
                    opt = deepCopy((JSONObject) opt, i - 1);
                    jSONObject2.put(next, opt);
                }
                opt = "...";
                jSONObject2.put(next, opt);
            } else {
                if (opt instanceof JSONArray) {
                    if (i != 0) {
                        opt = deepCopy((JSONArray) opt, i - 1);
                    }
                    opt = "...";
                }
                jSONObject2.put(next, opt);
            }
        }
        return jSONObject2;
    }

    public final String print(JSONObject jSONObject) throws JSONException {
        JSONObject deepCopy = deepCopy(jSONObject, this.nestingLimit);
        int i = this.indentSpaces;
        return i == 0 ? deepCopy.toString() : deepCopy.toString(i);
    }

    public final String print(JSONArray jSONArray) throws JSONException {
        JSONArray deepCopy = deepCopy(jSONArray, this.nestingLimit);
        int i = this.indentSpaces;
        return i == 0 ? deepCopy.toString() : deepCopy.toString(i);
    }

    private final JSONArray deepCopy(JSONArray jSONArray, int i) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object opt = jSONArray.opt(i2);
            if (!(opt instanceof JSONObject)) {
                if (opt instanceof JSONArray) {
                    if (i != 0) {
                        opt = deepCopy((JSONArray) opt, i - 1);
                    }
                    opt = "...";
                }
                jSONArray2.put(opt);
            } else {
                if (i != 0) {
                    opt = deepCopy((JSONObject) opt, i - 1);
                    jSONArray2.put(opt);
                }
                opt = "...";
                jSONArray2.put(opt);
            }
        }
        return jSONArray2;
    }
}
