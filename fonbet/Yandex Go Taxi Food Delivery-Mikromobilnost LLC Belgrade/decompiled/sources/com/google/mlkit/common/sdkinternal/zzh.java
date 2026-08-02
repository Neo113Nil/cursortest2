package com.google.mlkit.common.sdkinternal;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
final class zzh implements Executor {
    public static final zzh zza;
    private static final /* synthetic */ zzh[] zzb;

    static {
        zzh zzhVar = new zzh("INSTANCE", 0);
        zza = zzhVar;
        zzb = new zzh[]{zzhVar};
    }

    public static zzh[] values() {
        return (zzh[]) zzb.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a.a().a.post(runnable);
    }
}
