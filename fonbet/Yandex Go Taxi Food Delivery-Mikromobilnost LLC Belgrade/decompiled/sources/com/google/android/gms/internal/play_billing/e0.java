package com.google.android.gms.internal.play_billing;

import defpackage.fv91;
import defpackage.jfa1;
import defpackage.noa1;

/* loaded from: classes11.dex */
public final class e0 extends p {
    private static final e0 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        e0 e0Var = new e0();
        zzb = e0Var;
        p.o(e0.class, e0Var);
    }

    @Override // com.google.android.gms.internal.play_billing.p
    public final Object g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jfa1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", fv91.f, "zzf"});
        }
        if (i2 == 3) {
            return new e0();
        }
        if (i2 == 4) {
            return new noa1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
