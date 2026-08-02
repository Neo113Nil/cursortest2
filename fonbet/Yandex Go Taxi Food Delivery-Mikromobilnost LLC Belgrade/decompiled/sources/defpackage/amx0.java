package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class amx0 implements uxs {
    public static final amx0 a;
    private static final SerialDescriptor descriptor;

    static {
        amx0 amx0Var = new amx0();
        a = amx0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.experiments.TariffRequirementOverrideDto", amx0Var, 4);
        pluginGeneratedSerialDescriptor.j("glued", true);
        pluginGeneratedSerialDescriptor.j("optional_glued", true);
        pluginGeneratedSerialDescriptor.j("unset_order_button_key", true);
        pluginGeneratedSerialDescriptor.j("persistence_policy", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{qke.n(z96Var), qke.n(z96Var), qke.n(auu0.a), qke.n(d1b0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        f1b0 f1b0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                i |= 1;
            } else if (v == 1) {
                bool2 = (Boolean) b.s(serialDescriptor, 1, z96.a, bool2);
                i |= 2;
            } else if (v == 2) {
                str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                f1b0Var = (f1b0) b.s(serialDescriptor, 3, d1b0.a, f1b0Var);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new cmx0(i, bool, bool2, str, f1b0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cmx0 cmx0Var = (cmx0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || cmx0Var.a != null) {
            b.g(serialDescriptor, 0, z96.a, cmx0Var.a);
        }
        if (b.F() || cmx0Var.b != null) {
            b.g(serialDescriptor, 1, z96.a, cmx0Var.b);
        }
        if (b.F() || cmx0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, cmx0Var.c);
        }
        if (b.F() || cmx0Var.d != null) {
            b.g(serialDescriptor, 3, d1b0.a, cmx0Var.d);
        }
        b.c(serialDescriptor);
    }
}
