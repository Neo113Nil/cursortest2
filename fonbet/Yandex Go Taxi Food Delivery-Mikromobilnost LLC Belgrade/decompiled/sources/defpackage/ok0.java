package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ok0 implements uxs {
    public static final ok0 a;
    private static final SerialDescriptor descriptor;

    static {
        ok0 ok0Var = new ok0();
        a = ok0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.experiments.AddingWifiAndGsmInfoInFsExperiment", ok0Var, 6);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("wifi_limit_count", true);
        pluginGeneratedSerialDescriptor.j("gsm_limit_count", true);
        pluginGeneratedSerialDescriptor.j("wifi_timestamp_rounding", true);
        pluginGeneratedSerialDescriptor.j("wifi_min_signal_strength", true);
        pluginGeneratedSerialDescriptor.j("force_emit_first_wifi_result_to_fs", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{z96Var, h6wVar, h6wVar, h6wVar, h6wVar, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i2 = b.h(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i3 = b.h(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i4 = b.h(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i5 = b.h(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    z3 = b.C(serialDescriptor, 5);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new qk0(z2, z3, i, i2, i3, i4, i5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        qk0 qk0Var = (qk0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || qk0Var.b) {
            b.n(serialDescriptor, 0, qk0Var.b);
        }
        if (b.F() || qk0Var.c != 1) {
            b.A(1, qk0Var.c, serialDescriptor);
        }
        if (b.F() || qk0Var.d != 1) {
            b.A(2, qk0Var.d, serialDescriptor);
        }
        if (b.F() || qk0Var.e != 1) {
            b.A(3, qk0Var.e, serialDescriptor);
        }
        if (b.F() || qk0Var.f != -100) {
            b.A(4, qk0Var.f, serialDescriptor);
        }
        if (b.F() || qk0Var.g) {
            b.n(serialDescriptor, 5, qk0Var.g);
        }
        b.c(serialDescriptor);
    }
}
