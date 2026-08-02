package defpackage;

import com.yandex.go.chargers.feedback.domain.model.ChargersFeedbackCompletedOrder$FinishingStage;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class p0a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersFeedbackCompletedOrder$FinishingStage.values().length];
        try {
            iArr[ChargersFeedbackCompletedOrder$FinishingStage.FREE_CHECK_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersFeedbackCompletedOrder$FinishingStage.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
