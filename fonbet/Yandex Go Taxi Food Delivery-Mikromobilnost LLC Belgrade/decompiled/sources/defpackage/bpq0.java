package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.b;

/* loaded from: classes12.dex */
public final /* synthetic */ class bpq0 implements uxs {
    public static final bpq0 a;
    private static final SerialDescriptor descriptor;

    static {
        bpq0 bpq0Var = new bpq0();
        a = bpq0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.sendnativepayloadaction.SendNativePayloadAction", bpq0Var, 2);
        pluginGeneratedSerialDescriptor.j("name", false);
        pluginGeneratedSerialDescriptor.j("payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n(rcx.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                bVar = (b) b.s(serialDescriptor, 1, rcx.a, bVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new dpq0(i, str, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        dpq0 dpq0Var = (dpq0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = dpq0Var.a;
        b bVar = dpq0Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || bVar != null) {
            b.g(serialDescriptor, 1, rcx.a, bVar);
        }
        b.c(serialDescriptor);
    }
}
