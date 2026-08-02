package com.yandex.go.navigation.api.router;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BaseRootNavigationRouter.AnimationType.values().length];
        try {
            iArr[BaseRootNavigationRouter.AnimationType.STAR_WARS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BaseRootNavigationRouter.AnimationType.SLIDE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BaseRootNavigationRouter.AnimationType.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
