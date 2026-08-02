package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: LazyLayoutPager.kt */
/* loaded from: classes11.dex */
public final class wa90 implements fd8 {
    public final mc90 b;
    public final fd8 c;
    public final LayoutDirection d;

    public wa90(mc90 mc90Var, fd8 fd8Var, LayoutDirection layoutDirection) {
        this.b = mc90Var;
        this.c = fd8Var;
        this.d = layoutDirection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if ((r8 + r9) > r10) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x001a, code lost:
    
        if (r8 <= 1) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
    
        r3 = true;
     */
    @Override // xsna.fd8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f, float f2, float f3) {
        int i;
        int q;
        int i2;
        float a = this.c.a(f, f2, f3);
        boolean z = false;
        if (f <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            float f4 = f + f2;
            Object obj = c5u0.a;
        }
        float abs = Math.abs(a);
        LayoutDirection layoutDirection = this.d;
        mc90 mc90Var = this.b;
        if (abs != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && z) {
            if (layoutDirection == LayoutDirection.Rtl && mc90Var.n().getOrientation() == Orientation.Horizontal) {
                i2 = mc90Var.q() + (-mc90Var.f);
            } else {
                i2 = mc90Var.f;
            }
            float f5 = i2 * (-1);
            while (a > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f5 < a) {
                f5 += mc90Var.q();
            }
            while (a < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f5 > a) {
                f5 -= mc90Var.q();
            }
            return f5;
        }
        if (Math.abs(mc90Var.f) < 1.0E-6d) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        LayoutDirection layoutDirection2 = LayoutDirection.Rtl;
        if (layoutDirection == layoutDirection2 && mc90Var.n().getOrientation() == Orientation.Horizontal) {
            i = mc90Var.q() + (-mc90Var.f);
        } else {
            i = mc90Var.f;
        }
        float f6 = i * (-1.0f);
        if (layoutDirection == layoutDirection2 && mc90Var.n().getOrientation() == Orientation.Horizontal) {
            if (!mc90Var.m()) {
                q = mc90Var.q();
                f6 += q;
            }
            return swe0.f(f6, -f3, f3);
        }
        if (mc90Var.m()) {
            q = mc90Var.q();
            f6 += q;
        }
        return swe0.f(f6, -f3, f3);
    }
}
