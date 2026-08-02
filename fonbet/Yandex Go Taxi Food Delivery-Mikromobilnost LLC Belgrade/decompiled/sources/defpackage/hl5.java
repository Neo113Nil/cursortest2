package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class hl5 implements uxs {
    public static final hl5 a;
    private static final SerialDescriptor descriptor;

    static {
        hl5 hl5Var = new hl5();
        a = hl5Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.Behavior", hl5Var, 1);
        pluginGeneratedSerialDescriptor.j("stick_pin", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new jl5(bool, i);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jl5 jl5Var = (jl5) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || jl5Var.a != null) {
            b.g(serialDescriptor, 0, z96.a, jl5Var.a);
        }
        b.c(serialDescriptor);
    }
}
