package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final class lwu implements KSerializer {
    public final o2f0 a = d6z.a("HttpUrl", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return kwu.h(decoder.p());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        throw new IllegalStateException("Serialization not supported");
    }
}
