package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class kk10 implements uxs {
    public static final kk10 a;
    private static final SerialDescriptor descriptor;

    static {
        kk10 kk10Var = new kk10();
        a = kk10Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.menu.MenuDto", kk10Var, 2);
        pluginGeneratedSerialDescriptor.j("action_button", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(js.a), qke.n(gef.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        ls lsVar = null;
        ief iefVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                lsVar = (ls) b.s(serialDescriptor, 0, js.a, lsVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                iefVar = (ief) b.s(serialDescriptor, 1, gef.a, iefVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ok10(i, lsVar, iefVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ok10 ok10Var = (ok10) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || ok10Var.a != null) {
            b.g(serialDescriptor, 0, js.a, ok10Var.a);
        }
        if (b.F() || ok10Var.b != null) {
            b.g(serialDescriptor, 1, gef.a, ok10Var.b);
        }
        b.c(serialDescriptor);
    }
}
