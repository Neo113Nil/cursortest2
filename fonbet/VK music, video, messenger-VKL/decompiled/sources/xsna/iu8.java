package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.gbd0;

/* compiled from: Primitives.kt */
/* loaded from: classes8.dex */
public final class iu8 implements KSerializer<Byte> {
    public static final iu8 a = new iu8();
    public static final mbd0 b = new mbd0("kotlin.Byte", gbd0.b.a);

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        return Byte.valueOf(decoder.p());
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        encoder.A(((Number) obj).byteValue());
    }
}
