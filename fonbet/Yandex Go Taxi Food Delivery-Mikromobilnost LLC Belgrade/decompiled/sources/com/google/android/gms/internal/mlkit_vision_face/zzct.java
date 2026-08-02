package com.google.android.gms.internal.mlkit_vision_face;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class zzct {
    public static final zzct zza;
    public static final zzct zzb;
    public static final zzct zzc;
    private static final /* synthetic */ zzct[] zzd;

    static {
        zzct zzctVar = new zzct("DEFAULT", 0);
        zza = zzctVar;
        zzct zzctVar2 = new zzct("SIGNED", 1);
        zzb = zzctVar2;
        zzct zzctVar3 = new zzct("FIXED", 2);
        zzc = zzctVar3;
        zzd = new zzct[]{zzctVar, zzctVar2, zzctVar3};
    }

    public static zzct[] values() {
        return (zzct[]) zzd.clone();
    }
}
