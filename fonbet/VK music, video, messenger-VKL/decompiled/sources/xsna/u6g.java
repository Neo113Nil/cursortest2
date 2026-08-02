package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: ColorKeyframeAnimation.java */
/* loaded from: classes12.dex */
public final class u6g extends phy<Integer> {
    @Override // xsna.tf6
    public final Object g(nhy nhyVar, float f) {
        return Integer.valueOf(m(nhyVar, f));
    }

    public final int m(nhy<Integer> nhyVar, float f) {
        float f2;
        Float f3;
        Integer num = nhyVar.b;
        Integer num2 = nhyVar.b;
        if (num == null || nhyVar.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        a900<A> a900Var = this.e;
        if (a900Var == 0 || (f3 = nhyVar.h) == null) {
            f2 = f;
        } else {
            f2 = f;
            Integer num3 = (Integer) a900Var.b(nhyVar.g, f3.floatValue(), num2, nhyVar.c, f2, e(), this.d);
            if (num3 != null) {
                return num3.intValue();
            }
        }
        return zq70.p(ls20.b(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), num2.intValue(), nhyVar.c.intValue());
    }
}
