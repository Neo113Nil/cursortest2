package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class dm90 implements uxs {
    public static final dm90 a;
    private static final SerialDescriptor descriptor;

    static {
        dm90 dm90Var = new dm90();
        a = dm90Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.PassesListResponse", dm90Var, 2);
        pluginGeneratedSerialDescriptor.j("passes", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(rl90.a), gef.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        tl90 tl90Var = null;
        ief iefVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                tl90Var = (tl90) b.s(serialDescriptor, 0, rl90.a, tl90Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                iefVar = (ief) b.A(serialDescriptor, 1, gef.a, iefVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new fm90(i, tl90Var, iefVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        fm90 fm90Var = (fm90) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || fm90Var.a != null) {
            b.g(serialDescriptor, 0, rl90.a, fm90Var.a);
        }
        if (b.F() || !jl40.l(fm90Var.b, ief.e)) {
            b.e(serialDescriptor, 1, gef.a, fm90Var.b);
        }
        b.c(serialDescriptor);
    }
}
