package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.gbd0;

/* compiled from: Primitives.kt */
/* loaded from: classes8.dex */
public final class n9x implements KSerializer<Integer> {
    public static final n9x a = new n9x();
    public static final mbd0 b = new mbd0("kotlin.Int", gbd0.f.a);

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        return Integer.valueOf(decoder.B());
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        encoder.o(((Number) obj).intValue());
    }
}
