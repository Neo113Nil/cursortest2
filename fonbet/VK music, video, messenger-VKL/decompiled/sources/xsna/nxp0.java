package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: ValueClasses.kt */
/* loaded from: classes8.dex */
public final class nxp0 implements KSerializer<jxp0> {
    public static final nxp0 a = new nxp0();
    public static final qzw b = his0.a("kotlin.UInt", n9x.a);

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        return new jxp0(decoder.C(b).B());
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        encoder.i(b).o(((jxp0) obj).b);
    }
}
