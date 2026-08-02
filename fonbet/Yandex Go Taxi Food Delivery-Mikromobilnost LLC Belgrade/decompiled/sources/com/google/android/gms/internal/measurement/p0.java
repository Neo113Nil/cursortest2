package com.google.android.gms.internal.measurement;

import defpackage.d7b1;
import defpackage.et91;
import defpackage.i7b1;
import defpackage.z0b1;
import java.util.List;

/* loaded from: classes11.dex */
public final class p0 extends a1 {
    private static final p0 zzd;
    private z0b1 zzb = d7b1.x;

    static {
        p0 p0Var = new p0();
        zzd = p0Var;
        a1.o(p0.class, p0Var);
    }

    public static p0 t() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", q0.class});
        }
        if (i2 == 3) {
            return new p0();
        }
        if (i2 == 4) {
            return new et91(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List r() {
        return this.zzb;
    }

    public final int s() {
        return this.zzb.size();
    }
}
