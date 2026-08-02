package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class g9v0 implements uxs {
    public static final g9v0 a;
    private static final SerialDescriptor descriptor;

    static {
        g9v0 g9v0Var = new g9v0();
        a = g9v0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.zerosuggest.SuggestV2ResultItemOrg", g9v0Var, 6);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("log", true);
        pluginGeneratedSerialDescriptor.j("distance", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{qke.n(w7sVar), qke.n(w7sVar), qke.n(c7v.a), qke.n(sl2.e), auu0.a, qke.n(r1k.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        n7v n7vVar = null;
        rl2 rl2Var = null;
        String str = null;
        t1k t1kVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    formattedText = (FormattedText) b.s(serialDescriptor, 0, w7s.a, formattedText);
                    i |= 1;
                    break;
                case 1:
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText2);
                    i |= 2;
                    break;
                case 2:
                    n7vVar = (n7v) b.s(serialDescriptor, 2, c7v.a, n7vVar);
                    i |= 4;
                    break;
                case 3:
                    rl2Var = (rl2) b.s(serialDescriptor, 3, sl2.e, rl2Var);
                    i |= 8;
                    break;
                case 4:
                    str = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    t1kVar = (t1k) b.s(serialDescriptor, 5, r1k.a, t1kVar);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new i9v0(i, formattedText, formattedText2, n7vVar, rl2Var, str, t1kVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i9v0 i9v0Var = (i9v0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || i9v0Var.a != null) {
            b.g(serialDescriptor, 0, w7s.a, i9v0Var.a);
        }
        if (b.F() || i9v0Var.b != null) {
            b.g(serialDescriptor, 1, w7s.a, i9v0Var.b);
        }
        if (b.F() || i9v0Var.c != null) {
            b.g(serialDescriptor, 2, c7v.a, i9v0Var.c);
        }
        if (b.F() || i9v0Var.d != null) {
            b.g(serialDescriptor, 3, sl2.e, i9v0Var.d);
        }
        if (b.F() || !jl40.l(i9v0Var.e, "")) {
            b.o(serialDescriptor, 4, i9v0Var.e);
        }
        if (b.F() || i9v0Var.f != null) {
            b.g(serialDescriptor, 5, r1k.a, i9v0Var.f);
        }
        b.c(serialDescriptor);
    }
}
