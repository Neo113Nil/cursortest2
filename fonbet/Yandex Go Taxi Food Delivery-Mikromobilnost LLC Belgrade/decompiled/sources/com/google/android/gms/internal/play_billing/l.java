package com.google.android.gms.internal.play_billing;

import defpackage.jfa1;
import defpackage.qu91;

/* loaded from: classes11.dex */
public final class l extends p {
    private static final l zzb;
    private int zzd;
    private String zze = "";

    static {
        l lVar = new l();
        zzb = lVar;
        p.o(l.class, lVar);
    }

    public static qu91 r() {
        return (qu91) zzb.i();
    }

    public static /* synthetic */ void s(l lVar, String str) {
        lVar.zzd |= 1;
        lVar.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.p
    public final Object g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jfa1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new l();
        }
        if (i2 == 4) {
            return new qu91(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
