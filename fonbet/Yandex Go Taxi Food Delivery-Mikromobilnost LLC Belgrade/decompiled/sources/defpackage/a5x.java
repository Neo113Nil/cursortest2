package defpackage;

import java.util.ArrayList;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class a5x implements KSerializer {
    public static final a5x a = new a5x();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        KSerializer serializer = c.Companion.serializer();
        b = serializer;
        c = serializer.getDescriptor();
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        ArrayList l;
        ArrayList l2;
        c cVar = (c) decoder.B(b);
        Object obj = cVar.get("instructions");
        if (obj == null) {
            ny61.g("Instructions block is missing");
            return null;
        }
        l = lab1.l(qcx.l((b) obj), false);
        Object obj2 = cVar.get("constants");
        if (obj2 != null) {
            l2 = lab1.l(qcx.l((b) obj2), true);
            return new x4x(l, l2);
        }
        ny61.g("Constants block is missing");
        return null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a m;
        a m2;
        x4x x4xVar = (x4x) obj;
        m = lab1.m(x4xVar.a);
        Pair pair = new Pair("instructions", m);
        m2 = lab1.m(x4xVar.b);
        encoder.j(new c(kotlin.collections.b.i(pair, new Pair("constants", m2))), b);
    }
}
