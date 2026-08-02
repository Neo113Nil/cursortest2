package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes14.dex */
public final /* synthetic */ class jv90 implements uxs {
    public static final jv90 a;
    private static final SerialDescriptor descriptor;

    static {
        jv90 jv90Var = new jv90();
        a = jv90Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.gopayments.dto.Payment", jv90Var, 4);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("payment_method_id", true);
        pluginGeneratedSerialDescriptor.j("withdrawAmount", true);
        pluginGeneratedSerialDescriptor.j("has_limits", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n((KSerializer) lv90.e[0].getValue());
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, qke.n(auu0Var), qke.n(auu0Var), qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = lv90.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        PaymentMethod$Type paymentMethod$Type = null;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                paymentMethod$Type = (PaymentMethod$Type) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), paymentMethod$Type);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                bool = (Boolean) b.s(serialDescriptor, 3, z96.a, bool);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new lv90(i, paymentMethod$Type, str, str2, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        lv90 lv90Var = (lv90) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = lv90.e;
        if (b.F() || lv90Var.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), lv90Var.a);
        }
        if (b.F() || lv90Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, lv90Var.b);
        }
        if (b.F() || lv90Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, lv90Var.c);
        }
        if (b.F() || lv90Var.d != null) {
            b.g(serialDescriptor, 3, z96.a, lv90Var.d);
        }
        b.c(serialDescriptor);
    }
}
