package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import kotlinx.serialization.json.d;

/* loaded from: classes12.dex */
public final class lis0 implements KSerializer {
    public static final lis0 a = new lis0();
    public static final asq0 b = d6z.g("SingleValueTransportNode", new SerialDescriptor[0]);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        ncx ncxVar = decoder instanceof ncx ? (ncx) decoder : null;
        if (ncxVar == null) {
            ny61.r("Expected JsonDecoder");
            return null;
        }
        b t = ncxVar.t();
        if (!(t instanceof c)) {
            if ((t instanceof a) || (t instanceof JsonNull) || (t instanceof d)) {
                return new rum(t);
            }
            w511.b();
            return null;
        }
        boolean containsKey = ((c) t).containsKey("ft_node_type");
        if (containsKey) {
            q131 q131Var = q131.a;
            return q131.a(t, ncxVar);
        }
        if (!containsKey) {
            return new rum(t);
        }
        w511.b();
        return null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.j((kis0) obj, kis0.Companion.serializer());
    }
}
