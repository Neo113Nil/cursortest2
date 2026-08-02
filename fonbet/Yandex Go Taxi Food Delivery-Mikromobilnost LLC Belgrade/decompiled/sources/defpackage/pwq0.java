package defpackage;

import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class pwq0 implements uxs {
    public static final pwq0 a;
    private static final SerialDescriptor descriptor;

    static {
        pwq0 pwq0Var = new pwq0();
        a = pwq0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.ServiceOrder", pwq0Var, 5);
        pluginGeneratedSerialDescriptor.j(FinishFlowStatus.ORDER_ID_FIELD_NAME, true);
        pluginGeneratedSerialDescriptor.j("paymentMethod", true);
        pluginGeneratedSerialDescriptor.j("orderItemIds", true);
        pluginGeneratedSerialDescriptor.j("shopId", true);
        pluginGeneratedSerialDescriptor.j("shouldCloseService", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = rwq0.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(o65.a), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n(auu0Var), qke.n(z96.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = rwq0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        q65 q65Var = null;
        List list = null;
        String str2 = null;
        Boolean bool = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                q65Var = (q65) b.s(serialDescriptor, 1, o65.a, q65Var);
                i |= 2;
            } else if (v == 2) {
                list = (List) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            } else if (v == 3) {
                str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                bool = (Boolean) b.s(serialDescriptor, 4, z96.a, bool);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new rwq0(i, str, q65Var, list, str2, bool);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        rwq0 rwq0Var = (rwq0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = rwq0.f;
        if (b.F() || rwq0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, rwq0Var.a);
        }
        if (b.F() || rwq0Var.b != null) {
            b.g(serialDescriptor, 1, o65.a, rwq0Var.b);
        }
        if (b.F() || rwq0Var.c != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), rwq0Var.c);
        }
        if (b.F() || rwq0Var.d != null) {
            b.g(serialDescriptor, 3, auu0.a, rwq0Var.d);
        }
        if (b.F() || rwq0Var.e != null) {
            b.g(serialDescriptor, 4, z96.a, rwq0Var.e);
        }
        b.c(serialDescriptor);
    }
}
