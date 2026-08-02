package com.google.android.gms.internal.measurement;

import defpackage.d7b1;
import defpackage.et91;
import defpackage.i7b1;
import defpackage.z0b1;

/* loaded from: classes.dex */
public final class p extends a1 {
    private static final p zzg;
    private int zzb;
    private String zzd = "";
    private z0b1 zze = d7b1.x;
    private boolean zzf;

    static {
        p pVar = new p();
        zzg = pVar;
        a1.o(p.class, pVar);
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", u.class, "zzf"});
        }
        if (i2 == 3) {
            return new p();
        }
        if (i2 == 4) {
            return new et91(6);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String r() {
        return this.zzd;
    }
}
