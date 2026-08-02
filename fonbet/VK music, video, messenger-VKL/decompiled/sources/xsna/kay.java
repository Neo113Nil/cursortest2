package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;
import xsna.gbd0;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes8.dex */
public final class kay implements KSerializer<JsonPrimitive> {
    public static final kay a = new kay();
    public static final zli0 b = cmi0.c("kotlinx.serialization.json.JsonPrimitive", gbd0.i.a, new SerialDescriptor[0]);

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        JsonElement l = kn4.d(decoder).l();
        if (l instanceof JsonPrimitive) {
            return (JsonPrimitive) l;
        }
        throw ne7.d("Unexpected JSON element, expected JsonPrimitive, had " + fpf0.a(l.getClass()), l.toString(), -1);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        kn4.e(encoder);
        if (jsonPrimitive instanceof JsonNull) {
            encoder.B(v9y.a, JsonNull.INSTANCE);
        } else {
            encoder.B(p9y.a, (o9y) jsonPrimitive);
        }
    }
}
