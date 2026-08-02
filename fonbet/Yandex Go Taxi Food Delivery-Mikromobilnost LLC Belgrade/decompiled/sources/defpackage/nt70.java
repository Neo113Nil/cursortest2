package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class nt70 implements uxs {
    public static final nt70 a;
    private static final SerialDescriptor descriptor;

    static {
        nt70 nt70Var = new nt70();
        a = nt70Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.delivery.models.data.OrderDraftDeliveryRouteExtraData", nt70Var, 6);
        pluginGeneratedSerialDescriptor.j("contact_phone", true);
        pluginGeneratedSerialDescriptor.j("porch", true);
        pluginGeneratedSerialDescriptor.j("floor", true);
        pluginGeneratedSerialDescriptor.j("comment", true);
        pluginGeneratedSerialDescriptor.j("apartment", true);
        pluginGeneratedSerialDescriptor.j("doorphone_number", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var};
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
        String str6 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str6 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new pt70(i, str, str2, str3, str4, str5, str6);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pt70 pt70Var = (pt70) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(pt70Var.a, "")) {
            b.o(serialDescriptor, 0, pt70Var.a);
        }
        if (b.F() || !jl40.l(pt70Var.b, "")) {
            b.o(serialDescriptor, 1, pt70Var.b);
        }
        if (b.F() || !jl40.l(pt70Var.c, "")) {
            b.o(serialDescriptor, 2, pt70Var.c);
        }
        if (b.F() || !jl40.l(pt70Var.d, "")) {
            b.o(serialDescriptor, 3, pt70Var.d);
        }
        if (b.F() || !jl40.l(pt70Var.e, "")) {
            b.o(serialDescriptor, 4, pt70Var.e);
        }
        if (b.F() || !jl40.l(pt70Var.f, "")) {
            b.o(serialDescriptor, 5, pt70Var.f);
        }
        b.c(serialDescriptor);
    }
}
