package xsna;

import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* compiled from: JsonElementBuilders.kt */
/* loaded from: classes8.dex */
public final class y9y {
    public final LinkedHashMap a = new LinkedHashMap();

    public final JsonObject a() {
        return new JsonObject(this.a);
    }

    public final JsonElement b(String str, JsonElement jsonElement) {
        return (JsonElement) this.a.put(str, jsonElement);
    }
}
