package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: SheetDefaults.kt */
/* loaded from: classes11.dex */
public final class adj0 implements yzs<b6p0, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ String b;

    public adj0(String str) {
        this.b = str;
    }

    @Override // xsna.yzs
    public final s3q0 invoke(b6p0 b6p0Var, androidx.compose.runtime.a aVar, Integer num) {
        b6p0 b6p0Var2 = b6p0Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? aVar2.J(b6p0Var2) : aVar2.y(b6p0Var2) ? 4 : 2;
        }
        if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2059851063, intValue, -1, "androidx.compose.material3.DragHandleWithTooltip.<anonymous>.<anonymous> (SheetDefaults.kt:439)");
            }
            x5p0.a(b6p0Var2, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-999924215, new zcj0(this.b), aVar2), aVar2, (intValue & 14) | 805306368);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
