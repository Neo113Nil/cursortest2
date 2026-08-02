package com.google.android.gms.internal.measurement;

import defpackage.d7b1;
import defpackage.et91;
import defpackage.i7b1;
import defpackage.z0b1;
import java.util.List;

/* loaded from: classes.dex */
public final class o extends a1 {
    private static final o zzi;
    private int zzb;
    private z0b1 zzd;
    private z0b1 zze;
    private z0b1 zzf;
    private boolean zzg;
    private z0b1 zzh;

    static {
        o oVar = new o();
        zzi = oVar;
        a1.o(o.class, oVar);
    }

    public o() {
        d7b1 d7b1Var = d7b1.x;
        this.zzd = d7b1Var;
        this.zze = d7b1Var;
        this.zzf = d7b1Var;
        this.zzh = d7b1Var;
    }

    public static o x() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 2;
        if (i2 == 2) {
            return new i7b1(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", l.class, "zze", m.class, "zzf", n.class, "zzg", "zzh", l.class});
        }
        if (i2 == 3) {
            return new o();
        }
        if (i2 == 4) {
            return new et91(i3);
        }
        if (i2 == 5) {
            return zzi;
        }
        throw null;
    }

    public final List r() {
        return this.zzd;
    }

    public final List s() {
        return this.zze;
    }

    public final List t() {
        return this.zzf;
    }

    public final boolean u() {
        return (this.zzb & 1) != 0;
    }

    public final boolean v() {
        return this.zzg;
    }

    public final z0b1 w() {
        return this.zzh;
    }
}
