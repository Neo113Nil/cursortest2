package com.google.android.gms.internal.measurement;

import defpackage.d7b1;
import defpackage.et91;
import defpackage.i7b1;
import defpackage.jt91;
import defpackage.z0b1;

/* loaded from: classes.dex */
public final class k0 extends a1 {
    private static final k0 zzf;
    private int zzb;
    private int zzd = 1;
    private z0b1 zze = d7b1.x;

    static {
        k0 k0Var = new k0();
        zzf = k0Var;
        a1.o(k0.class, k0Var);
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", jt91.f, "zze", f0.class});
        }
        if (i2 == 3) {
            return new k0();
        }
        if (i2 == 4) {
            return new et91(15);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
