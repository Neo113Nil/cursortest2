package com.google.i18n.phonenumbers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class PhoneNumberUtil$ValidationResult {
    private static final /* synthetic */ PhoneNumberUtil$ValidationResult[] $VALUES;
    public static final PhoneNumberUtil$ValidationResult INVALID_COUNTRY_CODE;
    public static final PhoneNumberUtil$ValidationResult INVALID_LENGTH;
    public static final PhoneNumberUtil$ValidationResult IS_POSSIBLE;
    public static final PhoneNumberUtil$ValidationResult IS_POSSIBLE_LOCAL_ONLY;
    public static final PhoneNumberUtil$ValidationResult TOO_LONG;
    public static final PhoneNumberUtil$ValidationResult TOO_SHORT;

    static {
        PhoneNumberUtil$ValidationResult phoneNumberUtil$ValidationResult = new PhoneNumberUtil$ValidationResult("IS_POSSIBLE", 0);
        IS_POSSIBLE = phoneNumberUtil$ValidationResult;
        PhoneNumberUtil$ValidationResult phoneNumberUtil$ValidationResult2 = new PhoneNumberUtil$ValidationResult("IS_POSSIBLE_LOCAL_ONLY", 1);
        IS_POSSIBLE_LOCAL_ONLY = phoneNumberUtil$ValidationResult2;
        PhoneNumberUtil$ValidationResult phoneNumberUtil$ValidationResult3 = new PhoneNumberUtil$ValidationResult("INVALID_COUNTRY_CODE", 2);
        INVALID_COUNTRY_CODE = phoneNumberUtil$ValidationResult3;
        PhoneNumberUtil$ValidationResult phoneNumberUtil$ValidationResult4 = new PhoneNumberUtil$ValidationResult("TOO_SHORT", 3);
        TOO_SHORT = phoneNumberUtil$ValidationResult4;
        PhoneNumberUtil$ValidationResult phoneNumberUtil$ValidationResult5 = new PhoneNumberUtil$ValidationResult("INVALID_LENGTH", 4);
        INVALID_LENGTH = phoneNumberUtil$ValidationResult5;
        PhoneNumberUtil$ValidationResult phoneNumberUtil$ValidationResult6 = new PhoneNumberUtil$ValidationResult("TOO_LONG", 5);
        TOO_LONG = phoneNumberUtil$ValidationResult6;
        $VALUES = new PhoneNumberUtil$ValidationResult[]{phoneNumberUtil$ValidationResult, phoneNumberUtil$ValidationResult2, phoneNumberUtil$ValidationResult3, phoneNumberUtil$ValidationResult4, phoneNumberUtil$ValidationResult5, phoneNumberUtil$ValidationResult6};
    }

    public static PhoneNumberUtil$ValidationResult valueOf(String str) {
        return (PhoneNumberUtil$ValidationResult) Enum.valueOf(PhoneNumberUtil$ValidationResult.class, str);
    }

    public static PhoneNumberUtil$ValidationResult[] values() {
        return (PhoneNumberUtil$ValidationResult[]) $VALUES.clone();
    }
}
