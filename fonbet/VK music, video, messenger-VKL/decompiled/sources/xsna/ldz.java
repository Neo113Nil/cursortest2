package xsna;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes8.dex */
public final class ldz<E> extends w4g<E, Set<? extends E>, LinkedHashSet<E>> {
    public final kdz b;

    public ldz(KSerializer<E> kSerializer) {
        super(kSerializer);
        this.b = new kdz(kSerializer.getDescriptor());
    }

    @Override // xsna.rd
    public final Object a() {
        return new LinkedHashSet();
    }

    @Override // xsna.rd
    public final int b(Object obj) {
        return ((LinkedHashSet) obj).size();
    }

    @Override // xsna.rd
    public final Object g(Object obj) {
        return new LinkedHashSet((Collection) null);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // xsna.rd
    public final Object h(Object obj) {
        return (LinkedHashSet) obj;
    }

    @Override // xsna.u4g
    public final void i(int i, Object obj, Object obj2) {
        ((LinkedHashSet) obj).add(obj2);
    }
}
