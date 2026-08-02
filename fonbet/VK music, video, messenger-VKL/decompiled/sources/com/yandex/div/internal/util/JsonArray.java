package com.yandex.div.internal.util;

import org.json.JSONArray;

/* compiled from: JsonNode.kt */
/* loaded from: classes7.dex */
public final class JsonArray extends JsonNode {
    private final JSONArray value;

    public JsonArray(JSONArray jSONArray) {
        super(null);
        this.value = jSONArray;
    }

    @Override // com.yandex.div.internal.util.JsonNode
    public String dump() {
        return this.value.toString();
    }
}
