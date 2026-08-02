package com.google.android.gms.internal.play_billing;

import defpackage.jfa1;
import defpackage.wwa1;

/* loaded from: classes11.dex */
public final class k0 extends p {
    private static final k0 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;

    static {
        k0 k0Var = new k0();
        zzb = k0Var;
        p.o(k0.class, k0Var);
    }

    public static /* synthetic */ void r(k0 k0Var) {
        k0Var.zzd |= 2;
        k0Var.zzf = true;
    }

    public static wwa1 s() {
        return (wwa1) zzb.i();
    }

    @Override // com.google.android.gms.internal.play_billing.p
    public final Object g(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new jfa1(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new k0();
        }
        if (i2 == 4) {
            return new wwa1(zzb);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
