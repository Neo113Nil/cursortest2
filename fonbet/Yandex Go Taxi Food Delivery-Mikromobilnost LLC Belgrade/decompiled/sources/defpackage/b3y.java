package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final class b3y implements KSerializer {
    public static final b3y a = new b3y();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        KSerializer serializer = e3y.Companion.serializer();
        b = serializer;
        c = serializer.getDescriptor();
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        e3y e3yVar = (e3y) b.deserialize(decoder);
        return new a3y(e3yVar.a, e3yVar.b, e3yVar.c, e3yVar.d, e3yVar.e);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a3y a3yVar = (a3y) obj;
        encoder.j(new e3y(a3yVar.a, a3yVar.b, a3yVar.c, a3yVar.d, a3yVar.e), b);
    }
}
