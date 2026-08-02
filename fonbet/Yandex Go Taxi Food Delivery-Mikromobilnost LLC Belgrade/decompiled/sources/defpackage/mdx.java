package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class mdx implements KSerializer {
    public static final mdx a = new mdx();
    public static final ldx b = ldx.b;

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        y5e.e(decoder);
        return new c((Map) new k8u(auu0.a, rcx.a, 1).e(decoder));
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y5e.f(encoder);
        new k8u(auu0.a, rcx.a, 1).serialize(encoder, (c) obj);
    }
}
