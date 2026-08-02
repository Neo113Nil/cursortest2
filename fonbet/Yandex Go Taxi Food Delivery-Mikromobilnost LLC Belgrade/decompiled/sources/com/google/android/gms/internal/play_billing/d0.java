package com.google.android.gms.internal.play_billing;

import defpackage.fv91;
import defpackage.jfa1;
import defpackage.noa1;

/* loaded from: classes.dex */
public final class d0 extends p {
    private static final d0 zzb;
    private int zzd;
    private int zze;

    static {
        d0 d0Var = new d0();
        zzb = d0Var;
        p.o(d0.class, d0Var);
    }

    @Override // com.google.android.gms.internal.play_billing.p
    public final Object g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jfa1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", fv91.e});
        }
        int i3 = 3;
        if (i2 == 3) {
            return new d0();
        }
        if (i2 == 4) {
            return new noa1(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
