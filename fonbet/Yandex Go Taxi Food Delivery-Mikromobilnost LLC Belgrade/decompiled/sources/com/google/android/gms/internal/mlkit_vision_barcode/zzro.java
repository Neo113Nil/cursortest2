package com.google.android.gms.internal.mlkit_vision_barcode;

import defpackage.sr91;

/* loaded from: classes11.dex */
public enum zzro implements sr91 {
    TYPE_UNKNOWN(0),
    TYPE_CONTACT_INFO(1),
    TYPE_EMAIL(2),
    TYPE_ISBN(3),
    TYPE_PHONE(4),
    TYPE_PRODUCT(5),
    TYPE_SMS(6),
    TYPE_TEXT(7),
    TYPE_URL(8),
    TYPE_WIFI(9),
    TYPE_GEO(10),
    TYPE_CALENDAR_EVENT(11),
    TYPE_DRIVER_LICENSE(12);

    private final int zzo;

    zzro(int i) {
        this.zzo = i;
    }

    @Override // defpackage.sr91
    public final int zza() {
        return this.zzo;
    }
}
