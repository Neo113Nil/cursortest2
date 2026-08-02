package com.yandex.passport.internal.network.response;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportSocialConfiguration;
import com.yandex.passport.internal.SocialConfiguration;
import com.yandex.passport.internal.y;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0080\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006%"}, d2 = {"Lcom/yandex/passport/internal/network/response/AuthMethod;", "", "", "networkValue", "Ljava/lang/String;", "getNetworkValue", "()Ljava/lang/String;", "", "socialIcon", CA20Status.STATUS_USER_I, "getSocialIcon", "()I", "socialLabel", "getSocialLabel", "Lcom/yandex/passport/api/PassportSocialConfiguration;", "socialConfigurationId", "Lcom/yandex/passport/api/PassportSocialConfiguration;", "getSocialConfigurationId", "()Lcom/yandex/passport/api/PassportSocialConfiguration;", "", "isSocial", "Z", "b", "()Z", "Companion", "com/yandex/passport/internal/network/response/d", IDialogId.INTENT_EXTRA_OUT_PASSWORD, "MAGIC_LINK", "OTP", "SMS_CODE", "SOCIAL_VKONTAKTE", "SOCIAL_FACEBOOK", "SOCIAL_TWITTER", "SOCIAL_MAILRU", "SOCIAL_GOOGLE", "SOCIAL_ODNOKLASSNIKI", "NEO_PHONISH_RESTORE", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthMethod {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AuthMethod[] $VALUES;
    public static final d Companion;
    public static final AuthMethod MAGIC_LINK;
    public static final AuthMethod NEO_PHONISH_RESTORE;
    public static final AuthMethod OTP;
    public static final AuthMethod PASSWORD;
    public static final AuthMethod SMS_CODE;
    public static final AuthMethod SOCIAL_FACEBOOK;
    public static final AuthMethod SOCIAL_GOOGLE;
    public static final AuthMethod SOCIAL_MAILRU;
    public static final AuthMethod SOCIAL_ODNOKLASSNIKI;
    public static final AuthMethod SOCIAL_TWITTER;
    public static final AuthMethod SOCIAL_VKONTAKTE;
    private final boolean isSocial;
    private final String networkValue;
    private final PassportSocialConfiguration socialConfigurationId;
    private final int socialIcon;
    private final int socialLabel;

    static {
        String str = URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD;
        AuthMethod authMethod = new AuthMethod(IDialogId.INTENT_EXTRA_OUT_PASSWORD, 0, str);
        PASSWORD = authMethod;
        AuthMethod authMethod2 = new AuthMethod("MAGIC_LINK", 1, "magic_link");
        MAGIC_LINK = authMethod2;
        AuthMethod authMethod3 = new AuthMethod("OTP", 2, "otp");
        OTP = authMethod3;
        AuthMethod authMethod4 = new AuthMethod("SMS_CODE", 3, "sms_code");
        SMS_CODE = authMethod4;
        AuthMethod authMethod5 = new AuthMethod("SOCIAL_VKONTAKTE", 4, "social_vk", R.drawable.passport_domik_social_ui2_vkontakte, R.string.passport_am_social_vk_long, PassportSocialConfiguration.SOCIAL_VKONTAKTE);
        SOCIAL_VKONTAKTE = authMethod5;
        AuthMethod authMethod6 = new AuthMethod("SOCIAL_FACEBOOK", 5, "social_fb", R.drawable.passport_domik_social_ui2_facebook, R.string.passport_am_social_fb_long, PassportSocialConfiguration.SOCIAL_FACEBOOK);
        SOCIAL_FACEBOOK = authMethod6;
        AuthMethod authMethod7 = new AuthMethod("SOCIAL_TWITTER", 6, "social_tw", R.drawable.passport_domik_social_ui2_twitter, R.string.passport_am_social_twitter_long, PassportSocialConfiguration.SOCIAL_TWITTER);
        SOCIAL_TWITTER = authMethod7;
        AuthMethod authMethod8 = new AuthMethod("SOCIAL_MAILRU", 7, "social_mr", R.drawable.passport_domik_social_ui2_mailru, R.string.passport_am_social_mailru_long, PassportSocialConfiguration.SOCIAL_MAILRU);
        SOCIAL_MAILRU = authMethod8;
        AuthMethod authMethod9 = new AuthMethod("SOCIAL_GOOGLE", 8, "social_gg", R.drawable.passport_domik_social_ui2_google, R.string.passport_am_social_google_long, PassportSocialConfiguration.SOCIAL_GOOGLE);
        SOCIAL_GOOGLE = authMethod9;
        AuthMethod authMethod10 = new AuthMethod("SOCIAL_ODNOKLASSNIKI", 9, "social_ok", R.drawable.passport_domik_social_ui2_odnoklassniki, R.string.passport_am_social_ok_long, PassportSocialConfiguration.SOCIAL_ODNOKLASSNIKI);
        SOCIAL_ODNOKLASSNIKI = authMethod10;
        AuthMethod authMethod11 = new AuthMethod("NEO_PHONISH_RESTORE", 10, "neo_phonish_restore");
        NEO_PHONISH_RESTORE = authMethod11;
        AuthMethod[] authMethodArr = {authMethod, authMethod2, authMethod3, authMethod4, authMethod5, authMethod6, authMethod7, authMethod8, authMethod9, authMethod10, authMethod11};
        $VALUES = authMethodArr;
        $ENTRIES = kotlin.enums.a.a(authMethodArr);
        Companion = new d();
    }

    public AuthMethod(String str, int i, String str2, int i2, int i3, PassportSocialConfiguration passportSocialConfiguration) {
        this.networkValue = str2;
        this.socialIcon = i2;
        this.socialLabel = i3;
        this.socialConfigurationId = passportSocialConfiguration;
        this.isSocial = passportSocialConfiguration != null;
    }

    public static final AuthMethod a(String str) {
        Companion.getClass();
        for (AuthMethod authMethod : values()) {
            if (jl40.l(authMethod.networkValue, str)) {
                return authMethod;
            }
        }
        return null;
    }

    public static AuthMethod valueOf(String str) {
        return (AuthMethod) Enum.valueOf(AuthMethod.class, str);
    }

    public static AuthMethod[] values() {
        return (AuthMethod[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsSocial() {
        return this.isSocial;
    }

    public final SocialConfiguration c() {
        PassportSocialConfiguration passportSocialConfiguration = this.socialConfigurationId;
        if (passportSocialConfiguration == null) {
            return null;
        }
        SocialConfiguration.Companion.getClass();
        return y.a(passportSocialConfiguration);
    }

    public /* synthetic */ AuthMethod(String str, int i, String str2) {
        this(str, i, str2, 0, 0, null);
    }
}
