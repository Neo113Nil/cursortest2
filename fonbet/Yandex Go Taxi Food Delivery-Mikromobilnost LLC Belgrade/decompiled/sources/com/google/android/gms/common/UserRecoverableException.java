package com.google.android.gms.common;

import android.content.Intent;

/* loaded from: classes11.dex */
public abstract class UserRecoverableException extends Exception {
    private final Intent zza;

    public UserRecoverableException(Intent intent) {
        super("Google Play Services not available");
        this.zza = intent;
    }
}
