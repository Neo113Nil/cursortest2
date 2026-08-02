package com.google.android.gms.internal.play_billing;

import defpackage.gva1;
import defpackage.jfa1;

/* loaded from: classes.dex */
public final class i0 extends p {
    private static final i0 zzb;
    private int zzd;
    private y zze;

    static {
        i0 i0Var = new i0();
        zzb = i0Var;
        p.o(i0.class, i0Var);
    }

    public static /* synthetic */ void s(i0 i0Var, y yVar) {
        i0Var.zze = yVar;
        i0Var.zzd |= 1;
    }

    public static gva1 t() {
        return (gva1) zzb.i();
    }

    @Override // com.google.android.gms.internal.play_billing.p
    public final Object g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jfa1(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new i0();
        }
        if (i2 == 4) {
            return new gva1();
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
