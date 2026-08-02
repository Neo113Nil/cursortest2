package com.google.android.gms.internal.play_billing;

import defpackage.bua1;
import defpackage.jfa1;

/* loaded from: classes.dex */
public final class g0 extends p {
    private static final g0 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private b0 zzg;
    private c0 zzh;

    static {
        g0 g0Var = new g0();
        zzb = g0Var;
        p.o(g0.class, g0Var);
    }

    public static /* synthetic */ void r(g0 g0Var, w wVar) {
        g0Var.zzf = wVar;
        g0Var.zze = 2;
    }

    public static /* synthetic */ void s(g0 g0Var, x xVar) {
        g0Var.zzf = xVar;
        g0Var.zze = 3;
    }

    public static /* synthetic */ void t(g0 g0Var, z zVar) {
        zVar.getClass();
        g0Var.zzf = zVar;
        g0Var.zze = 7;
    }

    public static /* synthetic */ void u(g0 g0Var, b0 b0Var) {
        b0Var.getClass();
        g0Var.zzg = b0Var;
        g0Var.zzd |= 1;
    }

    public static /* synthetic */ void v(g0 g0Var, i0 i0Var) {
        g0Var.zzf = i0Var;
        g0Var.zze = 8;
    }

    public static /* synthetic */ void w(g0 g0Var, j0 j0Var) {
        g0Var.zzf = j0Var;
        g0Var.zze = 4;
    }

    public static bua1 x() {
        return (bua1) zzb.i();
    }

    @Override // com.google.android.gms.internal.play_billing.p
    public final Object g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jfa1(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", w.class, x.class, j0.class, a0.class, "zzh", z.class, i0.class});
        }
        if (i2 == 3) {
            return new g0();
        }
        if (i2 == 4) {
            return new bua1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
