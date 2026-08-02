package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Callable;

/* loaded from: classes11.dex */
final class zzfg extends zzes {
    final /* synthetic */ i zza;
    private final Callable zzb;

    public zzfg(i iVar, Callable callable) {
        this.zza = iVar;
        callable.getClass();
        this.zzb = callable;
    }

    @Override // com.google.android.gms.internal.play_billing.zzes
    public final Object a() {
        return this.zzb.call();
    }

    @Override // com.google.android.gms.internal.play_billing.zzes
    public final String b() {
        return this.zzb.toString();
    }
}
