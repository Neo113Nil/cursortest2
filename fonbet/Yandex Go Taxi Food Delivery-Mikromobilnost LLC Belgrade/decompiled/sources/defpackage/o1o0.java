package defpackage;

import defpackage.n1o0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes10.dex */
public final /* synthetic */ class o1o0 implements uxs {
    public static final o1o0 a;
    private static final SerialDescriptor descriptor;

    static {
        o1o0 o1o0Var = new o1o0();
        a = o1o0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.ScootersNewbieFlowExperiment.InitialModal", o1o0Var, 6);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("reject_button_text", true);
        pluginGeneratedSerialDescriptor.j("confirm_button_text", true);
        pluginGeneratedSerialDescriptor.j("promotion_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{auu0Var, w7sVar, w7sVar, w7sVar, w7sVar, auu0Var};
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
        FormattedText formattedText3 = null;
        FormattedText formattedText4 = null;
        String str2 = null;
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
                    formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                    i |= 2;
                    break;
                case 2:
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText2);
                    i |= 4;
                    break;
                case 3:
                    formattedText3 = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText3);
                    i |= 8;
                    break;
                case 4:
                    formattedText4 = (FormattedText) b.A(serialDescriptor, 4, w7s.a, formattedText4);
                    i |= 16;
                    break;
                case 5:
                    str2 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new n1o0.b(i, str, formattedText, formattedText2, formattedText3, formattedText4, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n1o0.b bVar = (n1o0.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(bVar.a, "")) {
            b.o(serialDescriptor, 0, bVar.a);
        }
        if (b.F() || !jl40.l(bVar.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, bVar.b);
        }
        if (b.F() || !jl40.l(bVar.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, bVar.c);
        }
        if (b.F() || !jl40.l(bVar.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, bVar.d);
        }
        if (b.F() || !jl40.l(bVar.e, FormattedText.c)) {
            b.e(serialDescriptor, 4, w7s.a, bVar.e);
        }
        if (b.F() || !jl40.l(bVar.f, "")) {
            b.o(serialDescriptor, 5, bVar.f);
        }
        b.c(serialDescriptor);
    }
}
