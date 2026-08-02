package defpackage;

import com.yandex.go.chargers.feedback.data.ChargersFeedbackScreenPromoPlateAnimationTag;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class oz9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersFeedbackScreenPromoPlateAnimationTag.values().length];
        try {
            iArr[ChargersFeedbackScreenPromoPlateAnimationTag.DISCOUNT_PROGRESS_ACHIEVED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersFeedbackScreenPromoPlateAnimationTag.TASK_PROGRESS_ACHIEVED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
