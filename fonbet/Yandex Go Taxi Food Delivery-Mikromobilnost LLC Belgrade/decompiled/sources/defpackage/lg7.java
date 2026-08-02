package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class lg7 implements uxs {
    public static final lg7 a;
    private static final SerialDescriptor descriptor;

    static {
        lg7 lg7Var = new lg7();
        a = lg7Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.voip_calls.calls_go.CallConfigsArgs", lg7Var, 2);
        pluginGeneratedSerialDescriptor.j("voip_call_regs_connection_retry_config", false);
        pluginGeneratedSerialDescriptor.j("voip_call_hangup_confirmation_config", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{sri0.a, r6u.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        uri0 uri0Var = null;
        t6u t6uVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                uri0Var = (uri0) b.A(serialDescriptor, 0, sri0.a, uri0Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                t6uVar = (t6u) b.A(serialDescriptor, 1, r6u.a, t6uVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ng7(i, uri0Var, t6uVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ng7 ng7Var = (ng7) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, sri0.a, ng7Var.a);
        b.e(serialDescriptor, 1, r6u.a, ng7Var.b);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
