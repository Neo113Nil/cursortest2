package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes14.dex */
public final /* synthetic */ class ku70 implements uxs {
    public static final ku70 a;
    private static final SerialDescriptor descriptor;

    static {
        ku70 ku70Var = new ku70();
        a = ku70Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.OrderDraftRequirementAddressRouteExtraData", ku70Var, 4);
        pluginGeneratedSerialDescriptor.j("porch", true);
        pluginGeneratedSerialDescriptor.j("floor", true);
        pluginGeneratedSerialDescriptor.j("apartment", true);
        pluginGeneratedSerialDescriptor.j("doorphone_number", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var};
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
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str3 = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str4 = b.k(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new mu70(i, str, str2, str3, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        mu70 mu70Var = (mu70) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(mu70Var.a, "")) {
            b.o(serialDescriptor, 0, mu70Var.a);
        }
        if (b.F() || !jl40.l(mu70Var.b, "")) {
            b.o(serialDescriptor, 1, mu70Var.b);
        }
        if (b.F() || !jl40.l(mu70Var.c, "")) {
            b.o(serialDescriptor, 2, mu70Var.c);
        }
        if (b.F() || !jl40.l(mu70Var.d, "")) {
            b.o(serialDescriptor, 3, mu70Var.d);
        }
        b.c(serialDescriptor);
    }
}
