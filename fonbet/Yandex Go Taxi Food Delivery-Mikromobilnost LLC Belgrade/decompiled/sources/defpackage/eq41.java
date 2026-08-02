package defpackage;

import android.os.Bundle;
import com.yandex.payment.sdk.core.data.PaymentSdkEnvironment;
import com.yandex.payment.sdk.ui.common.TrustedUrl;
import com.yandex.payment.sdk.ui.common.WebViewFragment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class eq41 {
    public static WebViewFragment a(eq41 eq41Var, b88 b88Var, String str, PaymentSdkEnvironment paymentSdkEnvironment, List list) {
        eq41Var.getClass();
        WebViewFragment webViewFragment = new WebViewFragment(b88Var);
        WebViewFragment.Companion.getClass();
        webViewFragment.setArguments(b(str, paymentSdkEnvironment, list, true, false));
        return webViewFragment;
    }

    public static Bundle b(String str, PaymentSdkEnvironment paymentSdkEnvironment, List list, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putString("url", str);
        bundle.putBoolean("is_debug", paymentSdkEnvironment.getIsDebug());
        List<fi11> list2 = list;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        for (fi11 fi11Var : list2) {
            arrayList.add(new TrustedUrl(fi11Var.a, fi11Var.b));
        }
        bundle.putParcelableArray("trusted_urls", (TrustedUrl[]) arrayList.toArray(new TrustedUrl[0]));
        bundle.putBoolean("show_navigation_bar", z);
        bundle.putBoolean("handle_deeplink", z2);
        return bundle;
    }
}
