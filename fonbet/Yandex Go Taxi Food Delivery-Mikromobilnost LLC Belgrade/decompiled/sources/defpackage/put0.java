package defpackage;

import android.net.Uri;
import com.ybsdk.feature.deeplink.api.actions.SplitDepositRepayment;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;

/* loaded from: classes9.dex */
public final class put0 {
    public static SplitDepositRepayment a(Uri uri) {
        String o = bzk0.o(uri, SdkUri$QueryParam.ORDER_ID);
        if (o == null) {
            return null;
        }
        return new SplitDepositRepayment(o, bzk0.o(uri, SdkUri$QueryParam.SCENARIO), bzk0.o(uri, SdkUri$QueryParam.PREVIOUS_PAYMENT_INDEX), uri);
    }
}
