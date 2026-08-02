package defpackage;

import com.ybsdk.feature.stories.internal.domain.VerticalStoriesAnalyticsInteractor$RefererScreenState;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ng31 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VerticalStoriesAnalyticsInteractor$RefererScreenState.values().length];
        try {
            iArr[VerticalStoriesAnalyticsInteractor$RefererScreenState.INITIAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VerticalStoriesAnalyticsInteractor$RefererScreenState.CONFIG_CHANGED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VerticalStoriesAnalyticsInteractor$RefererScreenState.VIEW_CREATED_FIRST_TIME.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VerticalStoriesAnalyticsInteractor$RefererScreenState.STORY_SELECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[VerticalStoriesAnalyticsInteractor$RefererScreenState.NAVIGATION_BACK.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
