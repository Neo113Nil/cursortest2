package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
enum zzam {
    zza("UNSET"),
    zzb("REMOTE_DEFAULT"),
    zzc("REMOTE_DELEGATION"),
    zzd("MANIFEST"),
    zze("INITIALIZATION"),
    zzf("API"),
    zzg("CHILD_ACCOUNT"),
    zzh("TCF"),
    zzi("REMOTE_ENFORCED_DEFAULT"),
    zzj("FAILSAFE");

    private final char zzk;

    zzam(String str) {
        this.zzk = r1;
    }

    public static zzam a(char c) {
        for (zzam zzamVar : values()) {
            if (zzamVar.zzk == c) {
                return zzamVar;
            }
        }
        return zza;
    }

    public final /* synthetic */ char b() {
        return this.zzk;
    }
}
