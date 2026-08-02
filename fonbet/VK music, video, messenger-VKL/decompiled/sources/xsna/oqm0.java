package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.gbd0;

/* compiled from: Primitives.kt */
/* loaded from: classes8.dex */
public final class oqm0 implements KSerializer<String> {
    public static final oqm0 a = new oqm0();
    public static final mbd0 b = new mbd0("kotlin.String", gbd0.i.a);

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        return decoder.x();
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        encoder.r((String) obj);
    }
}
