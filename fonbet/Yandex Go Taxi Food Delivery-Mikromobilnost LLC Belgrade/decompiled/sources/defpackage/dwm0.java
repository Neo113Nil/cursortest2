package defpackage;

import defpackage.gwm0;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class dwm0 implements uxs {
    public static final dwm0 a;
    private static final SerialDescriptor descriptor;

    static {
        dwm0 dwm0Var = new dwm0();
        a = dwm0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersActivePassesWindowDto.SettingsSectionDto.SettingsElement.PaymentSettings.AutorenewInfoDto", dwm0Var, 5);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("details", true);
        pluginGeneratedSerialDescriptor.j("close_button_text", true);
        pluginGeneratedSerialDescriptor.j("confirm_button_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = gwm0.a.f;
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, qke.n(w7sVar), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n(w7sVar), qke.n(w7sVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = gwm0.a.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
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
                formattedText2 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText2);
                i |= 2;
            } else if (v == 2) {
                list = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            } else if (v == 3) {
                formattedText3 = (FormattedText) b.s(serialDescriptor, 3, w7s.a, formattedText3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                formattedText4 = (FormattedText) b.s(serialDescriptor, 4, w7s.a, formattedText4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new gwm0.a(i, list, formattedText, formattedText2, formattedText3, formattedText4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gwm0.a aVar = (gwm0.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = gwm0.a.f;
        if (b.F() || !jl40.l(aVar.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, aVar.a);
        }
        if (b.F() || aVar.b != null) {
            b.g(serialDescriptor, 1, w7s.a, aVar.b);
        }
        if (b.F() || aVar.c != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), aVar.c);
        }
        if (b.F() || aVar.d != null) {
            b.g(serialDescriptor, 3, w7s.a, aVar.d);
        }
        if (b.F() || aVar.e != null) {
            b.g(serialDescriptor, 4, w7s.a, aVar.e);
        }
        b.c(serialDescriptor);
    }
}
