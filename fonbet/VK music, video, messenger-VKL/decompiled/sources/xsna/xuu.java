package xsna;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes8.dex */
public final class xuu<K, V> extends tl00<K, V, Map<K, ? extends V>, HashMap<K, V>> {
    public final wuu c;

    public xuu(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2);
        this.c = new wuu("kotlin.collections.HashMap", kSerializer.getDescriptor(), kSerializer2.getDescriptor());
    }

    @Override // xsna.rd
    public final Object a() {
        return new HashMap();
    }

    @Override // xsna.rd
    public final int b(Object obj) {
        return ((HashMap) obj).size() * 2;
    }

    @Override // xsna.rd
    public final Iterator c(Object obj) {
        return ((Map) obj).entrySet().iterator();
    }

    @Override // xsna.rd
    public final int d(Object obj) {
        return ((Map) obj).size();
    }

    @Override // xsna.rd
    public final Object g(Object obj) {
        return new HashMap((Map) null);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }

    @Override // xsna.rd
    public final Object h(Object obj) {
        return (HashMap) obj;
    }
}
