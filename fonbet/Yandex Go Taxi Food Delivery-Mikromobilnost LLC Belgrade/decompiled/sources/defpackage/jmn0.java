package defpackage;

import com.yandex.go.scooters.analytics.ScootersRideFeedbackAnalytics$Button;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class jmn0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[FeedbackSettingsParams$Screen.values().length];
        try {
            iArr[FeedbackSettingsParams$Screen.FINISH_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FeedbackSettingsParams$Screen.CANCEL_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ScootersRideFeedbackAnalytics$Button.values().length];
        try {
            iArr2[ScootersRideFeedbackAnalytics$Button.Done.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ScootersRideFeedbackAnalytics$Button.Charity.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ScootersRideFeedbackAnalytics$Button.Dialog.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ScootersRideFeedbackAnalytics$Button.NewbieHelpItem.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
