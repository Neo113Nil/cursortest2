package com.google.android.gms.internal.measurement;

import defpackage.d7b1;
import defpackage.et91;
import defpackage.i7b1;
import defpackage.z0b1;

/* loaded from: classes.dex */
public final class s extends a1 {
    private static final s zzd;
    private z0b1 zzb = d7b1.x;

    static {
        s sVar = new s();
        zzd = sVar;
        a1.o(s.class, sVar);
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new s();
        }
        if (i2 == 4) {
            return new et91(7);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }
}
