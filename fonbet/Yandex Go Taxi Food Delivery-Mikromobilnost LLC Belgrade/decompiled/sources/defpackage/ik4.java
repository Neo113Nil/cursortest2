package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ik4 implements uxs {
    public static final ik4 a;
    private static final SerialDescriptor descriptor;

    static {
        ik4 ik4Var = new ik4();
        a = ik4Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.BadgeDto", ik4Var, 2);
        pluginGeneratedSerialDescriptor.j("view", true);
        pluginGeneratedSerialDescriptor.j("show_policy", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{mk4.a, em4.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        ok4 ok4Var = null;
        gm4 gm4Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                ok4Var = (ok4) b.A(serialDescriptor, 0, mk4.a, ok4Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                gm4Var = (gm4) b.A(serialDescriptor, 1, em4.a, gm4Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new kk4(i, ok4Var, gm4Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kk4 kk4Var = (kk4) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(kk4Var.a, new ok4(0))) {
            b.e(serialDescriptor, 0, mk4.a, kk4Var.a);
        }
        if (b.F() || !jl40.l(kk4Var.b, new gm4(0))) {
            b.e(serialDescriptor, 1, em4.a, kk4Var.b);
        }
        b.c(serialDescriptor);
    }
}
