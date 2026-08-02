package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: ValueClasses.kt */
/* loaded from: classes8.dex */
public final class sxp0 implements KSerializer<oxp0> {
    public static final sxp0 a = new sxp0();
    public static final qzw b = his0.a("kotlin.ULong", u500.a);

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        return new oxp0(decoder.C(b).t());
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        encoder.i(b).u(((oxp0) obj).b);
    }
}
