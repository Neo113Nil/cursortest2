package defpackage;

import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class h6x implements KSerializer {
    public static final h6x a = new h6x();
    public static final KSerializer b;
    public static final SerialDescriptor c;

    static {
        KSerializer serializer = c.Companion.serializer();
        b = serializer;
        c = serializer.getDescriptor();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if (r0 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x005d, code lost:
    
        if (r4 == null) goto L11;
     */
    @Override // defpackage.myi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object deserialize(Decoder decoder) {
        v6x v6xVar;
        s6x s6xVar;
        ncx ncxVar = (ncx) decoder;
        c cVar = (c) decoder.B(b);
        b bVar = (b) cVar.get("value");
        if (bVar != null) {
            c m = qcx.m(bVar);
            sbx d = ncxVar.d();
            v6xVar = (v6x) d.a(gtq0.H(d.b, qoi0.c(v6x.class)), m);
        }
        v6xVar = w6x.a;
        b bVar2 = (b) cVar.get("tags");
        if (bVar2 != null) {
            c m2 = qcx.m(bVar2);
            sbx d2 = ncxVar.d();
            s6xVar = (s6x) d2.a(gtq0.H(d2.b, qoi0.c(s6x.class)), m2);
        }
        s6xVar = t6x.a;
        return new d6x(v6xVar, s6xVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d6x d6xVar = (d6x) obj;
        vcx vcxVar = (vcx) encoder;
        sbx d = vcxVar.d();
        b J = gwk0.J(d, d6xVar.a, gtq0.H(d.b, qoi0.e(v6x.class)));
        sbx d2 = vcxVar.d();
        encoder.j(new c(kotlin.collections.b.i(new Pair("value", J), new Pair("tags", gwk0.J(d2, d6xVar.b, gtq0.H(d2.b, qoi0.e(s6x.class)))))), b);
    }
}
