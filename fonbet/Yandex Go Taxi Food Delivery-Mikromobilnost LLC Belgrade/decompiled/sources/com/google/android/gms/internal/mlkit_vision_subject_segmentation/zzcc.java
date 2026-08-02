package com.google.android.gms.internal.mlkit_vision_subject_segmentation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class zzcc {
    public static final zzcc zza;
    public static final zzcc zzb;
    public static final zzcc zzc;
    private static final /* synthetic */ zzcc[] zzd;

    static {
        zzcc zzccVar = new zzcc("DEFAULT", 0);
        zza = zzccVar;
        zzcc zzccVar2 = new zzcc("SIGNED", 1);
        zzb = zzccVar2;
        zzcc zzccVar3 = new zzcc("FIXED", 2);
        zzc = zzccVar3;
        zzd = new zzcc[]{zzccVar, zzccVar2, zzccVar3};
    }

    public static zzcc[] values() {
        return (zzcc[]) zzd.clone();
    }
}
