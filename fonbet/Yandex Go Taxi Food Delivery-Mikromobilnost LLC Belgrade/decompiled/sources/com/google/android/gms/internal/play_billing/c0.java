package com.google.android.gms.internal.play_billing;

import defpackage.jfa1;
import defpackage.noa1;

/* loaded from: classes.dex */
public final class c0 extends p {
    private static final c0 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        c0 c0Var = new c0();
        zzb = c0Var;
        p.o(c0.class, c0Var);
    }

    @Override // com.google.android.gms.internal.play_billing.p
    public final Object g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 2;
        if (i2 == 2) {
            return new jfa1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new c0();
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
