package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class dlb implements uxs {
    public static final dlb a;
    private static final SerialDescriptor descriptor;

    static {
        dlb dlbVar = new dlb();
        a = dlbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CheckoutParam", dlbVar, 9);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("qr_url", true);
        pluginGeneratedSerialDescriptor.j("location", true);
        pluginGeneratedSerialDescriptor.j("starting_stop_id", true);
        pluginGeneratedSerialDescriptor.j("destination_stop_id", true);
        pluginGeneratedSerialDescriptor.j("direction_id", true);
        pluginGeneratedSerialDescriptor.j("zone_name", true);
        pluginGeneratedSerialDescriptor.j("tickets_count", true);
        pluginGeneratedSerialDescriptor.j("meta_checkout_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(b0t.a), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), auu0Var, qke.n(h6w.a), qke.n(cm2.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        boolean z = true;
        Object obj2 = null;
        String str = null;
        String str2 = null;
        zzs zzsVar = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Integer num = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                    i |= 2;
                    break;
                case 2:
                    zzsVar = (zzs) b.s(serialDescriptor, 2, b0t.a, zzsVar);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    str4 = (String) b.s(serialDescriptor, 4, auu0.a, str4);
                    i |= 16;
                    break;
                case 5:
                    str5 = (String) b.s(serialDescriptor, 5, auu0.a, str5);
                    i |= 32;
                    break;
                case 6:
                    str6 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    num = (Integer) b.s(serialDescriptor, 7, h6w.a, num);
                    i |= 128;
                    break;
                case 8:
                    obj2 = b.s(serialDescriptor, 8, cm2.a, obj2);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new flb(i, str, str2, zzsVar, str3, str4, str5, str6, num, obj2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        flb flbVar = (flb) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(flbVar.a, "")) {
            b.g(serialDescriptor, 0, auu0.a, flbVar.a);
        }
        if (b.F() || flbVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, flbVar.b);
        }
        if (b.F() || flbVar.c != null) {
            b.g(serialDescriptor, 2, b0t.a, flbVar.c);
        }
        if (b.F() || flbVar.d != null) {
            b.g(serialDescriptor, 3, auu0.a, flbVar.d);
        }
        if (b.F() || flbVar.e != null) {
            b.g(serialDescriptor, 4, auu0.a, flbVar.e);
        }
        if (b.F() || flbVar.f != null) {
            b.g(serialDescriptor, 5, auu0.a, flbVar.f);
        }
        if (b.F() || !jl40.l(flbVar.g, "")) {
            b.o(serialDescriptor, 6, flbVar.g);
        }
        if (b.F() || flbVar.h != null) {
            b.g(serialDescriptor, 7, h6w.a, flbVar.h);
        }
        if (b.F() || flbVar.i != null) {
            b.g(serialDescriptor, 8, cm2.a, flbVar.i);
        }
        b.c(serialDescriptor);
    }
}
