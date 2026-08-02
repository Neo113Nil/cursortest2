package xsna;

import android.app.Application;
import com.vk.accountmanager.di.AccountManagerComponentImpl;
import com.vk.api.generated.money.dto.MoneyGetNspkMembersResponseDto;
import com.vk.auth.captcha.api.di.CaptchaComponent;
import com.vk.auth.oauth.component.di.OAuthUiComponent;
import com.vk.auth.smartflow.api.SmartflowComponent;
import com.vk.auth.smartflow.mail.MailSmartflowComponent;
import com.vk.auth.suspicious_auth.SuspiciousAuthComponent;
import com.vk.autologin.di.VkAutoLoginComponent;
import com.vk.confirmaccount.api.di.ConfirmAccountComponent;
import com.vk.emailforwarding.api.di.EmailForwardingComponent;
import com.vk.log.L;
import com.vk.mail.auth.api.di.MailAuthComponent;
import com.vk.mail.auth.contract.di.MailAuthInternalComponent;
import com.vk.method.selector.api.MethodSelectorComponent;
import com.vk.odnoklassniki.heads.di.OkHeadsComponent;
import com.vk.odnoklassniki.registration.OkRegistrationComponent;
import com.vk.passkey.api.di.PasskeyComponent;
import com.vk.qr.auth.di.QrAuthComponent;
import com.vk.qr.rustore.api.VkRustoreQrComponent;
import com.vk.silentauthbylogin.di.SilentAuthByLoginComponent;
import com.vk.superapp.advertisement.api.di.fullscreen_ad.FullscreenAdFactoryComponent;
import com.vk.superapp.advertisement.api.di.sticky_banner_ad.StickyBannerAdFactoriesComponent;
import com.vk.superapp.analytics.di.SakAnalyticsComponent;
import com.vk.superapp.browser_events.di.BrowserEventsComponent;
import com.vk.superapp.catalog.api.di.AppsCatalogComponent;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.superapp.multiaccount.api.RelatedProfileComponent;
import com.vk.superapp.navigation.api.di.VkAnalyticsComponent;
import com.vk.superapp.sessionmanagment.impl.di.SessionManagementComponentImpl;
import com.vk.superapp.verification.account.di.VerificationAccountComponent;
import com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent;
import com.vk.superapp.vksteps.di.VkStepsComponent;
import com.vk.superapp.vkworkout.di.VkWorkoutComponent;
import com.vk.trustedhash.di.TrustedHashComponent;
import com.vk.whitelabelauth.di.WhiteLabelAuthComponent;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class m8r implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m8r(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                q8r q8rVar = (q8r) this.c;
                L.e("NSPK_LIST_DOWNLOADER", "NSPK list downloaded");
                ((rm70) q8rVar.d.getValue()).b(((MoneyGetNspkMembersResponseDto) obj).d());
                L.e("NSPK_LIST_DOWNLOADER", "NSPK list saved");
                break;
            case 1:
                ((ArrayList) this.c).add((String) obj);
                break;
            default:
                xxg0 xxg0Var = (xxg0) this.c;
                i7m i7mVar = (i7m) obj;
                i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.di.component.app.AppContextDiComponent", new fb8(xxg0Var, 9));
                i7mVar.a("com.vk.di.scope.SingletonScope").h("com.vk.superapp.statinteractor.api.di.StatInteractorComponent", new rwe(10));
                MultiAccountComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").h("com.vk.superapp.multiaccount.api.MultiAccountComponent", new vxg0(i7mVar, new com.vk.superapp.multiaccount.api.b()));
                RelatedProfileComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.superapp.multiaccount.api.RelatedProfileComponent", new uxg0(i7mVar, new com.vk.superapp.multiaccount.api.h(), xxg0Var));
                bpn0 bpn0Var = new bpn0(new aqi(8));
                Application application = xxg0Var.a;
                int i = 10;
                i7mVar.a("com.vk.di.scope.SingletonScope").h("com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent", new z56(new SessionManagementComponentImpl.a(application.getApplicationContext(), new ip(bpn0Var, 6), new np(bpn0Var, 8), new y56(6), new aq0(i), new aq0(i)), 9));
                new bpn0(new ihg(xxg0Var, 7));
                new bpn0(new exw(xxg0Var, 4));
                i7mVar.a("com.vk.di.scope.SingletonScope").h("com.vk.accountmanager.di.AccountManagerComponent", new w62(new AccountManagerComponentImpl.a(application, new ayg0(), new lp(), new bpn0(new ag7(xxg0Var))), 4));
                i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.auth.oauth.di.OAuthComponent", new hb8(9));
                VerificationAccountComponent.Companion.getClass();
                i7mVar.b("com.vk.superapp.verification.account.di.VerificationAccountComponent", new rwg0(i7mVar, new com.vk.superapp.verification.account.di.a()));
                ConfirmAccountComponent.Companion.getClass();
                i7mVar.b("com.vk.confirmaccount.api.di.ConfirmAccountComponent", new swg0(i7mVar, new com.vk.confirmaccount.api.di.a()));
                CaptchaComponent.Companion.getClass();
                i7mVar.b("com.vk.auth.captcha.api.di.CaptchaComponent", new twg0(i7mVar, new com.vk.auth.captcha.api.di.a()));
                VkHealthPermissionsComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.superapp.vkhealth.permissions.api.di.VkHealthPermissionsComponent", new bxg0(i7mVar, new com.vk.superapp.vkhealth.permissions.api.di.a()));
                VkWorkoutComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.superapp.vkworkout.di.VkWorkoutComponent", new cxg0(i7mVar, new com.vk.superapp.vkworkout.di.a()));
                VkStepsComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.superapp.vksteps.di.VkStepsComponent", new dxg0(i7mVar, new com.vk.superapp.vksteps.di.a()));
                OAuthUiComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.auth.oauth.component.di.OAuthUiComponent", new exg0(i7mVar, new com.vk.auth.oauth.component.di.a()));
                AppsCatalogComponent.Companion.getClass();
                i7mVar.b("com.vk.superapp.catalog.api.di.AppsCatalogComponent", new uwg0(i7mVar, new com.vk.superapp.catalog.api.di.a()));
                BrowserEventsComponent.b.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.superapp.browser_events.di.BrowserEventsComponent", new fxg0(i7mVar, new com.vk.superapp.browser_events.di.a()));
                OkHeadsComponent.Companion.getClass();
                i7mVar.b("com.vk.odnoklassniki.heads.di.OkHeadsComponent", new vwg0(i7mVar, new com.vk.odnoklassniki.heads.di.a()));
                VkAnalyticsComponent.Companion.getClass();
                i7mVar.b("com.vk.superapp.navigation.api.di.VkAnalyticsComponent", new wwg0(i7mVar, new com.vk.superapp.navigation.api.di.a()));
                WhiteLabelAuthComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.whitelabelauth.di.WhiteLabelAuthComponent", new gxg0(i7mVar, new com.vk.whitelabelauth.di.a()));
                OkRegistrationComponent.Companion.getClass();
                i7mVar.b("com.vk.odnoklassniki.registration.OkRegistrationComponent", new xwg0(i7mVar, new com.vk.odnoklassniki.registration.a()));
                EmailForwardingComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.emailforwarding.api.di.EmailForwardingComponent", new hxg0(i7mVar, new com.vk.emailforwarding.api.di.a()));
                i7mVar.a("com.vk.di.scope.SingletonScope").h("com.vk.superapp.qr.web2app.QrWebToAppComponent", new y45(11));
                i7mVar.a("com.vk.di.scope.SingletonScope").h("com.vk.stat.di.StatComponent", new zfl(7));
                i7mVar.a("com.vk.di.scope.SingletonScope").h("com.vk.superapp.vkworkout.di.VkWorkoutWidgetBridgeComponent", new m(11));
                QrAuthComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.qr.auth.di.QrAuthComponent", new ixg0(i7mVar, QrAuthComponent.Companion.b));
                FullscreenAdFactoryComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").h("com.vk.superapp.advertisement.api.di.fullscreen_ad.FullscreenAdFactoryComponent", new lxg0(i7mVar, new com.vk.superapp.advertisement.api.di.fullscreen_ad.a()));
                StickyBannerAdFactoriesComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").h("com.vk.superapp.advertisement.api.di.sticky_banner_ad.StickyBannerAdFactoriesComponent", new mxg0(i7mVar, new com.vk.superapp.advertisement.api.di.sticky_banner_ad.a()));
                i7mVar.a("com.vk.di.scope.SingletonScope").h("com.vk.superapp.advertisement.formats.api.AdvertisementOptionalFormatsComponent", new yp6(12));
                MethodSelectorComponent.Companion.getClass();
                i7mVar.c("com.vk.method.selector.api.MethodSelectorComponent", new zwg0(i7mVar, new com.vk.method.selector.api.a()));
                SmartflowComponent.Companion.getClass();
                i7mVar.c("com.vk.auth.smartflow.api.SmartflowComponent", new axg0(i7mVar, new com.vk.auth.smartflow.api.a()));
                MailSmartflowComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").h("com.vk.auth.smartflow.mail.MailSmartflowComponent", new nxg0(i7mVar, new com.vk.auth.smartflow.mail.a()));
                TrustedHashComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").h("com.vk.trustedhash.di.TrustedHashComponent", new oxg0(i7mVar, TrustedHashComponent.Companion.b));
                SilentAuthByLoginComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").h("com.vk.silentauthbylogin.di.SilentAuthByLoginComponent", new pxg0(i7mVar, new com.vk.silentauthbylogin.di.a()));
                VkRustoreQrComponent.Companion.getClass();
                i7mVar.b("com.vk.qr.rustore.api.VkRustoreQrComponent", new ywg0(i7mVar, VkRustoreQrComponent.Companion.b));
                PasskeyComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").h("com.vk.passkey.api.di.PasskeyComponent", new qxg0(i7mVar, new com.vk.passkey.api.di.a(), xxg0Var));
                SakAnalyticsComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").h("com.vk.superapp.analytics.di.SakAnalyticsComponent", new rxg0(i7mVar, new com.vk.superapp.analytics.di.a()));
                MailAuthComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").h("com.vk.mail.auth.api.di.MailAuthComponent", new sxg0(i7mVar, new com.vk.mail.auth.api.di.a()));
                MailAuthInternalComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").h("com.vk.mail.auth.contract.di.MailAuthInternalComponent", new txg0(i7mVar, new com.vk.mail.auth.contract.di.e()));
                SuspiciousAuthComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").h("com.vk.auth.suspicious_auth.SuspiciousAuthComponent", new kxg0(i7mVar, new com.vk.auth.suspicious_auth.a()));
                g2v.e(i7mVar);
                i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.emailactualization.api.di.EmailActualizationComponent", new s65(11));
                i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.phoneactualization.api.di.PhoneActualizationComponent", new c24(12));
                VkAutoLoginComponent.Companion.getClass();
                i7mVar.a("com.vk.di.scope.SingletonScope").g("com.vk.autologin.di.VkAutoLoginComponent", new jxg0(i7mVar, new com.vk.autologin.di.a()));
                break;
        }
        return s3q0.a;
    }
}
