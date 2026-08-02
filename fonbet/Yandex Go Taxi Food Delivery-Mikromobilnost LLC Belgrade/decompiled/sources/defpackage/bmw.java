package defpackage;

import defpackage.ylw;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class bmw implements uxs {
    public static final bmw a;
    private static final SerialDescriptor descriptor;

    static {
        bmw bmwVar = new bmw();
        a = bmwVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.intercity.contact.IntercityDeliveryExtraExperiment.DestinationContact", bmwVar, 3);
        pluginGeneratedSerialDescriptor.j("order_button", true);
        pluginGeneratedSerialDescriptor.j("tariff_card_item", true);
        pluginGeneratedSerialDescriptor.j("selector_modal", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(dmw.a), qke.n(hmw.a), fmw.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        ylw.d dVar = null;
        ylw.f fVar = null;
        ylw.e eVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                dVar = (ylw.d) b.s(serialDescriptor, 0, dmw.a, dVar);
                i |= 1;
            } else if (v == 1) {
                fVar = (ylw.f) b.s(serialDescriptor, 1, hmw.a, fVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                eVar = (ylw.e) b.A(serialDescriptor, 2, fmw.a, eVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new ylw.c(i, dVar, fVar, eVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ylw.c cVar = (ylw.c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || cVar.a != null) {
            b.g(serialDescriptor, 0, dmw.a, cVar.a);
        }
        if (b.F() || cVar.b != null) {
            b.g(serialDescriptor, 1, hmw.a, cVar.b);
        }
        if (b.F() || !jl40.l(cVar.c, new ylw.e(0))) {
            b.e(serialDescriptor, 2, fmw.a, cVar.c);
        }
        b.c(serialDescriptor);
    }
}
