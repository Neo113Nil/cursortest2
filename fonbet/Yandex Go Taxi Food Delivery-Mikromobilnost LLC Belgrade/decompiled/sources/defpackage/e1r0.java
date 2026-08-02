package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class e1r0 implements uxs {
    public static final e1r0 a;
    private static final SerialDescriptor descriptor;

    static {
        e1r0 e1r0Var = new e1r0();
        a = e1r0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.SessionSegmentInfoSpecials", e1r0Var, 7);
        pluginGeneratedSerialDescriptor.j("total_price", true);
        pluginGeneratedSerialDescriptor.j("total_price_hr", true);
        pluginGeneratedSerialDescriptor.j("total_duration", true);
        pluginGeneratedSerialDescriptor.j("free_time", true);
        pluginGeneratedSerialDescriptor.j("current_offer", true);
        pluginGeneratedSerialDescriptor.j("durations_by_tags", true);
        pluginGeneratedSerialDescriptor.j("remaining_pass_minutes_count", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{qke.n(h6wVar), qke.n(auu0.a), qke.n(h6wVar), qke.n(h6wVar), qke.n(k1r0.a), qke.n(h1r0.a), qke.n(pnz.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        String str = null;
        Integer num2 = null;
        Integer num3 = null;
        m1r0 m1r0Var = null;
        j1r0 j1r0Var = null;
        Long l = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    num = (Integer) b.s(serialDescriptor, 0, h6w.a, num);
                    i |= 1;
                    break;
                case 1:
                    str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                    i |= 2;
                    break;
                case 2:
                    num2 = (Integer) b.s(serialDescriptor, 2, h6w.a, num2);
                    i |= 4;
                    break;
                case 3:
                    num3 = (Integer) b.s(serialDescriptor, 3, h6w.a, num3);
                    i |= 8;
                    break;
                case 4:
                    m1r0Var = (m1r0) b.s(serialDescriptor, 4, k1r0.a, m1r0Var);
                    i |= 16;
                    break;
                case 5:
                    j1r0Var = (j1r0) b.s(serialDescriptor, 5, h1r0.a, j1r0Var);
                    i |= 32;
                    break;
                case 6:
                    l = (Long) b.s(serialDescriptor, 6, pnz.a, l);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new g1r0(i, num, str, num2, num3, m1r0Var, j1r0Var, l);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g1r0 g1r0Var = (g1r0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || g1r0Var.a != null) {
            b.g(serialDescriptor, 0, h6w.a, g1r0Var.a);
        }
        if (b.F() || g1r0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, g1r0Var.b);
        }
        if (b.F() || g1r0Var.c != null) {
            b.g(serialDescriptor, 2, h6w.a, g1r0Var.c);
        }
        if (b.F() || g1r0Var.d != null) {
            b.g(serialDescriptor, 3, h6w.a, g1r0Var.d);
        }
        if (b.F() || g1r0Var.e != null) {
            b.g(serialDescriptor, 4, k1r0.a, g1r0Var.e);
        }
        if (b.F() || g1r0Var.f != null) {
            b.g(serialDescriptor, 5, h1r0.a, g1r0Var.f);
        }
        if (b.F() || g1r0Var.g != null) {
            b.g(serialDescriptor, 6, pnz.a, g1r0Var.g);
        }
        b.c(serialDescriptor);
    }
}
