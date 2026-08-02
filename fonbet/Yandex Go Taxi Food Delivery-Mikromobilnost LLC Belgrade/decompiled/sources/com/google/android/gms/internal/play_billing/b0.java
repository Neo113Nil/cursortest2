package com.google.android.gms.internal.play_billing;

import defpackage.iqa1;
import defpackage.jfa1;

/* loaded from: classes.dex */
public final class b0 extends p {
    private static final b0 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private int zzg;
    private long zzh;

    static {
        b0 b0Var = new b0();
        zzb = b0Var;
        p.o(b0.class, b0Var);
    }

    public static /* synthetic */ void r(b0 b0Var, int i) {
        b0Var.zzd |= 4;
        b0Var.zzg = i;
    }

    public static /* synthetic */ void s(b0 b0Var, long j) {
        b0Var.zzd |= 8;
        b0Var.zzh = j;
    }

    public static /* synthetic */ void t(b0 b0Var, String str) {
        str.getClass();
        b0Var.zzd |= 2;
        b0Var.zzf = str;
    }

    public static /* synthetic */ void u(b0 b0Var, String str) {
        str.getClass();
        b0Var.zzd |= 1;
        b0Var.zze = str;
    }

    public static iqa1 v() {
        return (iqa1) zzb.i();
    }

    @Override // com.google.android.gms.internal.play_billing.p
    public final Object g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jfa1(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဂ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new b0();
        }
        if (i2 == 4) {
            return new iqa1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
