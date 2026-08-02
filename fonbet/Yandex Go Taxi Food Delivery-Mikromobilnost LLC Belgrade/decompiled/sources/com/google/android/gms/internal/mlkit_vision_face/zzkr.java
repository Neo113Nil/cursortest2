package com.google.android.gms.internal.mlkit_vision_face;

import defpackage.jf91;

/* loaded from: classes11.dex */
public enum zzkr implements jf91 {
    TYPE_UNKNOWN(0),
    TYPE_THIN(1),
    TYPE_THICK(2),
    TYPE_GMV(3);

    private final int zzf;

    zzkr(int i) {
        this.zzf = i;
    }

    @Override // defpackage.jf91
    public final int zza() {
        return this.zzf;
    }
}
