package com.yandex.passport.internal;

import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.api.PassportSocialProviderCode;
import com.yandex.passport.internal.SocialConfiguration;
import defpackage.g8e;
import defpackage.qke;
import defpackage.w511;
import kotlin.Pair;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes2.dex */
public final class y {
    public static SocialConfiguration a(PassportSocialConfiguration passportSocialConfiguration) {
        switch (x.a[passportSocialConfiguration.ordinal()]) {
            case 1:
                return new SocialConfiguration(PassportSocialConfiguration.SOCIAL_VKONTAKTE, SocialConfiguration.Type.SOCIAL, null, true, null, 20, null);
            case 2:
                return new SocialConfiguration(PassportSocialConfiguration.SOCIAL_FACEBOOK, SocialConfiguration.Type.SOCIAL, null, true, null, 20, null);
            case 3:
                return new SocialConfiguration(PassportSocialConfiguration.SOCIAL_TWITTER, SocialConfiguration.Type.SOCIAL, null, true, null, 20, null);
            case 4:
                return new SocialConfiguration(PassportSocialConfiguration.SOCIAL_ODNOKLASSNIKI, SocialConfiguration.Type.SOCIAL, null, true, null, 20, null);
            case 5:
                return new SocialConfiguration(PassportSocialConfiguration.SOCIAL_MAILRU, SocialConfiguration.Type.SOCIAL, null, true, null, 20, null);
            case 6:
                return new SocialConfiguration(PassportSocialConfiguration.SOCIAL_GOOGLE, SocialConfiguration.Type.SOCIAL, null, true, null, 20, null);
            case 7:
                return new SocialConfiguration(PassportSocialConfiguration.MAILISH_GOOGLE, SocialConfiguration.Type.MAIL_OAUTH, "https://mail.google.com/", true, g8e.z("force_prompt", "1"));
            case 8:
                return d(null);
            case 9:
                return c(null);
            case 10:
                return e(null);
            case 11:
                return new SocialConfiguration(PassportSocialConfiguration.MAILISH_RAMBLER, SocialConfiguration.Type.MAIL_PASSWORD, null, false, null, 28, null);
            case 12:
                return new SocialConfiguration(PassportSocialConfiguration.MAILISH_OTHER, SocialConfiguration.Type.MAIL_PASSWORD, null, false, null, 28, null);
            case 13:
                return new SocialConfiguration(PassportSocialConfiguration.SOCIAL_ESIA, SocialConfiguration.Type.SOCIAL, null, true, null, 20, null);
            case 14:
                return new SocialConfiguration(PassportSocialConfiguration.SOCIAL_TV_1001, SocialConfiguration.Type.SOCIAL, null, true, null, 20, null);
            default:
                w511.b();
                return null;
        }
    }

    public static PassportSocialConfiguration b(String str) {
        if (str.equals(PassportSocialProviderCode.VKONTAKTE.getCodeString())) {
            return PassportSocialConfiguration.SOCIAL_VKONTAKTE;
        }
        if (str.equals(PassportSocialProviderCode.FACEBOOK.getCodeString())) {
            return PassportSocialConfiguration.SOCIAL_FACEBOOK;
        }
        if (str.equals(PassportSocialProviderCode.TWITTER.getCodeString())) {
            return PassportSocialConfiguration.SOCIAL_TWITTER;
        }
        if (str.equals(PassportSocialProviderCode.ODNOKLASSNIKI.getCodeString())) {
            return PassportSocialConfiguration.SOCIAL_ODNOKLASSNIKI;
        }
        if (str.equals(PassportSocialProviderCode.GOOGLE.getCodeString())) {
            return PassportSocialConfiguration.SOCIAL_GOOGLE;
        }
        if (str.equals(PassportSocialProviderCode.MAILRU.getCodeString())) {
            return PassportSocialConfiguration.SOCIAL_MAILRU;
        }
        if (str.equals(PassportSocialProviderCode.ESIA.getCodeString())) {
            return PassportSocialConfiguration.SOCIAL_ESIA;
        }
        if (str.equals(PassportSocialProviderCode.TV1001.getCodeString())) {
            return PassportSocialConfiguration.SOCIAL_TV_1001;
        }
        return null;
    }

    public static SocialConfiguration c(String str) {
        return new SocialConfiguration(PassportSocialConfiguration.MAILISH_MAILRU, SocialConfiguration.Type.MAIL_OAUTH, "userinfo mail.imap", false, qke.k(kotlin.collections.b.i(new Pair(ClidProvider.APPLICATION, "mailru-o2-mail"), new Pair("login_hint", str))), 8, null);
    }

    public static SocialConfiguration d(String str) {
        return new SocialConfiguration(PassportSocialConfiguration.MAILISH_OUTLOOK, SocialConfiguration.Type.MAIL_OAUTH, "wl.imap wl.offline_access", false, qke.k(kotlin.collections.b.i(new Pair(ClidProvider.APPLICATION, "microsoft"), new Pair("login_hint", str))), 8, null);
    }

    public static SocialConfiguration e(String str) {
        return new SocialConfiguration(PassportSocialConfiguration.MAILISH_YAHOO, SocialConfiguration.Type.MAIL_OAUTH, "", false, qke.k(kotlin.collections.b.i(new Pair(ClidProvider.APPLICATION, "yahoo-mail-ru"), new Pair("login_hint", str))), 8, null);
    }
}
