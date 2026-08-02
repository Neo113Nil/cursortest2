package com.google.android.gms.internal.measurement;

import defpackage.i7b1;
import defpackage.k7a1;

/* loaded from: classes11.dex */
public final class d0 extends a1 {
    private static final d0 zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        d0 d0Var = new d0();
        zzf = d0Var;
        a1.o(d0.class, d0Var);
    }

    public static k7a1 v() {
        return (k7a1) zzf.j();
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new d0();
        }
        if (i2 == 4) {
            return new k7a1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final int s() {
        return this.zzd;
    }

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final long u() {
        return this.zze;
    }

    public final /* synthetic */ void w(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final /* synthetic */ void x(long j) {
        this.zzb |= 2;
        this.zze = j;
    }
}
