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
public final /* synthetic */ class gae0 implements uxs {
    public static final gae0 a;
    private static final SerialDescriptor descriptor;

    static {
        gae0 gae0Var = new gae0();
        a = gae0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.settings.experiments.PopupPushSettingsExperiment", gae0Var, 4);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("push_settings_popup", true);
        pluginGeneratedSerialDescriptor.j("push_disabled_popup", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, iae0.f[1].getValue(), d4g0.a, m1g0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = iae0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Map map = null;
        f4g0 f4g0Var = null;
        o1g0 o1g0Var = null;
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
                f4g0Var = (f4g0) b.A(serialDescriptor, 2, d4g0.a, f4g0Var);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                o1g0Var = (o1g0) b.A(serialDescriptor, 3, m1g0.a, o1g0Var);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new iae0(i, z2, map, f4g0Var, o1g0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        iae0 iae0Var = (iae0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = iae0.f;
        if (b.F() || iae0Var.b) {
            b.n(serialDescriptor, 0, iae0Var.b);
        }
        if (b.F() || !jl40.l(iae0Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), iae0Var.c);
        }
        if (b.F() || !jl40.l(iae0Var.d, new f4g0(0))) {
            b.e(serialDescriptor, 2, d4g0.a, iae0Var.d);
        }
        if (b.F() || !jl40.l(iae0Var.e, new o1g0(0))) {
            b.e(serialDescriptor, 3, m1g0.a, iae0Var.e);
        }
        b.c(serialDescriptor);
    }
}
