package defpackage;

import android.webkit.JavascriptInterface;

/* loaded from: classes2.dex */
public interface iap extends in41, x3x, zl41, ss41, di41 {
    @Override // defpackage.x3x
    default String a() {
        return "__plusSDKMobileCompat";
    }

    @JavascriptInterface
    void onMessage(String str);
}
