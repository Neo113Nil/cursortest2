package com.google.android.gms.internal.mlkit_vision_text_common;

import defpackage.xf91;

/* loaded from: classes11.dex */
public enum zzsb implements xf91 {
    TYPE_UNKNOWN(0),
    LATIN(1),
    LATIN_AND_CHINESE(2),
    LATIN_AND_DEVANAGARI(3),
    LATIN_AND_JAPANESE(4),
    LATIN_AND_KOREAN(5),
    CREDIT_CARD(6),
    DOCUMENT(7),
    PIXEL_AI(8);

    private final int zzk;

    zzsb(int i) {
        this.zzk = i;
    }

    @Override // defpackage.xf91
    public final int zza() {
        return this.zzk;
    }
}
