package xsna;

import com.vk.newsfeed.domain.model.DiscoverCustomIntent;

/* compiled from: NewsfeedCustomGetRequest.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class lf60 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[DiscoverCustomIntent.values().length];
        try {
            iArr[DiscoverCustomIntent.PRELOAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DiscoverCustomIntent.INITIAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DiscoverCustomIntent.PTR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DiscoverCustomIntent.NEXT_PAGE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DiscoverCustomIntent.FEED_BLOCK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
