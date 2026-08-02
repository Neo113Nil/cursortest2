package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class n0u0 implements uxs {
    public static final n0u0 a;
    private static final SerialDescriptor descriptor;

    static {
        n0u0 n0u0Var = new n0u0();
        a = n0u0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.StartCourierVerificationRequest", n0u0Var, 3);
        pluginGeneratedSerialDescriptor.j("timeout", true);
        pluginGeneratedSerialDescriptor.j("rssiThreshold", true);
        pluginGeneratedSerialDescriptor.j("flowId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(e6m.a), qke.n(h6w.a), qke.n(auu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Double d = null;
        Integer num = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                d = (Double) b.s(serialDescriptor, 0, e6m.a, d);
                i |= 1;
            } else if (v == 1) {
                num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new p0u0(i, d, num, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p0u0 p0u0Var = (p0u0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || p0u0Var.a != null) {
            b.g(serialDescriptor, 0, e6m.a, p0u0Var.a);
        }
        if (b.F() || p0u0Var.b != null) {
            b.g(serialDescriptor, 1, h6w.a, p0u0Var.b);
        }
        if (b.F() || p0u0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, p0u0Var.c);
        }
        b.c(serialDescriptor);
    }
}
