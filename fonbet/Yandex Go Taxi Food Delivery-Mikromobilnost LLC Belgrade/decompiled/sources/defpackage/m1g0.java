package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes10.dex */
public final /* synthetic */ class m1g0 implements uxs {
    public static final m1g0 a;
    private static final SerialDescriptor descriptor;

    static {
        m1g0 m1g0Var = new m1g0();
        a = m1g0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.settings.experiments.PushDisabledPopupModel", m1g0Var, 4);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("show_policy", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, g8s0.a, auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        p8s0 p8s0Var = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                p8s0Var = (p8s0) b.A(serialDescriptor, 1, g8s0.a, p8s0Var);
                i |= 2;
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str3 = b.k(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new o1g0(i, str, p8s0Var, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o1g0 o1g0Var = (o1g0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(o1g0Var.a, "")) {
            b.o(serialDescriptor, 0, o1g0Var.a);
        }
        if (b.F() || !jl40.l(o1g0Var.b, new p8s0(0))) {
            b.e(serialDescriptor, 1, g8s0.a, o1g0Var.b);
        }
        if (b.F() || !jl40.l(o1g0Var.c, "")) {
            b.o(serialDescriptor, 2, o1g0Var.c);
        }
        if (b.F() || !jl40.l(o1g0Var.d, "")) {
            b.o(serialDescriptor, 3, o1g0Var.d);
        }
        b.c(serialDescriptor);
    }
}
