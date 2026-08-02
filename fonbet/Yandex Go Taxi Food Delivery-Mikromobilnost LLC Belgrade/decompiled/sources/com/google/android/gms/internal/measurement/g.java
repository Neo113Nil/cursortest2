package com.google.android.gms.internal.measurement;

import defpackage.d7b1;
import defpackage.hs91;
import defpackage.i7b1;
import defpackage.vqa1;
import defpackage.z0b1;
import java.util.List;

/* loaded from: classes11.dex */
public final class g extends a1 {
    private static final g zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private z0b1 zzf = d7b1.x;
    private boolean zzg;
    private i zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        g gVar = new g();
        zzl = gVar;
        a1.o(g.class, gVar);
    }

    public static hs91 D() {
        return (hs91) zzl.j();
    }

    public final boolean A() {
        return this.zzj;
    }

    public final boolean B() {
        return (this.zzb & 64) != 0;
    }

    public final boolean C() {
        return this.zzk;
    }

    public final /* synthetic */ void E(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final void F(int i, h hVar) {
        z0b1 z0b1Var = this.zzf;
        if (!((vqa1) z0b1Var).a) {
            int size = z0b1Var.size();
            this.zzf = z0b1Var.b0(size + size);
        }
        this.zzf.set(i, hVar);
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", h.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new g();
        }
        if (i2 == 4) {
            return new hs91(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        throw null;
    }

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final int s() {
        return this.zzd;
    }

    public final String t() {
        return this.zze;
    }

    public final List u() {
        return this.zzf;
    }

    public final int v() {
        return this.zzf.size();
    }

    public final h w(int i) {
        return (h) this.zzf.get(i);
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final i y() {
        i iVar = this.zzh;
        return iVar == null ? i.A() : iVar;
    }

    public final boolean z() {
        return this.zzi;
    }
}
