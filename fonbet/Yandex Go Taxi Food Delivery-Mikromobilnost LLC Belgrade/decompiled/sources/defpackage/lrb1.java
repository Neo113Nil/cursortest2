package defpackage;

import android.net.Uri;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$NativeVibrateRequest$VibrateType;
import com.ybsdk.deeplink.generated.TopupAction;

/* loaded from: classes3.dex */
public abstract class lrb1 {
    public static TopupAction a(Uri uri) {
        Boolean j0;
        String queryParameter = uri.getQueryParameter("deposit_type");
        if (queryParameter == null) {
            queryParameter = "exact";
        }
        String queryParameter2 = uri.getQueryParameter("currency");
        if (queryParameter2 == null) {
            queryParameter2 = "RUB";
        }
        String queryParameter3 = uri.getQueryParameter("open_kyc_eds");
        boolean booleanValue = (queryParameter3 == null || (j0 = evu0.j0(queryParameter3)) == null) ? false : j0.booleanValue();
        String queryParameter4 = uri.getQueryParameter("amount");
        return new TopupAction(queryParameter, queryParameter2, booleanValue, queryParameter4 != null ? avu0.i(queryParameter4) : null, uri.getQueryParameter("agreement_id"), uri.getQueryParameter("payment_method_id"), uri.getQueryParameter("suggest_amounts"), uri.getQueryParameter("suggest_behaviour"));
    }

    public static final int b(OutMessage$NativeVibrateRequest$VibrateType outMessage$NativeVibrateRequest$VibrateType) {
        int i = q450.a[outMessage$NativeVibrateRequest$VibrateType.ordinal()];
        if (i == 1 || i == 2) {
            return 0;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4 || i == 5) {
            return 1;
        }
        w511.b();
        return 0;
    }
}
