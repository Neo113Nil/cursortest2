package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.internal.JsonDecodingException;
import xsna.gmi0;

/* compiled from: JsonElementSerializers.kt */
/* loaded from: classes8.dex */
public final class v9y implements KSerializer<JsonNull> {
    public static final v9y a = new v9y();
    public static final zli0 b = cmi0.c("kotlinx.serialization.json.JsonNull", gmi0.b.a, new SerialDescriptor[0]);

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        kn4.d(decoder);
        if (decoder.G()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        return JsonNull.INSTANCE;
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        kn4.e(encoder);
        encoder.J();
    }
}
