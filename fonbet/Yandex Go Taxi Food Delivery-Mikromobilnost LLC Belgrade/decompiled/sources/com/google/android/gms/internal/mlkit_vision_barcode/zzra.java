package com.google.android.gms.internal.mlkit_vision_barcode;

import defpackage.sr91;

/* loaded from: classes11.dex */
public enum zzra implements sr91 {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);

    private final int zzf;

    zzra(int i) {
        this.zzf = i;
    }

    @Override // defpackage.sr91
    public final int zza() {
        return this.zzf;
    }
}
