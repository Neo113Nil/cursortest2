package com.google.android.gms.internal.measurement;

import defpackage.et91;
import defpackage.hw91;
import defpackage.i7b1;
import defpackage.jl40;
import defpackage.wva1;

/* loaded from: classes.dex */
public final class l extends a1 {
    private static final l zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        l lVar = new l();
        zzg = lVar;
        a1.o(l.class, lVar);
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", hw91.c, "zze", hw91.b, "zzf", hw91.d});
        }
        int i3 = 3;
        if (i2 == 3) {
            return new l();
        }
        if (i2 == 4) {
            return new et91(i3);
        }
        if (i2 == 5) {
            return zzg;
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
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int u() {
        int g = wva1.g(this.zzf);
        if (g == 0) {
            return 1;
        }
        return g;
    }
}
