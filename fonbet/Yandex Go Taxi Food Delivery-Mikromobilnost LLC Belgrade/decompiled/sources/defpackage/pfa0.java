package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes9.dex */
public final /* synthetic */ class pfa0 implements uxs {
    public static final pfa0 a;
    private static final SerialDescriptor descriptor;

    static {
        pfa0 pfa0Var = new pfa0();
        a = pfa0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.gopayments.dto.request.PaymentParam", pfa0Var, 5);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("payment_method_id", true);
        pluginGeneratedSerialDescriptor.j("withdraw_amount", true);
        pluginGeneratedSerialDescriptor.j("has_limits", true);
        pluginGeneratedSerialDescriptor.j("complements", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = rfa0.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n(auu0Var), qke.n(auu0Var), qke.n(z96.a), qke.n((KSerializer) i3yVarArr[4].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = rfa0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        PaymentMethod$Type paymentMethod$Type = null;
        String str = null;
        String str2 = null;
        Boolean bool = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                paymentMethod$Type = (PaymentMethod$Type) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), paymentMethod$Type);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else if (v == 2) {
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            } else if (v == 3) {
                bool = (Boolean) b.s(serialDescriptor, 3, z96.a, bool);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new rfa0(i, paymentMethod$Type, str, str2, bool, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rfa0 rfa0Var = (rfa0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = rfa0.f;
        if (b.F() || rfa0Var.a != PaymentMethod$Type.CASH) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), rfa0Var.a);
        }
        if (b.F() || rfa0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, rfa0Var.b);
        }
        if (b.F() || rfa0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, rfa0Var.c);
        }
        if (b.F() || rfa0Var.d != null) {
            b.g(serialDescriptor, 3, z96.a, rfa0Var.d);
        }
        if (b.F() || rfa0Var.e != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), rfa0Var.e);
        }
        b.c(serialDescriptor);
    }
}
