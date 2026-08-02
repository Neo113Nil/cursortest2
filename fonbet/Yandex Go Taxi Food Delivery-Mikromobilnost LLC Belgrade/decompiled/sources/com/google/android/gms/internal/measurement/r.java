package com.google.android.gms.internal.measurement;

import defpackage.d7b1;
import defpackage.i7b1;
import defpackage.sz91;
import defpackage.vqa1;
import defpackage.z0b1;
import java.util.List;

/* loaded from: classes.dex */
public final class r extends a1 {
    private static final r zzu;
    private int zzb;
    private long zzd;
    private String zze = "";
    private int zzf;
    private z0b1 zzg;
    private z0b1 zzh;
    private z0b1 zzi;
    private String zzj;
    private boolean zzk;
    private z0b1 zzl;
    private z0b1 zzm;
    private String zzn;
    private String zzo;
    private o zzp;
    private t zzq;
    private w zzr;
    private u zzs;
    private s zzt;

    static {
        r rVar = new r();
        zzu = rVar;
        a1.o(r.class, rVar);
    }

    public r() {
        d7b1 d7b1Var = d7b1.x;
        this.zzg = d7b1Var;
        this.zzh = d7b1Var;
        this.zzi = d7b1Var;
        this.zzj = "";
        this.zzl = d7b1Var;
        this.zzm = d7b1Var;
        this.zzn = "";
        this.zzo = "";
    }

    public static sz91 H() {
        return (sz91) zzu.j();
    }

    public static r I() {
        return zzu;
    }

    public final int A() {
        return this.zzl.size();
    }

    public final List B() {
        return this.zzm;
    }

    public final String C() {
        return this.zzn;
    }

    public final boolean D() {
        return (this.zzb & 128) != 0;
    }

    public final o E() {
        o oVar = this.zzp;
        return oVar == null ? o.x() : oVar;
    }

    public final boolean F() {
        return (this.zzb & 512) != 0;
    }

    public final w G() {
        w wVar = this.zzr;
        return wVar == null ? w.t() : wVar;
    }

    public final void J(int i, q qVar) {
        z0b1 z0b1Var = this.zzh;
        if (!((vqa1) z0b1Var).a) {
            int size = z0b1Var.size();
            this.zzh = z0b1Var.b0(size + size);
        }
        this.zzh.set(i, qVar);
    }

    public final void K() {
        this.zzi = d7b1.x;
    }

    public final void L() {
        this.zzl = d7b1.x;
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", v.class, "zzh", q.class, "zzi", f.class, "zzj", "zzk", "zzl", r0.class, "zzm", p.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i2 == 3) {
            return new r();
        }
        if (i2 == 4) {
            return new sz91(zzu);
        }
        if (i2 == 5) {
            return zzu;
        }
        throw null;
    }

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final long s() {
        return this.zzd;
    }

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final String u() {
        return this.zze;
    }

    public final z0b1 v() {
        return this.zzg;
    }

    public final int w() {
        return this.zzh.size();
    }

    public final q x(int i) {
        return (q) this.zzh.get(i);
    }

    public final z0b1 y() {
        return this.zzi;
    }

    public final z0b1 z() {
        return this.zzl;
    }
}
