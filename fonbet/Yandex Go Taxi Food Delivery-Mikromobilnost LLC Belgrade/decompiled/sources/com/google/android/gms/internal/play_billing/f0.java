package com.google.android.gms.internal.play_billing;

import defpackage.dfa1;
import defpackage.i7a1;
import defpackage.jfa1;
import defpackage.noa1;

/* loaded from: classes11.dex */
public final class f0 extends p {
    private static final f0 zzb;
    private i7a1 zzd = dfa1.d();

    static {
        f0 f0Var = new f0();
        zzb = f0Var;
        p.o(f0.class, f0Var);
    }

    @Override // com.google.android.gms.internal.play_billing.p
    public final Object g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jfa1(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", e0.class});
        }
        if (i2 == 3) {
            return new f0();
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
