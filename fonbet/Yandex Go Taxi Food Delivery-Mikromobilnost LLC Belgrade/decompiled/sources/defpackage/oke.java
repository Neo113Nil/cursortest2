package defpackage;

import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes9.dex */
public final class oke implements KSerializer {
    public final g0c a;
    public final KSerializer b;
    public final List c;
    public final pje d;

    public oke(g0c g0cVar, KSerializer kSerializer, KSerializer[] kSerializerArr) {
        this.a = g0cVar;
        this.b = kSerializer;
        this.c = Arrays.asList(kSerializerArr);
        this.d = new pje(d6z.h("kotlinx.serialization.ContextualSerializer", esq0.g, new SerialDescriptor[0], new d8(12, this)), g0cVar);
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        kf5 a = decoder.a();
        List list = this.c;
        g0c g0cVar = this.a;
        KSerializer b = a.b(g0cVar, list);
        if (b != null || (b = this.b) != null) {
            return decoder.B(b);
        }
        uh6.M(g0cVar);
        throw null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kf5 a = encoder.a();
        List list = this.c;
        g0c g0cVar = this.a;
        KSerializer b = a.b(g0cVar, list);
        if (b == null && (b = this.b) == null) {
            uh6.M(g0cVar);
            throw null;
        }
        encoder.j(obj, b);
    }
}
