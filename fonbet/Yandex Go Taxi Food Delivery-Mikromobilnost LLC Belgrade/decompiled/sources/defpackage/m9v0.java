package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class m9v0 implements uxs {
    public static final m9v0 a;
    private static final SerialDescriptor descriptor;

    static {
        m9v0 m9v0Var = new m9v0();
        a = m9v0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.zerosuggest.SuggestV2ResultItemPlain", m9v0Var, 5);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("log", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{qke.n(w7sVar), qke.n(w7sVar), qke.n(c7v.a), qke.n(sl2.e), auu0.a};
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
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.s(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                formattedText2 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText2);
                i |= 2;
            } else if (v == 2) {
                n7vVar = (n7v) b.s(serialDescriptor, 2, c7v.a, n7vVar);
                i |= 4;
            } else if (v == 3) {
                rl2Var = (rl2) b.s(serialDescriptor, 3, sl2.e, rl2Var);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new o9v0(i, formattedText, formattedText2, n7vVar, rl2Var, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o9v0 o9v0Var = (o9v0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || o9v0Var.a != null) {
            b.g(serialDescriptor, 0, w7s.a, o9v0Var.a);
        }
        if (b.F() || o9v0Var.b != null) {
            b.g(serialDescriptor, 1, w7s.a, o9v0Var.b);
        }
        if (b.F() || o9v0Var.c != null) {
            b.g(serialDescriptor, 2, c7v.a, o9v0Var.c);
        }
        if (b.F() || o9v0Var.d != null) {
            b.g(serialDescriptor, 3, sl2.e, o9v0Var.d);
        }
        if (b.F() || !jl40.l(o9v0Var.e, "")) {
            b.o(serialDescriptor, 4, o9v0Var.e);
        }
        b.c(serialDescriptor);
    }
}
