package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Lambda;

/* compiled from: ColorVectorConverter.kt */
/* loaded from: classes11.dex */
public final class a9g extends Lambda implements izs<vq2, l5g> {
    final /* synthetic */ d8g $colorSpace;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9g(d8g d8gVar) {
        super(1);
        this.$colorSpace = d8gVar;
    }

    @Override // xsna.izs
    public final l5g invoke(vq2 vq2Var) {
        vq2 vq2Var2 = vq2Var;
        float f = vq2Var2.b;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        float f3 = vq2Var2.c;
        if (f3 < -0.5f) {
            f3 = -0.5f;
        }
        if (f3 > 0.5f) {
            f3 = 0.5f;
        }
        float f4 = vq2Var2.d;
        float f5 = f4 >= -0.5f ? f4 : -0.5f;
        float f6 = f5 <= 0.5f ? f5 : 0.5f;
        float f7 = vq2Var2.a;
        if (f7 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f2 = f7;
        }
        return new l5g(l5g.b(f870.b(f, f3, f6, f2 <= 1.0f ? f2 : 1.0f, h8g.x), this.$colorSpace));
    }
}
