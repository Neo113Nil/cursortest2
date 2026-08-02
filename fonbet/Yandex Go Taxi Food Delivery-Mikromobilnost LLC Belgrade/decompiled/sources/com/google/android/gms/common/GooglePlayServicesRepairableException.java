package com.google.android.gms.common;

import android.content.Intent;

/* loaded from: classes11.dex */
public class GooglePlayServicesRepairableException extends UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int i, Intent intent) {
        super(intent);
        this.zza = i;
    }

    public final int a() {
        return this.zza;
    }
}
