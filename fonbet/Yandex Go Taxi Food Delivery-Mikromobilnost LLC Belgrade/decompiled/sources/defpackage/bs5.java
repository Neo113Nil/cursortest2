package defpackage;

import java.math.BigDecimal;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes2.dex */
public final class bs5 implements KSerializer {
    public static final bs5 a = new bs5();
    public static final o2f0 b = d6z.a("openapi.generator.BigDecimal", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        ncx ncxVar = decoder instanceof ncx ? (ncx) decoder : null;
        if (ncxVar != null) {
            return new BigDecimal(qcx.n(ncxVar.t()).a());
        }
        yci0.m("This class can be decoded/encoded only by Json!");
        return null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.t(((BigDecimal) obj).toPlainString());
    }
}
