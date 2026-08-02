package xsna;

import android.graphics.drawable.GradientDrawable;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AngledLinearGradient.kt */
/* loaded from: classes17.dex */
public final class ve2 {

    /* compiled from: AngledLinearGradient.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GradientDrawable.Orientation.values().length];
            try {
                iArr[GradientDrawable.Orientation.TOP_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GradientDrawable.Orientation.TR_BL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GradientDrawable.Orientation.RIGHT_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GradientDrawable.Orientation.BR_TL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GradientDrawable.Orientation.BOTTOM_TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GradientDrawable.Orientation.BL_TR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GradientDrawable.Orientation.LEFT_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GradientDrawable.Orientation.TL_BR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static ue2 a(GradientDrawable.Orientation orientation, List list, List list2, int i) {
        float f;
        if ((i & 4) != 0) {
            list2 = null;
        }
        switch (a.$EnumSwitchMapping$0[orientation.ordinal()]) {
            case 1:
                f = 270.0f;
                break;
            case 2:
                f = 225.0f;
                break;
            case 3:
                f = 180.0f;
                break;
            case 4:
                f = 135.0f;
                break;
            case 5:
                f = 90.0f;
                break;
            case 6:
                f = 45.0f;
                break;
            case 7:
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                break;
            case 8:
                f = 315.0f;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new ue2(list, list2, f);
    }
}
