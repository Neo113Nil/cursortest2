package xsna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes8.dex */
public final class yk3<E> extends w4g<E, List<? extends E>, ArrayList<E>> {
    public final xk3 b;

    public yk3(KSerializer<E> kSerializer) {
        super(kSerializer);
        this.b = new xk3(kSerializer.getDescriptor());
    }

    @Override // xsna.rd
    public final Object a() {
        return new ArrayList();
    }

    @Override // xsna.rd
    public final int b(Object obj) {
        return ((ArrayList) obj).size();
    }

    @Override // xsna.rd
    public final Object g(Object obj) {
        return new ArrayList((Collection) null);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    @Override // xsna.rd
    public final Object h(Object obj) {
        return (ArrayList) obj;
    }

    @Override // xsna.u4g
    public final void i(int i, Object obj, Object obj2) {
        ((ArrayList) obj).add(i, obj2);
    }
}
