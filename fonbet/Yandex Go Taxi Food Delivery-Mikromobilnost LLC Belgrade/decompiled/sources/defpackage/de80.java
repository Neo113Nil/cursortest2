package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.map_object.u;

/* loaded from: classes5.dex */
public final /* synthetic */ class de80 implements uxs {
    public static final de80 a;
    private static final SerialDescriptor descriptor;

    static {
        de80 de80Var = new de80();
        a = de80Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.OrganizationCardAction", de80Var, 5);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("mode", true);
        pluginGeneratedSerialDescriptor.j("is_initial_expanded", true);
        pluginGeneratedSerialDescriptor.j("min_height", true);
        pluginGeneratedSerialDescriptor.j("max_height_ratio", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(auu0.a);
        KSerializer n2 = qke.n(z96.a);
        nor norVar = nor.a;
        return new KSerializer[]{ni80.a, n, n2, qke.n(norVar), qke.n(norVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        pi80 pi80Var = null;
        String str = null;
        Boolean bool = null;
        Float f = null;
        Float f2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                pi80Var = (pi80) b.A(serialDescriptor, 0, ni80.a, pi80Var);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                bool = (Boolean) b.s(serialDescriptor, 2, z96.a, bool);
                i |= 4;
            } else if (v == 3) {
                f = (Float) b.s(serialDescriptor, 3, nor.a, f);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                f2 = (Float) b.s(serialDescriptor, 4, nor.a, f2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new u(i, pi80Var, str, bool, f, f2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u uVar = (u) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(uVar.a, new pi80(0))) {
            b.e(serialDescriptor, 0, ni80.a, uVar.a);
        }
        if (b.F() || uVar.b != null) {
            b.g(serialDescriptor, 1, auu0.a, uVar.b);
        }
        if (b.F() || uVar.c != null) {
            b.g(serialDescriptor, 2, z96.a, uVar.c);
        }
        if (b.F() || uVar.d != null) {
            b.g(serialDescriptor, 3, nor.a, uVar.d);
        }
        if (b.F() || uVar.e != null) {
            b.g(serialDescriptor, 4, nor.a, uVar.e);
        }
        b.c(serialDescriptor);
    }
}
