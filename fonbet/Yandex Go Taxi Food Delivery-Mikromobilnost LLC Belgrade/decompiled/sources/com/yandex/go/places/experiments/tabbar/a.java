package com.yandex.go.places.experiments.tabbar;

import com.yandex.go.places.experiments.tabbar.DiscoveryTabbarExperiment;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DiscoveryTabbarExperiment.DiscoveryTabType.values().length];
        try {
            iArr[DiscoveryTabbarExperiment.DiscoveryTabType.NATIVE_TAB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DiscoveryTabbarExperiment.DiscoveryTabType.FLEX_TAB.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
