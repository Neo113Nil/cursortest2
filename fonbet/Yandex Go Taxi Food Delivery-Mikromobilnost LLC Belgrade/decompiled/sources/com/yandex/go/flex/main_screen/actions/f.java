package com.yandex.go.flex.main_screen.actions;

import com.yandex.go.flex.main_screen.actions.SdcRouteSelectionAction;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SdcRouteSelectionAction.ScreenType.values().length];
        try {
            iArr[SdcRouteSelectionAction.ScreenType.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SdcRouteSelectionAction.ScreenType.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
