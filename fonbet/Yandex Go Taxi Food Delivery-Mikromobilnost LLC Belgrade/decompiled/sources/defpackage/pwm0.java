package defpackage;

import defpackage.gwm0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes6.dex */
public final /* synthetic */ class pwm0 implements uxs {
    public static final pwm0 a;
    private static final SerialDescriptor descriptor;

    static {
        pwm0 pwm0Var = new pwm0();
        a = pwm0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersActivePassesWindowDto.SettingsSectionDto.SettingsElement.PaymentSettings.WinbackInfoDto", pwm0Var, 8);
        pluginGeneratedSerialDescriptor.j("pass_title", true);
        pluginGeneratedSerialDescriptor.j("pass_subtitle", true);
        pluginGeneratedSerialDescriptor.j("price_title", true);
        pluginGeneratedSerialDescriptor.j("price_subtitle", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("reject_button_text", true);
        pluginGeneratedSerialDescriptor.j("confirm_button_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, qke.n(w7sVar), w7sVar, qke.n(w7sVar), qke.n(auu0.a), qke.n(w7sVar), w7sVar, w7sVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        FormattedText formattedText4 = null;
        String str = null;
        FormattedText formattedText5 = null;
        FormattedText formattedText6 = null;
        FormattedText formattedText7 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                    i |= 1;
                    break;
                case 1:
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText2);
                    i |= 2;
                    break;
                case 2:
                    formattedText3 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText3);
                    i |= 4;
                    break;
                case 3:
                    formattedText4 = (FormattedText) b.s(serialDescriptor, 3, w7s.a, formattedText4);
                    i |= 8;
                    break;
                case 4:
                    str = (String) b.s(serialDescriptor, 4, auu0.a, str);
                    i |= 16;
                    break;
                case 5:
                    formattedText5 = (FormattedText) b.s(serialDescriptor, 5, w7s.a, formattedText5);
                    i |= 32;
                    break;
                case 6:
                    formattedText6 = (FormattedText) b.A(serialDescriptor, 6, w7s.a, formattedText6);
                    i |= 64;
                    break;
                case 7:
                    formattedText7 = (FormattedText) b.A(serialDescriptor, 7, w7s.a, formattedText7);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new gwm0.d(i, formattedText, formattedText2, formattedText3, formattedText4, str, formattedText5, formattedText6, formattedText7);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gwm0.d dVar = (gwm0.d) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(dVar.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, dVar.a);
        }
        if (b.F() || dVar.b != null) {
            b.g(serialDescriptor, 1, w7s.a, dVar.b);
        }
        if (b.F() || !jl40.l(dVar.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, dVar.c);
        }
        if (b.F() || dVar.d != null) {
            b.g(serialDescriptor, 3, w7s.a, dVar.d);
        }
        if (b.F() || dVar.e != null) {
            b.g(serialDescriptor, 4, auu0.a, dVar.e);
        }
        if (b.F() || dVar.f != null) {
            b.g(serialDescriptor, 5, w7s.a, dVar.f);
        }
        if (b.F() || !jl40.l(dVar.g, FormattedText.c)) {
            b.e(serialDescriptor, 6, w7s.a, dVar.g);
        }
        if (b.F() || !jl40.l(dVar.h, FormattedText.c)) {
            b.e(serialDescriptor, 7, w7s.a, dVar.h);
        }
        b.c(serialDescriptor);
    }
}
