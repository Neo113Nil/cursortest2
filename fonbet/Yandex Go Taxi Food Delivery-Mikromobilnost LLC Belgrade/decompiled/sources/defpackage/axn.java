package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes2.dex */
public final class axn implements KSerializer {
    public final o2f0 a = d6z.a("EmptyPayload", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        decoder.p();
        return new zwn();
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.t("");
    }
}
