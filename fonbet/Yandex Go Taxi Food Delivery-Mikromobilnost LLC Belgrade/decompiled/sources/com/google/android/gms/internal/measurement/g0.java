package com.google.android.gms.internal.measurement;

import defpackage.a9a1;
import defpackage.d7b1;
import defpackage.i7b1;
import defpackage.vqa1;
import defpackage.z0b1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class g0 extends a1 {
    private static final g0 zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private z0b1 zzi = d7b1.x;

    static {
        g0 g0Var = new g0();
        zzj = g0Var;
        a1.o(g0.class, g0Var);
    }

    public static a9a1 D() {
        return (a9a1) zzj.j();
    }

    public final double A() {
        return this.zzh;
    }

    public final List B() {
        return this.zzi;
    }

    public final int C() {
        return this.zzi.size();
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void G() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 4;
        this.zzf = j;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    public final /* synthetic */ void J(double d) {
        this.zzb |= 16;
        this.zzh = d;
    }

    public final /* synthetic */ void K() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    public final void L(g0 g0Var) {
        z0b1 z0b1Var = this.zzi;
        if (!((vqa1) z0b1Var).a) {
            int size = z0b1Var.size();
            this.zzi = z0b1Var.b0(size + size);
        }
        this.zzi.add(g0Var);
    }

    public final void M(ArrayList arrayList) {
        z0b1 z0b1Var = this.zzi;
        if (!((vqa1) z0b1Var).a) {
            int size = z0b1Var.size();
            this.zzi = z0b1Var.b0(size + size);
        }
        w0.f(arrayList, this.zzi);
    }

    public final void N() {
        this.zzi = d7b1.x;
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", g0.class});
        }
        if (i2 == 3) {
            return new g0();
        }
        if (i2 == 4) {
            return new a9a1(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final String s() {
        return this.zzd;
    }

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final String u() {
        return this.zze;
    }

    public final boolean v() {
        return (this.zzb & 4) != 0;
    }

    public final long w() {
        return this.zzf;
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final float y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzb & 16) != 0;
    }
}
