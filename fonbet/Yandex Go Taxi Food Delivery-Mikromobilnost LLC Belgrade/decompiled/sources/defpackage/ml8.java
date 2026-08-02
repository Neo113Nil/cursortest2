package defpackage;

import com.ybsdk.feature.card.internal.presentation.cardpin.CardPinCodeViewState$InputStep;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ml8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CardPinCodeViewState$InputStep.values().length];
        try {
            iArr[CardPinCodeViewState$InputStep.FIRST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CardPinCodeViewState$InputStep.SECOND.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
