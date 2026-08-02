package com.yandex.passport.internal.ui.domik;

import android.text.TextUtils;
import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.api.PassportSocialProviderCode;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.analytics.DomikStatefulReporter$Event;
import com.yandex.passport.internal.analytics.b0;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.h9;
import com.yandex.passport.internal.report.reporters.p0;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.ui.base.ShowFragmentInfo$AnimationType;
import com.yandex.passport.internal.ui.domik.RegTrack;
import com.yandex.passport.internal.ui.domik.phone_number.PhoneNumberFragment;
import com.yandex.passport.internal.ui.domik.relogin.ReloginFragment;
import com.yandex.passport.internal.ui.social.SocialFragment;
import com.yandex.passport.internal.y;
import defpackage.g8e;
import defpackage.gw00;
import defpackage.jl40;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class q {
    public final e a;
    public final com.yandex.passport.internal.flags.j b;
    public final LoginProperties c;
    public final b0 d;
    public final p0 e;

    public q(e eVar, com.yandex.passport.internal.flags.j jVar, LoginProperties loginProperties, b0 b0Var, p0 p0Var) {
        this.a = eVar;
        this.b = jVar;
        this.c = loginProperties;
        this.d = b0Var;
        this.e = p0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.yandex.passport.internal.ModernAccount] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    public static void a(q qVar, ModernAccount modernAccount, boolean z) {
        SocialConfiguration socialConfiguration;
        SocialConfiguration socialConfiguration2;
        e eVar = qVar.a;
        LoginProperties loginProperties = qVar.c;
        SocialConfiguration socialConfiguration3 = 0;
        socialConfiguration3 = 0;
        socialConfiguration3 = 0;
        socialConfiguration3 = 0;
        if (modernAccount == null) {
            String loginHint = loginProperties.getLoginHint();
            if (TextUtils.isEmpty(loginHint)) {
                qVar.c();
                return;
            } else {
                eVar.A.m(new com.yandex.passport.internal.ui.base.m(new p(qVar, loginHint, (ModernAccount) socialConfiguration3, z), ReloginFragment.FRAGMENT_TAG, false));
                return;
            }
        }
        String normalizedDisplayLogin = modernAccount.getUserInfo().getNormalizedDisplayLogin();
        SocialConfiguration.Companion.getClass();
        if (modernAccount.getSocialProviderCode() != null) {
            int primaryAliasType = modernAccount.getPrimaryAliasType();
            if (primaryAliasType == 6) {
                String socialProviderCode = modernAccount.getSocialProviderCode();
                if (jl40.l(socialProviderCode, PassportSocialProviderCode.VKONTAKTE.getCodeString())) {
                    socialConfiguration2 = new SocialConfiguration(PassportSocialConfiguration.SOCIAL_VKONTAKTE, SocialConfiguration.Type.SOCIAL, null, true, null, 20, null);
                } else if (jl40.l(socialProviderCode, PassportSocialProviderCode.FACEBOOK.getCodeString())) {
                    socialConfiguration2 = new SocialConfiguration(PassportSocialConfiguration.SOCIAL_FACEBOOK, SocialConfiguration.Type.SOCIAL, null, true, null, 20, null);
                } else if (jl40.l(socialProviderCode, PassportSocialProviderCode.TWITTER.getCodeString())) {
                    socialConfiguration2 = new SocialConfiguration(PassportSocialConfiguration.SOCIAL_TWITTER, SocialConfiguration.Type.SOCIAL, null, true, null, 20, null);
                } else if (jl40.l(socialProviderCode, PassportSocialProviderCode.ODNOKLASSNIKI.getCodeString())) {
                    socialConfiguration2 = new SocialConfiguration(PassportSocialConfiguration.SOCIAL_ODNOKLASSNIKI, SocialConfiguration.Type.SOCIAL, null, true, null, 20, null);
                } else if (jl40.l(socialProviderCode, PassportSocialProviderCode.GOOGLE.getCodeString())) {
                    socialConfiguration2 = new SocialConfiguration(PassportSocialConfiguration.SOCIAL_GOOGLE, SocialConfiguration.Type.SOCIAL, null, true, null, 20, null);
                } else if (jl40.l(socialProviderCode, PassportSocialProviderCode.MAILRU.getCodeString())) {
                    socialConfiguration = new SocialConfiguration(PassportSocialConfiguration.SOCIAL_MAILRU, SocialConfiguration.Type.SOCIAL, null, true, null, 20, null);
                    socialConfiguration3 = socialConfiguration;
                }
                socialConfiguration3 = socialConfiguration2;
            } else if (primaryAliasType == 12) {
                String socialProviderCode2 = modernAccount.getSocialProviderCode();
                if (jl40.l(socialProviderCode2, PassportSocialProviderCode.GOOGLE.getCodeString())) {
                    socialConfiguration2 = new SocialConfiguration(PassportSocialConfiguration.MAILISH_GOOGLE, SocialConfiguration.Type.MAIL_OAUTH, "https://mail.google.com/", true, g8e.z("force_prompt", "1"));
                } else if (jl40.l(socialProviderCode2, PassportSocialProviderCode.MAILRU.getCodeString())) {
                    socialConfiguration3 = y.c(modernAccount.getPrimaryDisplayName());
                } else if (jl40.l(socialProviderCode2, PassportSocialProviderCode.MICROSOFT.getCodeString())) {
                    socialConfiguration3 = y.d(modernAccount.getPrimaryDisplayName());
                } else if (jl40.l(socialProviderCode2, PassportSocialProviderCode.YAHOO.getCodeString())) {
                    socialConfiguration3 = y.e(modernAccount.getPrimaryDisplayName());
                } else if (jl40.l(socialProviderCode2, PassportSocialProviderCode.RAMBLER.getCodeString())) {
                    socialConfiguration2 = new SocialConfiguration(PassportSocialConfiguration.MAILISH_RAMBLER, SocialConfiguration.Type.MAIL_PASSWORD, null, false, null, 28, null);
                } else if (jl40.l(socialProviderCode2, PassportSocialProviderCode.OTHER.getCodeString())) {
                    socialConfiguration = new SocialConfiguration(PassportSocialConfiguration.MAILISH_OTHER, SocialConfiguration.Type.MAIL_PASSWORD, null, false, null, 28, null);
                    socialConfiguration3 = socialConfiguration;
                }
                socialConfiguration3 = socialConfiguration2;
            }
        }
        if (socialConfiguration3 != 0) {
            qVar.e(false, socialConfiguration3, true, modernAccount);
            return;
        }
        if (normalizedDisplayLogin != null) {
            eVar.A.m(new com.yandex.passport.internal.ui.base.m(new p(qVar, normalizedDisplayLogin, modernAccount, z), ReloginFragment.FRAGMENT_TAG, false));
            return;
        }
        if (modernAccount.getPrimaryAliasType() != 10) {
            qVar.c();
            return;
        }
        s sVar = RegTrack.Companion;
        RegTrack.RegOrigin regOrigin = RegTrack.RegOrigin.REGISTRATION;
        sVar.getClass();
        qVar.d(new RegTrack(loginProperties, null, null, null, null, null, null, null, null, regOrigin, null, null, null, null, false, UnsubscribeMailingStatus.NOT_SHOWED).withPhoneNumber(modernAccount.getAccountName()).withRelogin(modernAccount));
    }

    public final void b(AuthTrack authTrack, DomikResult domikResult) {
        UnsubscribeMailingStatus unsubscribeMailing;
        if (authTrack != null && (unsubscribeMailing = authTrack.getUnsubscribeMailing()) != null) {
            b0 b0Var = this.d;
            b0Var.d(b0Var.x, DomikStatefulReporter$Event.AUTH_SUCCESS, gw00.e(new Pair("unsubscribe_from_maillists", unsubscribeMailing.getAnalyticStatus())));
        }
        f(authTrack, domikResult);
    }

    public final void c() {
        s sVar = RegTrack.Companion;
        AuthTrack b = c.b(AuthTrack.Companion, this.c);
        RegTrack.RegOrigin regOrigin = RegTrack.RegOrigin.REGISTRATION;
        sVar.getClass();
        d(s.a(b, regOrigin));
    }

    public final void d(RegTrack regTrack) {
        PassportUidImpl selectedUid;
        LoginProperties loginProperties = this.c;
        if (loginProperties.isUpgradePhonish() && (selectedUid = loginProperties.getSelectedUid()) != null) {
            Uid B = com.yandex.passport.internal.util.p.B(selectedUid);
            boolean z = !loginProperties.getVisualProperties().isNoReturnToHost();
            p0 p0Var = this.e;
            p0Var.getClass();
            p0Var.f(h9.w, new yd(B), new com.yandex.passport.internal.report.a(z));
        }
        this.a.A.m(new com.yandex.passport.internal.ui.base.m(new com.yandex.passport.internal.t(5, regTrack), PhoneNumberFragment.FRAGMENT_TAG, false));
    }

    public final void e(boolean z, SocialConfiguration socialConfiguration, boolean z2, ModernAccount modernAccount) {
        this.a.A.m(new com.yandex.passport.internal.ui.base.m(new p(this, socialConfiguration, z2, modernAccount), SocialFragment.FRAGMENT_TAG, z, ShowFragmentInfo$AnimationType.NONE));
    }

    public final void f(AuthTrack authTrack, DomikResult domikResult) {
        String password = authTrack != null ? authTrack.getPassword() : null;
        if (authTrack == null) {
            authTrack = null;
        }
        this.a.D.m(new android.util.Pair(new CredentialManagerDomikResult(domikResult, password), authTrack));
    }
}
