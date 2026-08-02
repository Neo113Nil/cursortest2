package com.google.android.gms.internal.measurement;

import defpackage.d7b1;
import defpackage.et91;
import defpackage.i7b1;
import defpackage.jt91;
import defpackage.z0b1;

/* loaded from: classes11.dex */
public final class k extends a1 {
    private static final k zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private z0b1 zzg = d7b1.x;

    static {
        k kVar = new k();
        zzh = kVar;
        a1.o(k.class, kVar);
    }

    public static k y() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", jt91.c, "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new k();
        }
        if (i2 == 4) {
            return new et91(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final boolean s() {
        return (this.zzb & 2) != 0;
    }

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zzb & 4) != 0;
    }

    public final boolean v() {
        return this.zzf;
    }

    public final z0b1 w() {
        return this.zzg;
    }

    public final int x() {
        return this.zzg.size();
    }

    public final int z() {
        int i;
        switch (this.zzd) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
