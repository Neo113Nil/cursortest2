package defpackage;

import defpackage.soz0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class hpz0 implements uxs {
    public static final hpz0 a;
    private static final SerialDescriptor descriptor;

    static {
        hpz0 hpz0Var = new hpz0();
        a = hpz0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.preorder.tollroad.data.TollRoadDialogExperiment.Texts", hpz0Var, 7);
        pluginGeneratedSerialDescriptor.j("title_key", true);
        pluginGeneratedSerialDescriptor.j("description_default_key", true);
        pluginGeneratedSerialDescriptor.j("description_manual_payment_key", true);
        pluginGeneratedSerialDescriptor.j("description_manual_payment_with_fee_key", true);
        pluginGeneratedSerialDescriptor.j("description_automatic_payment_key", true);
        pluginGeneratedSerialDescriptor.j("description_automatic_payment_with_fee_key", true);
        pluginGeneratedSerialDescriptor.j("description_automatic_payment_with_fee_discount_key", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var};
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
        String str7 = null;
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
                case 6:
                    str7 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new soz0.i(i, str, str2, str3, str4, str5, str6, str7);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        soz0.i iVar = (soz0.i) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(iVar.a, "")) {
            b.o(serialDescriptor, 0, iVar.a);
        }
        if (b.F() || !jl40.l(iVar.b, "")) {
            b.o(serialDescriptor, 1, iVar.b);
        }
        if (b.F() || !jl40.l(iVar.c, "")) {
            b.o(serialDescriptor, 2, iVar.c);
        }
        if (b.F() || !jl40.l(iVar.d, "")) {
            b.o(serialDescriptor, 3, iVar.d);
        }
        if (b.F() || !jl40.l(iVar.e, "")) {
            b.o(serialDescriptor, 4, iVar.e);
        }
        if (b.F() || !jl40.l(iVar.f, "")) {
            b.o(serialDescriptor, 5, iVar.f);
        }
        if (b.F() || !jl40.l(iVar.g, "")) {
            b.o(serialDescriptor, 6, iVar.g);
        }
        b.c(serialDescriptor);
    }
}
