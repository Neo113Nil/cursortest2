package defpackage;

import com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardViewModel$SingleCardDetailsTooltipAnchorView;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ogs0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SingleCardViewModel$SingleCardDetailsTooltipAnchorView.values().length];
        try {
            iArr[SingleCardViewModel$SingleCardDetailsTooltipAnchorView.CARD_NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SingleCardViewModel$SingleCardDetailsTooltipAnchorView.EXPIRE_DATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SingleCardViewModel$SingleCardDetailsTooltipAnchorView.CVV.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
