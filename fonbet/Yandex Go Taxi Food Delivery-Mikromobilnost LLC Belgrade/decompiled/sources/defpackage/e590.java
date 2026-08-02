package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes6.dex */
public final /* synthetic */ class e590 implements uxs {
    public static final e590 a;
    private static final SerialDescriptor descriptor;

    static {
        e590 e590Var = new e590();
        a = e590Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.Packages", e590Var, 7);
        pluginGeneratedSerialDescriptor.j("groups", true);
        pluginGeneratedSerialDescriptor.j("entrypoint", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("active_passes", true);
        pluginGeneratedSerialDescriptor.j("purchase_window", true);
        pluginGeneratedSerialDescriptor.j("upsale_window", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n((KSerializer) g590.h[0].getValue());
        KSerializer n2 = qke.n(y3o.a);
        KSerializer n3 = qke.n(t20.a);
        KSerializer n4 = qke.n(c9o0.a);
        KSerializer n5 = qke.n(ebo0.a);
        w7s w7sVar = w7s.a;
        return new KSerializer[]{n, n2, w7sVar, w7sVar, n3, n4, n5};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = g590.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        List list = null;
        b4o b4oVar = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        v20 v20Var = null;
        f9o0 f9o0Var = null;
        hbo0 hbo0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    list = (List) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    b4oVar = (b4o) b.s(serialDescriptor, 1, y3o.a, b4oVar);
                    i |= 2;
                    break;
                case 2:
                    formattedText = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText);
                    i |= 4;
                    break;
                case 3:
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText2);
                    i |= 8;
                    break;
                case 4:
                    v20Var = (v20) b.s(serialDescriptor, 4, t20.a, v20Var);
                    i |= 16;
                    break;
                case 5:
                    f9o0Var = (f9o0) b.s(serialDescriptor, 5, c9o0.a, f9o0Var);
                    i |= 32;
                    break;
                case 6:
                    hbo0Var = (hbo0) b.s(serialDescriptor, 6, ebo0.a, hbo0Var);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new g590(i, list, b4oVar, formattedText, formattedText2, v20Var, f9o0Var, hbo0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g590 g590Var = (g590) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = g590.h;
        if (b.F() || g590Var.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), g590Var.a);
        }
        if (b.F() || g590Var.b != null) {
            b.g(serialDescriptor, 1, y3o.a, g590Var.b);
        }
        if (b.F() || !jl40.l(g590Var.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, g590Var.c);
        }
        if (b.F() || !jl40.l(g590Var.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, g590Var.d);
        }
        if (b.F() || g590Var.e != null) {
            b.g(serialDescriptor, 4, t20.a, g590Var.e);
        }
        if (b.F() || g590Var.f != null) {
            b.g(serialDescriptor, 5, c9o0.a, g590Var.f);
        }
        if (b.F() || g590Var.g != null) {
            b.g(serialDescriptor, 6, ebo0.a, g590Var.g);
        }
        b.c(serialDescriptor);
    }
}
