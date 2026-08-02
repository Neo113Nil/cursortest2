package com.google.android.gms.internal.measurement;

import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zzou {
    public static final zzou zza;
    public static final zzou zzb;
    public static final zzou zzc;
    public static final zzou zzd;
    public static final zzou zze;
    public static final zzou zzf;
    public static final zzou zzg;
    public static final zzou zzh;
    public static final zzou zzi;
    private static final /* synthetic */ zzou[] zzj;

    static {
        zzou zzouVar = new zzou("INT", 0);
        zza = zzouVar;
        zzou zzouVar2 = new zzou("LONG", 1);
        zzb = zzouVar2;
        zzou zzouVar3 = new zzou("FLOAT", 2);
        zzc = zzouVar3;
        zzou zzouVar4 = new zzou("DOUBLE", 3);
        zzd = zzouVar4;
        zzou zzouVar5 = new zzou("BOOLEAN", 4);
        zze = zzouVar5;
        zzou zzouVar6 = new zzou("STRING", 5);
        zzf = zzouVar6;
        zzlh zzlhVar = zzlh.a;
        zzou zzouVar7 = new zzou("BYTE_STRING", 6);
        zzg = zzouVar7;
        zzou zzouVar8 = new zzou("ENUM", 7);
        zzh = zzouVar8;
        zzou zzouVar9 = new zzou(IDialogId.INTENT_EXTRA_IN_MESSAGE, 8);
        zzi = zzouVar9;
        zzj = new zzou[]{zzouVar, zzouVar2, zzouVar3, zzouVar4, zzouVar5, zzouVar6, zzouVar7, zzouVar8, zzouVar9};
    }

    public static zzou[] values() {
        return (zzou[]) zzj.clone();
    }
}
