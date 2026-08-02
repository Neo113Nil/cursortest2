package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class ij9 implements KSerializer {
    public static final ij9 a = new ij9();
    public static final o2f0 b = new o2f0("kotlin.Char", h2f0.i);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return Character.valueOf(decoder.n());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.B(((Character) obj).charValue());
    }
}
