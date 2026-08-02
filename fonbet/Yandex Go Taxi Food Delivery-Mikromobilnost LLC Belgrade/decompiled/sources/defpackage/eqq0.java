package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class eqq0 implements uxs {
    public static final eqq0 a;
    private static final SerialDescriptor descriptor;

    static {
        eqq0 eqq0Var = new eqq0();
        a = eqq0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.SendVerificationResultToCourierRequest", eqq0Var, 2);
        pluginGeneratedSerialDescriptor.j("verificationId", true);
        pluginGeneratedSerialDescriptor.j("isSuccess", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                bool = (Boolean) b.s(serialDescriptor, 1, z96.a, bool);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new gqq0(i, str, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        gqq0 gqq0Var = (gqq0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || gqq0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, gqq0Var.a);
        }
        if (b.F() || gqq0Var.b != null) {
            b.g(serialDescriptor, 1, z96.a, gqq0Var.b);
        }
        b.c(serialDescriptor);
    }
}
