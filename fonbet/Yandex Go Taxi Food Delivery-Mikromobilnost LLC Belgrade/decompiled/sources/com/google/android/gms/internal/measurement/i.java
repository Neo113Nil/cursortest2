package com.google.android.gms.internal.measurement;

import defpackage.et91;
import defpackage.i7b1;
import defpackage.jt91;

/* loaded from: classes11.dex */
public final class i extends a1 {
    private static final i zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        i iVar = new i();
        zzi = iVar;
        a1.o(i.class, iVar);
    }

    public static i A() {
        return zzi;
    }

    public final int B() {
        int i;
        int i2 = this.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", jt91.b, "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new i();
        }
        if (i2 == 4) {
            return new et91(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final boolean s() {
        return (this.zzb & 2) != 0;
    }

    public final boolean t() {
        return this.zze;
    }

    public final boolean u() {
        return (this.zzb & 4) != 0;
    }

    public final String v() {
        return this.zzf;
    }

    public final boolean w() {
        return (this.zzb & 8) != 0;
    }

    public final String x() {
        return this.zzg;
    }

    public final boolean y() {
        return (this.zzb & 16) != 0;
    }

    public final String z() {
        return this.zzh;
    }
}
