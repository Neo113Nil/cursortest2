package xsna;

import com.vk.ecomm.reviews.impl.allreviews.domain.model.ReviewStatus;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MarketAllReviewsViewStateMapper.kt */
/* loaded from: classes18.dex */
public final class kt00 {

    /* compiled from: MarketAllReviewsViewStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReviewStatus.values().length];
            try {
                iArr[ReviewStatus.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReviewStatus.PUBLISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReviewStatus.DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReviewStatus.REJECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReviewStatus.DISABLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static int a(ReviewStatus reviewStatus) {
        int i = a.$EnumSwitchMapping$0[reviewStatus.ordinal()];
        if (i == 1) {
            return R.attr.vk_ui_text_secondary;
        }
        if (i == 2) {
            return R.attr.vk_ui_text_positive;
        }
        if (i == 3 || i == 4 || i == 5) {
            return R.attr.vk_ui_text_negative;
        }
        throw new NoWhenBranchMatchedException();
    }
}
