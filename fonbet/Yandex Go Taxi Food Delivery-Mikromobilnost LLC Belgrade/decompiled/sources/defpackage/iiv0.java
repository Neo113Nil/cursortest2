package defpackage;

import defpackage.kiv0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class iiv0 implements uxs {
    public static final iiv0 a;
    private static final SerialDescriptor descriptor;

    static {
        iiv0 iiv0Var = new iiv0();
        a = iiv0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.tooltips.experiment.SummaryMulticlassTooltipExperiment.TooltipConfig.ShowPolicy", iiv0Var, 2);
        pluginGeneratedSerialDescriptor.j("max_show_count", true);
        pluginGeneratedSerialDescriptor.j("max_show_count_per_session", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, qke.n(h6wVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        Integer num = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new kiv0.a.C0101a(i, i2, num);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kiv0.a.C0101a c0101a = (kiv0.a.C0101a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || c0101a.a != 0) {
            b.A(0, c0101a.a, serialDescriptor);
        }
        if (b.F() || c0101a.b != null) {
            b.g(serialDescriptor, 1, h6w.a, c0101a.b);
        }
        b.c(serialDescriptor);
    }
}
