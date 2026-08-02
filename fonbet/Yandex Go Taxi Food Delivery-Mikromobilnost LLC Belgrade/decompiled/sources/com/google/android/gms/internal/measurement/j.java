package com.google.android.gms.internal.measurement;

import defpackage.au91;
import defpackage.i7b1;

/* loaded from: classes11.dex */
public final class j extends a1 {
    private static final j zzj;
    private int zzb;
    private int zzd;
    private String zze = "";
    private h zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        j jVar = new j();
        zzj = jVar;
        a1.o(j.class, jVar);
    }

    public static au91 z() {
        return (au91) zzj.j();
    }

    public final /* synthetic */ void A(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new j();
        }
        if (i2 == 4) {
            return new au91(zzj);
        }
        if (i2 == 5) {
            return zzj;
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

    public final h u() {
        h hVar = this.zzf;
        return hVar == null ? h.z() : hVar;
    }

    public final boolean v() {
        return this.zzg;
    }

    public final boolean w() {
        return this.zzh;
    }

    public final boolean x() {
        return (this.zzb & 32) != 0;
    }

    public final boolean y() {
        return this.zzi;
    }
}
