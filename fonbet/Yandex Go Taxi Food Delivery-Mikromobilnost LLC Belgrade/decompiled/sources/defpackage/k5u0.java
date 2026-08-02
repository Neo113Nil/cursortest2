package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.layers.api.StateRequirementsFailedType;

/* loaded from: classes5.dex */
public final /* synthetic */ class k5u0 implements uxs {
    public static final k5u0 a;
    private static final SerialDescriptor descriptor;

    static {
        k5u0 k5u0Var = new k5u0();
        a = k5u0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.layers.api.StateRequirementsError", k5u0Var, 2);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_MESSAGE, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) m5u0.c[0].getValue()), qke.n(n5u0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = m5u0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        StateRequirementsFailedType stateRequirementsFailedType = null;
        p5u0 p5u0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                stateRequirementsFailedType = (StateRequirementsFailedType) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), stateRequirementsFailedType);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                p5u0Var = (p5u0) b.s(serialDescriptor, 1, n5u0.a, p5u0Var);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new m5u0(i, stateRequirementsFailedType, p5u0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        m5u0 m5u0Var = (m5u0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = m5u0.c;
        if (b.F() || m5u0Var.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), m5u0Var.a);
        }
        if (b.F() || m5u0Var.b != null) {
            b.g(serialDescriptor, 1, n5u0.a, m5u0Var.b);
        }
        b.c(serialDescriptor);
    }
}
