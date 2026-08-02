package com.google.android.gms.internal.measurement;

import defpackage.a5a1;
import defpackage.i7b1;

/* loaded from: classes.dex */
public final class a0 extends a1 {
    private static final a0 zzh;
    private int zzb;
    private int zzd;
    private l0 zze;
    private l0 zzf;
    private boolean zzg;

    static {
        a0 a0Var = new a0();
        zzh = a0Var;
        a1.o(a0.class, a0Var);
    }

    public static a5a1 y() {
        return (a5a1) zzh.j();
    }

    public final /* synthetic */ void A(l0 l0Var) {
        this.zze = l0Var;
        this.zzb |= 2;
    }

    public final /* synthetic */ void B(l0 l0Var) {
        this.zzf = l0Var;
        this.zzb |= 4;
    }

    public final /* synthetic */ void C(boolean z) {
        this.zzb |= 8;
        this.zzg = z;
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new a0();
        }
        if (i2 == 4) {
            return new a5a1();
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final int s() {
        return this.zzd;
    }

    public final l0 t() {
        l0 l0Var = this.zze;
        return l0Var == null ? l0.A() : l0Var;
    }

    public final boolean u() {
        return (this.zzb & 4) != 0;
    }

    public final l0 v() {
        l0 l0Var = this.zzf;
        return l0Var == null ? l0.A() : l0Var;
    }

    public final boolean w() {
        return (this.zzb & 8) != 0;
    }

    public final boolean x() {
        return this.zzg;
    }

    public final /* synthetic */ void z(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }
}
