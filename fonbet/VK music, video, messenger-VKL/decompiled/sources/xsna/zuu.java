package xsna;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes8.dex */
public final class zuu<E> extends w4g<E, Set<? extends E>, HashSet<E>> {
    public final yuu b;

    public zuu(KSerializer<E> kSerializer) {
        super(kSerializer);
        this.b = new yuu(kSerializer.getDescriptor());
    }

    @Override // xsna.rd
    public final Object a() {
        return new HashSet();
    }

    @Override // xsna.rd
    public final int b(Object obj) {
        return ((HashSet) obj).size();
    }

    @Override // xsna.rd
    public final Object g(Object obj) {
        return new HashSet((Collection) null);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // xsna.rd
    public final Object h(Object obj) {
        return (HashSet) obj;
    }

    @Override // xsna.u4g
    public final void i(int i, Object obj, Object obj2) {
        ((HashSet) obj).add(obj2);
    }
}
