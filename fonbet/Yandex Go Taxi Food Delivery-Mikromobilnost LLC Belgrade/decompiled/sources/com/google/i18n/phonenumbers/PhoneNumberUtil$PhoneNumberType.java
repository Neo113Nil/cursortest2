package com.google.i18n.phonenumbers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class PhoneNumberUtil$PhoneNumberType {
    private static final /* synthetic */ PhoneNumberUtil$PhoneNumberType[] $VALUES;
    public static final PhoneNumberUtil$PhoneNumberType FIXED_LINE;
    public static final PhoneNumberUtil$PhoneNumberType FIXED_LINE_OR_MOBILE;
    public static final PhoneNumberUtil$PhoneNumberType MOBILE;
    public static final PhoneNumberUtil$PhoneNumberType PAGER;
    public static final PhoneNumberUtil$PhoneNumberType PERSONAL_NUMBER;
    public static final PhoneNumberUtil$PhoneNumberType PREMIUM_RATE;
    public static final PhoneNumberUtil$PhoneNumberType SHARED_COST;
    public static final PhoneNumberUtil$PhoneNumberType TOLL_FREE;
    public static final PhoneNumberUtil$PhoneNumberType UAN;
    public static final PhoneNumberUtil$PhoneNumberType UNKNOWN;
    public static final PhoneNumberUtil$PhoneNumberType VOICEMAIL;
    public static final PhoneNumberUtil$PhoneNumberType VOIP;

    static {
        PhoneNumberUtil$PhoneNumberType phoneNumberUtil$PhoneNumberType = new PhoneNumberUtil$PhoneNumberType("FIXED_LINE", 0);
        FIXED_LINE = phoneNumberUtil$PhoneNumberType;
        PhoneNumberUtil$PhoneNumberType phoneNumberUtil$PhoneNumberType2 = new PhoneNumberUtil$PhoneNumberType("MOBILE", 1);
        MOBILE = phoneNumberUtil$PhoneNumberType2;
        PhoneNumberUtil$PhoneNumberType phoneNumberUtil$PhoneNumberType3 = new PhoneNumberUtil$PhoneNumberType("FIXED_LINE_OR_MOBILE", 2);
        FIXED_LINE_OR_MOBILE = phoneNumberUtil$PhoneNumberType3;
        PhoneNumberUtil$PhoneNumberType phoneNumberUtil$PhoneNumberType4 = new PhoneNumberUtil$PhoneNumberType("TOLL_FREE", 3);
        TOLL_FREE = phoneNumberUtil$PhoneNumberType4;
        PhoneNumberUtil$PhoneNumberType phoneNumberUtil$PhoneNumberType5 = new PhoneNumberUtil$PhoneNumberType("PREMIUM_RATE", 4);
        PREMIUM_RATE = phoneNumberUtil$PhoneNumberType5;
        PhoneNumberUtil$PhoneNumberType phoneNumberUtil$PhoneNumberType6 = new PhoneNumberUtil$PhoneNumberType("SHARED_COST", 5);
        SHARED_COST = phoneNumberUtil$PhoneNumberType6;
        PhoneNumberUtil$PhoneNumberType phoneNumberUtil$PhoneNumberType7 = new PhoneNumberUtil$PhoneNumberType("VOIP", 6);
        VOIP = phoneNumberUtil$PhoneNumberType7;
        PhoneNumberUtil$PhoneNumberType phoneNumberUtil$PhoneNumberType8 = new PhoneNumberUtil$PhoneNumberType("PERSONAL_NUMBER", 7);
        PERSONAL_NUMBER = phoneNumberUtil$PhoneNumberType8;
        PhoneNumberUtil$PhoneNumberType phoneNumberUtil$PhoneNumberType9 = new PhoneNumberUtil$PhoneNumberType("PAGER", 8);
        PAGER = phoneNumberUtil$PhoneNumberType9;
        PhoneNumberUtil$PhoneNumberType phoneNumberUtil$PhoneNumberType10 = new PhoneNumberUtil$PhoneNumberType("UAN", 9);
        UAN = phoneNumberUtil$PhoneNumberType10;
        PhoneNumberUtil$PhoneNumberType phoneNumberUtil$PhoneNumberType11 = new PhoneNumberUtil$PhoneNumberType("VOICEMAIL", 10);
        VOICEMAIL = phoneNumberUtil$PhoneNumberType11;
        PhoneNumberUtil$PhoneNumberType phoneNumberUtil$PhoneNumberType12 = new PhoneNumberUtil$PhoneNumberType("UNKNOWN", 11);
        UNKNOWN = phoneNumberUtil$PhoneNumberType12;
        $VALUES = new PhoneNumberUtil$PhoneNumberType[]{phoneNumberUtil$PhoneNumberType, phoneNumberUtil$PhoneNumberType2, phoneNumberUtil$PhoneNumberType3, phoneNumberUtil$PhoneNumberType4, phoneNumberUtil$PhoneNumberType5, phoneNumberUtil$PhoneNumberType6, phoneNumberUtil$PhoneNumberType7, phoneNumberUtil$PhoneNumberType8, phoneNumberUtil$PhoneNumberType9, phoneNumberUtil$PhoneNumberType10, phoneNumberUtil$PhoneNumberType11, phoneNumberUtil$PhoneNumberType12};
    }

    public static PhoneNumberUtil$PhoneNumberType valueOf(String str) {
        return (PhoneNumberUtil$PhoneNumberType) Enum.valueOf(PhoneNumberUtil$PhoneNumberType.class, str);
    }

    public static PhoneNumberUtil$PhoneNumberType[] values() {
        return (PhoneNumberUtil$PhoneNumberType[]) $VALUES.clone();
    }
}
