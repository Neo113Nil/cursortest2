package defpackage;

import defpackage.p0p0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class n0p0 implements uxs {
    public static final n0p0 a;
    private static final SerialDescriptor descriptor;

    static {
        n0p0 n0p0Var = new n0p0();
        a = n0p0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersSuperPassUpsaleWindowDto.ButtonsTexts", n0p0Var, 4);
        pluginGeneratedSerialDescriptor.j("reject_and_book_button", true);
        pluginGeneratedSerialDescriptor.j("reject_and_go_button", true);
        pluginGeneratedSerialDescriptor.j("confirm_and_book_button", true);
        pluginGeneratedSerialDescriptor.j("confirm_and_go_button", true);
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
        return new p0p0.a(i, formattedText, formattedText2, formattedText3, formattedText4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p0p0.a aVar = (p0p0.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        o0p0 o0p0Var = p0p0.a.Companion;
        if (b.F() || !jl40.l(aVar.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, aVar.a);
        }
        if (b.F() || !jl40.l(aVar.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, aVar.b);
        }
        if (b.F() || !jl40.l(aVar.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, aVar.c);
        }
        if (b.F() || !jl40.l(aVar.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, aVar.d);
        }
        b.c(serialDescriptor);
    }
}
