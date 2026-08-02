package xsna;

import com.vk.search.params.api.VkFeedSearchParams;

/* compiled from: FeedLocalizedParamsDescriptionMapper.kt */
/* loaded from: classes5.dex */
public final class v1r extends b920 {

    /* compiled from: FeedLocalizedParamsDescriptionMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkFeedSearchParams.SortType.values().length];
            try {
                iArr[VkFeedSearchParams.SortType.DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkFeedSearchParams.SortType.RELEVANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
