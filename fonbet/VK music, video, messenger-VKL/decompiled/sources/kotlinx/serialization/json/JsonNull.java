package kotlinx.serialization.json;

import kotlinx.serialization.KSerializer;
import xsna.imi0;
import xsna.v9y;

/* compiled from: JsonElement.kt */
@imi0(with = v9y.class)
/* loaded from: classes8.dex */
public final class JsonNull extends JsonPrimitive {
    public static final JsonNull INSTANCE = new JsonNull();
    public static final String b = "null";

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String c() {
        return b;
    }

    public final KSerializer<JsonNull> serializer() {
        return v9y.a;
    }
}
