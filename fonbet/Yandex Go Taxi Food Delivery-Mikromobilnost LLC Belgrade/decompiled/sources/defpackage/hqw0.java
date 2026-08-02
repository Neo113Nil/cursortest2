package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes6.dex */
public final /* synthetic */ class hqw0 implements uxs {
    public static final hqw0 a;
    private static final SerialDescriptor descriptor;

    static {
        hqw0 hqw0Var = new hqw0();
        a = hqw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeInfoContent", hqw0Var, 7);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("button", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("icon_color", true);
        pluginGeneratedSerialDescriptor.j("main_section", true);
        pluginGeneratedSerialDescriptor.j("bottom_section", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{w7sVar, w7sVar, cqw0.a, auu0Var, auu0Var, msw0.a, zpw0.a};
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
        eqw0 eqw0Var = null;
        String str = null;
        String str2 = null;
        osw0 osw0Var = null;
        bqw0 bqw0Var = null;
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
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText2);
                    i |= 2;
                    break;
                case 2:
                    eqw0Var = (eqw0) b.A(serialDescriptor, 2, cqw0.a, eqw0Var);
                    i |= 4;
                    break;
                case 3:
                    str = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str2 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    osw0Var = (osw0) b.A(serialDescriptor, 5, msw0.a, osw0Var);
                    i |= 32;
                    break;
                case 6:
                    bqw0Var = (bqw0) b.A(serialDescriptor, 6, zpw0.a, bqw0Var);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new jqw0(i, formattedText, formattedText2, eqw0Var, str, str2, osw0Var, bqw0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jqw0 jqw0Var = (jqw0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(jqw0Var.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, jqw0Var.a);
        }
        if (b.F() || !jl40.l(jqw0Var.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, jqw0Var.b);
        }
        if (b.F() || !jl40.l(jqw0Var.c, new eqw0(0))) {
            b.e(serialDescriptor, 2, cqw0.a, jqw0Var.c);
        }
        if (b.F() || !jl40.l(jqw0Var.d, "")) {
            b.o(serialDescriptor, 3, jqw0Var.d);
        }
        if (b.F() || !jl40.l(jqw0Var.e, "")) {
            b.o(serialDescriptor, 4, jqw0Var.e);
        }
        if (b.F() || !jl40.l(jqw0Var.f, new osw0(0))) {
            b.e(serialDescriptor, 5, msw0.a, jqw0Var.f);
        }
        if (b.F() || !jl40.l(jqw0Var.g, new bqw0(0))) {
            b.e(serialDescriptor, 6, zpw0.a, jqw0Var.g);
        }
        b.c(serialDescriptor);
    }
}
