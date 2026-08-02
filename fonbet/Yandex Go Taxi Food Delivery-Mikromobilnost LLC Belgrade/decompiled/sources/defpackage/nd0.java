package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class nd0 implements uxs {
    public static final nd0 a;
    private static final SerialDescriptor descriptor;

    static {
        nd0 nd0Var = new nd0();
        a = nd0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiment.AddFavoriteScreenModalExperiment", nd0Var, 3);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("settings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = qd0.e;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = qd0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Map map = null;
        List list = null;
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
                list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new qd0(i, list, map, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qd0 qd0Var = (qd0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = qd0.e;
        if (b.F() || !qd0Var.b) {
            b.n(serialDescriptor, 0, qd0Var.b);
        }
        if (b.F() || !jl40.l(qd0Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), qd0Var.c);
        }
        if (b.F() || !jl40.l(qd0Var.d, EmptyList.a)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), qd0Var.d);
        }
        b.c(serialDescriptor);
    }
}
