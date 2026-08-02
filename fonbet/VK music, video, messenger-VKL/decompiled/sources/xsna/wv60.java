package xsna;

import com.vk.newsfeed.domain.model.NewsfeedSimilarFeedType;

/* compiled from: NewsfeedPostsRecommendationsRemoteRepositoryFactory.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class wv60 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[NewsfeedSimilarFeedType.values().length];
        try {
            iArr[NewsfeedSimilarFeedType.BREAKING_NEWS_TREND.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NewsfeedSimilarFeedType.DZEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NewsfeedSimilarFeedType.SIMILAR_NEWS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[NewsfeedSimilarFeedType.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
