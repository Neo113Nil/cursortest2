package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class m77 implements KSerializer {
    public static final m77 a = new m77();
    public static final o2f0 b = new o2f0("kotlin.Byte", h2f0.h);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return Byte.valueOf(decoder.F());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.encodeByte(((Number) obj).byteValue());
    }
}
