package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import xsna.rub0;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes8.dex */
public final class e9y implements KSerializer<JsonElement> {
    public static final e9y a = new e9y();
    public static final zli0 b = cmi0.b("kotlinx.serialization.json.JsonElement", rub0.b.a, new SerialDescriptor[0], new xht(5));

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        return kn4.d(decoder).l();
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        JsonElement jsonElement = (JsonElement) obj;
        kn4.e(encoder);
        if (jsonElement instanceof JsonPrimitive) {
            encoder.B(kay.a, jsonElement);
        } else if (jsonElement instanceof JsonObject) {
            encoder.B(z9y.a, jsonElement);
        } else {
            if (!(jsonElement instanceof JsonArray)) {
                throw new NoWhenBranchMatchedException();
            }
            encoder.B(n8y.a, jsonElement);
        }
    }
}
