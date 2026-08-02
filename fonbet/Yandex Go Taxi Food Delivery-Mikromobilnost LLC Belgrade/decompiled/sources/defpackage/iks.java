package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.address.experiment.NextButtonShowStrategy;

/* loaded from: classes9.dex */
public final /* synthetic */ class iks implements uxs {
    public static final iks a;
    private static final SerialDescriptor descriptor;

    static {
        iks iksVar = new iks();
        a = iksVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.address.experiment.FullscreenSuggestsPointsABExperiment", iksVar, 12);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("forced_fullscreen", true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("source_icon", true);
        pluginGeneratedSerialDescriptor.j("destination_icon", true);
        pluginGeneratedSerialDescriptor.j("route_selector_source_title_key", true);
        pluginGeneratedSerialDescriptor.j("route_selector_destination_title_key", true);
        pluginGeneratedSerialDescriptor.j("pickup_title_key", true);
        pluginGeneratedSerialDescriptor.j("next_button_show_strategy", true);
        pluginGeneratedSerialDescriptor.j("next_button_text_key", true);
        pluginGeneratedSerialDescriptor.j("next_button_no_point_b_text_key", true);
        pluginGeneratedSerialDescriptor.j("expandable_transition_animation_enabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = kks.n;
        z96 z96Var = z96.a;
        kv0 kv0Var = kv0.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96Var, z96Var, i3yVarArr[2].getValue(), kv0Var, kv0Var, auu0Var, auu0Var, auu0Var, i3yVarArr[8].getValue(), auu0Var, auu0Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = kks.n;
        b.getClass();
        Object obj = null;
        boolean z = true;
        NextButtonShowStrategy nextButtonShowStrategy = null;
        Map map = null;
        mv0 mv0Var = null;
        mv0 mv0Var2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
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
                    map = (Map) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), map);
                    i |= 4;
                    break;
                case 3:
                    mv0Var = (mv0) b.A(serialDescriptor, 3, kv0.a, mv0Var);
                    i |= 8;
                    break;
                case 4:
                    mv0Var2 = (mv0) b.A(serialDescriptor, 4, kv0.a, mv0Var2);
                    i |= 16;
                    break;
                case 5:
                    str = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    str2 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    str3 = b.k(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    nextButtonShowStrategy = (NextButtonShowStrategy) b.A(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), nextButtonShowStrategy);
                    i |= 256;
                    break;
                case 9:
                    str4 = b.k(serialDescriptor, 9);
                    i |= 512;
                    break;
                case 10:
                    str5 = b.k(serialDescriptor, 10);
                    i |= 1024;
                    break;
                case 11:
                    z4 = b.C(serialDescriptor, 11);
                    i |= 2048;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new kks(i, z2, z3, map, mv0Var, mv0Var2, str, str2, str3, nextButtonShowStrategy, str4, str5, z4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kks kksVar = (kks) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = kks.n;
        if (b.F() || kksVar.b) {
            b.n(serialDescriptor, 0, kksVar.b);
        }
        if (b.F() || kksVar.c) {
            b.n(serialDescriptor, 1, kksVar.c);
        }
        if (b.F() || !jl40.l(kksVar.d, b.f())) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), kksVar.d);
        }
        if (b.F() || !jl40.l(kksVar.e, new mv0(0))) {
            b.e(serialDescriptor, 3, kv0.a, kksVar.e);
        }
        if (b.F() || !jl40.l(kksVar.f, new mv0(0))) {
            b.e(serialDescriptor, 4, kv0.a, kksVar.f);
        }
        if (b.F() || !jl40.l(kksVar.g, "")) {
            b.o(serialDescriptor, 5, kksVar.g);
        }
        if (b.F() || !jl40.l(kksVar.h, "")) {
            b.o(serialDescriptor, 6, kksVar.h);
        }
        if (b.F() || !jl40.l(kksVar.i, "")) {
            b.o(serialDescriptor, 7, kksVar.i);
        }
        if (b.F() || kksVar.j != NextButtonShowStrategy.NONE) {
            b.e(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), kksVar.j);
        }
        if (b.F() || !jl40.l(kksVar.k, "")) {
            b.o(serialDescriptor, 9, kksVar.k);
        }
        if (b.F() || !jl40.l(kksVar.l, "")) {
            b.o(serialDescriptor, 10, kksVar.l);
        }
        if (b.F() || kksVar.m) {
            b.n(serialDescriptor, 11, kksVar.m);
        }
        b.c(serialDescriptor);
    }
}
