package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class e6m implements KSerializer {
    public static final e6m a = new e6m();
    public static final o2f0 b = new o2f0("kotlin.Double", h2f0.j);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return Double.valueOf(decoder.m());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.u(((Number) obj).doubleValue());
    }
}
