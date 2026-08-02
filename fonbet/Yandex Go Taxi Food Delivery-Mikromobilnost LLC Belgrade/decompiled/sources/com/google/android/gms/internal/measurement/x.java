package com.google.android.gms.internal.measurement;

import defpackage.g3a1;
import defpackage.i7b1;
import defpackage.r2a1;
import defpackage.y2a1;

/* loaded from: classes.dex */
public final class x extends a1 {
    private static final x zzn;
    private int zzb;
    private String zzd;
    private String zze;
    private String zzf;
    private long zzg;
    private String zzh;
    private String zzi;
    private String zzj;
    private long zzk;
    private zzng zzl;
    private zzng zzm;

    static {
        x xVar = new x();
        zzn = xVar;
        a1.o(x.class, xVar);
    }

    public x() {
        zzng zzngVar = zzng.a;
        this.zzl = zzngVar;
        this.zzm = zzngVar;
        this.zzd = "";
        this.zze = "";
        this.zzf = "";
        this.zzh = "";
        this.zzi = "";
        this.zzj = "";
    }

    public static r2a1 Q() {
        return (r2a1) zzn.j();
    }

    public static x R() {
        return zzn;
    }

    public final boolean A() {
        return (this.zzb & 1) != 0;
    }

    public final String B() {
        return this.zzd;
    }

    public final boolean C() {
        return (this.zzb & 2) != 0;
    }

    public final String D() {
        return this.zze;
    }

    public final boolean E() {
        return (this.zzb & 4) != 0;
    }

    public final String F() {
        return this.zzf;
    }

    public final boolean G() {
        return (this.zzb & 8) != 0;
    }

    public final long H() {
        return this.zzg;
    }

    public final boolean I() {
        return (this.zzb & 16) != 0;
    }

    public final String J() {
        return this.zzh;
    }

    public final boolean K() {
        return (this.zzb & 32) != 0;
    }

    public final String L() {
        return this.zzi;
    }

    public final boolean M() {
        return (this.zzb & 64) != 0;
    }

    public final String N() {
        return this.zzj;
    }

    public final boolean O() {
        return (this.zzb & 128) != 0;
    }

    public final long P() {
        return this.zzk;
    }

    public final /* synthetic */ void S(String str) {
        this.zzb |= 1;
        this.zzd = str;
    }

    public final /* synthetic */ void T() {
        this.zzb &= -2;
        this.zzd = zzn.zzd;
    }

    public final /* synthetic */ void U(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    public final /* synthetic */ void V() {
        this.zzb &= -3;
        this.zze = zzn.zze;
    }

    public final /* synthetic */ void W(String str) {
        this.zzb |= 4;
        this.zzf = str;
    }

    public final /* synthetic */ void X() {
        this.zzb &= -5;
        this.zzf = zzn.zzf;
    }

    public final /* synthetic */ void Y(long j) {
        this.zzb |= 8;
        this.zzg = j;
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", y2a1.a, "zzm", g3a1.a});
        }
        if (i2 == 3) {
            return new x();
        }
        if (i2 == 4) {
            return new r2a1(zzn);
        }
        if (i2 == 5) {
            return zzn;
        }
        throw null;
    }

    public final /* synthetic */ void r(String str) {
        this.zzb |= 16;
        this.zzh = str;
    }

    public final /* synthetic */ void s() {
        this.zzb &= -17;
        this.zzh = zzn.zzh;
    }

    public final /* synthetic */ void t(String str) {
        this.zzb |= 32;
        this.zzi = str;
    }

    public final /* synthetic */ void u() {
        this.zzb &= -33;
        this.zzi = zzn.zzi;
    }

    public final /* synthetic */ void v(String str) {
        this.zzb |= 64;
        this.zzj = str;
    }

    public final /* synthetic */ void w() {
        this.zzb &= -65;
        this.zzj = zzn.zzj;
    }

    public final /* synthetic */ void x(long j) {
        this.zzb |= 128;
        this.zzk = j;
    }

    public final /* synthetic */ zzng y() {
        if (!this.zzl.c()) {
            this.zzl = this.zzl.a();
        }
        return this.zzl;
    }

    public final /* synthetic */ zzng z() {
        if (!this.zzm.c()) {
            this.zzm = this.zzm.a();
        }
        return this.zzm;
    }
}
