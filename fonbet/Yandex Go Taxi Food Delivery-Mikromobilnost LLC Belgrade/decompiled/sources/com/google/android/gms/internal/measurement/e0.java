package com.google.android.gms.internal.measurement;

import defpackage.d7b1;
import defpackage.i7b1;
import defpackage.vqa1;
import defpackage.y7a1;
import defpackage.z0b1;
import java.util.List;

/* loaded from: classes.dex */
public final class e0 extends a1 {
    private static final e0 zzj;
    private int zzb;
    private z0b1 zzd = d7b1.x;
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        e0 e0Var = new e0();
        zzj = e0Var;
        a1.o(e0.class, e0Var);
    }

    public static y7a1 B() {
        return (y7a1) zzj.j();
    }

    public final int A() {
        return this.zzh;
    }

    public final /* synthetic */ void C(int i, g0 g0Var) {
        L();
        this.zzd.set(i, g0Var);
    }

    public final /* synthetic */ void D(g0 g0Var) {
        g0Var.getClass();
        L();
        this.zzd.add(g0Var);
    }

    public final /* synthetic */ void E(Iterable iterable) {
        L();
        w0.f(iterable, this.zzd);
    }

    public final void F() {
        this.zzd = d7b1.x;
    }

    public final /* synthetic */ void G(int i) {
        L();
        this.zzd.remove(i);
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void I(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    public final /* synthetic */ void J(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void K(long j) {
        this.zzb |= 16;
        this.zzi = j;
    }

    public final void L() {
        z0b1 z0b1Var = this.zzd;
        if (((vqa1) z0b1Var).a) {
            return;
        }
        int size = z0b1Var.size();
        this.zzd = z0b1Var.b0(size + size);
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", g0.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new e0();
        }
        if (i2 == 4) {
            return new y7a1(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List r() {
        return this.zzd;
    }

    public final int s() {
        return this.zzd.size();
    }

    public final g0 t(int i) {
        return (g0) this.zzd.get(i);
    }

    public final String u() {
        return this.zze;
    }

    public final boolean v() {
        return (this.zzb & 2) != 0;
    }

    public final long w() {
        return this.zzf;
    }

    public final boolean x() {
        return (this.zzb & 4) != 0;
    }

    public final long y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzb & 8) != 0;
    }
}
