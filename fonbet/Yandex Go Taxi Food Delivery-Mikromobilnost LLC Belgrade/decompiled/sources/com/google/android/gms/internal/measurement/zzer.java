package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import defpackage.yja1;

/* loaded from: classes11.dex */
final class zzer extends zzcz {
    private final yja1 zza;

    public zzer(yja1 yja1Var) {
        this.zza = yja1Var;
    }

    @Override // com.google.android.gms.internal.measurement.zzcz, com.google.android.gms.internal.measurement.zzda
    public final void zze(String str, String str2, Bundle bundle, long j) {
        ((com.google.android.gms.measurement.internal.m) this.zza).a(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.internal.measurement.zzcz, com.google.android.gms.internal.measurement.zzda
    public final int zzf() {
        return System.identityHashCode(this.zza);
    }
}
