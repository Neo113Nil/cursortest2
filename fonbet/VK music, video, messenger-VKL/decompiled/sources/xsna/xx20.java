package xsna;

import androidx.compose.ui.window.SecureFlagPolicy;

/* compiled from: InternalModalBottomSheet.kt */
/* loaded from: classes17.dex */
public final class xx20 {
    public final SecureFlagPolicy a;
    public final gzs<Boolean> b;
    public final gzs<Boolean> c;
    public final boolean d;
    public final long e;
    public final long f;
    public final float g;
    public final long h;
    public final float i;
    public final float j;
    public final wzs<androidx.compose.runtime.a, Integer, zpx0> k;
    public final wzs<androidx.compose.runtime.a, Integer, zpx0> l;

    public xx20() {
        throw null;
    }

    public xx20(gzs gzsVar, gzs gzsVar2, boolean z, long j, long j2, float f, long j3, float f2, float f3, wzs wzsVar, wzs wzsVar2, int i) {
        SecureFlagPolicy secureFlagPolicy = SecureFlagPolicy.Inherit;
        gzs aq0Var = (i & 2) != 0 ? new aq0(10) : gzsVar;
        gzs aq0Var2 = (i & 4) != 0 ? new aq0(10) : gzsVar2;
        boolean z2 = (i & 8) != 0 ? true : z;
        long j4 = (i & 16) != 0 ? l5g.k : j;
        long j5 = (i & 32) != 0 ? l5g.k : j2;
        float f4 = (i & 64) != 0 ? Float.NaN : f;
        long j6 = (i & 128) != 0 ? l5g.k : j3;
        float f5 = (i & 256) == 0 ? f2 : Float.NaN;
        float f6 = (i & 512) != 0 ? 0 : f3;
        wzs wzsVar3 = (i & 1024) != 0 ? null : wzsVar;
        wzs wzsVar4 = (i & 2048) != 0 ? null : wzsVar2;
        this.a = secureFlagPolicy;
        this.b = aq0Var;
        this.c = aq0Var2;
        this.d = z2;
        this.e = j4;
        this.f = j5;
        this.g = f4;
        this.h = j6;
        this.i = f5;
        this.j = f6;
        this.k = wzsVar3;
        this.l = wzsVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xx20) {
            return this.a == ((xx20) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        int b = qoy.b(sf3.a(this.a.hashCode() * 31, 31, this.b), 31, this.d);
        int i = l5g.l;
        return Float.hashCode(this.j) + io.reactivex.rxjava3.subjects.b.a(this.i, bh10.a(io.reactivex.rxjava3.subjects.b.a(this.g, bh10.a(bh10.a(b, 31, this.e), 31, this.f), 31), 31, this.h), 31);
    }
}
