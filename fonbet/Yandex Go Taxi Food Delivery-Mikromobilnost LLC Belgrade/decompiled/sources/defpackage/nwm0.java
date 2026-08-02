package defpackage;

import com.yandex.go.scooters.passes.model.PassPayment;
import com.yandex.go.scooters.passes.model.PassPayment$$serializer;
import defpackage.gwm0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes6.dex */
public final /* synthetic */ class nwm0 implements uxs {
    public static final nwm0 a;
    private static final SerialDescriptor descriptor;

    static {
        nwm0 nwm0Var = new nwm0();
        a = nwm0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersActivePassesWindowDto.SettingsSectionDto.SettingsElement.PaymentSettings.PaymentInfoDto", nwm0Var, 12);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("card_text", true);
        pluginGeneratedSerialDescriptor.j("card_subtitle", true);
        pluginGeneratedSerialDescriptor.j("card_button_text", true);
        pluginGeneratedSerialDescriptor.j("autorenew_text", true);
        pluginGeneratedSerialDescriptor.j("payment_method", true);
        pluginGeneratedSerialDescriptor.j("autorenew", true);
        pluginGeneratedSerialDescriptor.j("autorenew_button_text", true);
        pluginGeneratedSerialDescriptor.j("close_button_text", true);
        pluginGeneratedSerialDescriptor.j("retry_button_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, qke.n(w7sVar), qke.n(w7sVar), w7sVar, qke.n(w7sVar), w7sVar, w7sVar, qke.n(PassPayment$$serializer.INSTANCE), z96.a, w7sVar, qke.n(w7sVar), qke.n(w7sVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        boolean z2 = true;
        FormattedText formattedText3 = null;
        int i = 0;
        FormattedText formattedText4 = null;
        FormattedText formattedText5 = null;
        FormattedText formattedText6 = null;
        FormattedText formattedText7 = null;
        FormattedText formattedText8 = null;
        FormattedText formattedText9 = null;
        FormattedText formattedText10 = null;
        PassPayment passPayment = null;
        boolean z3 = false;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    z = z2;
                    formattedText4 = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText4);
                    i |= 1;
                    break;
                case 1:
                    z = z2;
                    formattedText5 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText5);
                    i |= 2;
                    break;
                case 2:
                    z = z2;
                    formattedText6 = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText6);
                    i |= 4;
                    break;
                case 3:
                    z = z2;
                    formattedText7 = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText7);
                    i |= 8;
                    break;
                case 4:
                    z = z2;
                    formattedText8 = (FormattedText) b.s(serialDescriptor, 4, w7s.a, formattedText8);
                    i |= 16;
                    break;
                case 5:
                    z = z2;
                    formattedText9 = (FormattedText) b.A(serialDescriptor, 5, w7s.a, formattedText9);
                    i |= 32;
                    break;
                case 6:
                    z = z2;
                    formattedText10 = (FormattedText) b.A(serialDescriptor, 6, w7s.a, formattedText10);
                    i |= 64;
                    break;
                case 7:
                    z = z2;
                    passPayment = (PassPayment) b.s(serialDescriptor, 7, PassPayment$$serializer.INSTANCE, passPayment);
                    i |= 128;
                    break;
                case 8:
                    z3 = b.C(serialDescriptor, 8);
                    i |= 256;
                    continue;
                case 9:
                    z = z2;
                    formattedText3 = (FormattedText) b.A(serialDescriptor, 9, w7s.a, formattedText3);
                    i |= 512;
                    break;
                case 10:
                    z = z2;
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 10, w7s.a, formattedText2);
                    i |= 1024;
                    break;
                case 11:
                    z = z2;
                    formattedText = (FormattedText) b.s(serialDescriptor, 11, w7s.a, formattedText);
                    i |= 2048;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            z2 = z;
        }
        b.c(serialDescriptor);
        return new gwm0.c(i, formattedText4, formattedText5, formattedText6, formattedText7, formattedText8, formattedText9, formattedText10, passPayment, z3, formattedText3, formattedText2, formattedText);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gwm0.c cVar = (gwm0.c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(cVar.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, cVar.a);
        }
        if (b.F() || cVar.b != null) {
            b.g(serialDescriptor, 1, w7s.a, cVar.b);
        }
        if (b.F() || cVar.c != null) {
            b.g(serialDescriptor, 2, w7s.a, cVar.c);
        }
        if (b.F() || !jl40.l(cVar.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, cVar.d);
        }
        if (b.F() || cVar.e != null) {
            b.g(serialDescriptor, 4, w7s.a, cVar.e);
        }
        if (b.F() || !jl40.l(cVar.f, FormattedText.c)) {
            b.e(serialDescriptor, 5, w7s.a, cVar.f);
        }
        if (b.F() || !jl40.l(cVar.g, FormattedText.c)) {
            b.e(serialDescriptor, 6, w7s.a, cVar.g);
        }
        if (b.F() || cVar.h != null) {
            b.g(serialDescriptor, 7, PassPayment$$serializer.INSTANCE, cVar.h);
        }
        if (b.F() || cVar.i) {
            b.n(serialDescriptor, 8, cVar.i);
        }
        if (b.F() || !jl40.l(cVar.j, FormattedText.c)) {
            b.e(serialDescriptor, 9, w7s.a, cVar.j);
        }
        if (b.F() || cVar.k != null) {
            b.g(serialDescriptor, 10, w7s.a, cVar.k);
        }
        if (b.F() || cVar.l != null) {
            b.g(serialDescriptor, 11, w7s.a, cVar.l);
        }
        b.c(serialDescriptor);
    }
}
