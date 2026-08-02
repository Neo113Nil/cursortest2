package com.google.android.gms.internal.measurement;

import defpackage.et91;
import defpackage.i7b1;

/* loaded from: classes.dex */
public final class t extends a1 {
    private static final t zzi;
    private int zzb;
    private int zzd = 14;
    private int zze = 11;
    private int zzf = 60;
    private int zzg = 13;
    private int zzh = 11;

    static {
        t tVar = new t();
        zzi = tVar;
        a1.o(t.class, tVar);
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new t();
        }
        if (i2 == 4) {
            return new et91(8);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }
}
