package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class auu0 implements KSerializer {
    public static final auu0 a = new auu0();
    public static final o2f0 b = new o2f0("kotlin.String", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return decoder.p();
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.t((String) obj);
    }
}
