package defpackage;

import com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.metainfo.response.SimplifiedPaymentStatus;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class i180 implements uxs {
    public static final i180 a;
    private static final SerialDescriptor descriptor;

    static {
        i180 i180Var = new i180();
        a = i180Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.metainfo.response.OrderMetaInfoResponseDto", i180Var, 7);
        pluginGeneratedSerialDescriptor.j("full_payment_url", false);
        pluginGeneratedSerialDescriptor.j("merchant_id", false);
        pluginGeneratedSerialDescriptor.j("order_token", false);
        pluginGeneratedSerialDescriptor.j("can_be_anonymous", true);
        pluginGeneratedSerialDescriptor.j("simplified_current_status", true);
        pluginGeneratedSerialDescriptor.j("simplified_status", true);
        pluginGeneratedSerialDescriptor.j("return_url", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = k180.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, auu0Var, z96.a, qke.n((KSerializer) i3yVarArr[4].getValue()), qke.n((KSerializer) i3yVarArr[5].getValue()), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = k180.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        SimplifiedPaymentStatus simplifiedPaymentStatus = null;
        SimplifiedPaymentStatus simplifiedPaymentStatus2 = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z2 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    simplifiedPaymentStatus = (SimplifiedPaymentStatus) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), simplifiedPaymentStatus);
                    i |= 16;
                    break;
                case 5:
                    simplifiedPaymentStatus2 = (SimplifiedPaymentStatus) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), simplifiedPaymentStatus2);
                    i |= 32;
                    break;
                case 6:
                    str4 = (String) b.s(serialDescriptor, 6, auu0.a, str4);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new k180(i, str, str2, str3, z2, simplifiedPaymentStatus, simplifiedPaymentStatus2, str4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        k180 k180Var = (k180) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = k180.h;
        String str = k180Var.a;
        String str2 = k180Var.g;
        SimplifiedPaymentStatus simplifiedPaymentStatus = k180Var.f;
        SimplifiedPaymentStatus simplifiedPaymentStatus2 = k180Var.e;
        boolean z = k180Var.d;
        b.o(serialDescriptor, 0, str);
        b.o(serialDescriptor, 1, k180Var.b);
        b.o(serialDescriptor, 2, k180Var.c);
        if (b.F() || z) {
            b.n(serialDescriptor, 3, z);
        }
        if (b.F() || simplifiedPaymentStatus2 != null) {
            b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), simplifiedPaymentStatus2);
        }
        if (b.F() || simplifiedPaymentStatus != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), simplifiedPaymentStatus);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 6, auu0.a, str2);
        }
        b.c(serialDescriptor);
    }
}
