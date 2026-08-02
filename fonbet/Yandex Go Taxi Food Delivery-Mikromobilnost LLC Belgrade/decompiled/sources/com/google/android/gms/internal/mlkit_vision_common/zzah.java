package com.google.android.gms.internal.mlkit_vision_common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class zzah {
    public static final zzah zza;
    public static final zzah zzb;
    public static final zzah zzc;
    private static final /* synthetic */ zzah[] zzd;

    static {
        zzah zzahVar = new zzah("DEFAULT", 0);
        zza = zzahVar;
        zzah zzahVar2 = new zzah("SIGNED", 1);
        zzb = zzahVar2;
        zzah zzahVar3 = new zzah("FIXED", 2);
        zzc = zzahVar3;
        zzd = new zzah[]{zzahVar, zzahVar2, zzahVar3};
    }

    public static zzah[] values() {
        return (zzah[]) zzd.clone();
    }
}
