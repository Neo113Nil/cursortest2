package xsna;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes8.dex */
public abstract class u4g<Element, Collection, Builder> extends rd<Element, Collection, Builder> {
    public final KSerializer<Element> a;

    public u4g(KSerializer kSerializer) {
        this.a = kSerializer;
    }

    @Override // xsna.rd
    public void f(ssi ssiVar, int i, Object obj) {
        i(i, obj, ssiVar.y(getDescriptor(), i, this.a, null));
    }

    public abstract void i(int i, Object obj, Object obj2);

    @Override // xsna.mmi0
    public void serialize(Encoder encoder, Collection collection) {
        int d = d(collection);
        SerialDescriptor descriptor = getDescriptor();
        cti F = encoder.F(descriptor);
        Iterator<Element> c = c(collection);
        for (int i = 0; i < d; i++) {
            F.n(getDescriptor(), i, this.a, c.next());
        }
        F.e(descriptor);
    }
}
