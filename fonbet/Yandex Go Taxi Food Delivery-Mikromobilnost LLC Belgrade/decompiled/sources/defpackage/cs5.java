package defpackage;

import java.math.BigDecimal;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;

/* loaded from: classes2.dex */
public final class cs5 implements KSerializer {
    public final o2f0 a = d6z.a("java.math.BigDecimal", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        String p;
        b t;
        ncx ncxVar = decoder instanceof ncx ? (ncx) decoder : null;
        if (ncxVar == null || (t = ncxVar.t()) == null || (p = qcx.n(t).a()) == null) {
            p = decoder.p();
        }
        return new BigDecimal(p);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.t(((BigDecimal) obj).toPlainString());
    }
}
