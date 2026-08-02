package defpackage;

import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.yandex.plus.pay.api.google.model.GooglePlayPurchase;
import com.yandex.plus.pay.api.google.model.PurchaseState;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.CryptoPro.reprov.x509.X509CertImpl;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes2.dex */
public final /* synthetic */ class cwt implements uxs {
    public static final cwt a;
    private static final SerialDescriptor descriptor;

    static {
        cwt cwtVar = new cwt();
        a = cwtVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.api.google.model.GooglePlayPurchase", cwtVar, 8);
        pluginGeneratedSerialDescriptor.j(FinishFlowStatus.ORDER_ID_FIELD_NAME, false);
        pluginGeneratedSerialDescriptor.j("products", false);
        pluginGeneratedSerialDescriptor.j("originalJson", false);
        pluginGeneratedSerialDescriptor.j("jsonBase64", false);
        pluginGeneratedSerialDescriptor.j(X509CertImpl.SIGNATURE, false);
        pluginGeneratedSerialDescriptor.j(AuthSdkActivity.RESPONSE_TYPE_TOKEN, false);
        pluginGeneratedSerialDescriptor.j("acknowledge", false);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = GooglePlayPurchase.$childSerializers;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), i3yVarArr[1].getValue(), auu0Var, auu0Var, auu0Var, auu0Var, z96.a, i3yVarArr[7].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = GooglePlayPurchase.$childSerializers;
        b.getClass();
        Object obj = null;
        boolean z = true;
        PurchaseState purchaseState = null;
        String str = null;
        List list = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str3 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str4 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    str5 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    z2 = b.C(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    purchaseState = (PurchaseState) b.A(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), purchaseState);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new GooglePlayPurchase(i, str, list, str2, str3, str4, str5, z2, purchaseState, null);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        GooglePlayPurchase.write$Self$pay_sdk_api_release((GooglePlayPurchase) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
