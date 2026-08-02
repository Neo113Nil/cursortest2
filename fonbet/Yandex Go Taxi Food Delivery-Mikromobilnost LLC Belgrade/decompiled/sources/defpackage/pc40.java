package defpackage;

import defpackage.vb40;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class pc40 implements uxs {
    public static final pc40 a;
    private static final SerialDescriptor descriptor;

    static {
        pc40 pc40Var = new pc40();
        a = pc40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.checkout.model.MtTrainCheckoutScreenDataDto.PaymentInfoDto", pc40Var, 4);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("price_title", true);
        pluginGeneratedSerialDescriptor.j("button_title", true);
        pluginGeneratedSerialDescriptor.j("user_agreement", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, w7sVar, w7sVar, w7sVar};
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
        FormattedText formattedText4 = null;
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
                formattedText3 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                formattedText4 = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText4);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new vb40.k(i, formattedText, formattedText2, formattedText3, formattedText4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vb40.k kVar = (vb40.k) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(kVar.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, kVar.a);
        }
        if (b.F() || !jl40.l(kVar.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, kVar.b);
        }
        if (b.F() || !jl40.l(kVar.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, kVar.c);
        }
        if (b.F() || !jl40.l(kVar.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, kVar.d);
        }
        b.c(serialDescriptor);
    }
}
