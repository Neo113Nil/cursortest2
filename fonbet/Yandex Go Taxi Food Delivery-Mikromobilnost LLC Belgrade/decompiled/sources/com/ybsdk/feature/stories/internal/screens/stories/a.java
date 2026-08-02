package com.ybsdk.feature.stories.internal.screens.stories;

import com.ybsdk.feature.stories.internal.screens.stories.StoriesFragment;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StoriesFragment.ProgressType.values().length];
        try {
            iArr[StoriesFragment.ProgressType.CIRCLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StoriesFragment.ProgressType.SKEL_45.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StoriesFragment.ProgressType.SKEL_100.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
