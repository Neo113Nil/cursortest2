package com.google.android.gms.internal.measurement;

import defpackage.et91;
import defpackage.i7b1;

/* loaded from: classes.dex */
public final class w extends a1 {
    private static final w zzi;
    private int zzb;
    private int zzg;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        w wVar = new w();
        zzi = wVar;
        a1.o(w.class, wVar);
    }

    public static w t() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new w();
        }
        if (i2 == 4) {
            return new et91(11);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final int r() {
        return this.zzg;
    }

    public final String s() {
        return this.zzh;
    }
}
