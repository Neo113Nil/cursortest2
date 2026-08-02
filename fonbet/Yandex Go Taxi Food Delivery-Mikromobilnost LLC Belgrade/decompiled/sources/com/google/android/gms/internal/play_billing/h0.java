package com.google.android.gms.internal.play_billing;

import defpackage.dfa1;
import defpackage.i7a1;
import defpackage.jfa1;
import defpackage.noa1;

/* loaded from: classes11.dex */
public final class h0 extends p {
    private static final h0 zzb;
    private int zzd;
    private int zzf;
    private i7a1 zze = dfa1.d();
    private String zzg = "";

    static {
        h0 h0Var = new h0();
        zzb = h0Var;
        p.o(h0.class, h0Var);
    }

    @Override // com.google.android.gms.internal.play_billing.p
    public final Object g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jfa1(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new h0();
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
