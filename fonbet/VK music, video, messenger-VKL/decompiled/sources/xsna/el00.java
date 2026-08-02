package xsna;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.prm0;

/* compiled from: Tuples.kt */
/* loaded from: classes8.dex */
public final class el00<K, V> extends ley<K, V, Map.Entry<? extends K, ? extends V>> {
    public final zli0 c;

    /* compiled from: Tuples.kt */
    public static final class a<K, V> implements Map.Entry<K, V>, gcy {
        public final K b;
        public final V c;

        public a(K k, V v) {
            this.b = k;
            this.c = v;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.b;
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            return this.c;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            K k = this.b;
            int hashCode = (k == null ? 0 : k.hashCode()) * 31;
            V v = this.c;
            return hashCode + (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MapEntry(key=");
            sb.append(this.b);
            sb.append(", value=");
            return k73.c(sb, this.c, ')');
        }
    }

    public el00(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2);
        this.c = cmi0.b("kotlin.collections.Map.Entry", prm0.c.a, new SerialDescriptor[0], new s53(23, kSerializer, kSerializer2));
    }

    @Override // xsna.ley
    public final Object a(Object obj) {
        return ((Map.Entry) obj).getKey();
    }

    @Override // xsna.ley
    public final Object b(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    @Override // xsna.ley
    public final Object c(Object obj, Object obj2) {
        return new a(obj, obj2);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }
}
