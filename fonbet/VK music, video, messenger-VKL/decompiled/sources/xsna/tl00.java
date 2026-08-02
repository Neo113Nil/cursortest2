package xsna;

import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: CollectionSerializers.kt */
/* loaded from: classes8.dex */
public abstract class tl00<Key, Value, Collection, Builder extends Map<Key, Value>> extends rd<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    public final KSerializer<Key> a;
    public final KSerializer<Value> b;

    public tl00(KSerializer kSerializer, KSerializer kSerializer2) {
        this.a = kSerializer;
        this.b = kSerializer2;
    }

    @Override // xsna.rd
    public final void f(ssi ssiVar, int i, Object obj) {
        Map map = (Map) obj;
        Object y = ssiVar.y(getDescriptor(), i, this.a, null);
        int m = ssiVar.m(getDescriptor());
        if (m != i + 1) {
            throw new IllegalArgumentException(efz.a(i, m, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        boolean containsKey = map.containsKey(y);
        KSerializer<Value> kSerializer = this.b;
        map.put(y, (!containsKey || (kSerializer.getDescriptor().getKind() instanceof gbd0)) ? ssiVar.y(getDescriptor(), m, kSerializer, null) : ssiVar.y(getDescriptor(), m, kSerializer, pn00.h(y, map)));
    }

    @Override // xsna.mmi0
    public final void serialize(Encoder encoder, Collection collection) {
        d(collection);
        SerialDescriptor descriptor = getDescriptor();
        cti F = encoder.F(descriptor);
        Iterator<Map.Entry<? extends Key, ? extends Value>> c = c(collection);
        int i = 0;
        while (c.hasNext()) {
            Map.Entry<? extends Key, ? extends Value> next = c.next();
            Key key = next.getKey();
            Value value = next.getValue();
            int i2 = i + 1;
            F.n(getDescriptor(), i, this.a, key);
            i += 2;
            F.n(getDescriptor(), i2, this.b, value);
        }
        F.e(descriptor);
    }
}
