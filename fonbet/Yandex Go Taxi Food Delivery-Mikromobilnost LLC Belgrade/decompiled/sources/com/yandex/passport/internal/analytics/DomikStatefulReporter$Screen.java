package com.yandex.passport.internal.analytics;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.yandex.auth.LegacyAccountType;
import com.yandex.passport.internal.ui.autologin.AutoLoginRetryActivity;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b(\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*¨\u0006+"}, d2 = {"com/yandex/passport/internal/analytics/DomikStatefulReporter$Screen", "", "Lcom/yandex/passport/internal/analytics/DomikStatefulReporter$Screen;", "", "screenId", "Ljava/lang/String;", "a", "()Ljava/lang/String;", JCP.RAW_PREFIX, "IDENTIFIER", "CAROUSEL", "PASSWORD_ENTRY", "PASSWORD_CREATION", "ACCOUNT_NOT_FOUND", "PHONE_ENTRY", "SMS_CODE_ENTRY", "CALL_CONFIRM_ENTRY", "PERSONAL_INFO_ENTRY", "CAPTCHA_ENTRY", "SUGGEST_ACCOUNT", "TOTP", "RELOGIN", "SOCIAL_REG_START", "SOCIAL_REG_USERNAME", "SOCIAL_REG_PHONE", "SOCIAL_REG_SMSCODE", "SOCIAL_REG_CREDENTIALS", "SOCIAL_REG_CHOOSE_LOGIN", "SOCIAL_REG_CHOOSE_PASSWORD", "BIND_PHONE_NUMBER", "BIND_PHONE_SMS", "EXTERNAL_ACTION", "CHOOSE_LOGIN", "CHOOSE_PASSWORD", "AUTH_BY_SMS_CODE", "TURBO_AUTH", "SOCIAL", "NATIVE_TO_BROWSER_AUTH", "WEBAM", "AUTH_VIA_QR", "SHOW_AUTH_CODE", "SAML_SSO_AUTH", "ACCOUNT_UPGRADE", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DomikStatefulReporter$Screen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DomikStatefulReporter$Screen[] $VALUES;
    public static final DomikStatefulReporter$Screen ACCOUNT_NOT_FOUND;
    public static final DomikStatefulReporter$Screen ACCOUNT_UPGRADE;
    public static final DomikStatefulReporter$Screen AUTH_BY_SMS_CODE;
    public static final DomikStatefulReporter$Screen AUTH_VIA_QR;
    public static final DomikStatefulReporter$Screen BIND_PHONE_NUMBER;
    public static final DomikStatefulReporter$Screen BIND_PHONE_SMS;
    public static final DomikStatefulReporter$Screen CALL_CONFIRM_ENTRY;
    public static final DomikStatefulReporter$Screen CAPTCHA_ENTRY;
    public static final DomikStatefulReporter$Screen CAROUSEL;
    public static final DomikStatefulReporter$Screen CHOOSE_LOGIN;
    public static final DomikStatefulReporter$Screen CHOOSE_PASSWORD;
    public static final DomikStatefulReporter$Screen EXTERNAL_ACTION;
    public static final DomikStatefulReporter$Screen IDENTIFIER;
    public static final DomikStatefulReporter$Screen NATIVE_TO_BROWSER_AUTH;
    public static final DomikStatefulReporter$Screen NONE;
    public static final DomikStatefulReporter$Screen PASSWORD_CREATION;
    public static final DomikStatefulReporter$Screen PASSWORD_ENTRY;
    public static final DomikStatefulReporter$Screen PERSONAL_INFO_ENTRY;
    public static final DomikStatefulReporter$Screen PHONE_ENTRY;
    public static final DomikStatefulReporter$Screen RELOGIN;
    public static final DomikStatefulReporter$Screen SAML_SSO_AUTH;
    public static final DomikStatefulReporter$Screen SHOW_AUTH_CODE;
    public static final DomikStatefulReporter$Screen SMS_CODE_ENTRY;
    public static final DomikStatefulReporter$Screen SOCIAL;
    public static final DomikStatefulReporter$Screen SOCIAL_REG_CHOOSE_LOGIN;
    public static final DomikStatefulReporter$Screen SOCIAL_REG_CHOOSE_PASSWORD;
    public static final DomikStatefulReporter$Screen SOCIAL_REG_CREDENTIALS;
    public static final DomikStatefulReporter$Screen SOCIAL_REG_PHONE;
    public static final DomikStatefulReporter$Screen SOCIAL_REG_SMSCODE;
    public static final DomikStatefulReporter$Screen SOCIAL_REG_START;
    public static final DomikStatefulReporter$Screen SOCIAL_REG_USERNAME;
    public static final DomikStatefulReporter$Screen SUGGEST_ACCOUNT;
    public static final DomikStatefulReporter$Screen TOTP;
    public static final DomikStatefulReporter$Screen TURBO_AUTH;
    public static final DomikStatefulReporter$Screen WEBAM;
    private final String screenId;

    static {
        DomikStatefulReporter$Screen domikStatefulReporter$Screen = new DomikStatefulReporter$Screen(JCP.RAW_PREFIX, 0, "none");
        NONE = domikStatefulReporter$Screen;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen2 = new DomikStatefulReporter$Screen("IDENTIFIER", 1, "identifier");
        IDENTIFIER = domikStatefulReporter$Screen2;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen3 = new DomikStatefulReporter$Screen("CAROUSEL", 2, "carousel");
        CAROUSEL = domikStatefulReporter$Screen3;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen4 = new DomikStatefulReporter$Screen("PASSWORD_ENTRY", 3, URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD);
        PASSWORD_ENTRY = domikStatefulReporter$Screen4;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen5 = new DomikStatefulReporter$Screen("PASSWORD_CREATION", 4, AutoLoginRetryActivity.KEY_USER_CREDENTIALS);
        PASSWORD_CREATION = domikStatefulReporter$Screen5;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen6 = new DomikStatefulReporter$Screen("ACCOUNT_NOT_FOUND", 5, "account_not_found");
        ACCOUNT_NOT_FOUND = domikStatefulReporter$Screen6;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen7 = new DomikStatefulReporter$Screen("PHONE_ENTRY", 6, "phone");
        PHONE_ENTRY = domikStatefulReporter$Screen7;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen8 = new DomikStatefulReporter$Screen("SMS_CODE_ENTRY", 7, "smscode");
        SMS_CODE_ENTRY = domikStatefulReporter$Screen8;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen9 = new DomikStatefulReporter$Screen("CALL_CONFIRM_ENTRY", 8, "call_confirm");
        CALL_CONFIRM_ENTRY = domikStatefulReporter$Screen9;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen10 = new DomikStatefulReporter$Screen("PERSONAL_INFO_ENTRY", 9, "name");
        PERSONAL_INFO_ENTRY = domikStatefulReporter$Screen10;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen11 = new DomikStatefulReporter$Screen("CAPTCHA_ENTRY", 10, "captcha");
        CAPTCHA_ENTRY = domikStatefulReporter$Screen11;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen12 = new DomikStatefulReporter$Screen("SUGGEST_ACCOUNT", 11, "accountsuggest");
        SUGGEST_ACCOUNT = domikStatefulReporter$Screen12;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen13 = new DomikStatefulReporter$Screen("TOTP", 12, "totp");
        TOTP = domikStatefulReporter$Screen13;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen14 = new DomikStatefulReporter$Screen("RELOGIN", 13, "relogin");
        RELOGIN = domikStatefulReporter$Screen14;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen15 = new DomikStatefulReporter$Screen("SOCIAL_REG_START", 14, "social.reg.start");
        SOCIAL_REG_START = domikStatefulReporter$Screen15;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen16 = new DomikStatefulReporter$Screen("SOCIAL_REG_USERNAME", 15, "social.reg.username");
        SOCIAL_REG_USERNAME = domikStatefulReporter$Screen16;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen17 = new DomikStatefulReporter$Screen("SOCIAL_REG_PHONE", 16, "social.reg.phone");
        SOCIAL_REG_PHONE = domikStatefulReporter$Screen17;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen18 = new DomikStatefulReporter$Screen("SOCIAL_REG_SMSCODE", 17, "social.reg.smscode");
        SOCIAL_REG_SMSCODE = domikStatefulReporter$Screen18;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen19 = new DomikStatefulReporter$Screen("SOCIAL_REG_CREDENTIALS", 18, "social.reg.credentials");
        SOCIAL_REG_CREDENTIALS = domikStatefulReporter$Screen19;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen20 = new DomikStatefulReporter$Screen("SOCIAL_REG_CHOOSE_LOGIN", 19, "social.reg.choose_login");
        SOCIAL_REG_CHOOSE_LOGIN = domikStatefulReporter$Screen20;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen21 = new DomikStatefulReporter$Screen("SOCIAL_REG_CHOOSE_PASSWORD", 20, "social.reg.choose_password");
        SOCIAL_REG_CHOOSE_PASSWORD = domikStatefulReporter$Screen21;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen22 = new DomikStatefulReporter$Screen("BIND_PHONE_NUMBER", 21, "bind_phone.number");
        BIND_PHONE_NUMBER = domikStatefulReporter$Screen22;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen23 = new DomikStatefulReporter$Screen("BIND_PHONE_SMS", 22, "bind_phone.sms");
        BIND_PHONE_SMS = domikStatefulReporter$Screen23;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen24 = new DomikStatefulReporter$Screen("EXTERNAL_ACTION", 23, "external_action");
        EXTERNAL_ACTION = domikStatefulReporter$Screen24;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen25 = new DomikStatefulReporter$Screen("CHOOSE_LOGIN", 24, "choose_login");
        CHOOSE_LOGIN = domikStatefulReporter$Screen25;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen26 = new DomikStatefulReporter$Screen("CHOOSE_PASSWORD", 25, "choose_password");
        CHOOSE_PASSWORD = domikStatefulReporter$Screen26;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen27 = new DomikStatefulReporter$Screen("AUTH_BY_SMS_CODE", 26, "auth_by_sms_code");
        AUTH_BY_SMS_CODE = domikStatefulReporter$Screen27;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen28 = new DomikStatefulReporter$Screen("TURBO_AUTH", 27, "turbo_auth");
        TURBO_AUTH = domikStatefulReporter$Screen28;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen29 = new DomikStatefulReporter$Screen("SOCIAL", 28, LegacyAccountType.STRING_SOCIAL);
        SOCIAL = domikStatefulReporter$Screen29;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen30 = new DomikStatefulReporter$Screen("NATIVE_TO_BROWSER_AUTH", 29, "native_to_browser_auth");
        NATIVE_TO_BROWSER_AUTH = domikStatefulReporter$Screen30;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen31 = new DomikStatefulReporter$Screen("WEBAM", 30, "webam");
        WEBAM = domikStatefulReporter$Screen31;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen32 = new DomikStatefulReporter$Screen("AUTH_VIA_QR", 31, "auth_via_qr");
        AUTH_VIA_QR = domikStatefulReporter$Screen32;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen33 = new DomikStatefulReporter$Screen("SHOW_AUTH_CODE", 32, "show_auth_code");
        SHOW_AUTH_CODE = domikStatefulReporter$Screen33;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen34 = new DomikStatefulReporter$Screen("SAML_SSO_AUTH", 33, "saml_sso_auth");
        SAML_SSO_AUTH = domikStatefulReporter$Screen34;
        DomikStatefulReporter$Screen domikStatefulReporter$Screen35 = new DomikStatefulReporter$Screen("ACCOUNT_UPGRADE", 34, "saml_sso_auth");
        ACCOUNT_UPGRADE = domikStatefulReporter$Screen35;
        DomikStatefulReporter$Screen[] domikStatefulReporter$ScreenArr = {domikStatefulReporter$Screen, domikStatefulReporter$Screen2, domikStatefulReporter$Screen3, domikStatefulReporter$Screen4, domikStatefulReporter$Screen5, domikStatefulReporter$Screen6, domikStatefulReporter$Screen7, domikStatefulReporter$Screen8, domikStatefulReporter$Screen9, domikStatefulReporter$Screen10, domikStatefulReporter$Screen11, domikStatefulReporter$Screen12, domikStatefulReporter$Screen13, domikStatefulReporter$Screen14, domikStatefulReporter$Screen15, domikStatefulReporter$Screen16, domikStatefulReporter$Screen17, domikStatefulReporter$Screen18, domikStatefulReporter$Screen19, domikStatefulReporter$Screen20, domikStatefulReporter$Screen21, domikStatefulReporter$Screen22, domikStatefulReporter$Screen23, domikStatefulReporter$Screen24, domikStatefulReporter$Screen25, domikStatefulReporter$Screen26, domikStatefulReporter$Screen27, domikStatefulReporter$Screen28, domikStatefulReporter$Screen29, domikStatefulReporter$Screen30, domikStatefulReporter$Screen31, domikStatefulReporter$Screen32, domikStatefulReporter$Screen33, domikStatefulReporter$Screen34, domikStatefulReporter$Screen35};
        $VALUES = domikStatefulReporter$ScreenArr;
        $ENTRIES = kotlin.enums.a.a(domikStatefulReporter$ScreenArr);
    }

    public DomikStatefulReporter$Screen(String str, int i, String str2) {
        this.screenId = str2;
    }

    public static DomikStatefulReporter$Screen valueOf(String str) {
        return (DomikStatefulReporter$Screen) Enum.valueOf(DomikStatefulReporter$Screen.class, str);
    }

    public static DomikStatefulReporter$Screen[] values() {
        return (DomikStatefulReporter$Screen[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getScreenId() {
        return this.screenId;
    }
}
