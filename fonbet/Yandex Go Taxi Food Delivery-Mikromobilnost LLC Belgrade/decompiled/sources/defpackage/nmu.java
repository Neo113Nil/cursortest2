package defpackage;

import defpackage.kmu;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class nmu implements uxs {
    public static final nmu a;
    private static final SerialDescriptor descriptor;

    static {
        nmu nmuVar = new nmu();
        a = nmuVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.HistorySession.RideStatistics", nmuVar, 4);
        pluginGeneratedSerialDescriptor.j("distance", true);
        pluginGeneratedSerialDescriptor.j("speed", true);
        pluginGeneratedSerialDescriptor.j("duration", true);
        pluginGeneratedSerialDescriptor.j("price", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        pmu pmuVar = pmu.a;
        return new KSerializer[]{pmuVar, pmuVar, pmuVar, pmuVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        kmu.c.a aVar = null;
        kmu.c.a aVar2 = null;
        kmu.c.a aVar3 = null;
        kmu.c.a aVar4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                aVar = (kmu.c.a) b.A(serialDescriptor, 0, pmu.a, aVar);
                i |= 1;
            } else if (v == 1) {
                aVar2 = (kmu.c.a) b.A(serialDescriptor, 1, pmu.a, aVar2);
                i |= 2;
            } else if (v == 2) {
                aVar3 = (kmu.c.a) b.A(serialDescriptor, 2, pmu.a, aVar3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                aVar4 = (kmu.c.a) b.A(serialDescriptor, 3, pmu.a, aVar4);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new kmu.c(i, aVar, aVar2, aVar3, aVar4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        if (defpackage.jl40.l(r0, kmu.c.a.c) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
    
        if (defpackage.jl40.l(r0, kmu.c.a.c) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (defpackage.jl40.l(r0, kmu.c.a.c) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (defpackage.jl40.l(r0, kmu.c.a.c) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        kmu.c cVar = (kmu.c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (!b.F()) {
            kmu.c.a aVar = cVar.a;
            kmu.c.a.Companion.getClass();
        }
        b.e(serialDescriptor, 0, pmu.a, cVar.a);
        if (!b.F()) {
            kmu.c.a aVar2 = cVar.b;
            kmu.c.a.Companion.getClass();
        }
        b.e(serialDescriptor, 1, pmu.a, cVar.b);
        if (!b.F()) {
            kmu.c.a aVar3 = cVar.c;
            kmu.c.a.Companion.getClass();
        }
        b.e(serialDescriptor, 2, pmu.a, cVar.c);
        if (!b.F()) {
            kmu.c.a aVar4 = cVar.d;
            kmu.c.a.Companion.getClass();
        }
        b.e(serialDescriptor, 3, pmu.a, cVar.d);
        b.c(serialDescriptor);
    }
}
