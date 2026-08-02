package com.yandex.passport.internal.ui.social.authenticators;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFormatException;
import com.yandex.auth.LegacyAccountType;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.passport.api.PassportTheme;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.account.MasterToken;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.entities.Cookie;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.p;
import com.yandex.passport.internal.report.ab;
import com.yandex.passport.internal.report.i;
import com.yandex.passport.internal.report.i1;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.md;
import com.yandex.passport.internal.report.ra;
import com.yandex.passport.internal.report.reporters.w0;
import com.yandex.passport.internal.report.sa;
import com.yandex.passport.internal.report.ta;
import com.yandex.passport.internal.report.ya;
import com.yandex.passport.internal.report.yd;
import com.yandex.passport.internal.ui.browser.SocialBrowserActivity;
import com.yandex.passport.internal.ui.social.g;
import com.yandex.passport.internal.ui.social.h;
import com.yandex.passport.internal.ui.social.mail.MailPasswordLoginActivity;
import com.yandex.passport.internal.ui.social.mail.MailPasswordLoginFragment;
import com.yandex.passport.internal.ui.social.q;
import com.yandex.passport.internal.ui.social.r;
import com.yandex.passport.internal.ui.util.o;
import com.yandex.passport.internal.ui.webview.WebViewActivity;
import com.yandex.passport.internal.ui.webview.webcases.WebCaseType;
import com.yandex.passport.internal.usecase.ui.l;
import com.yandex.passport.internal.util.j;
import defpackage.ds31;
import defpackage.jl40;
import defpackage.k5c;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.oo31;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.w511;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Locale;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes2.dex */
public final class c extends f {
    public final j C;
    public final com.yandex.passport.internal.usecase.authorize.d D;
    public final l E;
    public final com.yandex.passport.internal.usecase.authorize.b F;
    public final com.yandex.passport.internal.core.accounts.d G;
    public final com.yandex.passport.internal.account.c H;
    public final com.yandex.passport.internal.network.client.c I;
    public final p J;
    public String K;

    public c(h hVar, j jVar, com.yandex.passport.internal.usecase.authorize.d dVar, l lVar, com.yandex.passport.internal.usecase.authorize.b bVar, com.yandex.passport.internal.core.accounts.d dVar2, com.yandex.passport.internal.account.c cVar, w0 w0Var, com.yandex.passport.internal.network.client.c cVar2, p pVar, LoginProperties loginProperties, SocialConfiguration socialConfiguration, Bundle bundle, boolean z) {
        super(loginProperties, socialConfiguration, bundle, z, hVar, w0Var);
        this.C = jVar;
        this.D = dVar;
        this.E = lVar;
        this.F = bVar;
        this.G = dVar2;
        this.H = cVar;
        this.I = cVar2;
        this.J = pVar;
    }

