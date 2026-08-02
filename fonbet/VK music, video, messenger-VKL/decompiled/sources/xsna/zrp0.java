package xsna;

import kotlin.Triple;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import xsna.prm0;

/* compiled from: Tuples.kt */
/* loaded from: classes8.dex */
public final class zrp0<A, B, C> implements KSerializer<Triple<? extends A, ? extends B, ? extends C>> {
    public final KSerializer<A> a;
    public final KSerializer<B> b;
    public final KSerializer<C> c;
    public final zli0 d;

    public zrp0(KSerializer<A> kSerializer, KSerializer<B> kSerializer2, KSerializer<C> kSerializer3) {
        this.a = kSerializer;
        this.b = kSerializer2;
        this.c = kSerializer3;
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        n9m0 n9m0Var = new n9m0(this, 10);
        if (drm0.N("kotlin.Triple")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        sfc sfcVar = new sfc("kotlin.Triple");
        n9m0Var.invoke(sfcVar);
        this.d = new zli0("kotlin.Triple", prm0.a.a, sfcVar.c.size(), rl3.u0(serialDescriptorArr), sfcVar);
    }

    @Override // xsna.a3m
    public final Object deserialize(Decoder decoder) {
        zli0 zli0Var = this.d;
        ssi d = decoder.d(zli0Var);
        Object obj = q6x.k;
        Object obj2 = obj;
        Object obj3 = obj2;
        Object obj4 = obj3;
        while (true) {
            int m = d.m(zli0Var);
            if (m == -1) {
                d.e(zli0Var);
                if (obj2 == obj) {
                    throw new SerializationException("Element 'first' is missing");
                }
                if (obj3 == obj) {
                    throw new SerializationException("Element 'second' is missing");
                }
                if (obj4 != obj) {
                    return new Triple(obj2, obj3, obj4);
                }
                throw new SerializationException("Element 'third' is missing");
            }
            if (m == 0) {
                obj2 = d.y(zli0Var, 0, this.a, null);
            } else if (m == 1) {
                obj3 = d.y(zli0Var, 1, this.b, null);
            } else {
                if (m != 2) {
                    throw new SerializationException(lhg.a(m, "Unexpected index "));
                }
                obj4 = d.y(zli0Var, 2, this.c, null);
            }
        }
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return this.d;
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Object obj) {
        Triple triple = (Triple) obj;
        zli0 zli0Var = this.d;
        cti d = encoder.d(zli0Var);
        d.n(zli0Var, 0, this.a, triple.i());
        d.n(zli0Var, 1, this.b, triple.j());
        d.n(zli0Var, 2, this.c, triple.k());
        d.e(zli0Var);
    }
}
