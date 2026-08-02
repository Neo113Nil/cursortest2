package com.google.zxing.qrcode.encoder;

/* loaded from: classes11.dex */
enum MinimalEncoder$VersionSize {
    SMALL("version 1-9"),
    MEDIUM("version 10-26"),
    LARGE("version 27-40");

    private final String description;

    MinimalEncoder$VersionSize(String str) {
        this.description = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.description;
    }
}
