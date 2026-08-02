package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes10.dex */
public final /* synthetic */ class eiv0 implements uxs {
    public static final eiv0 a;
    private static final SerialDescriptor descriptor;

    static {
        eiv0 eiv0Var = new eiv0();
        a = eiv0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.tooltips.experiment.SummaryMulticlassTooltipExperiment", eiv0Var, 3);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("tooltips", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = kiv0.e;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = kiv0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Map map = null;
        Map map2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                map2 = (Map) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), map2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new kiv0(i, z2, map, map2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        kiv0 kiv0Var = (kiv0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = kiv0.e;
        if (b.F() || kiv0Var.b) {
            b.n(serialDescriptor, 0, kiv0Var.b);
        }
        if (b.F() || !jl40.l(kiv0Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), kiv0Var.c);
        }
        if (b.F() || !jl40.l(kiv0Var.d, b.f())) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), kiv0Var.d);
        }
        b.c(serialDescriptor);
    }
}
