package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.n1o0;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes10.dex */
public final /* synthetic */ class j1o0 implements uxs {
    public static final j1o0 a;
    private static final SerialDescriptor descriptor;

    static {
        j1o0 j1o0Var = new j1o0();
        a = j1o0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.experiments.ScootersNewbieFlowExperiment", j1o0Var, 5);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("simplified_start_enabled", true);
        pluginGeneratedSerialDescriptor.j("initial_modal", true);
        pluginGeneratedSerialDescriptor.j("feedback_header", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = n1o0.g;
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, i3yVarArr[1].getValue(), z96Var, qke.n(o1o0.a), qke.n(l1o0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = n1o0.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        Map map = null;
        n1o0.b bVar = null;
        n1o0.a aVar = null;
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
            } else if (v == 2) {
                z3 = b.C(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                bVar = (n1o0.b) b.s(serialDescriptor, 3, o1o0.a, bVar);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                aVar = (n1o0.a) b.s(serialDescriptor, 4, l1o0.a, aVar);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new n1o0(i, z2, map, z3, bVar, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n1o0 n1o0Var = (n1o0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = n1o0.g;
        if (b.F() || n1o0Var.b) {
            b.n(serialDescriptor, 0, n1o0Var.b);
        }
        if (b.F() || !jl40.l(n1o0Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), n1o0Var.c);
        }
        if (b.F() || n1o0Var.d) {
            b.n(serialDescriptor, 2, n1o0Var.d);
        }
        if (b.F() || n1o0Var.e != null) {
            b.g(serialDescriptor, 3, o1o0.a, n1o0Var.e);
        }
        if (b.F() || n1o0Var.f != null) {
            b.g(serialDescriptor, 4, l1o0.a, n1o0Var.f);
        }
        b.c(serialDescriptor);
    }
}
