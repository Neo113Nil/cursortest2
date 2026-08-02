package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class ddy0 implements uxs {
    public static final ddy0 a;
    private static final SerialDescriptor descriptor;

    static {
        ddy0 ddy0Var = new ddy0();
        a = ddy0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.Telematics", ddy0Var, 3);
        pluginGeneratedSerialDescriptor.j("fuel_level", true);
        pluginGeneratedSerialDescriptor.j("fuel_distance", true);
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
        return new fdy0(i, i2, f, j);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fdy0 fdy0Var = (fdy0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || fdy0Var.a != 0) {
            b.A(0, fdy0Var.a, serialDescriptor);
        }
        if (b.F() || Float.compare(fdy0Var.b, 0.0f) != 0) {
            b.z(serialDescriptor, 1, fdy0Var.b);
        }
        if (b.F() || fdy0Var.c != 0) {
            b.s(serialDescriptor, 2, fdy0Var.c);
        }
        b.c(serialDescriptor);
    }
}
