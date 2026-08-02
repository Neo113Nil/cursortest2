package defpackage;

import android.net.Uri;
import com.ybsdk.feature.deeplink.api.actions.SplitDepositProcessing;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;

/* loaded from: classes9.dex */
public final class mut0 {
    public static SplitDepositProcessing a(Uri uri) {
        String o = bzk0.o(uri, SdkUri$QueryParam.TRANSACTION_PARAMETERS);
        if (o != null) {
            return new SplitDepositProcessing(uri, o);
        }
        return null;
    }
}
