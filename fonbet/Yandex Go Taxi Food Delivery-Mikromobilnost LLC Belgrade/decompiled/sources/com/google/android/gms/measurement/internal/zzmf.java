package com.google.android.gms.measurement.internal;

import defpackage.j5b1;
import defpackage.y1a1;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
final class zzmf extends zzgg {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ j5b1 zzb;

    public zzmf(j5b1 j5b1Var, AtomicReference atomicReference) {
        this.zza = atomicReference;
        Objects.requireNonNull(j5b1Var);
        this.zzb = j5b1Var;
    }

    @Override // com.google.android.gms.measurement.internal.zzgg, com.google.android.gms.measurement.internal.zzgh
    public final void zze(zzoq zzoqVar) {
        AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            y1a1 y1a1Var = ((g) this.zzb.b).y;
            g.g(y1a1Var);
            y1a1Var.H.b(Integer.valueOf(zzoqVar.zza.size()), "[sgtm] Got upload batches from service. count");
            atomicReference.set(zzoqVar);
            atomicReference.notifyAll();
        }
    }
}
