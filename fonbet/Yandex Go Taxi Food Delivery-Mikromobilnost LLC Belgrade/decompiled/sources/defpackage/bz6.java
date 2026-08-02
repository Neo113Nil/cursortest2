package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class bz6 implements uxs {
    public static final bz6 a;
    private static final SerialDescriptor descriptor;

    static {
        bz6 bz6Var = new bz6();
        a = bz6Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.orderpopup.analytics.ButtonActionParams", bz6Var, 4);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("slider_percent", true);
        pluginGeneratedSerialDescriptor.j("slider_time_ms", true);
        pluginGeneratedSerialDescriptor.j(TarifficatorScenarioActivity.RESULT_KEY, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(h6w.a);
        KSerializer n2 = qke.n(pnz.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, n, n2, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Integer num = null;
        Long l = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                i |= 2;
            } else if (v == 2) {
                l = (Long) b.s(serialDescriptor, 2, pnz.a, l);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str2 = b.k(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new dz6(i, str, num, l, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        dz6 dz6Var = (dz6) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(dz6Var.a, "")) {
            b.o(serialDescriptor, 0, dz6Var.a);
        }
        if (b.F() || dz6Var.b != null) {
            b.g(serialDescriptor, 1, h6w.a, dz6Var.b);
        }
        if (b.F() || dz6Var.c != null) {
            b.g(serialDescriptor, 2, pnz.a, dz6Var.c);
        }
        if (b.F() || !jl40.l(dz6Var.d, "")) {
            b.o(serialDescriptor, 3, dz6Var.d);
        }
        b.c(serialDescriptor);
    }
}
