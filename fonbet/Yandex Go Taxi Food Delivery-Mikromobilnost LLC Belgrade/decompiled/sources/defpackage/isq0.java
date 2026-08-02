package defpackage;

import kotlin.collections.builders.ListBuilder;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes8.dex */
public final class isq0 implements KSerializer {
    public static final KSerializer c = qke.n(auu0.a);
    public final KSerializer a;
    public final p53 b;

    public isq0(KSerializer kSerializer) {
        this.a = kSerializer;
        this.b = new p53(qke.n(kSerializer), 0);
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        p53 p53Var = this.b;
        s43 s43Var = (s43) p53Var.c;
        sjd b = decoder.b(s43Var);
        ListBuilder a = rcc.a();
        while (true) {
            int v = b.v((s43) p53Var.c);
            if (v == -1) {
                ListBuilder j = a.j();
                b.c(s43Var);
                return new jsq0(j);
            }
            a.add(gtq0.j((String) b.A((s43) p53Var.c, v, c, null), this.a));
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return (s43) this.b.c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.j(((jsq0) obj).a, this.b);
    }
}
