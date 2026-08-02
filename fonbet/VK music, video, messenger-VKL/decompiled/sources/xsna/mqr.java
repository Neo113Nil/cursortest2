package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.gbd0;

/* compiled from: Primitives.kt */
/* loaded from: classes8.dex */
public final class mqr implements KSerializer<Float> {
    public static final mqr a = new mqr();
    public static final mbd0 b = new mbd0("kotlin.Float", gbd0.e.a);

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        return Float.valueOf(decoder.D());
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        encoder.C(((Number) obj).floatValue());
    }
}
