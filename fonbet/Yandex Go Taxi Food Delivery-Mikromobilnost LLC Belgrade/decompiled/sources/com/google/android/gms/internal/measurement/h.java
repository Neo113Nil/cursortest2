package com.google.android.gms.internal.measurement;

import defpackage.i7b1;
import defpackage.ts91;

/* loaded from: classes11.dex */
public final class h extends a1 {
    private static final h zzh;
    private int zzb;
    private k zzd;
    private i zze;
    private boolean zzf;
    private String zzg = "";

    static {
        h hVar = new h();
        zzh = hVar;
        a1.o(h.class, hVar);
    }

    public static h z() {
        return zzh;
    }

    public final /* synthetic */ void A(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new h();
        }
        if (i2 == 4) {
            return new ts91(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final k s() {
        k kVar = this.zzd;
        return kVar == null ? k.y() : kVar;
    }

    public final boolean t() {
        return (this.zzb & 2) != 0;
    }

    public final i u() {
        i iVar = this.zze;
        return iVar == null ? i.A() : iVar;
    }

    public final boolean v() {
        return (this.zzb & 4) != 0;
    }

    public final boolean w() {
        return this.zzf;
    }

    public final boolean x() {
        return (this.zzb & 8) != 0;
    }

    public final String y() {
        return this.zzg;
    }
}
