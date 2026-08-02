package com.google.android.gms.internal.play_billing;

import defpackage.fv91;
import defpackage.jfa1;
import defpackage.ot91;

/* loaded from: classes11.dex */
public final class j extends p {
    private static final j zzb;
    private int zzd;
    private l zze;
    private l zzf;
    private int zzg;

    static {
        j jVar = new j();
        zzb = jVar;
        p.o(j.class, jVar);
    }

    public static ot91 r() {
        return (ot91) zzb.i();
    }

    public static /* synthetic */ void s(j jVar, l lVar) {
        jVar.zze = lVar;
        jVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.play_billing.p
    public final Object g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jfa1(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", fv91.b});
        }
        if (i2 == 3) {
            return new j();
        }
        if (i2 == 4) {
            return new ot91(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
