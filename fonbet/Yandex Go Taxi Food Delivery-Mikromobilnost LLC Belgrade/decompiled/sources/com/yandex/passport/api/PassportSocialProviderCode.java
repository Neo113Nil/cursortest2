package com.yandex.passport.api;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/passport/api/PassportSocialProviderCode;", "", "", "codeString", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "VKONTAKTE", "FACEBOOK", "TWITTER", "MAILRU", "GOOGLE", "ODNOKLASSNIKI", "MICROSOFT", "YAHOO", "RAMBLER", "ESIA", "TV1001", "OTHER", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PassportSocialProviderCode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassportSocialProviderCode[] $VALUES;
    public static final PassportSocialProviderCode ESIA;
    public static final PassportSocialProviderCode FACEBOOK;
    public static final PassportSocialProviderCode GOOGLE;
    public static final PassportSocialProviderCode MAILRU;
    public static final PassportSocialProviderCode MICROSOFT;
    public static final PassportSocialProviderCode ODNOKLASSNIKI;
    public static final PassportSocialProviderCode OTHER;
    public static final PassportSocialProviderCode RAMBLER;
    public static final PassportSocialProviderCode TV1001;
    public static final PassportSocialProviderCode TWITTER;
    public static final PassportSocialProviderCode VKONTAKTE;
    public static final PassportSocialProviderCode YAHOO;
    private final String codeString;

    static {
        PassportSocialProviderCode passportSocialProviderCode = new PassportSocialProviderCode("VKONTAKTE", 0, "vk");
        VKONTAKTE = passportSocialProviderCode;
        PassportSocialProviderCode passportSocialProviderCode2 = new PassportSocialProviderCode("FACEBOOK", 1, "fb");
        FACEBOOK = passportSocialProviderCode2;
        PassportSocialProviderCode passportSocialProviderCode3 = new PassportSocialProviderCode("TWITTER", 2, "tw");
        TWITTER = passportSocialProviderCode3;
        PassportSocialProviderCode passportSocialProviderCode4 = new PassportSocialProviderCode("MAILRU", 3, "mr");
        MAILRU = passportSocialProviderCode4;
        PassportSocialProviderCode passportSocialProviderCode5 = new PassportSocialProviderCode("GOOGLE", 4, "gg");
        GOOGLE = passportSocialProviderCode5;
        PassportSocialProviderCode passportSocialProviderCode6 = new PassportSocialProviderCode("ODNOKLASSNIKI", 5, WriteBlocks.OK);
        ODNOKLASSNIKI = passportSocialProviderCode6;
        PassportSocialProviderCode passportSocialProviderCode7 = new PassportSocialProviderCode("MICROSOFT", 6, "ms");
        MICROSOFT = passportSocialProviderCode7;
        PassportSocialProviderCode passportSocialProviderCode8 = new PassportSocialProviderCode("YAHOO", 7, "yh");
        YAHOO = passportSocialProviderCode8;
        PassportSocialProviderCode passportSocialProviderCode9 = new PassportSocialProviderCode("RAMBLER", 8, "ra");
        RAMBLER = passportSocialProviderCode9;
        PassportSocialProviderCode passportSocialProviderCode10 = new PassportSocialProviderCode("ESIA", 9, "esia");
        ESIA = passportSocialProviderCode10;
        PassportSocialProviderCode passportSocialProviderCode11 = new PassportSocialProviderCode("TV1001", 10, "tv1001");
        TV1001 = passportSocialProviderCode11;
        PassportSocialProviderCode passportSocialProviderCode12 = new PassportSocialProviderCode("OTHER", 11, "other");
        OTHER = passportSocialProviderCode12;
        PassportSocialProviderCode[] passportSocialProviderCodeArr = {passportSocialProviderCode, passportSocialProviderCode2, passportSocialProviderCode3, passportSocialProviderCode4, passportSocialProviderCode5, passportSocialProviderCode6, passportSocialProviderCode7, passportSocialProviderCode8, passportSocialProviderCode9, passportSocialProviderCode10, passportSocialProviderCode11, passportSocialProviderCode12};
        $VALUES = passportSocialProviderCodeArr;
        $ENTRIES = kotlin.enums.a.a(passportSocialProviderCodeArr);
    }

    public PassportSocialProviderCode(String str, int i, String str2) {
        this.codeString = str2;
    }

    public static PassportSocialProviderCode valueOf(String str) {
        return (PassportSocialProviderCode) Enum.valueOf(PassportSocialProviderCode.class, str);
    }

    public static PassportSocialProviderCode[] values() {
        return (PassportSocialProviderCode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getCodeString() {
        return this.codeString;
    }
}
