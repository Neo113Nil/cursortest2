package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: ValueClasses.kt */
/* loaded from: classes8.dex */
public final class zxp0 implements KSerializer<vxp0> {
    public static final zxp0 a = new zxp0();
    public static final qzw b = his0.a("kotlin.UShort", qfj0.a);

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        return new vxp0(decoder.C(b).v());
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        encoder.i(b).j(((vxp0) obj).b);
    }
}
