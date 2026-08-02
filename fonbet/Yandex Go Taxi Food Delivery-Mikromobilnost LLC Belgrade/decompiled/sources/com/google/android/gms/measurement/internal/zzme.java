package com.google.android.gms.measurement.internal;

import defpackage.j5b1;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
final class zzme extends zzgd {
    final /* synthetic */ AtomicReference zza;

    public zzme(j5b1 j5b1Var, AtomicReference atomicReference) {
        this.zza = atomicReference;
        Objects.requireNonNull(j5b1Var);
    }

    @Override // com.google.android.gms.measurement.internal.zzgd, com.google.android.gms.measurement.internal.zzge
    public final void zze(List list) {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
