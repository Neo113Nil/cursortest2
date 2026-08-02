package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: Padding.kt */
/* loaded from: classes11.dex */
final class j890 extends d730<o890> {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;
    public final izs<z5x, s3q0> f;

    public j890() {
        throw null;
    }

    public j890(float f, float f2, float f3, float f4, izs izsVar) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        boolean z = true;
        this.e = true;
        this.f = izsVar;
        boolean z2 = (f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Float.isNaN(f)) & (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Float.isNaN(f2)) & (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || Float.isNaN(f3));
        if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            szw.a("Padding must be non-negative");
        }
    }

    public final boolean equals(Object obj) {
        j890 j890Var = obj instanceof j890 ? (j890) obj : null;
        return j890Var != null && pco.b(this.a, j890Var.a) && pco.b(this.b, j890Var.b) && pco.b(this.c, j890Var.c) && pco.b(this.d, j890Var.d) && this.e == j890Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + io.reactivex.rxjava3.subjects.b.a(this.d, io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    @Override // xsna.d730
    public final o890 r() {
        o890 o890Var = new o890();
        o890Var.p = this.a;
        o890Var.q = this.b;
        o890Var.r = this.c;
        o890Var.s = this.d;
        o890Var.t = this.e;
        return o890Var;
    }

    @Override // xsna.d730
    public final void s(o890 o890Var) {
        o890 o890Var2 = o890Var;
        o890Var2.p = this.a;
        o890Var2.q = this.b;
        o890Var2.r = this.c;
        o890Var2.s = this.d;
        o890Var2.t = this.e;
    }
}
