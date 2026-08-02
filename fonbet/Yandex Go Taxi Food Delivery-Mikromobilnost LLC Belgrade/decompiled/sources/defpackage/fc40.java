package defpackage;

import defpackage.vb40;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class fc40 implements uxs {
    public static final fc40 a;
    private static final SerialDescriptor descriptor;

    static {
        fc40 fc40Var = new fc40();
        a = fc40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutScreenDataDto.DetailsSectionDto", fc40Var, 4);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("condition_button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(auu0.a);
        KSerializer n2 = qke.n(xb40.a);
        w7s w7sVar = w7s.a;
        return new KSerializer[]{n, w7sVar, w7sVar, n2};
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
        vb40.b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                i |= 2;
            } else if (v == 2) {
                formattedText2 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                bVar = (vb40.b) b.s(serialDescriptor, 3, xb40.a, bVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new vb40.f(i, str, formattedText, formattedText2, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vb40.f fVar = (vb40.f) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || fVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, fVar.a);
        }
        if (b.F() || !jl40.l(fVar.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, fVar.b);
        }
        if (b.F() || !jl40.l(fVar.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, fVar.c);
        }
        if (b.F() || fVar.d != null) {
            b.g(serialDescriptor, 3, xb40.a, fVar.d);
        }
        b.c(serialDescriptor);
    }
}
