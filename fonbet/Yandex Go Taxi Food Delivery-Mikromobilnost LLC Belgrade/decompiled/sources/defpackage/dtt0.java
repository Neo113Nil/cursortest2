package defpackage;

import android.net.Uri;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;

/* loaded from: classes9.dex */
public final class dtt0 {
    public static DeeplinkAction.SplitDeposit a(Uri uri) {
        String o = bzk0.o(uri, SdkUri$QueryParam.ORDER_ID);
        if (o == null) {
            return null;
        }
        return new DeeplinkAction.SplitDeposit(o, bzk0.o(uri, SdkUri$QueryParam.SCENARIO));
    }
}
