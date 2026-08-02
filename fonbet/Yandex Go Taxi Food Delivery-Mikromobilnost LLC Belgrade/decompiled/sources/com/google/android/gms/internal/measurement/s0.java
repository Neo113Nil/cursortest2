package com.google.android.gms.internal.measurement;

import defpackage.d7b1;
import defpackage.et91;
import defpackage.i7b1;
import defpackage.jt91;
import defpackage.z0b1;
import java.util.List;

/* loaded from: classes11.dex */
public final class s0 extends a1 {
    private static final s0 zzj;
    private int zzb;
    private int zzd;
    private z0b1 zze = d7b1.x;
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private double zzi;

    static {
        s0 s0Var = new s0();
        zzj = s0Var;
        a1.o(s0.class, s0Var);
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", jt91.j, "zze", s0.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new s0();
        }
        if (i2 == 4) {
            return new et91(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List r() {
        return this.zze;
    }

    public final String s() {
        return this.zzf;
    }

    public final boolean t() {
        return (this.zzb & 4) != 0;
    }

    public final String u() {
        return this.zzg;
    }

    public final boolean v() {
        return (this.zzb & 8) != 0;
    }

    public final boolean w() {
        return this.zzh;
    }

    public final boolean x() {
        return (this.zzb & 16) != 0;
    }

    public final double y() {
        return this.zzi;
    }

    public final int z() {
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
}
