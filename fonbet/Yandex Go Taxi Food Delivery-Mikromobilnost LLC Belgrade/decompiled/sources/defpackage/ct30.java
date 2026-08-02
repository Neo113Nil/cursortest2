package defpackage;

import defpackage.qs30;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ct30 implements uxs {
    public static final ct30 a;
    private static final SerialDescriptor descriptor;

    static {
        ct30 ct30Var = new ct30();
        a = ct30Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.experiment.purchase_availability.MtPurchaseAvailabilityConfigDto.TicketButtonDto", ct30Var, 3);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("deeplinks", true);
        pluginGeneratedSerialDescriptor.j("show_for_default_scenario", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), qke.n(et30.a), z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        qs30.h hVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                hVar = (qs30.h) b.s(serialDescriptor, 1, et30.a, hVar);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new qs30.g(i, str, hVar, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qs30.g gVar = (qs30.g) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || gVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, gVar.a);
        }
        if (b.F() || gVar.b != null) {
            b.g(serialDescriptor, 1, et30.a, gVar.b);
        }
        if (b.F() || gVar.c) {
            b.n(serialDescriptor, 2, gVar.c);
        }
        b.c(serialDescriptor);
    }
}
