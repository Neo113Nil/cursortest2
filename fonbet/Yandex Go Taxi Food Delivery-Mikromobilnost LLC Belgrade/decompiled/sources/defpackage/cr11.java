package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class cr11 implements KSerializer {
    public static final cr11 a = new cr11();
    public static final exv b = uh6.c("kotlin.ULong", pnz.a);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return new yq11(decoder.w(b).j());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.i(b).w(((yq11) obj).a);
    }
}
