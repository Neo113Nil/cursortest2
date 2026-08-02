package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
final class zzed implements Executor {
    public static final zzed zza;
    private static final /* synthetic */ zzed[] zzb;

    static {
        zzed zzedVar = new zzed("INSTANCE", 0);
        zza = zzedVar;
        zzb = new zzed[]{zzedVar};
    }

    public static zzed[] values() {
        return (zzed[]) zzb.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
