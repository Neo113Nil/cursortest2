package defpackage;

import defpackage.rct;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class nct implements uxs {
    public static final nct a;
    private static final SerialDescriptor descriptor;

    static {
        nct nctVar = new nct();
        a = nctVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.data.dto.GetRideHistoryOrderByIdResponse", nctVar, 1);
        pluginGeneratedSerialDescriptor.j("order", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(pct.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        rct.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                aVar = (rct.a) b.s(serialDescriptor, 0, pct.a, aVar);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new rct(i, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rct rctVar = (rct) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(rctVar.a, new rct.a(0))) {
            b.g(serialDescriptor, 0, pct.a, rctVar.a);
        }
        b.c(serialDescriptor);
    }
}
