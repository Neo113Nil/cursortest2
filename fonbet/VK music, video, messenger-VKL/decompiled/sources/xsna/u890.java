package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: Padding.kt */
/* loaded from: classes11.dex */
public final class u890 implements s890 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public u890(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & (f3 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) || !(f4 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)) {
            szw.a("Padding must be non-negative");
        }
    }

    @Override // xsna.s890
    public final float a(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.c : this.a;
    }

    @Override // xsna.s890
    public final float b() {
        return this.d;
    }

    @Override // xsna.s890
    public final float c(LayoutDirection layoutDirection) {
        return layoutDirection == LayoutDirection.Ltr ? this.a : this.c;
    }

    @Override // xsna.s890
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u890)) {
            return false;
        }
        u890 u890Var = (u890) obj;
        return pco.b(this.a, u890Var.a) && pco.b(this.b, u890Var.b) && pco.b(this.c, u890Var.c) && pco.b(this.d, u890Var.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + io.reactivex.rxjava3.subjects.b.a(this.c, io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaddingValues(start=");
        oq.f(this.a, ", top=", sb);
        oq.f(this.b, ", end=", sb);
        oq.f(this.c, ", bottom=", sb);
        return ir.f(')', this.d, sb);
    }
}
