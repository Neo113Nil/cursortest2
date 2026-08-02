package com.google.android.gms.internal.measurement;

import defpackage.gz91;
import defpackage.i7b1;

/* loaded from: classes.dex */
public final class q extends a1 {
    private static final q zzh;
    private int zzb;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        q qVar = new q();
        zzh = qVar;
        a1.o(q.class, qVar);
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new q();
        }
        if (i2 == 4) {
            return new gz91(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final String r() {
        return this.zzd;
    }

    public final boolean s() {
        return (this.zzb & 2) != 0;
    }

    public final boolean t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zzb & 4) != 0;
    }

    public final boolean v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzb & 8) != 0;
    }

    public final int x() {
        return this.zzg;
    }

    public final /* synthetic */ void y(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
