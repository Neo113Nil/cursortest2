package xsna;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: Tuples.kt */
/* loaded from: classes8.dex */
public abstract class ley<K, V, R> implements KSerializer<R> {
    public final KSerializer<K> a;
    public final KSerializer<V> b;

    public ley(KSerializer kSerializer, KSerializer kSerializer2) {
        this.a = kSerializer;
        this.b = kSerializer2;
    }

    public abstract K a(R r);

    public abstract V b(R r);

    public abstract R c(K k, V v);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.a3m
    public final R deserialize(Decoder decoder) {
        Object obj = q6x.k;
        SerialDescriptor descriptor = getDescriptor();
        ssi d = decoder.d(descriptor);
        Object obj2 = obj;
        Object obj3 = obj2;
        while (true) {
            int m = d.m(getDescriptor());
            if (m == -1) {
                if (obj2 == obj) {
                    throw new SerializationException("Element 'key' is missing");
                }
                if (obj3 == obj) {
                    throw new SerializationException("Element 'value' is missing");
                }
                R r = (R) c(obj2, obj3);
                d.e(descriptor);
                return r;
            }
            if (m == 0) {
                obj2 = d.y(getDescriptor(), 0, this.a, null);
            } else {
                if (m != 1) {
                    throw new SerializationException(lhg.a(m, "Invalid index: "));
                }
                obj3 = d.y(getDescriptor(), 1, this.b, null);
            }
        }
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, R r) {
        cti d = encoder.d(getDescriptor());
        d.n(getDescriptor(), 0, this.a, a(r));
        d.n(getDescriptor(), 1, this.b, b(r));
        d.e(getDescriptor());
    }
}
