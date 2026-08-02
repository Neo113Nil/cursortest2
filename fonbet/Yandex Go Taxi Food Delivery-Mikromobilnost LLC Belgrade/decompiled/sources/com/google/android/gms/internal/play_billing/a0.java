package com.google.android.gms.internal.play_billing;

import defpackage.c7a1;
import defpackage.dfa1;
import defpackage.fv91;
import defpackage.i7a1;
import defpackage.jfa1;
import defpackage.n6a1;
import defpackage.noa1;

/* loaded from: classes.dex */
public final class a0 extends p {
    private static final a0 zzb;
    private int zzd;
    private int zzf;
    private y zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private c7a1 zzg = n6a1.e();
    private i7a1 zzh = dfa1.d();

    static {
        a0 a0Var = new a0();
        zzb = a0Var;
        p.o(a0.class, a0Var);
    }

    @Override // com.google.android.gms.internal.play_billing.p
    public final Object g(int i) {
        int i2 = i - 1;
        int i3 = 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jfa1(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", fv91.d, "zzg", fv91.c, "zzh", h0.class, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new a0();
        }
        if (i2 == 4) {
            return new noa1(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
