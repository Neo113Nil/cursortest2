package xsna;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes8.dex */
public final class jdz<K, V> extends tl00<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {
    public final idz c;

    public jdz(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2);
        this.c = new idz("kotlin.collections.LinkedHashMap", kSerializer.getDescriptor(), kSerializer2.getDescriptor());
    }

    @Override // xsna.rd
    public final Object a() {
        return new LinkedHashMap();
    }

    @Override // xsna.rd
    public final int b(Object obj) {
        return ((LinkedHashMap) obj).size() * 2;
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
        return new LinkedHashMap((Map) null);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }

    @Override // xsna.rd
    public final Object h(Object obj) {
        return (LinkedHashMap) obj;
    }
}
