package com.google.android.gms.internal.measurement;

import defpackage.et91;
import defpackage.i7b1;

/* loaded from: classes.dex */
public final class h0 extends a1 {
    private static final h0 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private y zzf;

    static {
        h0 h0Var = new h0();
        zzg = h0Var;
        a1.o(h0.class, h0Var);
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new h0();
        }
        if (i2 == 4) {
            return new et91(14);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
