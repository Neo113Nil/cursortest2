package com.google.android.gms.internal.play_billing;

import defpackage.jfa1;
import defpackage.noa1;

/* loaded from: classes.dex */
public final class z extends p {
    private static final z zzb;

    static {
        z zVar = new z();
        zzb = zVar;
        p.o(z.class, zVar);
    }

    public static z r() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.p
    public final Object g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jfa1(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new z();
        }
        if (i2 == 4) {
            return new noa1(0);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
