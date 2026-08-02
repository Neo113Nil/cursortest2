package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class fs60 implements uxs {
    public static final fs60 a;
    private static final SerialDescriptor descriptor;

    static {
        fs60 fs60Var = new fs60();
        a = fs60Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.OfferFormattedDetailsItem", fs60Var, 4);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("value", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, w7sVar, qke.n(w7sVar), qke.n(zx.e)};
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
        FormattedText formattedText3 = null;
        er erVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                formattedText2 = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText2);
                i |= 2;
            } else if (v == 2) {
                formattedText3 = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                erVar = (er) b.s(serialDescriptor, 3, zx.e, erVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new hs60(i, formattedText, formattedText2, formattedText3, erVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        hs60 hs60Var = (hs60) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(hs60Var.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, hs60Var.a);
        }
        if (b.F() || !jl40.l(hs60Var.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, hs60Var.b);
        }
        if (b.F() || hs60Var.c != null) {
            b.g(serialDescriptor, 2, w7s.a, hs60Var.c);
        }
        if (b.F() || hs60Var.d != null) {
            b.g(serialDescriptor, 3, zx.e, hs60Var.d);
        }
        b.c(serialDescriptor);
    }
}
