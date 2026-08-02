package com.google.android.gms.internal.mlkit_vision_text_common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class zzcw {
    public static final zzcw zza;
    public static final zzcw zzb;
    public static final zzcw zzc;
    private static final /* synthetic */ zzcw[] zzd;

    static {
        zzcw zzcwVar = new zzcw("DEFAULT", 0);
        zza = zzcwVar;
        zzcw zzcwVar2 = new zzcw("SIGNED", 1);
        zzb = zzcwVar2;
        zzcw zzcwVar3 = new zzcw("FIXED", 2);
        zzc = zzcwVar3;
        zzd = new zzcw[]{zzcwVar, zzcwVar2, zzcwVar3};
    }

    public static zzcw[] values() {
        return (zzcw[]) zzd.clone();
    }
}
