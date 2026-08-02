package com.yandex.div.core.actions;

import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: DivActionTypedDictSetValueHandler.kt */
/* loaded from: classes7.dex */
public final class DivActionTypedDictSetValueHandlerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final JSONObject clone(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject2.put(next, jSONObject.get(next));
        }
        return jSONObject2;
    }
}
