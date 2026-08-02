package defpackage;

import defpackage.jfo0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes6.dex */
public final /* synthetic */ class mfo0 implements uxs {
    public static final mfo0 a;
    private static final SerialDescriptor descriptor;

    static {
        mfo0 mfo0Var = new mfo0();
        a = mfo0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersPassesPurchaseWindowDto.PassSelectionSection.PassElement", mfo0Var, 10);
        pluginGeneratedSerialDescriptor.j("pass_id", true);
        pluginGeneratedSerialDescriptor.j("pass_title", true);
        pluginGeneratedSerialDescriptor.j("pass_subtitle", true);
        pluginGeneratedSerialDescriptor.j("price_title", true);
        pluginGeneratedSerialDescriptor.j("price_subtitle", true);
        pluginGeneratedSerialDescriptor.j("confirm_button", true);
        pluginGeneratedSerialDescriptor.j("price", true);
        pluginGeneratedSerialDescriptor.j("package_discount", true);
        pluginGeneratedSerialDescriptor.j("trial_period", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{auu0.a, w7sVar, qke.n(w7sVar), w7sVar, qke.n(w7sVar), ofo0.a, qke.n(qfo0.a), qke.n(h6w.a), qke.n(sfo0.a), qke.n(w7sVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        FormattedText formattedText = null;
        boolean z = true;
        jfo0.b.a.c cVar = null;
        int i = 0;
        String str = null;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        FormattedText formattedText4 = null;
        FormattedText formattedText5 = null;
        jfo0.b.a.C0097a c0097a = null;
        jfo0.b.a.C0098b c0098b = null;
        Integer num = null;
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
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText2);
                    i |= 2;
                    break;
                case 2:
                    formattedText3 = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText3);
                    i |= 4;
                    break;
                case 3:
                    formattedText4 = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText4);
                    i |= 8;
                    break;
                case 4:
                    formattedText5 = (FormattedText) b.s(serialDescriptor, 4, w7s.a, formattedText5);
                    i |= 16;
                    break;
                case 5:
                    c0097a = (jfo0.b.a.C0097a) b.A(serialDescriptor, 5, ofo0.a, c0097a);
                    i |= 32;
                    break;
                case 6:
                    c0098b = (jfo0.b.a.C0098b) b.s(serialDescriptor, 6, qfo0.a, c0098b);
                    i |= 64;
                    break;
                case 7:
                    num = (Integer) b.s(serialDescriptor, 7, h6w.a, num);
                    i |= 128;
                    break;
                case 8:
                    cVar = (jfo0.b.a.c) b.s(serialDescriptor, 8, sfo0.a, cVar);
                    i |= 256;
                    break;
                case 9:
                    formattedText = (FormattedText) b.s(serialDescriptor, 9, w7s.a, formattedText);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new jfo0.b.a(i, str, formattedText2, formattedText3, formattedText4, formattedText5, c0097a, c0098b, num, cVar, formattedText);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jfo0.b.a aVar = (jfo0.b.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(aVar.a, "")) {
            b.o(serialDescriptor, 0, aVar.a);
        }
        if (b.F() || !jl40.l(aVar.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, aVar.b);
        }
        if (b.F() || aVar.c != null) {
            b.g(serialDescriptor, 2, w7s.a, aVar.c);
        }
        if (b.F() || !jl40.l(aVar.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, aVar.d);
        }
        if (b.F() || aVar.e != null) {
            b.g(serialDescriptor, 4, w7s.a, aVar.e);
        }
        if (b.F() || !jl40.l(aVar.f, new jfo0.b.a.C0097a(0))) {
            b.e(serialDescriptor, 5, ofo0.a, aVar.f);
        }
        if (b.F() || aVar.g != null) {
            b.g(serialDescriptor, 6, qfo0.a, aVar.g);
        }
        if (b.F() || aVar.h != null) {
            b.g(serialDescriptor, 7, h6w.a, aVar.h);
        }
        if (b.F() || aVar.i != null) {
            b.g(serialDescriptor, 8, sfo0.a, aVar.i);
        }
        if (b.F() || aVar.j != null) {
            b.g(serialDescriptor, 9, w7s.a, aVar.j);
        }
        b.c(serialDescriptor);
    }
}
