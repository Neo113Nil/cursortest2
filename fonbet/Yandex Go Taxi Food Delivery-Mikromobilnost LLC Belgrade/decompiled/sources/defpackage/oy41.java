package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.map_object.v0;

/* loaded from: classes5.dex */
public final /* synthetic */ class oy41 implements uxs {
    public static final oy41 a;
    private static final SerialDescriptor descriptor;

    static {
        oy41 oy41Var = new oy41();
        a = oy41Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.WhereYouAreAction", oy41Var, 8);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("button_text", true);
        pluginGeneratedSerialDescriptor.j("other_text", true);
        pluginGeneratedSerialDescriptor.j("ask_for_edit", true);
        pluginGeneratedSerialDescriptor.j("i_am_here", true);
        pluginGeneratedSerialDescriptor.j("bubble", true);
        pluginGeneratedSerialDescriptor.j("action_reason", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, auu0Var, z96.a, auu0Var, wr.a, qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        yr yrVar = null;
        String str6 = null;
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
                    str4 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z2 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str5 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    yrVar = (yr) b.A(serialDescriptor, 6, wr.a, yrVar);
                    i |= 64;
                    break;
                case 7:
                    str6 = (String) b.s(serialDescriptor, 7, auu0.a, str6);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new v0(i, str, str2, str3, str4, z2, str5, yrVar, str6);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        v0 v0Var = (v0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(v0Var.a, "")) {
            b.o(serialDescriptor, 0, v0Var.a);
        }
        if (b.F() || !jl40.l(v0Var.b, "")) {
            b.o(serialDescriptor, 1, v0Var.b);
        }
        if (b.F() || !jl40.l(v0Var.c, "")) {
            b.o(serialDescriptor, 2, v0Var.c);
        }
        if (b.F() || !jl40.l(v0Var.d, "")) {
            b.o(serialDescriptor, 3, v0Var.d);
        }
        if (b.F() || v0Var.e) {
            b.n(serialDescriptor, 4, v0Var.e);
        }
        if (b.F() || !jl40.l(v0Var.f, "")) {
            b.o(serialDescriptor, 5, v0Var.f);
        }
        if (b.F() || !jl40.l(v0Var.g, new yr(0))) {
            b.e(serialDescriptor, 6, wr.a, v0Var.g);
        }
        if (b.F() || v0Var.h != null) {
            b.g(serialDescriptor, 7, auu0.a, v0Var.h);
        }
        b.c(serialDescriptor);
    }
}
