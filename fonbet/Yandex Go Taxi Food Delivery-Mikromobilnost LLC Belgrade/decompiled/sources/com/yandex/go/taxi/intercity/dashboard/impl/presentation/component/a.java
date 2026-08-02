package com.yandex.go.taxi.intercity.dashboard.impl.presentation.component;

import com.yandex.go.taxi.intercity.dashboard.impl.presentation.component.IntercityDashboardTariffSelectorContainerView;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[IntercityDashboardTariffSelectorContainerView.ViewMode.values().length];
        try {
            iArr[IntercityDashboardTariffSelectorContainerView.ViewMode.SINGLE_TARIFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[IntercityDashboardTariffSelectorContainerView.ViewMode.TWO_TARIFFS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[IntercityDashboardTariffSelectorContainerView.ViewMode.MULTIPLE_TARIFFS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
