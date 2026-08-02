package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class h6w implements KSerializer {
    public static final h6w a = new h6w();
    public static final o2f0 b = new o2f0("kotlin.Int", h2f0.l);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return Integer.valueOf(decoder.u());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.q(((Number) obj).intValue());
    }
}
