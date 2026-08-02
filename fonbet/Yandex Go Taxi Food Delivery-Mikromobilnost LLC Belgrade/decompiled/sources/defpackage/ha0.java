package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class ha0 implements uxs {
    public static final ha0 a;
    private static final SerialDescriptor descriptor;

    static {
        ha0 ha0Var = new ha0();
        a = ha0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.AddCardParams", ha0Var, 4);
        pluginGeneratedSerialDescriptor.j("paymethod_id", true);
        pluginGeneratedSerialDescriptor.j("mobile_paymethod_id", true);
        pluginGeneratedSerialDescriptor.j("corp_id", true);
        pluginGeneratedSerialDescriptor.j("nequi_token_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ja0(i, str, str2, str3, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ja0 ja0Var = (ja0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || ja0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, ja0Var.a);
        }
        if (b.F() || ja0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, ja0Var.b);
        }
        if (b.F() || ja0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, ja0Var.c);
        }
        if (b.F() || ja0Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, ja0Var.d);
        }
        b.c(serialDescriptor);
    }
}
