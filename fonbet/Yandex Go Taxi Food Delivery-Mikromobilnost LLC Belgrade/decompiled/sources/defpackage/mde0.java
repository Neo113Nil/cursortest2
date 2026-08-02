package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class mde0 implements uxs {
    public static final mde0 a;
    private static final SerialDescriptor descriptor;

    static {
        mde0 mde0Var = new mde0();
        a = mde0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.PositionConfirmationDeclineAction.ChooseAddress", mde0Var, 5);
        pluginGeneratedSerialDescriptor.j("bubble_text", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("skip_button_text", true);
        pluginGeneratedSerialDescriptor.j("other_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, auu0Var};
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
        String str5 = null;
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
            } else if (v == 3) {
                str4 = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str5 = b.k(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new ode0(str, str2, str3, str4, i, str5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ode0 ode0Var = (ode0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(ode0Var.a, "")) {
            b.o(serialDescriptor, 0, ode0Var.a);
        }
        if (b.F() || !jl40.l(ode0Var.b, "")) {
            b.o(serialDescriptor, 1, ode0Var.b);
        }
        if (b.F() || !jl40.l(ode0Var.c, "")) {
            b.o(serialDescriptor, 2, ode0Var.c);
        }
        if (b.F() || !jl40.l(ode0Var.d, "")) {
            b.o(serialDescriptor, 3, ode0Var.d);
        }
        if (b.F() || !jl40.l(ode0Var.e, "")) {
            b.o(serialDescriptor, 4, ode0Var.e);
        }
        b.c(serialDescriptor);
    }
}
