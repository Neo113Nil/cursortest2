package defpackage;

import defpackage.gwm0;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class jwm0 implements uxs {
    public static final jwm0 a;
    private static final SerialDescriptor descriptor;

    static {
        jwm0 jwm0Var = new jwm0();
        a = jwm0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersActivePassesWindowDto.SettingsSectionDto.SettingsElement.PaymentSettings.FreezeInfoDto", jwm0Var, 6);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("details", true);
        pluginGeneratedSerialDescriptor.j("reject_button_text", true);
        pluginGeneratedSerialDescriptor.j("confirm_button_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = gwm0.b.g;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, qke.n(w7sVar), auu0.a, i3yVarArr[3].getValue(), w7sVar, w7sVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = gwm0.b.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        String str = null;
        List list = null;
        FormattedText formattedText3 = null;
        FormattedText formattedText4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                    i |= 1;
                    break;
                case 1:
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText2);
                    i |= 2;
                    break;
                case 2:
                    str = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    formattedText3 = (FormattedText) b.A(serialDescriptor, 4, w7s.a, formattedText3);
                    i |= 16;
                    break;
                case 5:
                    formattedText4 = (FormattedText) b.A(serialDescriptor, 5, w7s.a, formattedText4);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new gwm0.b(i, formattedText, formattedText2, str, list, formattedText3, formattedText4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gwm0.b bVar = (gwm0.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = gwm0.b.g;
        if (b.F() || !jl40.l(bVar.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, bVar.a);
        }
        if (b.F() || bVar.b != null) {
            b.g(serialDescriptor, 1, w7s.a, bVar.b);
        }
        if (b.F() || !jl40.l(bVar.c, "")) {
            b.o(serialDescriptor, 2, bVar.c);
        }
        if (b.F() || !jl40.l(bVar.d, EmptyList.a)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), bVar.d);
        }
        if (b.F() || !jl40.l(bVar.e, FormattedText.c)) {
            b.e(serialDescriptor, 4, w7s.a, bVar.e);
        }
        if (b.F() || !jl40.l(bVar.f, FormattedText.c)) {
            b.e(serialDescriptor, 5, w7s.a, bVar.f);
        }
        b.c(serialDescriptor);
    }
}
