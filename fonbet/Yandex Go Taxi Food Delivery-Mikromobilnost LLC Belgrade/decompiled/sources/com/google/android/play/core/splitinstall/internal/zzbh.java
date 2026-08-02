package com.google.android.play.core.splitinstall.internal;

import android.content.pm.PackageManager;

/* loaded from: classes11.dex */
public final class zzbh extends RuntimeException {
    public zzbh(PackageManager.NameNotFoundException nameNotFoundException) {
        super("Failed to initialize FileStorage", nameNotFoundException);
    }
}
