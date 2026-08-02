package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class byz0 implements uxs {
    public static final byz0 a;
    private static final SerialDescriptor descriptor;

    static {
        byz0 byz0Var = new byz0();
        a = byz0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.data.mb.dto.TopupScreenDto", byz0Var, 2);
        pluginGeneratedSerialDescriptor.j("actionScenario", false);
        pluginGeneratedSerialDescriptor.j("autoTopUpUrls", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n(gyz0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        iyz0 iyz0Var = null;
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
                iyz0Var = (iyz0) b.s(serialDescriptor, 1, gyz0.a, iyz0Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new jyz0(i, str, iyz0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jyz0 jyz0Var = (jyz0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        String str = jyz0Var.a;
        iyz0 iyz0Var = jyz0Var.b;
        b.o(serialDescriptor, 0, str);
        if (b.F() || iyz0Var != null) {
            b.g(serialDescriptor, 1, gyz0.a, iyz0Var);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
