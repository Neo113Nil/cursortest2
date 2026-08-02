package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class jai implements uxs {
    public static final jai a;
    private static final SerialDescriptor descriptor;

    static {
        jai jaiVar = new jai();
        a = jaiVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.delivery.experiments.DeliveryFormDto", jaiVar, 4);
        pluginGeneratedSerialDescriptor.j("title_key", true);
        pluginGeneratedSerialDescriptor.j("subtitle_key", true);
        pluginGeneratedSerialDescriptor.j("lead_image_tag", true);
        pluginGeneratedSerialDescriptor.j("badge_image_tag", true);
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
        return new lai(i, str, str2, str3, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        lai laiVar = (lai) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(laiVar.a, "")) {
            b.o(serialDescriptor, 0, laiVar.a);
        }
        if (b.F() || !jl40.l(laiVar.b, "")) {
            b.o(serialDescriptor, 1, laiVar.b);
        }
        if (b.F() || laiVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, laiVar.c);
        }
        if (b.F() || laiVar.d != null) {
            b.g(serialDescriptor, 3, auu0.a, laiVar.d);
        }
        b.c(serialDescriptor);
    }
}
