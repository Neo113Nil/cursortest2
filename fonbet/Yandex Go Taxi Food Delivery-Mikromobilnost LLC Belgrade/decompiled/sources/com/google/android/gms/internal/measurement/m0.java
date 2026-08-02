package com.google.android.gms.internal.measurement;

import defpackage.i7b1;
import defpackage.p3b1;
import defpackage.pca1;
import defpackage.t0b1;
import defpackage.vqa1;
import java.util.List;

/* loaded from: classes11.dex */
public final class m0 extends a1 {
    private static final m0 zzf;
    private int zzb;
    private int zzd;
    private t0b1 zze = p3b1.e();

    static {
        m0 m0Var = new m0();
        zzf = m0Var;
        a1.o(m0.class, m0Var);
    }

    public static pca1 w() {
        return (pca1) zzf.j();
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new m0();
        }
        if (i2 == 4) {
            return new pca1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final int s() {
        return this.zzd;
    }

    public final List t() {
        return this.zze;
    }

    public final int u() {
        return this.zze.size();
    }

    public final long v(int i) {
        return ((p3b1) this.zze).b(i);
    }

    public final /* synthetic */ void x(int i) {
        this.zzb |= 1;
        this.zzd = i;
    }

    public final void y(List list) {
        List list2 = this.zze;
        if (!((vqa1) list2).a) {
            int size = list2.size();
            this.zze = ((p3b1) list2).b0(size + size);
        }
        w0.f(list, this.zze);
    }
}
