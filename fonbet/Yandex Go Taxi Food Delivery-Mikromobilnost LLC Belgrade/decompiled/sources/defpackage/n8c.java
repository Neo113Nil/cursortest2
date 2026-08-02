package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class n8c implements uxs {
    public static final n8c a;
    private static final SerialDescriptor descriptor;

    static {
        n8c n8cVar = new n8c();
        a = n8cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.experiments.ClusterizationParameters", n8cVar, 3);
        pluginGeneratedSerialDescriptor.j("select_zoom", true);
        pluginGeneratedSerialDescriptor.j("hide_point_on_bubble_intersection", true);
        pluginGeneratedSerialDescriptor.j("cluster_label_configuration", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{h6w.a, z96.a, qke.n(v7c.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        x7c x7cVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                z2 = b.C(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                x7cVar = (x7c) b.s(serialDescriptor, 2, v7c.a, x7cVar);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new p8c(i, i2, z2, x7cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p8c p8cVar = (p8c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || p8cVar.a != 0) {
            b.A(0, p8cVar.a, serialDescriptor);
        }
        if (b.F() || p8cVar.b) {
            b.n(serialDescriptor, 1, p8cVar.b);
        }
        if (b.F() || p8cVar.c != null) {
            b.g(serialDescriptor, 2, v7c.a, p8cVar.c);
        }
        b.c(serialDescriptor);
    }
}
