package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class zzfd {
    public static final zzfd zza;
    public static final zzfd zzb;
    public static final zzfd zzc;
    private static final /* synthetic */ zzfd[] zzd;

    static {
        zzfd zzfdVar = new zzfd("DEFAULT", 0);
        zza = zzfdVar;
        zzfd zzfdVar2 = new zzfd("SIGNED", 1);
        zzb = zzfdVar2;
        zzfd zzfdVar3 = new zzfd("FIXED", 2);
        zzc = zzfdVar3;
        zzd = new zzfd[]{zzfdVar, zzfdVar2, zzfdVar3};
    }

    public static zzfd[] values() {
        return (zzfd[]) zzd.clone();
    }
}
