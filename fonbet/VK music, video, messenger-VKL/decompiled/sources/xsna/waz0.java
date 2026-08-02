package xsna;

import android.webkit.JavascriptInterface;
import androidx.annotation.Nullable;
import xsna.mfz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class waz0 {
    public final mfz0.b a;

    public waz0(mfz0.b bVar) {
        this.a = bVar;
    }

    @JavascriptInterface
    public void VKWebAppClose(@Nullable String str) {
        o8z0.d(new hv1(this.a, 26));
    }

    @JavascriptInterface
    public void VKWebAppCopyText(@Nullable String str) {
        o8z0.d(new zz9(6, this, str));
    }

    @JavascriptInterface
    public void VKWebAppGetCustomSdkUserInfo(@Nullable String str) {
        o8z0.d(new iv1(this, str));
    }

    @JavascriptInterface
    public void VKWebAppInit(@Nullable String str) {
        gu8.c("WebFormBridgeHandler", "App has been initialized");
    }

    @JavascriptInterface
    public void VKWebAppSetViewSettings(@Nullable String str) {
        o8z0.d(new tnf(this, str));
    }
}
