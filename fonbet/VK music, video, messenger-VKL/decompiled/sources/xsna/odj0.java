package xsna;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: ShimmerEffect.kt */
/* loaded from: classes17.dex */
public final class odj0 {
    public final iq2<Float> a;
    public final int b;
    public final float c;
    public final List<l5g> d;
    public final List<Float> e;
    public final float f;
    public final if2<Float, sq2> g;
    public final Matrix h;
    public final LinearGradient i;
    public final va2 j;
    public final va2 k;

    public odj0() {
        throw null;
    }

    public odj0(iq2 iq2Var, int i, float f, List list, List list2, float f2) {
        this.a = iq2Var;
        this.b = i;
        this.c = f;
        this.d = list;
        this.e = list2;
        this.f = f2;
        this.g = qf2.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.h = new Matrix();
        float f3 = 2;
        LinearGradient a = jcr.a((Float.floatToRawIntBits((-f2) / f3) << 32) | (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L), (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L) | (Float.floatToRawIntBits(f2 / f3) << 32), list, list2, 0);
        this.i = a;
        va2 va2Var = new va2();
        va2Var.a.setAntiAlias(true);
        va2Var.q(0);
        va2Var.i(i);
        va2Var.f(a);
        this.j = va2Var;
        this.k = new va2();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!odj0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        odj0 odj0Var = (odj0) obj;
        return epx.f(this.a, odj0Var.a) && this.b == odj0Var.b && this.c == odj0Var.c && epx.f(this.d, odj0Var.d) && epx.f(this.e, odj0Var.e) && this.f == odj0Var.f;
    }

    public final int hashCode() {
        int a = fw3.a(io.reactivex.rxjava3.subjects.b.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d);
        List<Float> list = this.e;
        return Float.hashCode(this.f) + ((a + (list != null ? list.hashCode() : 0)) * 31);
    }
}
