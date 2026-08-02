package com.yandex.div.internal.util;

import org.json.JSONObject;

/* compiled from: JsonNode.kt */
/* loaded from: classes7.dex */
public final class JsonObject extends JsonNode {
    private final JSONObject value;

    public JsonObject(JSONObject jSONObject) {
        super(null);
        this.value = jSONObject;
    }

    @Override // com.yandex.div.internal.util.JsonNode
    public String dump() {
        return this.value.toString();
    }
}
