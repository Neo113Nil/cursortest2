package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.gbd0;

/* compiled from: Primitives.kt */
/* loaded from: classes8.dex */
public final class qfj0 implements KSerializer<Short> {
    public static final qfj0 a = new qfj0();
    public static final mbd0 b = new mbd0("kotlin.Short", gbd0.h.a);

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        return Short.valueOf(decoder.v());
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        encoder.j(((Number) obj).shortValue());
    }
}
