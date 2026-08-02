package defpackage;

import defpackage.gwm0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class cwm0 implements uxs {
    public static final cwm0 a;
    private static final SerialDescriptor descriptor;

    static {
        cwm0 cwm0Var = new cwm0();
        a = cwm0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersActivePassesWindowDto.SettingsSectionDto.SettingsElement.PaymentSettings", cwm0Var, 8);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("background_color", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("payment_info", true);
        pluginGeneratedSerialDescriptor.j("autorenew_info", true);
        pluginGeneratedSerialDescriptor.j("freeze_info", true);
        pluginGeneratedSerialDescriptor.j("winback_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        KSerializer n = qke.n(w7sVar);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{w7sVar, n, qke.n(auu0Var), qke.n(auu0Var), nwm0.a, dwm0.a, qke.n(jwm0.a), qke.n(pwm0.a)};
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
        String str = null;
        String str2 = null;
        gwm0.c cVar = null;
        gwm0.a aVar = null;
        gwm0.b bVar = null;
        gwm0.d dVar = null;
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
                    str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                    i |= 8;
                    break;
                case 4:
                    cVar = (gwm0.c) b.A(serialDescriptor, 4, nwm0.a, cVar);
                    i |= 16;
                    break;
                case 5:
                    aVar = (gwm0.a) b.A(serialDescriptor, 5, dwm0.a, aVar);
                    i |= 32;
                    break;
                case 6:
                    bVar = (gwm0.b) b.s(serialDescriptor, 6, jwm0.a, bVar);
                    i |= 64;
                    break;
                case 7:
                    dVar = (gwm0.d) b.s(serialDescriptor, 7, pwm0.a, dVar);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new gwm0(i, formattedText, formattedText2, str, str2, cVar, aVar, bVar, dVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gwm0 gwm0Var = (gwm0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(gwm0Var.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, gwm0Var.a);
        }
        if (b.F() || gwm0Var.b != null) {
            b.g(serialDescriptor, 1, w7s.a, gwm0Var.b);
        }
        if (b.F() || gwm0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, gwm0Var.c);
        }
        if (b.F() || gwm0Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, gwm0Var.d);
        }
        if (b.F() || !jl40.l(gwm0Var.e, new gwm0.c(0))) {
            b.e(serialDescriptor, 4, nwm0.a, gwm0Var.e);
        }
        if (b.F() || !jl40.l(gwm0Var.f, new gwm0.a(0))) {
            b.e(serialDescriptor, 5, dwm0.a, gwm0Var.f);
        }
        if (b.F() || gwm0Var.g != null) {
            b.g(serialDescriptor, 6, jwm0.a, gwm0Var.g);
        }
        if (b.F() || gwm0Var.h != null) {
            b.g(serialDescriptor, 7, pwm0.a, gwm0Var.h);
        }
        b.c(serialDescriptor);
    }
}
