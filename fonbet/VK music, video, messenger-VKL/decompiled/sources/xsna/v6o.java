package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.gbd0;

/* compiled from: Primitives.kt */
/* loaded from: classes8.dex */
public final class v6o implements KSerializer<Double> {
    public static final v6o a = new v6o();
    public static final mbd0 b = new mbd0("kotlin.Double", gbd0.d.a);

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        return Double.valueOf(decoder.g());
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        encoder.H(((Number) obj).doubleValue());
    }
}
