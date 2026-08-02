package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class n5x implements KSerializer {
    public static final n5x a = new n5x();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        KSerializer serializer = c.Companion.serializer();
        b = serializer;
        c = serializer.getDescriptor();
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        return rzo.Z((c) decoder.B(b));
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.j(ooc.F((m5x) obj), b);
    }
}
