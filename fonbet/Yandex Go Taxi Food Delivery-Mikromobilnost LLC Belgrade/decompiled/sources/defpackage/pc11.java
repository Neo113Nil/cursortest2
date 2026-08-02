package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class pc11 implements uxs {
    public static final pc11 a;
    private static final SerialDescriptor descriptor;

    static {
        pc11 pc11Var = new pc11();
        a = pc11Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.notifications.tips.TransportingTipsNotificationExperiment.ButtonDto.TipsButtonsDto", pc11Var, 3);
        pluginGeneratedSerialDescriptor.j("buttons_count", true);
        pluginGeneratedSerialDescriptor.j("is_custom_allowed", true);
        pluginGeneratedSerialDescriptor.j("custom_button_text_key", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{h6w.a, z96.a, auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                z2 = b.C(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new rc11(i, str, z2, i2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rc11 rc11Var = (rc11) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || rc11Var.a != 0) {
            b.A(0, rc11Var.a, serialDescriptor);
        }
        if (b.F() || rc11Var.b) {
            b.n(serialDescriptor, 1, rc11Var.b);
        }
        if (b.F() || !jl40.l(rc11Var.c, "")) {
            b.o(serialDescriptor, 2, rc11Var.c);
        }
        b.c(serialDescriptor);
    }
}
