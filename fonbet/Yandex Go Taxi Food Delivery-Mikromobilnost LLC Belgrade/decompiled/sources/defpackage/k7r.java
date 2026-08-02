package defpackage;

import android.net.Uri;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;

/* loaded from: classes9.dex */
public final class k7r {
    public static DeeplinkAction.FinalizePaymentChoice a(Uri uri) {
        String o = bzk0.o(uri, SdkUri$QueryParam.PAYMENT_METHOD_ID);
        if (o != null) {
            return new DeeplinkAction.FinalizePaymentChoice(o, bzk0.o(uri, SdkUri$QueryParam.PAYMENT_METHOD_TYPE), bzk0.o(uri, SdkUri$QueryParam.IMAGE_URL_LIGHT), bzk0.o(uri, SdkUri$QueryParam.IMAGE_URL_DARK), bzk0.o(uri, SdkUri$QueryParam.TITLE), bzk0.o(uri, SdkUri$QueryParam.AMOUNT), bzk0.o(uri, SdkUri$QueryParam.TRUST_ID));
        }
        return null;
    }
}
