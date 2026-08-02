package com.google.ar.core;

import com.google.ar.core.ArCoreApk;

/* loaded from: classes11.dex */
enum b extends ArCoreApk.Availability {
    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isTransient() {
        return true;
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isUnknown() {
        return true;
    }
}
