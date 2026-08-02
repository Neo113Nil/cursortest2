package xsna;

import android.webkit.JavascriptInterface;
import com.vk.superapp.dating.js.bridge.api.events.AllowLocationPermission$Parameters;
import com.vk.superapp.dating.js.bridge.api.events.GetPushToken$Parameters;
import com.vk.superapp.dating.js.bridge.api.events.ImageShare$Parameters;
import com.vk.superapp.dating.js.bridge.api.events.InAppUpdate$Parameters;

/* compiled from: JsVkDatingBridge.kt */
/* loaded from: classes6.dex */
public final class g7y extends r6y implements s3y {
    public final bpn0 d0;

    public g7y(wwv0 wwv0Var) {
        super(wwv0Var);
        new bpn0(new myh(this, 27));
        this.d0 = new bpn0(new flu(this, 10));
    }

    @Override // xsna.s3y
    public final void S(p2y<InAppUpdate$Parameters> p2yVar) {
        ((t3y) this.d0.getValue()).S(p2yVar);
    }

    @Override // xsna.s3y
    @JavascriptInterface
    public void VKWebAppAllowLocationPermission(String str) {
        super.VKWebAppAllowLocationPermission(str);
    }

    @Override // xsna.s3y
    @JavascriptInterface
    public void VKWebAppGetPushToken(String str) {
        super.VKWebAppGetPushToken(str);
    }

    @Override // xsna.s3y
    @JavascriptInterface
    public void VKWebAppImageShare(String str) {
        super.VKWebAppImageShare(str);
    }

    @Override // xsna.s3y
    @JavascriptInterface
    public void VKWebAppInAppUpdate(String str) {
        super.VKWebAppInAppUpdate(str);
    }

    @Override // xsna.s3y
    public final void b1(p2y<ImageShare$Parameters> p2yVar) {
        ((t3y) this.d0.getValue()).b1(p2yVar);
    }

    @Override // xsna.s3y
    public final void s1(p2y<AllowLocationPermission$Parameters> p2yVar) {
        ((t3y) this.d0.getValue()).s1(p2yVar);
    }

    @Override // xsna.s3y
    public final void t1(p2y<GetPushToken$Parameters> p2yVar) {
        ((t3y) this.d0.getValue()).t1(p2yVar);
    }
}
