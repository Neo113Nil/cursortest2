package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class aub0 implements uxs {
    public static final aub0 a;
    private static final SerialDescriptor descriptor;

    static {
        aub0 aub0Var = new aub0();
        a = aub0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.finalsuggest.PinAlertDto", aub0Var, 2);
        pluginGeneratedSerialDescriptor.j("warning_data", true);
        pluginGeneratedSerialDescriptor.j("success_data", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        xtb0 xtb0Var = xtb0.a;
        return new KSerializer[]{qke.n(xtb0Var), qke.n(xtb0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        ztb0 ztb0Var = null;
        ztb0 ztb0Var2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                ztb0Var = (ztb0) b.s(serialDescriptor, 0, xtb0.a, ztb0Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                ztb0Var2 = (ztb0) b.s(serialDescriptor, 1, xtb0.a, ztb0Var2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new cub0(i, ztb0Var, ztb0Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        cub0 cub0Var = (cub0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || cub0Var.a != null) {
            b.g(serialDescriptor, 0, xtb0.a, cub0Var.a);
        }
        if (b.F() || cub0Var.b != null) {
            b.g(serialDescriptor, 1, xtb0.a, cub0Var.b);
        }
        b.c(serialDescriptor);
    }
}
