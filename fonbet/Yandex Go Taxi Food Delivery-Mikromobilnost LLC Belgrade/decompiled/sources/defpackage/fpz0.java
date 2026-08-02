package defpackage;

import defpackage.soz0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class fpz0 implements uxs {
    public static final fpz0 a;
    private static final SerialDescriptor descriptor;

    static {
        fpz0 fpz0Var = new fpz0();
        a = fpz0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.preorder.tollroad.data.TollRoadDialogExperiment.SkipModalThresholds", fpz0Var, 2);
        pluginGeneratedSerialDescriptor.j("road_time_abs_sec", true);
        pluginGeneratedSerialDescriptor.j("road_time_rel_percent", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(h6w.a), qke.n(e6m.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        Double d = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                num = (Integer) b.s(serialDescriptor, 0, h6w.a, num);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                d = (Double) b.s(serialDescriptor, 1, e6m.a, d);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new soz0.h(i, num, d);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        soz0.h hVar = (soz0.h) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || hVar.a != null) {
            b.g(serialDescriptor, 0, h6w.a, hVar.a);
        }
        if (b.F() || hVar.b != null) {
            b.g(serialDescriptor, 1, e6m.a, hVar.b);
        }
        b.c(serialDescriptor);
    }
}
