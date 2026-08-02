package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class jjr0 implements uxs {
    public static final jjr0 a;
    private static final SerialDescriptor descriptor;

    static {
        jjr0 jjr0Var = new jjr0();
        a = jjr0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.share_favorites.experiments.ShareCurrentLocationAndFavoritesExperiment", jjr0Var, 12);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("show_favorites_section", true);
        pluginGeneratedSerialDescriptor.j("share_link", true);
        pluginGeneratedSerialDescriptor.j("title_tk", true);
        pluginGeneratedSerialDescriptor.j("share_text_tk", true);
        pluginGeneratedSerialDescriptor.j("share_current_location_title_tk", true);
        pluginGeneratedSerialDescriptor.j("save_current_location_title_tk", true);
        pluginGeneratedSerialDescriptor.j("share_current_location_subtitle_tk", true);
        pluginGeneratedSerialDescriptor.j("save_current_location_subtitle_tk", true);
        pluginGeneratedSerialDescriptor.j("save_current_location_section_title_tk", true);
        pluginGeneratedSerialDescriptor.j("share_favorites_section_title_tk", true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ljr0.n;
        z96 z96Var = z96.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96Var, z96Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, auu0Var, i3yVarArr[11].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ljr0.n;
        b.getClass();
        Object obj = null;
        boolean z = true;
        Map map = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    z3 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str4 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str5 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str6 = b.k(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    str7 = b.k(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    str8 = b.k(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    str9 = b.k(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    map = (Map) b.A(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), map);
                    i |= 2048;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new ljr0(i, z2, z3, str, str2, str3, str4, str5, str6, str7, str8, str9, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ljr0 ljr0Var = (ljr0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ljr0.n;
        if (b.F() || ljr0Var.b) {
            b.n(serialDescriptor, 0, ljr0Var.b);
        }
        if (b.F() || ljr0Var.c) {
            b.n(serialDescriptor, 1, ljr0Var.c);
        }
        if (b.F() || !jl40.l(ljr0Var.d, "")) {
            b.o(serialDescriptor, 2, ljr0Var.d);
        }
        if (b.F() || !jl40.l(ljr0Var.e, "")) {
            b.o(serialDescriptor, 3, ljr0Var.e);
        }
        if (b.F() || !jl40.l(ljr0Var.f, "")) {
            b.o(serialDescriptor, 4, ljr0Var.f);
        }
        if (b.F() || !jl40.l(ljr0Var.g, "")) {
            b.o(serialDescriptor, 5, ljr0Var.g);
        }
        if (b.F() || !jl40.l(ljr0Var.h, "")) {
            b.o(serialDescriptor, 6, ljr0Var.h);
        }
        if (b.F() || !jl40.l(ljr0Var.i, "")) {
            b.o(serialDescriptor, 7, ljr0Var.i);
        }
        if (b.F() || !jl40.l(ljr0Var.j, "")) {
            b.o(serialDescriptor, 8, ljr0Var.j);
        }
        if (b.F() || !jl40.l(ljr0Var.k, "")) {
            b.o(serialDescriptor, 9, ljr0Var.k);
        }
        if (b.F() || !jl40.l(ljr0Var.l, "")) {
            b.o(serialDescriptor, 10, ljr0Var.l);
        }
        if (b.F() || !jl40.l(ljr0Var.m, b.f())) {
            b.e(serialDescriptor, 11, (KSerializer) i3yVarArr[11].getValue(), ljr0Var.m);
        }
        b.c(serialDescriptor);
    }
}
