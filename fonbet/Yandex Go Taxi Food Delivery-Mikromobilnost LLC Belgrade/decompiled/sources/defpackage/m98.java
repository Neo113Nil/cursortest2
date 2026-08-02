package defpackage;

import com.ybsdk.feature.card.internal.presentation.cardactivation.CardActivationInputState;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class m98 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardActivationInputState.values().length];
        try {
            iArr[CardActivationInputState.CVV.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardActivationInputState.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
