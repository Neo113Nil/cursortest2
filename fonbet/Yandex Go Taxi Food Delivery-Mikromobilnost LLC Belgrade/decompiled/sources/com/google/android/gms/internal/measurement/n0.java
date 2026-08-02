package com.google.android.gms.internal.measurement;

import defpackage.bda1;
import defpackage.i7b1;
import defpackage.jt91;
import defpackage.nwa1;
import defpackage.twa1;

/* loaded from: classes.dex */
public final class n0 extends a1 {
    private static final n0 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        n0 n0Var = new n0();
        zzg = n0Var;
        a1.o(n0.class, n0Var);
    }

    public static bda1 s() {
        return (bda1) zzg.j();
    }

    public static n0 t() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", jt91.i, "zze", jt91.g, "zzf", jt91.h});
        }
        if (i2 == 3) {
            return new n0();
        }
        if (i2 == 4) {
            return new bda1();
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final zzin r() {
        zzin a = zzin.a(this.zze);
        return a == null ? zzin.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : a;
    }

    public final /* synthetic */ void u(zzin zzinVar) {
        this.zze = zzinVar.zza();
        this.zzb |= 2;
    }

    public final int w() {
        int j = twa1.j(this.zzd);
        if (j == 0) {
            return 1;
        }
        return j;
    }

    public final int x() {
        int j = nwa1.j(this.zzf);
        if (j == 0) {
            return 1;
        }
        return j;
    }

    public final /* synthetic */ void y(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void z(int i) {
        this.zzf = i - 1;
        this.zzb |= 4;
    }
}
