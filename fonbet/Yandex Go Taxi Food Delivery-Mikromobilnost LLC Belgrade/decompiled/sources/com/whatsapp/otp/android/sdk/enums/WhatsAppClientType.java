package com.whatsapp.otp.android.sdk.enums;

/* loaded from: classes11.dex */
public enum WhatsAppClientType {
    CONSUMER("com.whatsapp"),
    BUSINESS("com.whatsapp.w4b");

    private String packageName;

    WhatsAppClientType(String str) {
        this.packageName = str;
    }

    public final String a() {
        return this.packageName;
    }
}
