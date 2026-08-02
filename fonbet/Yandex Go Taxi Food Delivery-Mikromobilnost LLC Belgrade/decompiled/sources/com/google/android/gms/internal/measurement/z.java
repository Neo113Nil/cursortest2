package com.google.android.gms.internal.measurement;

import defpackage.i7b1;
import defpackage.o4a1;

/* loaded from: classes.dex */
public final class z extends a1 {
    private static final z zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        z zVar = new z();
        zzk = zVar;
        a1.o(z.class, zVar);
    }

    public static o4a1 y() {
        return (o4a1) zzk.j();
    }

    public static z z() {
        return zzk;
    }

    public final /* synthetic */ void A(boolean z) {
        this.zzb |= 1;
        this.zzd = z;
    }

    public final /* synthetic */ void B(boolean z) {
        this.zzb |= 2;
        this.zze = z;
    }

    public final /* synthetic */ void C(boolean z) {
        this.zzb |= 4;
        this.zzf = z;
    }

    public final /* synthetic */ void D(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }

    public final /* synthetic */ void E(boolean z) {
        this.zzb |= 16;
        this.zzh = z;
    }

    public final /* synthetic */ void F(boolean z) {
        this.zzb |= 32;
        this.zzi = z;
    }

    public final /* synthetic */ void G(boolean z) {
        this.zzb |= 64;
        this.zzj = z;
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new z();
        }
        if (i2 == 4) {
            return new o4a1();
        }
        if (i2 == 5) {
            return zzk;
        }
        throw null;
    }

    public final boolean r() {
        return this.zzd;
    }

    public final boolean s() {
        return this.zze;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final boolean u() {
        return this.zzg;
    }

    public final boolean v() {
        return this.zzh;
    }

    public final boolean w() {
        return this.zzi;
    }

    public final boolean x() {
        return this.zzj;
    }
}
