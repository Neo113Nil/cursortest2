package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class nud0 implements uxs {
    public static final nud0 a;
    private static final SerialDescriptor descriptor;

    static {
        nud0 nud0Var = new nud0();
        a = nud0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.maas.api.PointDto", nud0Var, 2);
        pluginGeneratedSerialDescriptor.j("lat", true);
        pluginGeneratedSerialDescriptor.j("lon", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        e6m e6mVar = e6m.a;
        return new KSerializer[]{e6mVar, e6mVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        double d = 0.0d;
        double d2 = 0.0d;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                d = b.E(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                d2 = b.E(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new pud0(d, d2, i);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pud0 pud0Var = (pud0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || Double.compare(pud0Var.a, 0.0d) != 0) {
            b.E(serialDescriptor, 0, pud0Var.a);
        }
        if (b.F() || Double.compare(pud0Var.b, 0.0d) != 0) {
            b.E(serialDescriptor, 1, pud0Var.b);
        }
        b.c(serialDescriptor);
    }
}