    @Override // com.yandex.passport.internal.ui.social.authenticators.f
    public final void W(int i, int i2, Intent intent) {
        w0 w0Var = this.y;
        w0Var.getClass();
        w0Var.f(ra.w, new yd(w0.j(this.c), 5, false), new md(i, 14), new md(i2, 16), new md(w0Var.c, 21));
        switch (i) {
            case 100:
                if (i2 != -1) {
                    if (i2 != 0) {
                        return;
                    }
                    b0();
                    return;
                } else {
                    Cookie.Companion.getClass();
                    String queryParameter = Uri.parse(com.yandex.passport.internal.entities.d.a(intent).getReturnUrl()).getQueryParameter("task_id");
                    if (queryParameter == null) {
                        c0(new RuntimeException("task_id not found"));
                        return;
                    } else {
                        tje.N(ds31.a(this), null, null, new AuthSocialViewModel$onWebMailSuccess$1(this, queryParameter, null), 3);
                        return;
                    }
                }
            case 101:
                if (i2 == -1 && intent != null) {
                    Cookie.Companion.getClass();
                    tje.N(ds31.a(this), null, null, new AuthSocialViewModel$onWebSocialSuccess$1(this, com.yandex.passport.internal.entities.d.a(intent), null), 3);
                    return;
                } else {
                    if (i2 == 0) {
                        b0();
                        return;
                    }
                    return;
                }
            case 102:
                if (i2 != -1 || intent == null) {
                    b0();
                    return;
                }
                String queryParameter2 = intent.getData().getQueryParameter("task_id");
                if (queryParameter2 == null) {
                    c0(new RuntimeException("task_id not found"));
                    return;
                } else {
                    tje.N(ds31.a(this), null, null, new AuthSocialViewModel$onBrowserMailSuccess$1(this, queryParameter2, null), 3);
                    return;
                }
            case 103:
                if (i2 != -1 || intent == null) {
                    b0();
                    return;
                }
                String queryParameter3 = intent.getData().getQueryParameter("yandex_authorization_code");
                if (this.K == null) {
                    c0(new RuntimeException("Code challenge null"));
                    return;
                } else if (queryParameter3 == null) {
                    c0(new RuntimeException("Code null"));
                    return;
                } else {
                    tje.N(ds31.a(this), null, null, new AuthSocialViewModel$onBrowserSocialSuccess$1(this, queryParameter3, null), 3);
                    return;
                }
            case 104:
                if (i2 != -1) {
                    if (i2 == 100) {
                        a0();
                        return;
                    }
                    if ((intent != null ? intent.getSerializableExtra(Constants.KEY_EXCEPTION) : null) != null) {
                        c0((Throwable) intent.getSerializableExtra(Constants.KEY_EXCEPTION));
                        return;
                    } else {
                        b0();
                        return;
                    }
                }
                if (intent == null) {
                    c0(new RuntimeException("Intent data null"));
                    return;
                }
                String stringExtra = intent.getStringExtra("social-token");
                if (stringExtra == null) {
                    c0(new RuntimeException("Social token null"));
                    return;
                } else {
                    d0(new com.yandex.passport.internal.ui.base.l(new b(this, stringExtra, intent.getStringExtra("application-id"), 0), HProv.PP_SET_PIN));
                    return;
                }
            case 105:
                if (i2 != -1) {
                    if (i2 == 100) {
                        a0();
                        return;
                    }
                    if ((intent != null ? intent.getSerializableExtra(Constants.KEY_EXCEPTION) : null) != null) {
                        c0((Throwable) intent.getSerializableExtra(Constants.KEY_EXCEPTION));
                        return;
                    } else {
                        b0();
                        return;
                    }
                }
                if (intent == null) {
                    c0(new RuntimeException("Intent data null"));
                    return;
                }
                String stringExtra2 = intent.getStringExtra("social-token");
                if (stringExtra2 == null) {
                    c0(new RuntimeException("Social token null"));
                    return;
                }
                String stringExtra3 = intent.getStringExtra("application-id");
                k5c a = ds31.a(this);
                sjh sjhVar = uyj.a;
                tje.N(a, mdh.b, null, new AuthSocialViewModel$performRequest$1(this, stringExtra2, stringExtra3, null), 2);
                return;
            case 106:
                if (i2 != -1) {
                    b0();
                    return;
                }
                if (intent == null) {
                    c0(new RuntimeException("Intent data null"));
                    return;
                }
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    c0(new RuntimeException("No extras in bundle"));
                    return;
                }
                Uid uid = (Uid) oo31.e(extras, com.yandex.passport.internal.util.p.class, "passport-uid");
                if (uid == null) {
                    throw new ParcelFormatException("Invalid parcelable Uid in the bundle");
                }
                ModernAccount e = this.G.a().e(uid);
                if (e != null) {
                    e0(e);
                    return;
                }
                return;
            case HProv.PP_SET_PIN /* 107 */:
                if (i2 != -1) {
                    b0();
                    return;
                }
                if (intent == null) {
                    c0(new RuntimeException("Intent data null"));
                    return;
                }
                com.yandex.passport.common.account.b bVar = MasterToken.Companion;
                String stringExtra4 = intent.getStringExtra("master-token");
                if (stringExtra4 == null) {
                    ny61.r("master-token is missing");
                    return;
                }
                bVar.getClass();
                MasterToken a2 = com.yandex.passport.common.account.b.a(stringExtra4);
                k5c a3 = ds31.a(this);
                sjh sjhVar2 = uyj.a;
                tje.N(a3, mdh.b, null, new AuthSocialViewModel$onMasterTokenReceived$1(this, a2, null), 2);
                return;
            default:
                return;
        }
    }

    @Override // com.yandex.passport.internal.ui.social.authenticators.f
    public final void X() {
        com.yandex.passport.internal.ui.base.l lVar;
        h hVar = (h) this.x;
        this.y.k(this.c, this.w, hVar.a);
        if (hVar instanceof com.yandex.passport.internal.ui.social.c) {
            final int i = 0;
            lVar = new com.yandex.passport.internal.ui.base.l(new com.yandex.passport.legacy.lx.j(this) { // from class: com.yandex.passport.internal.ui.social.authenticators.a
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // com.yandex.passport.legacy.lx.j
                public final Object a(Object obj) {
                    int i2 = i;
                    c cVar = this.b;
                    switch (i2) {
                        case 0:
                            Context context = (Context) obj;
                            cVar.K = com.yandex.passport.internal.util.b.b();
                            com.yandex.passport.internal.network.client.c cVar2 = cVar.I;
                            LoginProperties loginProperties = cVar.b;
                            com.yandex.passport.internal.network.client.e b = cVar2.b(com.yandex.passport.internal.util.p.u(loginProperties.getFilter().getPrimaryEnvironment()));
                            SocialConfiguration socialConfiguration = cVar.c;
                            String b2 = com.yandex.passport.common.browser.c.b(context);
                            j jVar = cVar.C;
                            String str = cVar.K;
                            jVar.getClass();
                            String a = j.a(str);
                            String str2 = ((com.yandex.passport.internal.ui.social.c) cVar.x).b;
                            PassportTheme theme = loginProperties.getTheme();
                            Locale locale = cVar.J.q;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) b.f;
                            Uri.Builder appendQueryParameter = Uri.parse(b.a()).buildUpon().appendEncodedPath(com.yandex.passport.internal.network.client.d.a[socialConfiguration.getProviderCode().ordinal()] == 1 ? "pwl/social/start" : "auth/social/start").appendQueryParameter("consumer", eVar.a()).appendQueryParameter(CommonUrlParts.APP_ID, eVar.a()).appendQueryParameter("provider", socialConfiguration.getProviderCodeOld()).appendQueryParameter("retpath", b2).appendQueryParameter("code_challenge", a).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("passthrough_errors", "UserDeniedError").appendQueryParameter("lang", locale.getLanguage()).appendQueryParameter("locale", locale.getCountry()).appendQueryParameter(DivkitThemeChangeListener.THEME_VARIABLE_NAME, o.b(theme)).appendQueryParameter("app_platform", ConstantDeviceInfo.APP_PLATFORM);
                            String d = b.e.d();
                            if (d != null) {
                                appendQueryParameter.appendQueryParameter(MetaDataField.DEVICE_ID_FIELD, d);
                            }
                            if (str2 != null) {
                                appendQueryParameter.appendQueryParameter(ClidProvider.APPLICATION, str2);
                            }
                            return SocialBrowserActivity.createIntent(context, Uri.parse(appendQueryParameter.toString()));
                        case 1:
                            Context context2 = (Context) obj;
                            com.yandex.passport.internal.network.client.e b3 = cVar.I.b(com.yandex.passport.internal.util.p.u(cVar.b.getFilter().getPrimaryEnvironment()));
                            SocialConfiguration socialConfiguration2 = cVar.c;
                            return SocialBrowserActivity.createIntent(context2, Uri.parse(b3.b(socialConfiguration2.getProviderCodeOld(), com.yandex.passport.common.browser.c.b(context2), socialConfiguration2.getScope(), socialConfiguration2.getExtraQueryParams())));
                        case 2:
                            com.yandex.passport.internal.ui.webview.b bVar = WebViewActivity.Companion;
                            LoginProperties loginProperties2 = cVar.b;
                            PassportEnvironmentImpl primaryEnvironment = loginProperties2.getFilter().getPrimaryEnvironment();
                            PassportTheme theme2 = loginProperties2.getTheme();
                            WebCaseType webCaseType = WebCaseType.SOCIAL_AUTH;
                            SocialConfiguration socialConfiguration3 = cVar.c;
                            String str3 = ((g) cVar.x).b;
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("social-provider", socialConfiguration3);
                            bundle.putString("native-application", str3);
                            return com.yandex.passport.internal.ui.webview.b.b(bVar, primaryEnvironment, (Context) obj, theme2, webCaseType, bundle);
                        case 3:
                            Context context3 = (Context) obj;
                            com.yandex.passport.internal.ui.webview.b bVar2 = WebViewActivity.Companion;
                            LoginProperties loginProperties3 = cVar.b;
                            PassportEnvironmentImpl primaryEnvironment2 = loginProperties3.getFilter().getPrimaryEnvironment();
                            PassportTheme theme3 = loginProperties3.getTheme();
                            WebCaseType webCaseType2 = WebCaseType.MAIL_OAUTH;
                            SocialConfiguration socialConfiguration4 = cVar.c;
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("social-provider", socialConfiguration4);
                            return com.yandex.passport.internal.ui.webview.b.b(bVar2, primaryEnvironment2, context3, theme3, webCaseType2, bundle2);
                        case 4:
                            com.yandex.passport.internal.ui.social.mail.a aVar = MailPasswordLoginActivity.Companion;
                            LoginProperties loginProperties4 = cVar.b;
                            String str4 = ((com.yandex.passport.internal.ui.social.e) cVar.x).b;
                            aVar.getClass();
                            Intent intent = new Intent((Context) obj, (Class<?>) MailPasswordLoginActivity.class);
                            intent.putExtras(loginProperties4.toBundle());
                            intent.putExtra(MailPasswordLoginFragment.KEY_SUGGESTED_LOGIN, str4);
                            return intent;
                        case 5:
                            return ((com.yandex.passport.internal.ui.social.d) cVar.x).b;
                        default:
                            return ((com.yandex.passport.internal.ui.social.f) cVar.x).b;
                    }
                }
            }, 103);
        } else if (jl40.l(hVar, com.yandex.passport.internal.ui.social.b.b)) {
            final int i2 = 1;
            lVar = new com.yandex.passport.internal.ui.base.l(new com.yandex.passport.legacy.lx.j(this) { // from class: com.yandex.passport.internal.ui.social.authenticators.a
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // com.yandex.passport.legacy.lx.j
                public final Object a(Object obj) {
                    int i22 = i2;
                    c cVar = this.b;
                    switch (i22) {
                        case 0:
                            Context context = (Context) obj;
                            cVar.K = com.yandex.passport.internal.util.b.b();
                            com.yandex.passport.internal.network.client.c cVar2 = cVar.I;
                            LoginProperties loginProperties = cVar.b;
                            com.yandex.passport.internal.network.client.e b = cVar2.b(com.yandex.passport.internal.util.p.u(loginProperties.getFilter().getPrimaryEnvironment()));
                            SocialConfiguration socialConfiguration = cVar.c;
                            String b2 = com.yandex.passport.common.browser.c.b(context);
                            j jVar = cVar.C;
                            String str = cVar.K;
                            jVar.getClass();
                            String a = j.a(str);
                            String str2 = ((com.yandex.passport.internal.ui.social.c) cVar.x).b;
                            PassportTheme theme = loginProperties.getTheme();
                            Locale locale = cVar.J.q;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) b.f;
                            Uri.Builder appendQueryParameter = Uri.parse(b.a()).buildUpon().appendEncodedPath(com.yandex.passport.internal.network.client.d.a[socialConfiguration.getProviderCode().ordinal()] == 1 ? "pwl/social/start" : "auth/social/start").appendQueryParameter("consumer", eVar.a()).appendQueryParameter(CommonUrlParts.APP_ID, eVar.a()).appendQueryParameter("provider", socialConfiguration.getProviderCodeOld()).appendQueryParameter("retpath", b2).appendQueryParameter("code_challenge", a).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("passthrough_errors", "UserDeniedError").appendQueryParameter("lang", locale.getLanguage()).appendQueryParameter("locale", locale.getCountry()).appendQueryParameter(DivkitThemeChangeListener.THEME_VARIABLE_NAME, o.b(theme)).appendQueryParameter("app_platform", ConstantDeviceInfo.APP_PLATFORM);
                            String d = b.e.d();
                            if (d != null) {
                                appendQueryParameter.appendQueryParameter(MetaDataField.DEVICE_ID_FIELD, d);
                            }
                            if (str2 != null) {
                                appendQueryParameter.appendQueryParameter(ClidProvider.APPLICATION, str2);
                            }
                            return SocialBrowserActivity.createIntent(context, Uri.parse(appendQueryParameter.toString()));
                        case 1:
                            Context context2 = (Context) obj;
                            com.yandex.passport.internal.network.client.e b3 = cVar.I.b(com.yandex.passport.internal.util.p.u(cVar.b.getFilter().getPrimaryEnvironment()));
                            SocialConfiguration socialConfiguration2 = cVar.c;
                            return SocialBrowserActivity.createIntent(context2, Uri.parse(b3.b(socialConfiguration2.getProviderCodeOld(), com.yandex.passport.common.browser.c.b(context2), socialConfiguration2.getScope(), socialConfiguration2.getExtraQueryParams())));
                        case 2:
                            com.yandex.passport.internal.ui.webview.b bVar = WebViewActivity.Companion;
                            LoginProperties loginProperties2 = cVar.b;
                            PassportEnvironmentImpl primaryEnvironment = loginProperties2.getFilter().getPrimaryEnvironment();
                            PassportTheme theme2 = loginProperties2.getTheme();
                            WebCaseType webCaseType = WebCaseType.SOCIAL_AUTH;
                            SocialConfiguration socialConfiguration3 = cVar.c;
                            String str3 = ((g) cVar.x).b;
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("social-provider", socialConfiguration3);
                            bundle.putString("native-application", str3);
                            return com.yandex.passport.internal.ui.webview.b.b(bVar, primaryEnvironment, (Context) obj, theme2, webCaseType, bundle);
                        case 3:
                            Context context3 = (Context) obj;
                            com.yandex.passport.internal.ui.webview.b bVar2 = WebViewActivity.Companion;
                            LoginProperties loginProperties3 = cVar.b;
                            PassportEnvironmentImpl primaryEnvironment2 = loginProperties3.getFilter().getPrimaryEnvironment();
                            PassportTheme theme3 = loginProperties3.getTheme();
                            WebCaseType webCaseType2 = WebCaseType.MAIL_OAUTH;
                            SocialConfiguration socialConfiguration4 = cVar.c;
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("social-provider", socialConfiguration4);
                            return com.yandex.passport.internal.ui.webview.b.b(bVar2, primaryEnvironment2, context3, theme3, webCaseType2, bundle2);
                        case 4:
                            com.yandex.passport.internal.ui.social.mail.a aVar = MailPasswordLoginActivity.Companion;
                            LoginProperties loginProperties4 = cVar.b;
                            String str4 = ((com.yandex.passport.internal.ui.social.e) cVar.x).b;
                            aVar.getClass();
                            Intent intent = new Intent((Context) obj, (Class<?>) MailPasswordLoginActivity.class);
                            intent.putExtras(loginProperties4.toBundle());
                            intent.putExtra(MailPasswordLoginFragment.KEY_SUGGESTED_LOGIN, str4);
                            return intent;
                        case 5:
                            return ((com.yandex.passport.internal.ui.social.d) cVar.x).b;
                        default:
                            return ((com.yandex.passport.internal.ui.social.f) cVar.x).b;
                    }
                }
            }, 102);
        } else if (hVar instanceof g) {
            final int i3 = 2;
            lVar = new com.yandex.passport.internal.ui.base.l(new com.yandex.passport.legacy.lx.j(this) { // from class: com.yandex.passport.internal.ui.social.authenticators.a
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // com.yandex.passport.legacy.lx.j
                public final Object a(Object obj) {
                    int i22 = i3;
                    c cVar = this.b;
                    switch (i22) {
                        case 0:
                            Context context = (Context) obj;
                            cVar.K = com.yandex.passport.internal.util.b.b();
                            com.yandex.passport.internal.network.client.c cVar2 = cVar.I;
                            LoginProperties loginProperties = cVar.b;
                            com.yandex.passport.internal.network.client.e b = cVar2.b(com.yandex.passport.internal.util.p.u(loginProperties.getFilter().getPrimaryEnvironment()));
                            SocialConfiguration socialConfiguration = cVar.c;
                            String b2 = com.yandex.passport.common.browser.c.b(context);
                            j jVar = cVar.C;
                            String str = cVar.K;
                            jVar.getClass();
                            String a = j.a(str);
                            String str2 = ((com.yandex.passport.internal.ui.social.c) cVar.x).b;
                            PassportTheme theme = loginProperties.getTheme();
                            Locale locale = cVar.J.q;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) b.f;
                            Uri.Builder appendQueryParameter = Uri.parse(b.a()).buildUpon().appendEncodedPath(com.yandex.passport.internal.network.client.d.a[socialConfiguration.getProviderCode().ordinal()] == 1 ? "pwl/social/start" : "auth/social/start").appendQueryParameter("consumer", eVar.a()).appendQueryParameter(CommonUrlParts.APP_ID, eVar.a()).appendQueryParameter("provider", socialConfiguration.getProviderCodeOld()).appendQueryParameter("retpath", b2).appendQueryParameter("code_challenge", a).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("passthrough_errors", "UserDeniedError").appendQueryParameter("lang", locale.getLanguage()).appendQueryParameter("locale", locale.getCountry()).appendQueryParameter(DivkitThemeChangeListener.THEME_VARIABLE_NAME, o.b(theme)).appendQueryParameter("app_platform", ConstantDeviceInfo.APP_PLATFORM);
                            String d = b.e.d();
                            if (d != null) {
                                appendQueryParameter.appendQueryParameter(MetaDataField.DEVICE_ID_FIELD, d);
                            }
                            if (str2 != null) {
                                appendQueryParameter.appendQueryParameter(ClidProvider.APPLICATION, str2);
                            }
                            return SocialBrowserActivity.createIntent(context, Uri.parse(appendQueryParameter.toString()));
                        case 1:
                            Context context2 = (Context) obj;
                            com.yandex.passport.internal.network.client.e b3 = cVar.I.b(com.yandex.passport.internal.util.p.u(cVar.b.getFilter().getPrimaryEnvironment()));
                            SocialConfiguration socialConfiguration2 = cVar.c;
                            return SocialBrowserActivity.createIntent(context2, Uri.parse(b3.b(socialConfiguration2.getProviderCodeOld(), com.yandex.passport.common.browser.c.b(context2), socialConfiguration2.getScope(), socialConfiguration2.getExtraQueryParams())));
                        case 2:
                            com.yandex.passport.internal.ui.webview.b bVar = WebViewActivity.Companion;
                            LoginProperties loginProperties2 = cVar.b;
                            PassportEnvironmentImpl primaryEnvironment = loginProperties2.getFilter().getPrimaryEnvironment();
                            PassportTheme theme2 = loginProperties2.getTheme();
                            WebCaseType webCaseType = WebCaseType.SOCIAL_AUTH;
                            SocialConfiguration socialConfiguration3 = cVar.c;
                            String str3 = ((g) cVar.x).b;
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("social-provider", socialConfiguration3);
                            bundle.putString("native-application", str3);
                            return com.yandex.passport.internal.ui.webview.b.b(bVar, primaryEnvironment, (Context) obj, theme2, webCaseType, bundle);
                        case 3:
                            Context context3 = (Context) obj;
                            com.yandex.passport.internal.ui.webview.b bVar2 = WebViewActivity.Companion;
                            LoginProperties loginProperties3 = cVar.b;
                            PassportEnvironmentImpl primaryEnvironment2 = loginProperties3.getFilter().getPrimaryEnvironment();
                            PassportTheme theme3 = loginProperties3.getTheme();
                            WebCaseType webCaseType2 = WebCaseType.MAIL_OAUTH;
                            SocialConfiguration socialConfiguration4 = cVar.c;
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("social-provider", socialConfiguration4);
                            return com.yandex.passport.internal.ui.webview.b.b(bVar2, primaryEnvironment2, context3, theme3, webCaseType2, bundle2);
                        case 4:
                            com.yandex.passport.internal.ui.social.mail.a aVar = MailPasswordLoginActivity.Companion;
                            LoginProperties loginProperties4 = cVar.b;
                            String str4 = ((com.yandex.passport.internal.ui.social.e) cVar.x).b;
                            aVar.getClass();
                            Intent intent = new Intent((Context) obj, (Class<?>) MailPasswordLoginActivity.class);
                            intent.putExtras(loginProperties4.toBundle());
                            intent.putExtra(MailPasswordLoginFragment.KEY_SUGGESTED_LOGIN, str4);
                            return intent;
                        case 5:
                            return ((com.yandex.passport.internal.ui.social.d) cVar.x).b;
                        default:
                            return ((com.yandex.passport.internal.ui.social.f) cVar.x).b;
                    }
                }
            }, 101);
        } else if (jl40.l(hVar, com.yandex.passport.internal.ui.social.b.c)) {
            final int i4 = 3;
            lVar = new com.yandex.passport.internal.ui.base.l(new com.yandex.passport.legacy.lx.j(this) { // from class: com.yandex.passport.internal.ui.social.authenticators.a
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // com.yandex.passport.legacy.lx.j
                public final Object a(Object obj) {
                    int i22 = i4;
                    c cVar = this.b;
                    switch (i22) {
                        case 0:
                            Context context = (Context) obj;
                            cVar.K = com.yandex.passport.internal.util.b.b();
                            com.yandex.passport.internal.network.client.c cVar2 = cVar.I;
                            LoginProperties loginProperties = cVar.b;
                            com.yandex.passport.internal.network.client.e b = cVar2.b(com.yandex.passport.internal.util.p.u(loginProperties.getFilter().getPrimaryEnvironment()));
                            SocialConfiguration socialConfiguration = cVar.c;
                            String b2 = com.yandex.passport.common.browser.c.b(context);
                            j jVar = cVar.C;
                            String str = cVar.K;
                            jVar.getClass();
                            String a = j.a(str);
                            String str2 = ((com.yandex.passport.internal.ui.social.c) cVar.x).b;
                            PassportTheme theme = loginProperties.getTheme();
                            Locale locale = cVar.J.q;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) b.f;
                            Uri.Builder appendQueryParameter = Uri.parse(b.a()).buildUpon().appendEncodedPath(com.yandex.passport.internal.network.client.d.a[socialConfiguration.getProviderCode().ordinal()] == 1 ? "pwl/social/start" : "auth/social/start").appendQueryParameter("consumer", eVar.a()).appendQueryParameter(CommonUrlParts.APP_ID, eVar.a()).appendQueryParameter("provider", socialConfiguration.getProviderCodeOld()).appendQueryParameter("retpath", b2).appendQueryParameter("code_challenge", a).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("passthrough_errors", "UserDeniedError").appendQueryParameter("lang", locale.getLanguage()).appendQueryParameter("locale", locale.getCountry()).appendQueryParameter(DivkitThemeChangeListener.THEME_VARIABLE_NAME, o.b(theme)).appendQueryParameter("app_platform", ConstantDeviceInfo.APP_PLATFORM);
                            String d = b.e.d();
                            if (d != null) {
                                appendQueryParameter.appendQueryParameter(MetaDataField.DEVICE_ID_FIELD, d);
                            }
                            if (str2 != null) {
                                appendQueryParameter.appendQueryParameter(ClidProvider.APPLICATION, str2);
                            }
                            return SocialBrowserActivity.createIntent(context, Uri.parse(appendQueryParameter.toString()));
                        case 1:
                            Context context2 = (Context) obj;
                            com.yandex.passport.internal.network.client.e b3 = cVar.I.b(com.yandex.passport.internal.util.p.u(cVar.b.getFilter().getPrimaryEnvironment()));
                            SocialConfiguration socialConfiguration2 = cVar.c;
                            return SocialBrowserActivity.createIntent(context2, Uri.parse(b3.b(socialConfiguration2.getProviderCodeOld(), com.yandex.passport.common.browser.c.b(context2), socialConfiguration2.getScope(), socialConfiguration2.getExtraQueryParams())));
                        case 2:
                            com.yandex.passport.internal.ui.webview.b bVar = WebViewActivity.Companion;
                            LoginProperties loginProperties2 = cVar.b;
                            PassportEnvironmentImpl primaryEnvironment = loginProperties2.getFilter().getPrimaryEnvironment();
                            PassportTheme theme2 = loginProperties2.getTheme();
                            WebCaseType webCaseType = WebCaseType.SOCIAL_AUTH;
                            SocialConfiguration socialConfiguration3 = cVar.c;
                            String str3 = ((g) cVar.x).b;
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("social-provider", socialConfiguration3);
                            bundle.putString("native-application", str3);
                            return com.yandex.passport.internal.ui.webview.b.b(bVar, primaryEnvironment, (Context) obj, theme2, webCaseType, bundle);
                        case 3:
                            Context context3 = (Context) obj;
                            com.yandex.passport.internal.ui.webview.b bVar2 = WebViewActivity.Companion;
                            LoginProperties loginProperties3 = cVar.b;
                            PassportEnvironmentImpl primaryEnvironment2 = loginProperties3.getFilter().getPrimaryEnvironment();
                            PassportTheme theme3 = loginProperties3.getTheme();
                            WebCaseType webCaseType2 = WebCaseType.MAIL_OAUTH;
                            SocialConfiguration socialConfiguration4 = cVar.c;
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("social-provider", socialConfiguration4);
                            return com.yandex.passport.internal.ui.webview.b.b(bVar2, primaryEnvironment2, context3, theme3, webCaseType2, bundle2);
                        case 4:
                            com.yandex.passport.internal.ui.social.mail.a aVar = MailPasswordLoginActivity.Companion;
                            LoginProperties loginProperties4 = cVar.b;
                            String str4 = ((com.yandex.passport.internal.ui.social.e) cVar.x).b;
                            aVar.getClass();
                            Intent intent = new Intent((Context) obj, (Class<?>) MailPasswordLoginActivity.class);
                            intent.putExtras(loginProperties4.toBundle());
                            intent.putExtra(MailPasswordLoginFragment.KEY_SUGGESTED_LOGIN, str4);
                            return intent;
                        case 5:
                            return ((com.yandex.passport.internal.ui.social.d) cVar.x).b;
                        default:
                            return ((com.yandex.passport.internal.ui.social.f) cVar.x).b;
                    }
                }
            }, 100);
        } else if (hVar instanceof com.yandex.passport.internal.ui.social.e) {
            final int i5 = 4;
            lVar = new com.yandex.passport.internal.ui.base.l(new com.yandex.passport.legacy.lx.j(this) { // from class: com.yandex.passport.internal.ui.social.authenticators.a
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // com.yandex.passport.legacy.lx.j
                public final Object a(Object obj) {
                    int i22 = i5;
                    c cVar = this.b;
                    switch (i22) {
                        case 0:
                            Context context = (Context) obj;
                            cVar.K = com.yandex.passport.internal.util.b.b();
                            com.yandex.passport.internal.network.client.c cVar2 = cVar.I;
                            LoginProperties loginProperties = cVar.b;
                            com.yandex.passport.internal.network.client.e b = cVar2.b(com.yandex.passport.internal.util.p.u(loginProperties.getFilter().getPrimaryEnvironment()));
                            SocialConfiguration socialConfiguration = cVar.c;
                            String b2 = com.yandex.passport.common.browser.c.b(context);
                            j jVar = cVar.C;
                            String str = cVar.K;
                            jVar.getClass();
                            String a = j.a(str);
                            String str2 = ((com.yandex.passport.internal.ui.social.c) cVar.x).b;
                            PassportTheme theme = loginProperties.getTheme();
                            Locale locale = cVar.J.q;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) b.f;
                            Uri.Builder appendQueryParameter = Uri.parse(b.a()).buildUpon().appendEncodedPath(com.yandex.passport.internal.network.client.d.a[socialConfiguration.getProviderCode().ordinal()] == 1 ? "pwl/social/start" : "auth/social/start").appendQueryParameter("consumer", eVar.a()).appendQueryParameter(CommonUrlParts.APP_ID, eVar.a()).appendQueryParameter("provider", socialConfiguration.getProviderCodeOld()).appendQueryParameter("retpath", b2).appendQueryParameter("code_challenge", a).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("passthrough_errors", "UserDeniedError").appendQueryParameter("lang", locale.getLanguage()).appendQueryParameter("locale", locale.getCountry()).appendQueryParameter(DivkitThemeChangeListener.THEME_VARIABLE_NAME, o.b(theme)).appendQueryParameter("app_platform", ConstantDeviceInfo.APP_PLATFORM);
                            String d = b.e.d();
                            if (d != null) {
                                appendQueryParameter.appendQueryParameter(MetaDataField.DEVICE_ID_FIELD, d);
                            }
                            if (str2 != null) {
                                appendQueryParameter.appendQueryParameter(ClidProvider.APPLICATION, str2);
                            }
                            return SocialBrowserActivity.createIntent(context, Uri.parse(appendQueryParameter.toString()));
                        case 1:
                            Context context2 = (Context) obj;
                            com.yandex.passport.internal.network.client.e b3 = cVar.I.b(com.yandex.passport.internal.util.p.u(cVar.b.getFilter().getPrimaryEnvironment()));
                            SocialConfiguration socialConfiguration2 = cVar.c;
                            return SocialBrowserActivity.createIntent(context2, Uri.parse(b3.b(socialConfiguration2.getProviderCodeOld(), com.yandex.passport.common.browser.c.b(context2), socialConfiguration2.getScope(), socialConfiguration2.getExtraQueryParams())));
                        case 2:
                            com.yandex.passport.internal.ui.webview.b bVar = WebViewActivity.Companion;
                            LoginProperties loginProperties2 = cVar.b;
                            PassportEnvironmentImpl primaryEnvironment = loginProperties2.getFilter().getPrimaryEnvironment();
                            PassportTheme theme2 = loginProperties2.getTheme();
                            WebCaseType webCaseType = WebCaseType.SOCIAL_AUTH;
                            SocialConfiguration socialConfiguration3 = cVar.c;
                            String str3 = ((g) cVar.x).b;
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("social-provider", socialConfiguration3);
                            bundle.putString("native-application", str3);
                            return com.yandex.passport.internal.ui.webview.b.b(bVar, primaryEnvironment, (Context) obj, theme2, webCaseType, bundle);
                        case 3:
                            Context context3 = (Context) obj;
                            com.yandex.passport.internal.ui.webview.b bVar2 = WebViewActivity.Companion;
                            LoginProperties loginProperties3 = cVar.b;
                            PassportEnvironmentImpl primaryEnvironment2 = loginProperties3.getFilter().getPrimaryEnvironment();
                            PassportTheme theme3 = loginProperties3.getTheme();
                            WebCaseType webCaseType2 = WebCaseType.MAIL_OAUTH;
                            SocialConfiguration socialConfiguration4 = cVar.c;
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("social-provider", socialConfiguration4);
                            return com.yandex.passport.internal.ui.webview.b.b(bVar2, primaryEnvironment2, context3, theme3, webCaseType2, bundle2);
                        case 4:
                            com.yandex.passport.internal.ui.social.mail.a aVar = MailPasswordLoginActivity.Companion;
                            LoginProperties loginProperties4 = cVar.b;
                            String str4 = ((com.yandex.passport.internal.ui.social.e) cVar.x).b;
                            aVar.getClass();
                            Intent intent = new Intent((Context) obj, (Class<?>) MailPasswordLoginActivity.class);
                            intent.putExtras(loginProperties4.toBundle());
                            intent.putExtra(MailPasswordLoginFragment.KEY_SUGGESTED_LOGIN, str4);
                            return intent;
                        case 5:
                            return ((com.yandex.passport.internal.ui.social.d) cVar.x).b;
                        default:
                            return ((com.yandex.passport.internal.ui.social.f) cVar.x).b;
                    }
                }
            }, 106);
        } else if (hVar instanceof com.yandex.passport.internal.ui.social.d) {
            final int i6 = 5;
            lVar = new com.yandex.passport.internal.ui.base.l(new com.yandex.passport.legacy.lx.j(this) { // from class: com.yandex.passport.internal.ui.social.authenticators.a
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // com.yandex.passport.legacy.lx.j
                public final Object a(Object obj) {
                    int i22 = i6;
                    c cVar = this.b;
                    switch (i22) {
                        case 0:
                            Context context = (Context) obj;
                            cVar.K = com.yandex.passport.internal.util.b.b();
                            com.yandex.passport.internal.network.client.c cVar2 = cVar.I;
                            LoginProperties loginProperties = cVar.b;
                            com.yandex.passport.internal.network.client.e b = cVar2.b(com.yandex.passport.internal.util.p.u(loginProperties.getFilter().getPrimaryEnvironment()));
                            SocialConfiguration socialConfiguration = cVar.c;
                            String b2 = com.yandex.passport.common.browser.c.b(context);
                            j jVar = cVar.C;
                            String str = cVar.K;
                            jVar.getClass();
                            String a = j.a(str);
                            String str2 = ((com.yandex.passport.internal.ui.social.c) cVar.x).b;
                            PassportTheme theme = loginProperties.getTheme();
                            Locale locale = cVar.J.q;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) b.f;
                            Uri.Builder appendQueryParameter = Uri.parse(b.a()).buildUpon().appendEncodedPath(com.yandex.passport.internal.network.client.d.a[socialConfiguration.getProviderCode().ordinal()] == 1 ? "pwl/social/start" : "auth/social/start").appendQueryParameter("consumer", eVar.a()).appendQueryParameter(CommonUrlParts.APP_ID, eVar.a()).appendQueryParameter("provider", socialConfiguration.getProviderCodeOld()).appendQueryParameter("retpath", b2).appendQueryParameter("code_challenge", a).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("passthrough_errors", "UserDeniedError").appendQueryParameter("lang", locale.getLanguage()).appendQueryParameter("locale", locale.getCountry()).appendQueryParameter(DivkitThemeChangeListener.THEME_VARIABLE_NAME, o.b(theme)).appendQueryParameter("app_platform", ConstantDeviceInfo.APP_PLATFORM);
                            String d = b.e.d();
                            if (d != null) {
                                appendQueryParameter.appendQueryParameter(MetaDataField.DEVICE_ID_FIELD, d);
                            }
                            if (str2 != null) {
                                appendQueryParameter.appendQueryParameter(ClidProvider.APPLICATION, str2);
                            }
                            return SocialBrowserActivity.createIntent(context, Uri.parse(appendQueryParameter.toString()));
                        case 1:
                            Context context2 = (Context) obj;
                            com.yandex.passport.internal.network.client.e b3 = cVar.I.b(com.yandex.passport.internal.util.p.u(cVar.b.getFilter().getPrimaryEnvironment()));
                            SocialConfiguration socialConfiguration2 = cVar.c;
                            return SocialBrowserActivity.createIntent(context2, Uri.parse(b3.b(socialConfiguration2.getProviderCodeOld(), com.yandex.passport.common.browser.c.b(context2), socialConfiguration2.getScope(), socialConfiguration2.getExtraQueryParams())));
                        case 2:
                            com.yandex.passport.internal.ui.webview.b bVar = WebViewActivity.Companion;
                            LoginProperties loginProperties2 = cVar.b;
                            PassportEnvironmentImpl primaryEnvironment = loginProperties2.getFilter().getPrimaryEnvironment();
                            PassportTheme theme2 = loginProperties2.getTheme();
                            WebCaseType webCaseType = WebCaseType.SOCIAL_AUTH;
                            SocialConfiguration socialConfiguration3 = cVar.c;
                            String str3 = ((g) cVar.x).b;
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("social-provider", socialConfiguration3);
                            bundle.putString("native-application", str3);
                            return com.yandex.passport.internal.ui.webview.b.b(bVar, primaryEnvironment, (Context) obj, theme2, webCaseType, bundle);
                        case 3:
                            Context context3 = (Context) obj;
                            com.yandex.passport.internal.ui.webview.b bVar2 = WebViewActivity.Companion;
                            LoginProperties loginProperties3 = cVar.b;
                            PassportEnvironmentImpl primaryEnvironment2 = loginProperties3.getFilter().getPrimaryEnvironment();
                            PassportTheme theme3 = loginProperties3.getTheme();
                            WebCaseType webCaseType2 = WebCaseType.MAIL_OAUTH;
                            SocialConfiguration socialConfiguration4 = cVar.c;
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("social-provider", socialConfiguration4);
                            return com.yandex.passport.internal.ui.webview.b.b(bVar2, primaryEnvironment2, context3, theme3, webCaseType2, bundle2);
                        case 4:
                            com.yandex.passport.internal.ui.social.mail.a aVar = MailPasswordLoginActivity.Companion;
                            LoginProperties loginProperties4 = cVar.b;
                            String str4 = ((com.yandex.passport.internal.ui.social.e) cVar.x).b;
                            aVar.getClass();
                            Intent intent = new Intent((Context) obj, (Class<?>) MailPasswordLoginActivity.class);
                            intent.putExtras(loginProperties4.toBundle());
                            intent.putExtra(MailPasswordLoginFragment.KEY_SUGGESTED_LOGIN, str4);
                            return intent;
                        case 5:
                            return ((com.yandex.passport.internal.ui.social.d) cVar.x).b;
                        default:
                            return ((com.yandex.passport.internal.ui.social.f) cVar.x).b;
                    }
                }
            }, 105);
        } else if (!(hVar instanceof com.yandex.passport.internal.ui.social.f)) {
            w511.b();
            return;
        } else {
            final int i7 = 6;
            lVar = new com.yandex.passport.internal.ui.base.l(new com.yandex.passport.legacy.lx.j(this) { // from class: com.yandex.passport.internal.ui.social.authenticators.a
                public final /* synthetic */ c b;

                {
                    this.b = this;
                }

                @Override // com.yandex.passport.legacy.lx.j
                public final Object a(Object obj) {
                    int i22 = i7;
                    c cVar = this.b;
                    switch (i22) {
                        case 0:
                            Context context = (Context) obj;
                            cVar.K = com.yandex.passport.internal.util.b.b();
                            com.yandex.passport.internal.network.client.c cVar2 = cVar.I;
                            LoginProperties loginProperties = cVar.b;
                            com.yandex.passport.internal.network.client.e b = cVar2.b(com.yandex.passport.internal.util.p.u(loginProperties.getFilter().getPrimaryEnvironment()));
                            SocialConfiguration socialConfiguration = cVar.c;
                            String b2 = com.yandex.passport.common.browser.c.b(context);
                            j jVar = cVar.C;
                            String str = cVar.K;
                            jVar.getClass();
                            String a = j.a(str);
                            String str2 = ((com.yandex.passport.internal.ui.social.c) cVar.x).b;
                            PassportTheme theme = loginProperties.getTheme();
                            Locale locale = cVar.J.q;
                            if (locale == null) {
                                locale = Locale.getDefault();
                            }
                            com.yandex.passport.internal.common.e eVar = (com.yandex.passport.internal.common.e) b.f;
                            Uri.Builder appendQueryParameter = Uri.parse(b.a()).buildUpon().appendEncodedPath(com.yandex.passport.internal.network.client.d.a[socialConfiguration.getProviderCode().ordinal()] == 1 ? "pwl/social/start" : "auth/social/start").appendQueryParameter("consumer", eVar.a()).appendQueryParameter(CommonUrlParts.APP_ID, eVar.a()).appendQueryParameter("provider", socialConfiguration.getProviderCodeOld()).appendQueryParameter("retpath", b2).appendQueryParameter("code_challenge", a).appendQueryParameter("place", "query").appendQueryParameter("display", "touch").appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("passthrough_errors", "UserDeniedError").appendQueryParameter("lang", locale.getLanguage()).appendQueryParameter("locale", locale.getCountry()).appendQueryParameter(DivkitThemeChangeListener.THEME_VARIABLE_NAME, o.b(theme)).appendQueryParameter("app_platform", ConstantDeviceInfo.APP_PLATFORM);
                            String d = b.e.d();
                            if (d != null) {
                                appendQueryParameter.appendQueryParameter(MetaDataField.DEVICE_ID_FIELD, d);
                            }
                            if (str2 != null) {
                                appendQueryParameter.appendQueryParameter(ClidProvider.APPLICATION, str2);
                            }
                            return SocialBrowserActivity.createIntent(context, Uri.parse(appendQueryParameter.toString()));
                        case 1:
                            Context context2 = (Context) obj;
                            com.yandex.passport.internal.network.client.e b3 = cVar.I.b(com.yandex.passport.internal.util.p.u(cVar.b.getFilter().getPrimaryEnvironment()));
                            SocialConfiguration socialConfiguration2 = cVar.c;
                            return SocialBrowserActivity.createIntent(context2, Uri.parse(b3.b(socialConfiguration2.getProviderCodeOld(), com.yandex.passport.common.browser.c.b(context2), socialConfiguration2.getScope(), socialConfiguration2.getExtraQueryParams())));
                        case 2:
                            com.yandex.passport.internal.ui.webview.b bVar = WebViewActivity.Companion;
                            LoginProperties loginProperties2 = cVar.b;
                            PassportEnvironmentImpl primaryEnvironment = loginProperties2.getFilter().getPrimaryEnvironment();
                            PassportTheme theme2 = loginProperties2.getTheme();
                            WebCaseType webCaseType = WebCaseType.SOCIAL_AUTH;
                            SocialConfiguration socialConfiguration3 = cVar.c;
                            String str3 = ((g) cVar.x).b;
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("social-provider", socialConfiguration3);
                            bundle.putString("native-application", str3);
                            return com.yandex.passport.internal.ui.webview.b.b(bVar, primaryEnvironment, (Context) obj, theme2, webCaseType, bundle);
                        case 3:
                            Context context3 = (Context) obj;
                            com.yandex.passport.internal.ui.webview.b bVar2 = WebViewActivity.Companion;
                            LoginProperties loginProperties3 = cVar.b;
                            PassportEnvironmentImpl primaryEnvironment2 = loginProperties3.getFilter().getPrimaryEnvironment();
                            PassportTheme theme3 = loginProperties3.getTheme();
                            WebCaseType webCaseType2 = WebCaseType.MAIL_OAUTH;
                            SocialConfiguration socialConfiguration4 = cVar.c;
                            Bundle bundle2 = new Bundle();
                            bundle2.putParcelable("social-provider", socialConfiguration4);
                            return com.yandex.passport.internal.ui.webview.b.b(bVar2, primaryEnvironment2, context3, theme3, webCaseType2, bundle2);
                        case 4:
                            com.yandex.passport.internal.ui.social.mail.a aVar = MailPasswordLoginActivity.Companion;
                            LoginProperties loginProperties4 = cVar.b;
                            String str4 = ((com.yandex.passport.internal.ui.social.e) cVar.x).b;
                            aVar.getClass();
                            Intent intent = new Intent((Context) obj, (Class<?>) MailPasswordLoginActivity.class);
                            intent.putExtras(loginProperties4.toBundle());
                            intent.putExtra(MailPasswordLoginFragment.KEY_SUGGESTED_LOGIN, str4);
                            return intent;
                        case 5:
                            return ((com.yandex.passport.internal.ui.social.d) cVar.x).b;
                        default:
                            return ((com.yandex.passport.internal.ui.social.f) cVar.x).b;
                    }
                }
            }, 104);
        }
        d0(lVar);
    }

    @Override // com.yandex.passport.internal.ui.social.authenticators.f
    public final void Y(Bundle bundle) {
        if (bundle != null) {
            this.K = bundle.getString("code-challenge");
        }
    }

    @Override // com.yandex.passport.internal.ui.social.authenticators.f
    public final void Z(Bundle bundle) {
        bundle.putString("code-challenge", this.K);
    }

    public final void b0() {
        w0 w0Var = this.y;
        w0Var.getClass();
        w0Var.f(sa.w, new yd(w0.j(this.c), 5, false), new md(w0Var.c, 21));
        com.yandex.passport.internal.ui.social.p pVar = com.yandex.passport.internal.ui.social.p.a;
        r0 r0Var = this.A;
        r0Var.getClass();
        r0Var.m(null, pVar);
    }

    public final void c0(Throwable th) {
        w0 w0Var = this.y;
        w0Var.getClass();
        w0Var.f(ta.w, new yd(w0.j(this.c), 5, false), new yd(th), new md(w0Var.c, 21));
        q qVar = new q(this.z.a(th));
        r0 r0Var = this.A;
        r0Var.getClass();
        r0Var.m(null, qVar);
    }

    public final void d0(com.yandex.passport.internal.ui.base.l lVar) {
        int i = lVar.b;
        w0 w0Var = this.y;
        w0Var.getClass();
        w0Var.f(ya.w, new yd(w0.j(this.c), 5, false), new md(i, 14), new md(w0Var.c, 21));
        r rVar = new r(lVar);
        r0 r0Var = this.A;
        r0Var.getClass();
        r0Var.m(null, rVar);
    }

    public final void e0(ModernAccount modernAccount) {
        String str;
        w0 w0Var = this.y;
        w0Var.getClass();
        int primaryAliasType = modernAccount.getPrimaryAliasType();
        if (primaryAliasType == 6) {
            str = (String) w0.w.get(modernAccount.getSocialProviderCode());
            if (str == null) {
                str = LegacyAccountType.STRING_SOCIAL;
            }
        } else if (primaryAliasType != 12) {
            str = LegacyAccountType.STRING_LOGIN;
        } else {
            str = (String) w0.x.get(modernAccount.getSocialProviderCode());
            if (str == null) {
                str = "mailish";
            }
        }
        w0Var.f(i1.w, new i("false", 5, false), new yd(str, 5, false), new jd(String.valueOf(modernAccount.getUid().getValue()), 3), new md(w0Var.c, 21));
        w0Var.f(ab.w, new yd(w0.j(this.c), 5, false), new jd(String.valueOf(modernAccount.getUid().getValue()), 3), new i(this.w, 15), new md(((h) this.x).a, 1, false), new md(w0Var.c, 21));
        com.yandex.passport.internal.ui.social.o oVar = new com.yandex.passport.internal.ui.social.o(modernAccount);
        r0 r0Var = this.A;
        r0Var.getClass();
        r0Var.m(null, oVar);
    }
}
