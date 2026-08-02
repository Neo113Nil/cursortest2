package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes14.dex */
public final /* synthetic */ class jc11 implements uxs {
    public static final jc11 a;
    private static final SerialDescriptor descriptor;

    static {
        jc11 jc11Var = new jc11();
        a = jc11Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.notifications.tips.TransportingTipsNotificationExperiment", jc11Var, 9);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("arrival_time_left_sec", true);
        pluginGeneratedSerialDescriptor.j("arrival_time_left_percent", true);
        pluginGeneratedSerialDescriptor.j("button", true);
        pluginGeneratedSerialDescriptor.j("single_order_title_key", true);
        pluginGeneratedSerialDescriptor.j("multi_order_title_key", true);
        pluginGeneratedSerialDescriptor.j("text_key", true);
        pluginGeneratedSerialDescriptor.j("is_big_headsup", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        h6w h6wVar = h6w.a;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{vc11.k[0].getValue(), z96Var, qke.n(h6wVar), qke.n(h6wVar), lc11.e, auu0Var, auu0Var, auu0Var, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = vc11.k;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        Map map = null;
        Integer num = null;
        Integer num2 = null;
        tc11 tc11Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    map = (Map) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), map);
                    i |= 1;
                    break;
                case 1:
                    z2 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    num = (Integer) b.s(serialDescriptor, 2, h6w.a, num);
                    i |= 4;
                    break;
                case 3:
                    num2 = (Integer) b.s(serialDescriptor, 3, h6w.a, num2);
                    i |= 8;
                    break;
                case 4:
                    tc11Var = (tc11) b.A(serialDescriptor, 4, lc11.e, tc11Var);
                    i |= 16;
                    break;
                case 5:
                    str = b.k(serialDescriptor, 5);
                    i |= 32;
                    continue;
                case 6:
                    str2 = b.k(serialDescriptor, 6);
                    i |= 64;
                    continue;
                case 7:
                    str3 = b.k(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    z3 = b.C(serialDescriptor, 8);
                    i |= 256;
                    continue;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new vc11(i, map, z2, num, num2, tc11Var, str, str2, str3, z3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vc11 vc11Var = (vc11) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = vc11.k;
        if (b.F() || !jl40.l(vc11Var.b, b.f())) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), vc11Var.b);
        }
        if (b.F() || vc11Var.c) {
            b.n(serialDescriptor, 1, vc11Var.c);
        }
        if (b.F() || vc11Var.d != null) {
            b.g(serialDescriptor, 2, h6w.a, vc11Var.d);
        }
        if (b.F() || vc11Var.e != null) {
            b.g(serialDescriptor, 3, h6w.a, vc11Var.e);
        }
        if (b.F() || !jl40.l(vc11Var.f, sc11.INSTANCE)) {
            b.e(serialDescriptor, 4, lc11.e, vc11Var.f);
        }
        if (b.F() || !jl40.l(vc11Var.g, "")) {
            b.o(serialDescriptor, 5, vc11Var.g);
        }
        if (b.F() || !jl40.l(vc11Var.h, "")) {
            b.o(serialDescriptor, 6, vc11Var.h);
        }
        if (b.F() || !jl40.l(vc11Var.i, "")) {
            b.o(serialDescriptor, 7, vc11Var.i);
        }
        if (b.F() || vc11Var.j) {
            b.n(serialDescriptor, 8, vc11Var.j);
        }
        b.c(serialDescriptor);
    }
}
