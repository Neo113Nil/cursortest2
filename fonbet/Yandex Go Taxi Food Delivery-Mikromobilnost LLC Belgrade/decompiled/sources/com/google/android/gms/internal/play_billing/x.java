package com.google.android.gms.internal.play_billing;

import defpackage.jfa1;
import defpackage.nma1;
import defpackage.uma1;

/* loaded from: classes.dex */
public final class x extends p {
    private static final x zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;

    static {
        x xVar = new x();
        zzb = xVar;
        p.o(x.class, xVar);
    }

    public static /* synthetic */ void s(x xVar, k0 k0Var) {
        xVar.zzf = k0Var;
        xVar.zze = 3;
    }

    public static /* synthetic */ void t(x xVar, int i) {
        xVar.zzg = i - 1;
        xVar.zzd |= 1;
    }

    public static uma1 u() {
        return (uma1) zzb.i();
    }

    @Override // com.google.android.gms.internal.play_billing.p
    public final Object g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jfa1(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", nma1.b, d0.class, k0.class, f0.class});
        }
        if (i2 == 3) {
            return new x();
        }
        if (i2 == 4) {
            return new uma1();
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
