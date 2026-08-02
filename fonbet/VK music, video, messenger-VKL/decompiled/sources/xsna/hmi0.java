package xsna;

import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import xsna.gmi0;
import xsna.ppj;
import xsna.prm0;

/* compiled from: SerializersModule.kt */
/* loaded from: classes8.dex */
public final class hmi0 extends de {
    public final Map<dcy<?>, ppj> b;
    public final Map<dcy<?>, Map<dcy<?>, KSerializer<?>>> c;
    public final Map<dcy<?>, izs<?, mmi0<?>>> d;
    public final Map<dcy<?>, Map<String, KSerializer<?>>> e;
    public final Map<dcy<?>, izs<String, a3m<?>>> f;
    public final boolean g;

    /* JADX WARN: Multi-variable type inference failed */
    public hmi0(Map<dcy<?>, ? extends ppj> map, Map<dcy<?>, ? extends Map<dcy<?>, ? extends KSerializer<?>>> map2, Map<dcy<?>, ? extends izs<?, ? extends mmi0<?>>> map3, Map<dcy<?>, ? extends Map<String, ? extends KSerializer<?>>> map4, Map<dcy<?>, ? extends izs<? super String, ? extends a3m<?>>> map5, boolean z) {
        this.b = map;
        this.c = map2;
        this.d = map3;
        this.e = map4;
        this.f = map5;
        this.g = z;
    }

    @Override // xsna.de
    public final void U(uub0 uub0Var) {
        for (Map.Entry<dcy<?>, ppj> entry : this.b.entrySet()) {
            entry.getKey();
            ppj value = entry.getValue();
            if (value instanceof ppj.a) {
                ((ppj.a) value).getClass();
            } else {
                if (!(value instanceof ppj.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((ppj.b) value).getClass();
            }
        }
        for (Map.Entry<dcy<?>, Map<dcy<?>, KSerializer<?>>> entry2 : this.c.entrySet()) {
            entry2.getKey();
            for (Map.Entry<dcy<?>, KSerializer<?>> entry3 : entry2.getValue().entrySet()) {
                dcy<?> key = entry3.getKey();
                SerialDescriptor descriptor = entry3.getValue().getDescriptor();
                gmi0 kind = descriptor.getKind();
                if ((kind instanceof rub0) || epx.f(kind, gmi0.a.a)) {
                    throw new IllegalArgumentException("Serializer for " + key.l() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
                }
                if (epx.f(kind, prm0.b.a) || epx.f(kind, prm0.c.a) || (kind instanceof gbd0) || (kind instanceof gmi0.b)) {
                    throw new IllegalArgumentException("Serializer for " + key.l() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
                }
                int c = descriptor.c();
                for (int i = 0; i < c; i++) {
                    String d = descriptor.d(i);
                    if (epx.f(d, uub0Var.a)) {
                        throw new IllegalArgumentException("Polymorphic serializer for " + key + " has property '" + d + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                    }
                }
            }
        }
        for (Map.Entry<dcy<?>, izs<?, mmi0<?>>> entry4 : this.d.entrySet()) {
            entry4.getKey();
            ttp0.d(1, entry4.getValue());
        }
        for (Map.Entry<dcy<?>, izs<String, a3m<?>>> entry5 : this.f.entrySet()) {
            entry5.getKey();
            ttp0.d(1, entry5.getValue());
        }
    }

    @Override // xsna.de
    public final <T> KSerializer<T> X(dcy<T> dcyVar, List<? extends KSerializer<?>> list) {
        ppj ppjVar = this.b.get(dcyVar);
        KSerializer<T> kSerializer = ppjVar != null ? (KSerializer<T>) ppjVar.a(list) : null;
        if (kSerializer instanceof KSerializer) {
            return kSerializer;
        }
        return null;
    }

    @Override // xsna.de
    public final boolean Y() {
        return this.g;
    }

    @Override // xsna.de
    public final a3m i0(String str, dcy dcyVar) {
        Map<String, KSerializer<?>> map = this.e.get(dcyVar);
        KSerializer<?> kSerializer = map != null ? map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        izs<String, a3m<?>> izsVar = this.f.get(dcyVar);
        izs<String, a3m<?>> izsVar2 = ttp0.e(1, izsVar) ? izsVar : null;
        if (izsVar2 != null) {
            return izsVar2.invoke(str);
        }
        return null;
    }

    @Override // xsna.de
    public final <T> mmi0<T> j0(dcy<? super T> dcyVar, T t) {
        if (dcyVar.c(t)) {
            Map<dcy<?>, KSerializer<?>> map = this.c.get(dcyVar);
            KSerializer<?> kSerializer = map != null ? map.get(fpf0.a(t.getClass())) : null;
            KSerializer<?> kSerializer2 = kSerializer instanceof mmi0 ? kSerializer : null;
            if (kSerializer2 != null) {
                return kSerializer2;
            }
            izs<?, mmi0<?>> izsVar = this.d.get(dcyVar);
            izs<?, mmi0<?>> izsVar2 = ttp0.e(1, izsVar) ? izsVar : null;
            if (izsVar2 != null) {
                return (mmi0) izsVar2.invoke(t);
            }
        }
        return null;
    }
}
