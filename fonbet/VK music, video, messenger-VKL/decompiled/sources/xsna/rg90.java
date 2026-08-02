package xsna;

import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.prm0;

/* compiled from: Tuples.kt */
/* loaded from: classes8.dex */
public final class rg90<K, V> extends ley<K, V, Pair<? extends K, ? extends V>> {
    public final zli0 c;

    public rg90(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(kSerializer, kSerializer2);
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (drm0.N("kotlin.Pair")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        sfc sfcVar = new sfc("kotlin.Pair");
        sfc.a(sfcVar, "first", kSerializer.getDescriptor());
        sfc.a(sfcVar, "second", kSerializer2.getDescriptor());
        s3q0 s3q0Var = s3q0.a;
        this.c = new zli0("kotlin.Pair", prm0.a.a, sfcVar.c.size(), rl3.u0(serialDescriptorArr), sfcVar);
    }

    @Override // xsna.ley
    public final Object a(Object obj) {
        return ((Pair) obj).i();
    }

    @Override // xsna.ley
    public final Object b(Object obj) {
        return ((Pair) obj).j();
    }

    @Override // xsna.ley
    public final Object c(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    @Override // xsna.mmi0, xsna.a3m
    public final SerialDescriptor getDescriptor() {
        return this.c;
    }
}
