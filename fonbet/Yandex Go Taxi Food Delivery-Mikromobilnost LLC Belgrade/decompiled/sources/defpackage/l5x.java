package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class l5x implements KSerializer {
    public static final l5x a = new l5x();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        KSerializer serializer = b.Companion.serializer();
        b = serializer;
        c = serializer.getDescriptor();
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        j5x Y = rzo.Y((b) decoder.B(b));
        return Y == null ? k5x.a : Y;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.j(ooc.E((j5x) obj), b);
    }
}
