package defpackage;

import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes12.dex */
public final /* synthetic */ class o2r0 implements uxs {
    public static final o2r0 a;
    private static final SerialDescriptor descriptor;

    static {
        o2r0 o2r0Var = new o2r0();
        a = o2r0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.fintechsdk.features.bdui.internal.presentation.action.yb.split.creditlimit.SetCreditLimitPurchaseSettingsAction", o2r0Var, 12);
        pluginGeneratedSerialDescriptor.j("cardId", false);
        pluginGeneratedSerialDescriptor.j("creditLengthInMonths", false);
        pluginGeneratedSerialDescriptor.j("externalId", false);
        pluginGeneratedSerialDescriptor.j("merchantId", false);
        pluginGeneratedSerialDescriptor.j("purchaseAmount", false);
        pluginGeneratedSerialDescriptor.j("purchaseCurrencyCode", false);
        pluginGeneratedSerialDescriptor.j("purchaseTimestampMs", false);
        pluginGeneratedSerialDescriptor.j("onFailure", true);
        pluginGeneratedSerialDescriptor.j("onInvalidSettings", true);
        pluginGeneratedSerialDescriptor.j("onSuccess", true);
        pluginGeneratedSerialDescriptor.j(FinishFlowStatus.ORDER_ID_FIELD_NAME, true);
        pluginGeneratedSerialDescriptor.j("splitId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = q2r0.m;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, h6w.a, auu0Var, auu0Var, e6m.a, auu0Var, pnz.a, qke.n((KSerializer) i3yVarArr[7].getValue()), qke.n((KSerializer) i3yVarArr[8].getValue()), qke.n((KSerializer) i3yVarArr[9].getValue()), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = q2r0.m;
        b.getClass();
        double d = 0.0d;
        long j = 0;
        String str = null;
        boolean z = true;
        vm50 vm50Var = null;
        vm50 vm50Var2 = null;
        vm50 vm50Var3 = null;
        String str2 = null;
        int i = 0;
        String str3 = null;
        int i2 = 0;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str3 = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i2 = b.h(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str4 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str5 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    d = b.E(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str6 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    j = b.f(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    vm50Var = (vm50) b.s(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), vm50Var);
                    i |= 128;
                    break;
                case 8:
                    vm50Var2 = (vm50) b.s(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), vm50Var2);
                    i |= 256;
                    break;
                case 9:
                    vm50Var3 = (vm50) b.s(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), vm50Var3);
                    i |= 512;
                    break;
                case 10:
                    str2 = (String) b.s(serialDescriptor, 10, auu0.a, str2);
                    i |= 1024;
                    break;
                case 11:
                    str = (String) b.s(serialDescriptor, 11, auu0.a, str);
                    i |= 2048;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new q2r0(i, str3, i2, str4, str5, d, str6, j, vm50Var, vm50Var2, vm50Var3, str2, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q2r0 q2r0Var = (q2r0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = q2r0.m;
        String str = q2r0Var.a;
        String str2 = q2r0Var.l;
        String str3 = q2r0Var.k;
        vm50 vm50Var = q2r0Var.j;
        vm50 vm50Var2 = q2r0Var.i;
        vm50 vm50Var3 = q2r0Var.h;
        b.o(serialDescriptor, 0, str);
        b.A(1, q2r0Var.b, serialDescriptor);
        b.o(serialDescriptor, 2, q2r0Var.c);
        b.o(serialDescriptor, 3, q2r0Var.d);
        b.E(serialDescriptor, 4, q2r0Var.e);
        b.o(serialDescriptor, 5, q2r0Var.f);
        b.s(serialDescriptor, 6, q2r0Var.g);
        if (b.F() || vm50Var3 != null) {
            b.g(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), vm50Var3);
        }
        if (b.F() || vm50Var2 != null) {
            b.g(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), vm50Var2);
        }
        if (b.F() || vm50Var != null) {
            b.g(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), vm50Var);
        }
        if (b.F() || str3 != null) {
            b.g(serialDescriptor, 10, auu0.a, str3);
        }
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 11, auu0.a, str2);
        }
        b.c(serialDescriptor);
    }
}
