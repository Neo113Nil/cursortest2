package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class mmy implements uxs {
    public static final mmy a;
    private static final SerialDescriptor descriptor;

    static {
        mmy mmyVar = new mmy();
        a = mmyVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderDriverDto", mmyVar, 4);
        pluginGeneratedSerialDescriptor.j("tariff_class", true);
        pluginGeneratedSerialDescriptor.j("color_code", true);
        pluginGeneratedSerialDescriptor.j("plates", true);
        pluginGeneratedSerialDescriptor.j("phone_gateway", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, pmy.a};
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
        rmy rmyVar = null;
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
                rmyVar = (rmy) b.A(serialDescriptor, 3, pmy.a, rmyVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new omy(i, str, str2, str3, rmyVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        omy omyVar = (omy) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(omyVar.a, "")) {
            b.o(serialDescriptor, 0, omyVar.a);
        }
        if (b.F() || !jl40.l(omyVar.b, "")) {
            b.o(serialDescriptor, 1, omyVar.b);
        }
        if (b.F() || !jl40.l(omyVar.c, "")) {
            b.o(serialDescriptor, 2, omyVar.c);
        }
        if (b.F() || !jl40.l(omyVar.d, new rmy(0))) {
            b.e(serialDescriptor, 3, pmy.a, omyVar.d);
        }
        b.c(serialDescriptor);
    }
}
