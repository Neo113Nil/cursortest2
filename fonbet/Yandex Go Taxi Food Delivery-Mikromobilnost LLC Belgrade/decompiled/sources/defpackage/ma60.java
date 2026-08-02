package defpackage;

import android.net.Uri;
import com.ybsdk.feature.nfc.api.models.NfcPaymentMethod;
import com.ybsdk.feature.nfc.api.models.NfcTokenizationSource;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;

/* loaded from: classes9.dex */
public final class ma60 {
    public static DeeplinkAction.ShowNfcTokenization a(Uri uri) {
        String o = bzk0.o(uri, SdkUri$QueryParam.PRODUCT);
        String o2 = bzk0.o(uri, SdkUri$QueryParam.MEMBER_ID);
        String o3 = bzk0.o(uri, SdkUri$QueryParam.YELLOW_ID);
        String name = e6b1.e(uri).name();
        if (o != null) {
            return new DeeplinkAction.ShowNfcTokenization(new NfcPaymentMethod.Product(atb1.c(o)), new NfcTokenizationSource.Deeplink(name));
        }
        if (o2 != null) {
            return new DeeplinkAction.ShowNfcTokenization(new NfcPaymentMethod.External(o2), new NfcTokenizationSource.Deeplink(name));
        }
        if (o3 != null) {
            return new DeeplinkAction.ShowNfcTokenization(new NfcPaymentMethod.Yellow(o3), new NfcTokenizationSource.Deeplink(name));
        }
        return null;
    }
}
