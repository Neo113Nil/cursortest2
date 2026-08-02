package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class of5 implements uxs {
    public static final of5 a;
    private static final SerialDescriptor descriptor;

    static {
        of5 of5Var = new of5();
        a = of5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.Battery", of5Var, 3);
        pluginGeneratedSerialDescriptor.j("charge_level", true);
        pluginGeneratedSerialDescriptor.j("remaining_distance", true);
        pluginGeneratedSerialDescriptor.j("remaining_time", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{h6w.a, nor.a, pnz.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        long j = 0;
        boolean z = true;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                f = b.y(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                j = b.f(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new qf5(i, i2, f, j);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qf5 qf5Var = (qf5) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || qf5Var.a != 0) {
            b.A(0, qf5Var.a, serialDescriptor);
        }
        if (b.F() || Float.compare(qf5Var.b, 0.0f) != 0) {
            b.z(serialDescriptor, 1, qf5Var.b);
        }
        if (b.F() || qf5Var.c != 0) {
            b.s(serialDescriptor, 2, qf5Var.c);
        }
        b.c(serialDescriptor);
    }
}
