package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.eatskit.dto.BleError;

/* loaded from: classes5.dex */
public final /* synthetic */ class hqq0 implements uxs {
    public static final hqq0 a;
    private static final SerialDescriptor descriptor;

    static {
        hqq0 hqq0Var = new hqq0();
        a = hqq0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.SendVerificationResultToCourierResponse", hqq0Var, 2);
        pluginGeneratedSerialDescriptor.j("success", true);
        pluginGeneratedSerialDescriptor.j("error", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(z96.a), qke.n((KSerializer) jqq0.c[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = jqq0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        Boolean bool = null;
        BleError bleError = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                bleError = (BleError) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), bleError);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new jqq0(i, bool, bleError);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jqq0 jqq0Var = (jqq0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = jqq0.c;
        if (b.F() || jqq0Var.a != null) {
            b.g(serialDescriptor, 0, z96.a, jqq0Var.a);
        }
        if (b.F() || jqq0Var.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), jqq0Var.b);
        }
        b.c(serialDescriptor);
    }
}
