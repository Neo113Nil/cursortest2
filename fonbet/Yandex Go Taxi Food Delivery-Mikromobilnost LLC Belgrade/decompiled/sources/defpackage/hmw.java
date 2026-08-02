package defpackage;

import defpackage.ylw;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class hmw implements uxs {
    public static final hmw a;
    private static final SerialDescriptor descriptor;

    static {
        hmw hmwVar = new hmw();
        a = hmwVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.intercity.contact.IntercityDeliveryExtraExperiment.TariffCardItem", hmwVar, 4);
        pluginGeneratedSerialDescriptor.j("item_title_key", true);
        pluginGeneratedSerialDescriptor.j("item_subtitle_empty_key", true);
        pluginGeneratedSerialDescriptor.j("item_lead_icon", true);
        pluginGeneratedSerialDescriptor.j("position", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ylw.f(i, str, str2, str3, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ylw.f fVar = (ylw.f) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(fVar.a, "")) {
            b.o(serialDescriptor, 0, fVar.a);
        }
        if (b.F() || !jl40.l(fVar.b, "")) {
            b.o(serialDescriptor, 1, fVar.b);
        }
        if (b.F() || fVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, fVar.c);
        }
        if (b.F() || fVar.d != null) {
            b.g(serialDescriptor, 3, auu0.a, fVar.d);
        }
        b.c(serialDescriptor);
    }
}
