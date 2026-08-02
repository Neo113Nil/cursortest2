package com.google.android.gms.internal.measurement;

import defpackage.a6a1;
import defpackage.i7b1;
import defpackage.jt91;

/* loaded from: classes11.dex */
public final class b0 extends a1 {
    private static final b0 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        b0 b0Var = new b0();
        zzf = b0Var;
        a1.o(b0.class, b0Var);
    }

    public static a6a1 r() {
        return (a6a1) zzf.j();
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", jt91.d, "zze", jt91.e});
        }
        if (i2 == 3) {
            return new b0();
        }
        if (i2 == 4) {
            return new a6a1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int s() {
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

    public final int t() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void u(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void v(int i) {
        this.zze = i - 1;
        this.zzb |= 2;
    }
}
