package com.google.android.gms.internal.measurement;

import defpackage.d7b1;
import defpackage.et91;
import defpackage.i7b1;
import defpackage.z0b1;
import java.util.List;

/* loaded from: classes.dex */
public final class r0 extends a1 {
    private static final r0 zzf;
    private int zzb;
    private z0b1 zzd = d7b1.x;
    private p0 zze;

    static {
        r0 r0Var = new r0();
        zzf = r0Var;
        a1.o(r0.class, r0Var);
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", s0.class, "zze"});
        }
        if (i2 == 3) {
            return new r0();
        }
        if (i2 == 4) {
            return new et91(18);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final List r() {
        return this.zzd;
    }

    public final p0 s() {
        p0 p0Var = this.zze;
        return p0Var == null ? p0.t() : p0Var;
    }
}
