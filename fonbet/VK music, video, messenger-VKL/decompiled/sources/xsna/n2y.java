package xsna;

import android.content.Intent;
import android.webkit.JavascriptInterface;
import com.coremedia.iso.boxes.AuthorBox;
import com.vk.superapp.auth.js.bridge.api.events.AuthByExchangeToken$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.AuthPauseRequests$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.AuthRestore$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.AuthResumeRequests$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.ConfirmUserByService$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.GetAuthToken$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.GetRestoreHash$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.GetSilentToken$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.IsMultiaccountAvailable$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.OAuthActivate$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.OAuthDeactivate$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.OpenMultiaccountSwitcher$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.RelatedPinCodeChanged$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.RelatedProfileCreated$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.RelatedProfileDeleted$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.SaveCredentials$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.UserDeactivated$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.VerifyUserByService$Parameters;
import com.vk.superapp.auth.js.bridge.api.events.VerifyUserServicesInfo$Parameters;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.base.js.bridge.ReportableStubDelegate;
import xsna.g2y;

/* compiled from: JsAuthDelegateStub.kt */
/* loaded from: classes6.dex */
public final class n2y extends ReportableStubDelegate implements g2y {
    public final com.vk.superapp.base.js.bridge.b b;

    public n2y(com.vk.superapp.base.js.bridge.b bVar) {
        this.b = bVar;
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final String B1() {
        return AuthorBox.TYPE;
    }

    @Override // xsna.x1y
    public final void E0(p2y<RelatedProfileDeleted$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppRelatedProfileDeleted"), p2yVar);
    }

    @Override // xsna.x1y
    public final void F0(p2y<SaveCredentials$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppSaveCredentials"), p2yVar);
    }

    @Override // xsna.x1y
    public final void H(p2y<UserDeactivated$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppUserDeactivated"), p2yVar);
    }

    @Override // xsna.x1y
    public final void I(int i, Intent intent) {
        C1("handleConfirmUserByServiceResult(resultCode=" + i + ", data=" + intent + ')');
    }

    @Override // xsna.x1y
    public final void M(p2y<OAuthActivate$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppOAuthActivate"), p2yVar);
    }

    @Override // xsna.x1y
    public final void N0(p2y<ConfirmUserByService$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppVerifyUserByService"), p2yVar);
    }

    @Override // xsna.x1y
    public final void O0(p2y<RelatedProfileCreated$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppRelatedProfileCreated"), p2yVar);
    }

    @Override // xsna.x1y
    public final void R(p2y<GetAuthToken$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppGetAuthToken"), p2yVar);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppAuthByExchangeToken(String str) {
        g2y.b.VKWebAppAuthByExchangeToken(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppAuthPauseRequests(String str) {
        g2y.b.VKWebAppAuthPauseRequests(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppAuthRestore(String str) {
        g2y.b.VKWebAppAuthRestore(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppAuthResumeRequests(String str) {
        g2y.b.VKWebAppAuthResumeRequests(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppConfirmUserByService(String str) {
        g2y.b.VKWebAppConfirmUserByService(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppGetAuthToken(String str) {
        g2y.b.VKWebAppGetAuthToken(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppGetRestoreHash(String str) {
        g2y.b.VKWebAppGetRestoreHash(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppGetSilentToken(String str) {
        g2y.b.VKWebAppGetSilentToken(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppIsMultiaccountAvailable(String str) {
        g2y.b.VKWebAppIsMultiaccountAvailable(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppOAuthActivate(String str) {
        g2y.b.VKWebAppOAuthActivate(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppOAuthDeactivate(String str) {
        g2y.b.VKWebAppOAuthDeactivate(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppOpenMultiaccountSwitcher(String str) {
        g2y.b.VKWebAppOpenMultiaccountSwitcher(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppRelatedPinCodeChanged(String str) {
        g2y.b.VKWebAppRelatedPinCodeChanged(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppRelatedProfileCreated(String str) {
        g2y.b.VKWebAppRelatedProfileCreated(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppRelatedProfileDeleted(String str) {
        g2y.b.VKWebAppRelatedProfileDeleted(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppSaveCredentials(String str) {
        g2y.b.VKWebAppSaveCredentials(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppUserDeactivated(String str) {
        g2y.b.VKWebAppUserDeactivated(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppVerifyUserByService(String str) {
        g2y.b.VKWebAppVerifyUserByService(this, str);
    }

    @Override // xsna.g2y, xsna.x1y
    @JavascriptInterface
    public void VKWebAppVerifyUserServicesInfo(String str) {
        g2y.b.VKWebAppVerifyUserServicesInfo(this, str);
    }

    @Override // xsna.x1y
    public final void W(p2y<IsMultiaccountAvailable$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppIsMultiaccountAvailable"), p2yVar);
    }

    @Override // xsna.x1y
    public final void Y0(p2y<AuthResumeRequests$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppAuthResumeRequests"), p2yVar);
    }

    @Override // xsna.x1y
    public final void e0(p2y<GetRestoreHash$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppGetRestoreHash"), p2yVar);
    }

    @Override // xsna.x1y
    public final void h1(p2y<RelatedPinCodeChanged$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppVerifyUserServicesInfo"), p2yVar);
    }

    @Override // xsna.x1y
    public final void n0(p2y<VerifyUserServicesInfo$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppVerifyUserServicesInfo"), p2yVar);
    }

    @Override // xsna.x1y
    public final void p(p2y<AuthPauseRequests$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppAuthPauseRequests"), p2yVar);
    }

    @Override // xsna.x1y
    public final void s0(p2y<GetSilentToken$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppGetSilentToken"), p2yVar);
    }

    @Override // xsna.x1y
    public final void u(p2y<AuthRestore$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppAuthRestore"), p2yVar);
    }

    @Override // xsna.x1y
    public final void v(p2y<AuthByExchangeToken$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppAuthByExchangeToken"), p2yVar);
    }

    @Override // xsna.x1y
    public final void v1(p2y<VerifyUserByService$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppVerifyUserServicesInfo"), p2yVar);
    }

    @Override // xsna.x1y
    public final void w(p2y<OpenMultiaccountSwitcher$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppOpenMultiaccountSwitcher"), p2yVar);
    }

    @Override // xsna.x1y
    public final void y0(p2y<OAuthDeactivate$Parameters> p2yVar) {
        D1(new JsMethod("VKWebAppOAuthDeactivate"), p2yVar);
    }

    @Override // com.vk.superapp.base.js.bridge.ReportableStubDelegate
    public final com.vk.superapp.base.js.bridge.b z1() {
        return this.b;
    }

    @Override // xsna.npf0
    public final void release() {
    }

    @Override // xsna.npf0
    public final void r(xwv0 xwv0Var) {
    }
}
