package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes13.dex */
public final /* synthetic */ class lko0 implements uxs {
    public static final lko0 a;
    private static final SerialDescriptor descriptor;

    static {
        lko0 lko0Var = new lko0();
        a = lko0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.ScootersPollingTimeoutExperiment", lko0Var, 3);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("default_timeout_sec", true);
        pluginGeneratedSerialDescriptor.j("features", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, pnz.a, pko0.e[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = pko0.e;
        b.getClass();
        int i = 0;
        boolean z = false;
        long j = 0;
        List list = null;
        boolean z2 = true;
        while (z2) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z2 = false;
            } else if (v == 0) {
                z = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                j = b.f(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new pko0(i, j, list, z);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pko0 pko0Var = (pko0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = pko0.e;
        if (b.F() || pko0Var.b) {
            b.n(serialDescriptor, 0, pko0Var.b);
        }
        if (b.F() || pko0Var.c != 3600) {
            b.s(serialDescriptor, 1, pko0Var.c);
        }
        if (b.F() || !jl40.l(pko0Var.d, EmptyList.a)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), pko0Var.d);
        }
        b.c(serialDescriptor);
    }
}
