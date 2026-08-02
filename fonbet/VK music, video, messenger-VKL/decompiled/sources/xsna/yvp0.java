package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: ValueClasses.kt */
/* loaded from: classes8.dex */
public final class yvp0 implements KSerializer<uvp0> {
    public static final yvp0 a = new yvp0();
    public static final qzw b = his0.a("kotlin.UByte", iu8.a);

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        return new uvp0(decoder.C(b).p());
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        encoder.i(b).A(((uvp0) obj).b);
    }
}
