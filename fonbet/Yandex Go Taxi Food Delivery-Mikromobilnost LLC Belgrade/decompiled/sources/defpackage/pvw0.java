package defpackage;

import defpackage.tvw0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class pvw0 implements uxs {
    public static final pvw0 a;
    private static final SerialDescriptor descriptor;

    static {
        pvw0 pvw0Var = new pvw0();
        a = pvw0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeShortcutModal", pvw0Var, 5);
        pluginGeneratedSerialDescriptor.j("show_policy", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("buttons_footer", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{qke.n(rvw0.a), w7sVar, w7sVar, auu0.a, o47.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        tvw0.a aVar = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        String str = null;
        r47 r47Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                aVar = (tvw0.a) b.s(serialDescriptor, 0, rvw0.a, aVar);
                i |= 1;
            } else if (v == 1) {
                formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                i |= 2;
            } else if (v == 2) {
                formattedText2 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText2);
                i |= 4;
            } else if (v == 3) {
                str = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                r47Var = (r47) b.A(serialDescriptor, 4, o47.a, r47Var);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new tvw0(i, aVar, formattedText, formattedText2, str, r47Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tvw0 tvw0Var = (tvw0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || tvw0Var.a != null) {
            b.g(serialDescriptor, 0, rvw0.a, tvw0Var.a);
        }
        if (b.F() || !jl40.l(tvw0Var.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, tvw0Var.b);
        }
        if (b.F() || !jl40.l(tvw0Var.c, FormattedText.c)) {
            b.e(serialDescriptor, 2, w7s.a, tvw0Var.c);
        }
        if (b.F() || !jl40.l(tvw0Var.d, "")) {
            b.o(serialDescriptor, 3, tvw0Var.d);
        }
        if (b.F() || !jl40.l(tvw0Var.e, new r47(0))) {
            b.e(serialDescriptor, 4, o47.a, tvw0Var.e);
        }
        b.c(serialDescriptor);
    }
}
