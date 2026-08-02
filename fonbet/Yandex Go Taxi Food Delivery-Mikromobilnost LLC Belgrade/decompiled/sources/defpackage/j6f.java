package defpackage;

import defpackage.n6f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class j6f implements uxs {
    public static final j6f a;
    private static final SerialDescriptor descriptor;

    static {
        j6f j6fVar = new j6f();
        a = j6fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.geopayment.checkout.network.model.CreatePaymentParam", j6fVar, 8);
        pluginGeneratedSerialDescriptor.j("uuid", true);
        pluginGeneratedSerialDescriptor.j("transport_id", true);
        pluginGeneratedSerialDescriptor.j("payment_info", true);
        pluginGeneratedSerialDescriptor.j("count", true);
        pluginGeneratedSerialDescriptor.j("a_point", true);
        pluginGeneratedSerialDescriptor.j("b_point", true);
        pluginGeneratedSerialDescriptor.j("zone_name", true);
        pluginGeneratedSerialDescriptor.j("meta_payment_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, l6f.a, h6w.a, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(cm2.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        n6f.a aVar = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Object obj2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    aVar = (n6f.a) b.A(serialDescriptor, 2, l6f.a, aVar);
                    i |= 4;
                    break;
                case 3:
                    i2 = b.h(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) b.s(serialDescriptor, 4, auu0.a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) b.s(serialDescriptor, 5, auu0.a, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) b.s(serialDescriptor, 6, auu0.a, str5);
                    i |= 64;
                    break;
                case 7:
                    obj2 = b.s(serialDescriptor, 7, cm2.a, obj2);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new n6f(i, str, str2, aVar, i2, str3, str4, str5, obj2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n6f n6fVar = (n6f) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        int i = 0;
        if (b.F() || !jl40.l(n6fVar.a, "")) {
            b.o(serialDescriptor, 0, n6fVar.a);
        }
        if (b.F() || !jl40.l(n6fVar.b, "")) {
            b.o(serialDescriptor, 1, n6fVar.b);
        }
        if (b.F() || !jl40.l(n6fVar.c, new n6f.a(i))) {
            b.e(serialDescriptor, 2, l6f.a, n6fVar.c);
        }
        if (b.F() || n6fVar.d != 1) {
            b.A(3, n6fVar.d, serialDescriptor);
        }
        if (b.F() || n6fVar.e != null) {
            b.g(serialDescriptor, 4, auu0.a, n6fVar.e);
        }
        if (b.F() || n6fVar.f != null) {
            b.g(serialDescriptor, 5, auu0.a, n6fVar.f);
        }
        if (b.F() || n6fVar.g != null) {
            b.g(serialDescriptor, 6, auu0.a, n6fVar.g);
        }
        if (b.F() || n6fVar.h != null) {
            b.g(serialDescriptor, 7, cm2.a, n6fVar.h);
        }
        b.c(serialDescriptor);
    }
}
