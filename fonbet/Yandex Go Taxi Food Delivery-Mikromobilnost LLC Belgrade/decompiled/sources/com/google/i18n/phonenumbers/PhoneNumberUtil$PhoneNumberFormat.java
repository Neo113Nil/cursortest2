package com.google.i18n.phonenumbers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class PhoneNumberUtil$PhoneNumberFormat {
    private static final /* synthetic */ PhoneNumberUtil$PhoneNumberFormat[] $VALUES;
    public static final PhoneNumberUtil$PhoneNumberFormat E164;
    public static final PhoneNumberUtil$PhoneNumberFormat INTERNATIONAL;
    public static final PhoneNumberUtil$PhoneNumberFormat NATIONAL;
    public static final PhoneNumberUtil$PhoneNumberFormat RFC3966;

    static {
        PhoneNumberUtil$PhoneNumberFormat phoneNumberUtil$PhoneNumberFormat = new PhoneNumberUtil$PhoneNumberFormat("E164", 0);
        E164 = phoneNumberUtil$PhoneNumberFormat;
        PhoneNumberUtil$PhoneNumberFormat phoneNumberUtil$PhoneNumberFormat2 = new PhoneNumberUtil$PhoneNumberFormat("INTERNATIONAL", 1);
        INTERNATIONAL = phoneNumberUtil$PhoneNumberFormat2;
        PhoneNumberUtil$PhoneNumberFormat phoneNumberUtil$PhoneNumberFormat3 = new PhoneNumberUtil$PhoneNumberFormat("NATIONAL", 2);
        NATIONAL = phoneNumberUtil$PhoneNumberFormat3;
        PhoneNumberUtil$PhoneNumberFormat phoneNumberUtil$PhoneNumberFormat4 = new PhoneNumberUtil$PhoneNumberFormat("RFC3966", 3);
        RFC3966 = phoneNumberUtil$PhoneNumberFormat4;
        $VALUES = new PhoneNumberUtil$PhoneNumberFormat[]{phoneNumberUtil$PhoneNumberFormat, phoneNumberUtil$PhoneNumberFormat2, phoneNumberUtil$PhoneNumberFormat3, phoneNumberUtil$PhoneNumberFormat4};
    }

    public static PhoneNumberUtil$PhoneNumberFormat valueOf(String str) {
        return (PhoneNumberUtil$PhoneNumberFormat) Enum.valueOf(PhoneNumberUtil$PhoneNumberFormat.class, str);
    }

    public static PhoneNumberUtil$PhoneNumberFormat[] values() {
        return (PhoneNumberUtil$PhoneNumberFormat[]) $VALUES.clone();
    }
}
