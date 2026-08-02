package defpackage;

import android.net.Uri;
import com.ybsdk.api.YBSdkScenarioResultReceiver$CreditResultV2;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.screens.initial.deeplink.SdkUri$QueryParam;

/* loaded from: classes9.dex */
public final class obf {
    public static DeeplinkAction a(Uri uri) {
        String o = bzk0.o(uri, SdkUri$QueryParam.ON_FAIL);
        YBSdkScenarioResultReceiver$CreditResultV2 yBSdkScenarioResultReceiver$CreditResultV2 = null;
        Uri parse = o != null ? Uri.parse(o) : null;
        String o2 = bzk0.o(uri, SdkUri$QueryParam.RESULT);
        if ("fail".equalsIgnoreCase(o2)) {
            yBSdkScenarioResultReceiver$CreditResultV2 = new YBSdkScenarioResultReceiver$CreditResultV2.Fail(parse);
        } else if ("success".equalsIgnoreCase(o2)) {
            yBSdkScenarioResultReceiver$CreditResultV2 = YBSdkScenarioResultReceiver$CreditResultV2.Success.INSTANCE;
        }
        return yBSdkScenarioResultReceiver$CreditResultV2 != null ? new DeeplinkAction.CreditResult(yBSdkScenarioResultReceiver$CreditResultV2) : DeeplinkAction.CloseSdk.INSTANCE;
    }
}
