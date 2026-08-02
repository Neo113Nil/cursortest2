package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes12.dex */
public final class q131 implements KSerializer {
    public static final q131 a = new q131();
    public static final asq0 b = d6z.g("ValueTransferNode", new SerialDescriptor[0]);

    public static p131 a(b bVar, ncx ncxVar) {
        KSerializer serializer;
        if (!(bVar instanceof c)) {
            ny61.r("ValueTransferNodeSerializer: value should be a Map");
            return null;
        }
        String a2 = qcx.n((b) kotlin.collections.b.g("ft_node_type", qcx.m(bVar))).a();
        int hashCode = a2.hashCode();
        if (hashCode == -1249586564) {
            if (a2.equals("variable")) {
                serializer = n231.Companion.serializer();
                return (p131) ncxVar.d().a(serializer, bVar);
            }
            ny61.r("Unsupported node type: ".concat(a2));
            return null;
        }
        if (hashCode == 445095505) {
            if (a2.equals("oauth_token")) {
                serializer = ify0.Companion.serializer();
                return (p131) ncxVar.d().a(serializer, bVar);
            }
            ny61.r("Unsupported node type: ".concat(a2));
            return null;
        }
        if (hashCode == 1804939082 && a2.equals("gen_uuid")) {
            serializer = ffy0.Companion.serializer();
            return (p131) ncxVar.d().a(serializer, bVar);
        }
        ny61.r("Unsupported node type: ".concat(a2));
        return null;
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        ncx ncxVar = decoder instanceof ncx ? (ncx) decoder : null;
        if (ncxVar != null) {
            return a(ncxVar.t(), ncxVar);
        }
        ny61.r("Expected JsonDecoder");
        return null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.j((p131) obj, p131.Companion.serializer());
    }
}
