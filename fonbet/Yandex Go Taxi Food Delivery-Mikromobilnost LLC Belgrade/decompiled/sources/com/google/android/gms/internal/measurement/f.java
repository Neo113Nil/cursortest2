package com.google.android.gms.internal.measurement;

import defpackage.d7b1;
import defpackage.i7b1;
import defpackage.vqa1;
import defpackage.xr91;
import defpackage.z0b1;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends a1 {
    private static final f zzi;
    private int zzb;
    private int zzd;
    private z0b1 zze;
    private z0b1 zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        f fVar = new f();
        zzi = fVar;
        a1.o(f.class, fVar);
    }

    public f() {
        d7b1 d7b1Var = d7b1.x;
        this.zze = d7b1Var;
        this.zzf = d7b1Var;
    }

    public final void A(int i, g gVar) {
        z0b1 z0b1Var = this.zzf;
        if (!((vqa1) z0b1Var).a) {
            int size = z0b1Var.size();
            this.zzf = z0b1Var.b0(size + size);
        }
        this.zzf.set(i, gVar);
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", j.class, "zzf", g.class, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new f();
        }
        if (i2 == 4) {
            return new xr91();
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final int s() {
        return this.zzd;
    }

    public final List t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final j v(int i) {
        return (j) this.zze.get(i);
    }

    public final z0b1 w() {
        return this.zzf;
    }

    public final int x() {
        return this.zzf.size();
    }

    public final g y(int i) {
        return (g) this.zzf.get(i);
    }

    public final void z(int i, j jVar) {
        z0b1 z0b1Var = this.zze;
        if (!((vqa1) z0b1Var).a) {
            int size = z0b1Var.size();
            this.zze = z0b1Var.b0(size + size);
        }
        this.zze.set(i, jVar);
    }
}
