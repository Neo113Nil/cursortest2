package com.google.android.gms.internal.measurement;

import defpackage.i7b1;
import defpackage.sea1;

/* loaded from: classes.dex */
public final class o0 extends a1 {
    private static final o0 zzj;
    private int zzb;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    static {
        o0 o0Var = new o0();
        zzj = o0Var;
        a1.o(o0.class, o0Var);
    }

    public static sea1 C() {
        return (sea1) zzj.j();
    }

    public final boolean A() {
        return (this.zzb & 32) != 0;
    }

    public final double B() {
        return this.zzi;
    }

    public final /* synthetic */ void D(long j) {
        this.zzb |= 1;
        this.zzd = j;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void G() {
        this.zzb &= -5;
        this.zzf = zzj.zzf;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -9;
        this.zzg = 0L;
    }

    public final /* synthetic */ void J(double d) {
        this.zzb |= 32;
        this.zzi = d;
    }

    public final /* synthetic */ void K() {
        this.zzb &= -33;
        this.zzi = 0.0d;
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new o0();
        }
        if (i2 == 4) {
            return new sea1(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final long s() {
        return this.zzd;
    }

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zzb & 4) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzb & 8) != 0;
    }

    public final long x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zzb & 16) != 0;
    }

    public final float z() {
        return this.zzh;
    }
}
