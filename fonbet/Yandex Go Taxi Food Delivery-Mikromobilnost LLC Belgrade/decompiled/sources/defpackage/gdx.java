package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonNull;

/* loaded from: classes9.dex */
public final class gdx implements KSerializer {
    public static final gdx a = new gdx();
    public static final asq0 b = d6z.i("kotlinx.serialization.json.JsonNull", fsq0.g, new SerialDescriptor[0]);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        y5e.e(decoder);
        if (decoder.D()) {
            throw new JsonDecodingException(qje.n(-1, "Expected 'null' literal", null, null, null), "Expected 'null' literal", null, null, -1, null);
        }
        decoder.i();
        return JsonNull.INSTANCE;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y5e.f(encoder);
        encoder.y();
    }
}
