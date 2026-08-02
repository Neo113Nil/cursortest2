package defpackage;

import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class gnv0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SummaryPromotionsResponse.OfferAvailability.values().length];
        try {
            iArr[SummaryPromotionsResponse.OfferAvailability.ALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SummaryPromotionsResponse.OfferAvailability.ORIGINAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SummaryPromotionsResponse.OfferAvailability.ALTERNATIVE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
