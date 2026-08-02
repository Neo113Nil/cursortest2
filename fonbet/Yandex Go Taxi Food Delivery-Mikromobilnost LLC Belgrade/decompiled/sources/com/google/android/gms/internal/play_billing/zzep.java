package com.google.android.gms.internal.play_billing;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* loaded from: classes11.dex */
final class zzep extends AbstractOwnableSynchronizer implements Runnable {
    private final zzes zza;

    public /* synthetic */ zzep(zzfg zzfgVar) {
        this.zza = zzfgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.zza.toString();
    }
}
