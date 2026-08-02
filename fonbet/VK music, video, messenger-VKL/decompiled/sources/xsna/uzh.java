package xsna;

import com.vk.ecomm.reviews.model.sort.ReviewsSort;

/* compiled from: CommunityReviewsScreenBuilder.kt */
/* loaded from: classes18.dex */
public final class uzh {
    public final sdz a;

    /* compiled from: CommunityReviewsScreenBuilder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReviewsSort.values().length];
            try {
                iArr[ReviewsSort.PUBLISHED_FROM_NEW_TO_OLD_SORT.ordinal()] = 1;
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

    public uzh(sdz sdzVar) {
        this.a = sdzVar;
    }

    public static boolean a(hzh hzhVar, Integer num, Integer num2) {
        Integer num3 = hzhVar.j;
        Integer num4 = hzhVar.i;
        if (num3 == null && num4 == null) {
            return true;
        }
        if (num == null && num2 == null) {
            return false;
        }
        return num2 == null ? epx.f(num, num4) && num3 == null : num2.equals(num3) && epx.f(num, num4);
    }

    public static /* synthetic */ boolean b(uzh uzhVar, hzh hzhVar, Integer num, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        uzhVar.getClass();
        return a(hzhVar, num, null);
    }
}
