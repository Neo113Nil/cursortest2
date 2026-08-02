package defpackage;

import defpackage.gi30;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ei30 implements uxs {
    public static final ei30 a;
    private static final SerialDescriptor descriptor;

    static {
        ei30 ei30Var = new ei30();
        a = ei30Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.main.experiment.MtDiscoveryFlexExperiment.MtDiscoveryFlexMainCardSettings", ei30Var, 4);
        pluginGeneratedSerialDescriptor.j("max_height_to_screen_ratio", true);
        pluginGeneratedSerialDescriptor.j("min_height", true);
        pluginGeneratedSerialDescriptor.j("min_hidden_content_height", true);
        pluginGeneratedSerialDescriptor.j("corner_radius", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(nor.a);
        h6w h6wVar = h6w.a;
        return new KSerializer[]{n, qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Float f = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                f = (Float) b.s(serialDescriptor, 0, nor.a, f);
                i |= 1;
            } else if (v == 1) {
                num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                i |= 2;
            } else if (v == 2) {
                num2 = (Integer) b.s(serialDescriptor, 2, h6w.a, num2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                num3 = (Integer) b.s(serialDescriptor, 3, h6w.a, num3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new gi30.a(i, f, num, num2, num3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gi30.a aVar = (gi30.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || aVar.a != null) {
            b.g(serialDescriptor, 0, nor.a, aVar.a);
        }
        if (b.F() || aVar.b != null) {
            b.g(serialDescriptor, 1, h6w.a, aVar.b);
        }
        if (b.F() || aVar.c != null) {
            b.g(serialDescriptor, 2, h6w.a, aVar.c);
        }
        if (b.F() || aVar.d != null) {
            b.g(serialDescriptor, 3, h6w.a, aVar.d);
        }
        b.c(serialDescriptor);
    }
}
