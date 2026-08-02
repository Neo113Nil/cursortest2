package com.google.android.gms.internal.measurement;

import defpackage.d7b1;
import defpackage.dca1;
import defpackage.i7b1;
import defpackage.p3b1;
import defpackage.t0b1;
import defpackage.vqa1;
import defpackage.z0b1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class l0 extends a1 {
    private static final l0 zzg;
    private t0b1 zzb = p3b1.e();
    private t0b1 zzd = p3b1.e();
    private z0b1 zze;
    private z0b1 zzf;

    static {
        l0 l0Var = new l0();
        zzg = l0Var;
        a1.o(l0.class, l0Var);
    }

    public l0() {
        d7b1 d7b1Var = d7b1.x;
        this.zze = d7b1Var;
        this.zzf = d7b1Var;
    }

    public static l0 A() {
        return zzg;
    }

    public static dca1 z() {
        return (dca1) zzg.j();
    }

    public final void B(Iterable iterable) {
        List list = this.zzb;
        if (!((vqa1) list).a) {
            int size = list.size();
            this.zzb = ((p3b1) list).b0(size + size);
        }
        w0.f(iterable, this.zzb);
    }

    public final void C() {
        this.zzb = p3b1.e();
    }

    public final void D(List list) {
        List list2 = this.zzd;
        if (!((vqa1) list2).a) {
            int size = list2.size();
            this.zzd = ((p3b1) list2).b0(size + size);
        }
        w0.f(list, this.zzd);
    }

    public final void E() {
        this.zzd = p3b1.e();
    }

    public final void F(ArrayList arrayList) {
        z0b1 z0b1Var = this.zze;
        if (!((vqa1) z0b1Var).a) {
            int size = z0b1Var.size();
            this.zze = z0b1Var.b0(size + size);
        }
        w0.f(arrayList, this.zze);
    }

    public final void G() {
        this.zze = d7b1.x;
    }

    public final void H(Iterable iterable) {
        z0b1 z0b1Var = this.zzf;
        if (!((vqa1) z0b1Var).a) {
            int size = z0b1Var.size();
            this.zzf = z0b1Var.b0(size + size);
        }
        w0.f(iterable, this.zzf);
    }

    public final void I() {
        this.zzf = d7b1.x;
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", d0.class, "zzf", m0.class});
        }
        if (i2 == 3) {
            return new l0();
        }
        if (i2 == 4) {
            return new dca1();
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List r() {
        return this.zzb;
    }

    public final int s() {
        return this.zzb.size();
    }

    public final List t() {
        return this.zzd;
    }

    public final int u() {
        return this.zzd.size();
    }

    public final z0b1 v() {
        return this.zze;
    }

    public final int w() {
        return this.zze.size();
    }

    public final List x() {
        return this.zzf;
    }

    public final int y() {
        return this.zzf.size();
    }
}
