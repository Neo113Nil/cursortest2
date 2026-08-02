package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class nor implements KSerializer {
    public static final nor a = new nor();
    public static final o2f0 b = new o2f0("kotlin.Float", h2f0.k);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return Float.valueOf(decoder.x());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.m(((Number) obj).floatValue());
    }
}
