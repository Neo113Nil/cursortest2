package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes9.dex */
public final /* synthetic */ class esw0 implements uxs {
    public static final esw0 a;
    private static final SerialDescriptor descriptor;

    static {
        esw0 esw0Var = new esw0();
        a = esw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.SurgeInfoItem.TextBlock", esw0Var, 3);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{auu0.a, w7sVar, qke.n(w7sVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                formattedText2 = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new hsw0(i, str, formattedText, formattedText2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        hsw0 hsw0Var = (hsw0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(hsw0Var.a, "")) {
            b.o(serialDescriptor, 0, hsw0Var.a);
        }
        if (b.F() || !jl40.l(hsw0Var.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, hsw0Var.b);
        }
        if (b.F() || hsw0Var.c != null) {
            b.g(serialDescriptor, 2, w7s.a, hsw0Var.c);
        }
        b.c(serialDescriptor);
    }
}
