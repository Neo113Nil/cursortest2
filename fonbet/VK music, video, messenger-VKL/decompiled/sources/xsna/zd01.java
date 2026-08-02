package xsna;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes13.dex */
public final class zd01 implements Executor {
    public static final zd01 zza;
    private static final /* synthetic */ zd01[] zzb;

    static {
        zd01 zd01Var = new zd01("INSTANCE", 0);
        zza = zd01Var;
        zzb = new zd01[]{zd01Var};
    }

    public static zd01[] values() {
        return (zd01[]) zzb.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        bc00.a().a.post(runnable);
    }
}
