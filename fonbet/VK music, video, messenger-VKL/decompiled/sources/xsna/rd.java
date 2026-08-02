package xsna;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes8.dex */
public abstract class rd<Element, Collection, Builder> implements KSerializer<Collection> {
    public abstract Builder a();

    public abstract int b(Builder builder);

    public abstract Iterator<Element> c(Collection collection);

    public abstract int d(Collection collection);

    public Collection deserialize(Decoder decoder) {
        return (Collection) e(decoder);
    }

    public final Object e(Decoder decoder) {
        Builder a = a();
        int b = b(a);
        ssi d = decoder.d(getDescriptor());
        while (true) {
            int m = d.m(getDescriptor());
            if (m == -1) {
                d.e(getDescriptor());
                return h(a);
            }
            f(d, m + b, a);
        }
    }

    public abstract void f(ssi ssiVar, int i, Object obj);

    public abstract Builder g(Collection collection);

    public abstract Collection h(Builder builder);
}
