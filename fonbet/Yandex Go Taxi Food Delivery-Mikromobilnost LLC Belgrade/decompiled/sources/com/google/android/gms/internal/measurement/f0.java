package com.google.android.gms.internal.measurement;

import defpackage.et91;
import defpackage.i7b1;

/* loaded from: classes11.dex */
public final class f0 extends a1 {
    private static final f0 zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    static {
        f0 f0Var = new f0();
        zzf = f0Var;
        a1.o(f0.class, f0Var);
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new f0();
        }
        if (i2 == 4) {
            return new et91(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
