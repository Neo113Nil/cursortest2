package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* loaded from: classes11.dex */
final class zzdu extends zzcw {
    final /* synthetic */ Runnable zza;

    public zzdu(a aVar, Runnable runnable) {
        this.zza = runnable;
        Objects.requireNonNull(aVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcw, com.google.android.gms.internal.measurement.zzcx
    public final void zze() {
        this.zza.run();
    }
}
