package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.eatskit.dto.PaymentMethodType;

/* loaded from: classes5.dex */
public final /* synthetic */ class o65 implements uxs {
    public static final o65 a;
    private static final SerialDescriptor descriptor;

    static {
        o65 o65Var = new o65();
        a = o65Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.BasePaymentMethod", o65Var, 2);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("type", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), q65.c[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = q65.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        PaymentMethodType paymentMethodType = null;
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
                paymentMethodType = (PaymentMethodType) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), paymentMethodType);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new q65(i, str, paymentMethodType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q65 q65Var = (q65) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = q65.c;
        if (b.F() || q65Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, q65Var.a);
        }
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), q65Var.b);
        b.c(serialDescriptor);
    }
}
