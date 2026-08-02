package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes6.dex */
public final /* synthetic */ class a7s0 implements uxs {
    public static final a7s0 a;
    private static final SerialDescriptor descriptor;

    static {
        a7s0 a7s0Var = new a7s0();
        a = a7s0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.checkout.model.ShowModalInfoAction", a7s0Var, 6);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("button", true);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("spot_color", true);
        pluginGeneratedSerialDescriptor.j(CRLReasonCodeExtension.REASON, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        KSerializer n = qke.n(w7sVar);
        KSerializer n2 = qke.n(w7sVar);
        KSerializer n3 = qke.n(ox20.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, n2, n3, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var)};
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
        qx20 qx20Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    formattedText = (FormattedText) b.s(serialDescriptor, 0, w7s.a, formattedText);
                    i |= 1;
                    break;
                case 1:
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText2);
                    i |= 2;
                    break;
                case 2:
                    qx20Var = (qx20) b.s(serialDescriptor, 2, ox20.a, qx20Var);
                    i |= 4;
                    break;
                case 3:
                    str = (String) b.s(serialDescriptor, 3, auu0.a, str);
                    i |= 8;
                    break;
                case 4:
                    str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                    i |= 16;
                    break;
                case 5:
                    str3 = (String) b.s(serialDescriptor, 5, auu0.a, str3);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new c7s0(i, formattedText, formattedText2, qx20Var, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c7s0 c7s0Var = (c7s0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || c7s0Var.a != null) {
            b.g(serialDescriptor, 0, w7s.a, c7s0Var.a);
        }
        if (b.F() || c7s0Var.b != null) {
            b.g(serialDescriptor, 1, w7s.a, c7s0Var.b);
        }
        if (b.F() || c7s0Var.c != null) {
            b.g(serialDescriptor, 2, ox20.a, c7s0Var.c);
        }
        if (b.F() || c7s0Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, c7s0Var.d);
        }
        if (b.F() || c7s0Var.e != null) {
            b.g(serialDescriptor, 4, auu0.a, c7s0Var.e);
        }
        if (b.F() || c7s0Var.f != null) {
            b.g(serialDescriptor, 5, auu0.a, c7s0Var.f);
        }
        b.c(serialDescriptor);
    }
}
