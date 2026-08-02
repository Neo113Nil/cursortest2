package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class egf implements uxs {
    public static final egf a;
    private static final SerialDescriptor descriptor;

    static {
        egf egfVar = new egf();
        a = egfVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiments.CurrentLocationInSuggestsExperiment", egfVar, 9);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("title_tk", true);
        pluginGeneratedSerialDescriptor.j("subtitle_tk", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("always_visible", true);
        pluginGeneratedSerialDescriptor.j("sticky", true);
        pluginGeneratedSerialDescriptor.j("geo_tap", true);
        pluginGeneratedSerialDescriptor.j("replace_title_in_suggest_input", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = ggf.k;
        z96 z96Var = z96.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96Var, i3yVarArr[1].getValue(), auu0Var, auu0Var, auu0Var, z96Var, z96Var, z96Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ggf.k;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        Map map = null;
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
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
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
                    z3 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z4 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    z5 = b.C(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    z6 = b.C(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new ggf(i, z2, map, str, str2, str3, z3, z4, z5, z6);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ggf ggfVar = (ggf) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ggf.k;
        if (b.F() || ggfVar.b) {
            b.n(serialDescriptor, 0, ggfVar.b);
        }
        if (b.F() || !jl40.l(ggfVar.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), ggfVar.c);
        }
        if (b.F() || !jl40.l(ggfVar.d, "")) {
            b.o(serialDescriptor, 2, ggfVar.d);
        }
        if (b.F() || !jl40.l(ggfVar.e, "")) {
            b.o(serialDescriptor, 3, ggfVar.e);
        }
        if (b.F() || !jl40.l(ggfVar.f, "")) {
            b.o(serialDescriptor, 4, ggfVar.f);
        }
        if (b.F() || ggfVar.g) {
            b.n(serialDescriptor, 5, ggfVar.g);
        }
        if (b.F() || !ggfVar.h) {
            b.n(serialDescriptor, 6, ggfVar.h);
        }
        if (b.F() || !ggfVar.i) {
            b.n(serialDescriptor, 7, ggfVar.i);
        }
        if (b.F() || ggfVar.j) {
            b.n(serialDescriptor, 8, ggfVar.j);
        }
        b.c(serialDescriptor);
    }
}
