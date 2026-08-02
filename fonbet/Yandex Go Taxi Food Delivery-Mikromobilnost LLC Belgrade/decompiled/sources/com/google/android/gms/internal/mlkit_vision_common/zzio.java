package com.google.android.gms.internal.mlkit_vision_common;

import defpackage.i591;

/* loaded from: classes11.dex */
public enum zzio implements i591 {
    SOURCE_UNKNOWN(0),
    BITMAP(1),
    BYTEARRAY(2),
    BYTEBUFFER(3),
    FILEPATH(4),
    ANDROID_MEDIA_IMAGE(5);

    private final int zzh;

    zzio(int i) {
        this.zzh = i;
    }

    @Override // defpackage.i591
    public final int zza() {
        return this.zzh;
    }
}
