package com.google.android.gms.internal.measurement;

import defpackage.baa1;
import defpackage.d7b1;
import defpackage.hw91;
import defpackage.i7b1;
import defpackage.kya1;
import defpackage.vqa1;
import defpackage.z0b1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i0 extends a1 {
    private static final i0 zzh;
    private int zzb;
    private z0b1 zzd = d7b1.x;
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        i0 i0Var = new i0();
        zzh = i0Var;
        a1.o(i0.class, i0Var);
    }

    public static baa1 y() {
        return (baa1) zzh.j();
    }

    public static baa1 z(i0 i0Var) {
        kya1 j = zzh.j();
        j.g(i0Var);
        return (baa1) j;
    }

    public final /* synthetic */ void A(int i, j0 j0Var) {
        G();
        this.zzd.set(i, j0Var);
    }

    public final /* synthetic */ void B(j0 j0Var) {
        G();
        this.zzd.add(j0Var);
    }

    public final /* synthetic */ void C(ArrayList arrayList) {
        G();
        w0.f(arrayList, this.zzd);
    }

    public final void D() {
        this.zzd = d7b1.x;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void G() {
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
            return new i7b1(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", j0.class, "zze", "zzf", "zzg", hw91.f});
        }
        if (i2 == 3) {
            return new i0();
        }
        if (i2 == 4) {
            return new baa1(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List r() {
        return this.zzd;
    }

    public final int s() {
        return this.zzd.size();
    }

    public final j0 t(int i) {
        return (j0) this.zzd.get(i);
    }

    public final boolean u() {
        return (this.zzb & 1) != 0;
    }

    public final String v() {
        return this.zze;
    }

    public final boolean w() {
        return (this.zzb & 2) != 0;
    }

    public final String x() {
        return this.zzf;
    }
}
