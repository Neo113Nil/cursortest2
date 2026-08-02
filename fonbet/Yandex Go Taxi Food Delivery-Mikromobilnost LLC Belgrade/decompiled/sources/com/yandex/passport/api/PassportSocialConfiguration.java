package com.yandex.passport.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/passport/api/PassportSocialConfiguration;", "", "", "isFullSocial", "Z", "()Z", "SOCIAL_VKONTAKTE", "SOCIAL_FACEBOOK", "SOCIAL_TWITTER", "SOCIAL_ODNOKLASSNIKI", "SOCIAL_MAILRU", "SOCIAL_GOOGLE", "SOCIAL_ESIA", "SOCIAL_TV_1001", "MAILISH_GOOGLE", "MAILISH_OUTLOOK", "MAILISH_MAILRU", "MAILISH_YAHOO", "MAILISH_RAMBLER", "MAILISH_OTHER", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportSocialConfiguration {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassportSocialConfiguration[] $VALUES;
    public static final PassportSocialConfiguration MAILISH_GOOGLE;
    public static final PassportSocialConfiguration MAILISH_MAILRU;
    public static final PassportSocialConfiguration MAILISH_OTHER;
    public static final PassportSocialConfiguration MAILISH_OUTLOOK;
    public static final PassportSocialConfiguration MAILISH_RAMBLER;
    public static final PassportSocialConfiguration MAILISH_YAHOO;
    public static final PassportSocialConfiguration SOCIAL_ESIA;
    public static final PassportSocialConfiguration SOCIAL_FACEBOOK;
    public static final PassportSocialConfiguration SOCIAL_GOOGLE;
    public static final PassportSocialConfiguration SOCIAL_MAILRU;
    public static final PassportSocialConfiguration SOCIAL_ODNOKLASSNIKI;
    public static final PassportSocialConfiguration SOCIAL_TV_1001;
    public static final PassportSocialConfiguration SOCIAL_TWITTER;
    public static final PassportSocialConfiguration SOCIAL_VKONTAKTE;
    private final boolean isFullSocial;

    static {
        PassportSocialConfiguration passportSocialConfiguration = new PassportSocialConfiguration("SOCIAL_VKONTAKTE", 0, true);
        SOCIAL_VKONTAKTE = passportSocialConfiguration;
        PassportSocialConfiguration passportSocialConfiguration2 = new PassportSocialConfiguration("SOCIAL_FACEBOOK", 1, true);
        SOCIAL_FACEBOOK = passportSocialConfiguration2;
        PassportSocialConfiguration passportSocialConfiguration3 = new PassportSocialConfiguration("SOCIAL_TWITTER", 2, true);
        SOCIAL_TWITTER = passportSocialConfiguration3;
        PassportSocialConfiguration passportSocialConfiguration4 = new PassportSocialConfiguration("SOCIAL_ODNOKLASSNIKI", 3, true);
        SOCIAL_ODNOKLASSNIKI = passportSocialConfiguration4;
        PassportSocialConfiguration passportSocialConfiguration5 = new PassportSocialConfiguration("SOCIAL_MAILRU", 4, true);
        SOCIAL_MAILRU = passportSocialConfiguration5;
        PassportSocialConfiguration passportSocialConfiguration6 = new PassportSocialConfiguration("SOCIAL_GOOGLE", 5, true);
        SOCIAL_GOOGLE = passportSocialConfiguration6;
        PassportSocialConfiguration passportSocialConfiguration7 = new PassportSocialConfiguration("SOCIAL_ESIA", 6, true);
        SOCIAL_ESIA = passportSocialConfiguration7;
        PassportSocialConfiguration passportSocialConfiguration8 = new PassportSocialConfiguration("SOCIAL_TV_1001", 7, true);
        SOCIAL_TV_1001 = passportSocialConfiguration8;
        PassportSocialConfiguration passportSocialConfiguration9 = new PassportSocialConfiguration("MAILISH_GOOGLE", 8, false);
        MAILISH_GOOGLE = passportSocialConfiguration9;
        PassportSocialConfiguration passportSocialConfiguration10 = new PassportSocialConfiguration("MAILISH_OUTLOOK", 9, false);
        MAILISH_OUTLOOK = passportSocialConfiguration10;
        PassportSocialConfiguration passportSocialConfiguration11 = new PassportSocialConfiguration("MAILISH_MAILRU", 10, false);
        MAILISH_MAILRU = passportSocialConfiguration11;
        PassportSocialConfiguration passportSocialConfiguration12 = new PassportSocialConfiguration("MAILISH_YAHOO", 11, false);
        MAILISH_YAHOO = passportSocialConfiguration12;
        PassportSocialConfiguration passportSocialConfiguration13 = new PassportSocialConfiguration("MAILISH_RAMBLER", 12, false);
        MAILISH_RAMBLER = passportSocialConfiguration13;
        PassportSocialConfiguration passportSocialConfiguration14 = new PassportSocialConfiguration("MAILISH_OTHER", 13, false);
        MAILISH_OTHER = passportSocialConfiguration14;
        PassportSocialConfiguration[] passportSocialConfigurationArr = {passportSocialConfiguration, passportSocialConfiguration2, passportSocialConfiguration3, passportSocialConfiguration4, passportSocialConfiguration5, passportSocialConfiguration6, passportSocialConfiguration7, passportSocialConfiguration8, passportSocialConfiguration9, passportSocialConfiguration10, passportSocialConfiguration11, passportSocialConfiguration12, passportSocialConfiguration13, passportSocialConfiguration14};
        $VALUES = passportSocialConfigurationArr;
        $ENTRIES = kotlin.enums.a.a(passportSocialConfigurationArr);
    }

    public PassportSocialConfiguration(String str, int i, boolean z) {
        this.isFullSocial = z;
    }

    public static PassportSocialConfiguration valueOf(String str) {
        return (PassportSocialConfiguration) Enum.valueOf(PassportSocialConfiguration.class, str);
    }

    public static PassportSocialConfiguration[] values() {
        return (PassportSocialConfiguration[]) $VALUES.clone();
    }
}
