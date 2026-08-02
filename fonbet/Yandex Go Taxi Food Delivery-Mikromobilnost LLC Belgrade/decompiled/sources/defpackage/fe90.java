package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class fe90 implements uxs {
    public static final fe90 a;
    private static final SerialDescriptor descriptor;

    static {
        fe90 fe90Var = new fe90();
        a = fe90Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.parks.api.ParkDto", fe90Var, 7);
        pluginGeneratedSerialDescriptor.j("parkid", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("phone", true);
        pluginGeneratedSerialDescriptor.j("rating", true);
        pluginGeneratedSerialDescriptor.j("rating_count", true);
        pluginGeneratedSerialDescriptor.j("tariffs_url", true);
        pluginGeneratedSerialDescriptor.j("tariffs_url_parts", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(gh21.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, e6m.a, h6w.a, auu0Var, n};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        double d = 0.0d;
        boolean z = true;
        ih21 ih21Var = null;
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
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    d = b.E(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i2 = b.h(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    ih21Var = (ih21) b.s(serialDescriptor, 6, gh21.a, ih21Var);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new he90(i, str, str2, str3, d, i2, str4, ih21Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        he90 he90Var = (he90) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(he90Var.a, "")) {
            b.o(serialDescriptor, 0, he90Var.a);
        }
        if (b.F() || !jl40.l(he90Var.b, "")) {
            b.o(serialDescriptor, 1, he90Var.b);
        }
        if (b.F() || !jl40.l(he90Var.c, "")) {
            b.o(serialDescriptor, 2, he90Var.c);
        }
        if (b.F() || Double.compare(he90Var.d, Double.NaN) != 0) {
            b.E(serialDescriptor, 3, he90Var.d);
        }
        if (b.F() || he90Var.e != 0) {
            b.A(4, he90Var.e, serialDescriptor);
        }
        if (b.F() || !jl40.l(he90Var.f, "")) {
            b.o(serialDescriptor, 5, he90Var.f);
        }
        if (b.F() || he90Var.g != null) {
            b.g(serialDescriptor, 6, gh21.a, he90Var.g);
        }
        b.c(serialDescriptor);
    }
}
