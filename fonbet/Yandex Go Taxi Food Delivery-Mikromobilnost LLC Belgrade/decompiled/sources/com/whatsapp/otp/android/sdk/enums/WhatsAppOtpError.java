package com.whatsapp.otp.android.sdk.enums;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class WhatsAppOtpError {
    private static final /* synthetic */ WhatsAppOtpError[] $VALUES;
    public static final WhatsAppOtpError GENERIC_EXCEPTION;
    public static final WhatsAppOtpError INTENT_IS_NOT_FROM_WHATSAPP;
    public static final WhatsAppOtpError OTP_CODE_NOT_RECEIVED;

    static {
        WhatsAppOtpError whatsAppOtpError = new WhatsAppOtpError("INTENT_IS_NOT_FROM_WHATSAPP", 0);
        INTENT_IS_NOT_FROM_WHATSAPP = whatsAppOtpError;
        WhatsAppOtpError whatsAppOtpError2 = new WhatsAppOtpError("OTP_CODE_NOT_RECEIVED", 1);
        OTP_CODE_NOT_RECEIVED = whatsAppOtpError2;
        WhatsAppOtpError whatsAppOtpError3 = new WhatsAppOtpError("GENERIC_EXCEPTION", 2);
        GENERIC_EXCEPTION = whatsAppOtpError3;
        $VALUES = new WhatsAppOtpError[]{whatsAppOtpError, whatsAppOtpError2, whatsAppOtpError3};
    }

    public static WhatsAppOtpError valueOf(String str) {
        return (WhatsAppOtpError) Enum.valueOf(WhatsAppOtpError.class, str);
    }

    public static WhatsAppOtpError[] values() {
        return (WhatsAppOtpError[]) $VALUES.clone();
    }
}
