package com.google.android.gms.internal.play_billing;

import defpackage.fv91;
import defpackage.jfa1;
import defpackage.noa1;

/* loaded from: classes.dex */
public final class j0 extends p {
    private static final j0 zzb;
    private int zzd;
    private int zze;

    static {
        j0 j0Var = new j0();
        zzb = j0Var;
        p.o(j0.class, j0Var);
    }

    public static j0 r() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.p
    public final Object g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jfa1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", fv91.g});
        }
        if (i2 == 3) {
            return new j0();
        }
        if (i2 == 4) {
            return new noa1(7);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
