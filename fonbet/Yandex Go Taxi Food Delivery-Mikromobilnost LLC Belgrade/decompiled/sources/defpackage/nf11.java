package defpackage;

import kotlin.Triple;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes2.dex */
public final class nf11 implements KSerializer {
    public final KSerializer a;
    public final KSerializer b;
    public final KSerializer c;
    public final asq0 d = d6z.f("kotlin.Triple", new SerialDescriptor[0], new jl01(24, this));

    public nf11(KSerializer kSerializer, KSerializer kSerializer2, KSerializer kSerializer3) {
        this.a = kSerializer;
        this.b = kSerializer2;
        this.c = kSerializer3;
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        asq0 asq0Var = this.d;
        sjd b = decoder.b(asq0Var);
        b.getClass();
        Object obj = j6a1.a;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int v = b.v(asq0Var);
            if (v == -1) {
                b.c(asq0Var);
                if (obj2 == obj) {
                    yci0.m("Element 'first' is missing");
                    return null;
                }
                if (obj3 == obj) {
                    yci0.m("Element 'second' is missing");
                    return null;
                }
                if (obj4 != obj) {
                    return new Triple(obj2, obj3, obj4);
                }
                yci0.m("Element 'third' is missing");
                return null;
            }
            if (v == 0) {
                obj2 = b.A(asq0Var, 0, this.a, null);
            } else if (v == 1) {
                obj3 = b.A(asq0Var, 1, this.b, null);
            } else {
                if (v != 2) {
                    yci0.m(oyr.i(v, "Unexpected index "));
                    return null;
                }
                obj4 = b.A(asq0Var, 2, this.c, null);
            }
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.d;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Triple triple = (Triple) obj;
        asq0 asq0Var = this.d;
        yjd b = encoder.b(asq0Var);
        b.e(asq0Var, 0, this.a, triple.f());
        b.e(asq0Var, 1, this.b, triple.g());
        b.e(asq0Var, 2, this.c, triple.h());
        b.c(asq0Var);
    }
}
