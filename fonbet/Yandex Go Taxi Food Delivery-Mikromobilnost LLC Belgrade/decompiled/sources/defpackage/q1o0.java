package defpackage;

import defpackage.n1o0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes10.dex */
public final /* synthetic */ class q1o0 implements uxs {
    public static final q1o0 a;
    private static final SerialDescriptor descriptor;

    static {
        q1o0 q1o0Var = new q1o0();
        a = q1o0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.ScootersNewbieFlowExperiment.ProgressInfo", q1o0Var, 5);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("lottie_json_url", true);
        pluginGeneratedSerialDescriptor.j("help_item", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        KSerializer n = qke.n(auu0Var);
        KSerializer n2 = qke.n(s1o0.a);
        w7s w7sVar = w7s.a;
        return new KSerializer[]{auu0Var, w7sVar, w7sVar, n, n2};
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
        String str2 = null;
        n1o0.c.a aVar = null;
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
            } else if (v == 2) {
                formattedText2 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText2);
                i |= 4;
            } else if (v == 3) {
                str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                aVar = (n1o0.c.a) b.s(serialDescriptor, 4, s1o0.a, aVar);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new n1o0.c(i, str, formattedText, formattedText2, str2, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n1o0.c cVar = (n1o0.c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(cVar.a, "")) {
            b.o(serialDescriptor, 0, cVar.a);
        }
        if (b.F() || !jl40.l(cVar.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, cVar.b);
        }
        if (b.F() || !jl40.l(cVar.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, cVar.c);
        }
        if (b.F() || cVar.d != null) {
            b.g(serialDescriptor, 3, auu0.a, cVar.d);
        }
        if (b.F() || cVar.e != null) {
            b.g(serialDescriptor, 4, s1o0.a, cVar.e);
        }
        b.c(serialDescriptor);
    }
}
