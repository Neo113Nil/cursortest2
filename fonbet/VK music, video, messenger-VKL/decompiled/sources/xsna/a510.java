package xsna;

import com.vk.ecomm.reviews.model.sort.ReviewsSort;

/* compiled from: MarketItemReviewsViewStateMapper.kt */
/* loaded from: classes18.dex */
public final class a510 {
    public final sdz a;

    /* compiled from: MarketItemReviewsViewStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReviewsSort.values().length];
            try {
                iArr[ReviewsSort.NEWEST_SORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReviewsSort.WITH_PHOTOS_SORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReviewsSort.HIGHEST_MARKS_SORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a510(sdz sdzVar) {
        this.a = sdzVar;
    }
}
