package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import defpackage.fka1;

/* loaded from: classes.dex */
final class zzes extends zzcz {
    private final fka1 zza;

    public zzes(fka1 fka1Var) {
        this.zza = fka1Var;
    }

    @Override // com.google.android.gms.internal.measurement.zzcz, com.google.android.gms.internal.measurement.zzda
    public final void zze(String str, String str2, Bundle bundle, long j) {
        this.zza.a(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcz, com.google.android.gms.internal.measurement.zzda
    public final int zzf() {
        return System.identityHashCode(this.zza);
    }
}
