package com.google.android.gms.internal.measurement;

import defpackage.d7b1;
import defpackage.i5a1;
import defpackage.i7b1;
import defpackage.vqa1;
import defpackage.z0b1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c0 extends a1 {
    private static final c0 zzd;
    private z0b1 zzb = d7b1.x;

    static {
        c0 c0Var = new c0();
        zzd = c0Var;
        a1.o(c0.class, c0Var);
    }

    public static i5a1 s() {
        return (i5a1) zzd.j();
    }

    public static c0 t() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.a1
    public final Object q(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new i7b1(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", b0.class});
        }
        if (i2 == 3) {
            return new c0();
        }
        if (i2 == 4) {
            return new i5a1();
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List r() {
        return this.zzb;
    }

    public final void u(ArrayList arrayList) {
        z0b1 z0b1Var = this.zzb;
        if (!((vqa1) z0b1Var).a) {
            int size = z0b1Var.size();
            this.zzb = z0b1Var.b0(size + size);
        }
        w0.f(arrayList, this.zzb);
    }
}
