package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class pnz implements KSerializer {
    public static final pnz a = new pnz();
    public static final o2f0 b = new o2f0("kotlin.Long", h2f0.m);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return Long.valueOf(decoder.j());
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.w(((Number) obj).longValue());
    }
}
