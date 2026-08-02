package defpackage;

import com.ybsdk.feature.card.api.CardScenarioEventsReceiver$ActivationResult;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class kf8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardScenarioEventsReceiver$ActivationResult.values().length];
        try {
            iArr[CardScenarioEventsReceiver$ActivationResult.FAIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardScenarioEventsReceiver$ActivationResult.SUCCESS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
