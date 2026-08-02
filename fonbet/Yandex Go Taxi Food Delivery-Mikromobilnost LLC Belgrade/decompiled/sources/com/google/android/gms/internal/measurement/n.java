package com.google.android.gms.internal.measurement;

import defpackage.et91;
import defpackage.i7b1;

/* loaded from: classes.dex */
public final class n extends a1 {
    private static final n zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        n nVar = new n();
        zzf = nVar;
        a1.o(n.class, nVar);
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new n();
        }
        int i3 = 5;
        if (i2 == 4) {
            return new et91(i3);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String r() {
        return this.zzd;
    }
}
