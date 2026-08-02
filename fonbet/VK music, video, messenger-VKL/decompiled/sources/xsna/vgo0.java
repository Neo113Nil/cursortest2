package xsna;

import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;
import xsna.tra0;

/* compiled from: TextFieldScroll.kt */
/* loaded from: classes11.dex */
public final class vgo0 {

    /* compiled from: TextFieldScroll.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final zhf0 a(tra0.a aVar, int i, klp0 klp0Var, ljo0 ljo0Var, boolean z, int i2) {
        zhf0 c = ljo0Var != null ? ljo0Var.c(klp0Var.b.b(i)) : zhf0.e;
        float f = c.a;
        int r0 = aVar.r0(pfo0.a);
        return zhf0.b(c, z ? (i2 - f) - r0 : f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z ? i2 - f : r0 + f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
    }
}
