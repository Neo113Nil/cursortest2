package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import defpackage.cvw;

/* loaded from: classes11.dex */
public final class zzaf extends Exception {
    public final ConnectionResult zza;

    public zzaf(ConnectionResult connectionResult) {
        cvw.d("ResolvableConnectionException can only be created with a connection result containing a resolution.", connectionResult.hasResolution());
        this.zza = connectionResult;
    }
}
