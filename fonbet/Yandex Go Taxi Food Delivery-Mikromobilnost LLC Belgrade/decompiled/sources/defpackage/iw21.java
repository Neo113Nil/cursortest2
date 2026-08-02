package defpackage;

import java.time.format.DateTimeFormatter;
import kotlinx.datetime.UtcOffset;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes4.dex */
public final class iw21 implements KSerializer {
    public static final iw21 a = new iw21();
    public static final o2f0 b = d6z.a("kotlinx.datetime.UtcOffset", h2f0.o);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        zv21 zv21Var = UtcOffset.Companion;
        String p = decoder.p();
        i3y i3yVar = dw21.a;
        cw21 cw21Var = (cw21) i3yVar.getValue();
        zv21Var.getClass();
        return cw21Var == ((cw21) i3yVar.getValue()) ? fw21.b(p, (DateTimeFormatter) fw21.a.getValue()) : cw21Var == ((cw21) dw21.b.getValue()) ? fw21.b(p, (DateTimeFormatter) fw21.b.getValue()) : cw21Var == ((cw21) dw21.c.getValue()) ? fw21.b(p, (DateTimeFormatter) fw21.c.getValue()) : (UtcOffset) cw21Var.c(p);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.t(((UtcOffset) obj).toString());
    }
}
