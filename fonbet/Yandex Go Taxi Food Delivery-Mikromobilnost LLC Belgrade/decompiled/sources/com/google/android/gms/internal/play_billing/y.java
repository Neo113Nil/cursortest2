package com.google.android.gms.internal.play_billing;

import defpackage.jfa1;
import defpackage.nma1;
import defpackage.nna1;

/* loaded from: classes.dex */
public final class y extends p {
    private static final y zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        y yVar = new y();
        zzb = yVar;
        p.o(y.class, yVar);
    }

    public static /* synthetic */ void r(y yVar, String str) {
        yVar.zzd |= 8;
        yVar.zzh = str;
    }

    public static /* synthetic */ void s(y yVar, String str) {
        str.getClass();
        yVar.zzd |= 2;
        yVar.zzf = str;
    }

    public static /* synthetic */ void t(y yVar, int i) {
        yVar.zzd |= 1;
        yVar.zze = i;
    }

    public static /* synthetic */ void u(y yVar, int i) {
        yVar.zzg = i - 1;
        yVar.zzd |= 4;
    }

    public static nna1 v() {
        return (nna1) zzb.i();
    }

    @Override // com.google.android.gms.internal.play_billing.p
    public final Object g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jfa1(zzb, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", nma1.c, "zzh"});
        }
        if (i2 == 3) {
            return new y();
        }
        if (i2 == 4) {
            return new nna1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
