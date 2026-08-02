package defpackage;

import java.util.Collections;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes9.dex */
public final class jvl implements KSerializer {
    public static final jvl a = new jvl();
    public static final p53 b;
    public static final SerialDescriptor c;

    static {
        p53 p53Var = new p53(x4t0.Companion.serializer(), 0);
        b = p53Var;
        c = (s43) p53Var.c;
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        b t = ((ncx) decoder).t();
        if ((t instanceof d) || (t instanceof c)) {
            return Collections.singletonList(x4t0.Companion.serializer().deserialize(decoder));
        }
        if (t instanceof a) {
            return (List) b.deserialize(decoder);
        }
        ny61.g(qv10.l(t.getClass(), "Unexpected element "));
        return null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.j((List) obj, b);
    }
}
