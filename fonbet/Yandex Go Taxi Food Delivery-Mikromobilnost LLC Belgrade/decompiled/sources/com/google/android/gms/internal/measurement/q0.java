package com.google.android.gms.internal.measurement;

import defpackage.d7b1;
import defpackage.et91;
import defpackage.i7b1;
import defpackage.z0b1;
import java.util.List;

/* loaded from: classes11.dex */
public final class q0 extends a1 {
    private static final q0 zzf;
    private int zzb;
    private String zzd = "";
    private z0b1 zze = d7b1.x;

    static {
        q0 q0Var = new q0();
        zzf = q0Var;
        a1.o(q0.class, q0Var);
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", s0.class});
        }
        if (i2 == 3) {
            return new q0();
        }
        if (i2 == 4) {
            return new et91(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String r() {
        return this.zzd;
    }

    public final List s() {
        return this.zze;
    }
}
