package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: AspectRatio.kt */
/* loaded from: classes11.dex */
final class ru3 extends d730<tu3> {
    public final float a;
    public final boolean b;
    public final izs<z5x, s3q0> c;

    public ru3(float f, izs izsVar, boolean z) {
        this.a = f;
        this.b = z;
        this.c = izsVar;
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        szw.a("aspectRatio " + f + " must be > 0");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ru3 ru3Var = obj instanceof ru3 ? (ru3) obj : null;
        if (ru3Var != null && this.a == ru3Var.a) {
            if (this.b == ((ru3) obj).b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    @Override // xsna.d730
    public final tu3 r() {
        tu3 tu3Var = new tu3();
        tu3Var.p = this.a;
        tu3Var.q = this.b;
        return tu3Var;
    }

    @Override // xsna.d730
    public final void s(tu3 tu3Var) {
        tu3 tu3Var2 = tu3Var;
        tu3Var2.p = this.a;
        tu3Var2.q = this.b;
    }
}
