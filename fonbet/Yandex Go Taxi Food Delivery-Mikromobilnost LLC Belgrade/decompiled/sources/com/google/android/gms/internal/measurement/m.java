package com.google.android.gms.internal.measurement;

import defpackage.et91;
import defpackage.hw91;
import defpackage.i7b1;
import defpackage.jl40;

/* loaded from: classes.dex */
public final class m extends a1 {
    private static final m zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        m mVar = new m();
        zzf = mVar;
        a1.o(m.class, mVar);
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            hw91 hw91Var = hw91.c;
            return new i7b1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", hw91Var, "zze", hw91Var});
        }
        if (i2 == 3) {
            return new m();
        }
        int i3 = 4;
        if (i2 == 4) {
            return new et91(i3);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int s() {
        int S = jl40.S(this.zzd);
        if (S == 0) {
            return 1;
        }
        return S;
    }

    public final int t() {
        int S = jl40.S(this.zze);
        if (S == 0) {
            return 1;
        }
        return S;
    }
}
