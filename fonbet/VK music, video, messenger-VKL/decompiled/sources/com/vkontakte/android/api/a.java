package com.vkontakte.android.api;

import org.json.JSONObject;
import xsna.epx;

/* compiled from: NameHistory.kt */
/* loaded from: classes7.dex */
public final class a {
    public final String a;
    public final Long b;
    public final NameHistoryItemType c;

    public a(JSONObject jSONObject) {
        String optString;
        this.a = jSONObject.optString("title");
        NameHistoryItemType nameHistoryItemType = null;
        JSONObject jSONObject2 = jSONObject.has("time") ? jSONObject : null;
        this.b = jSONObject2 != null ? Long.valueOf(jSONObject2.optLong("time")) : null;
        jSONObject = jSONObject.has("type") ? jSONObject : null;
        if (jSONObject != null && (optString = jSONObject.optString("type")) != null) {
            NameHistoryItemType.Companion.getClass();
            NameHistoryItemType[] values = NameHistoryItemType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                NameHistoryItemType nameHistoryItemType2 = values[i];
                if (epx.f(nameHistoryItemType2.h(), optString)) {
                    nameHistoryItemType = nameHistoryItemType2;
                    break;
                }
                i++;
            }
        }
        this.c = nameHistoryItemType;
    }
}
