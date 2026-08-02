package com.yandex.go.pickuppoints.impl;

import com.yandex.go.pickuppoints.api.AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType;
import com.yandex.go.pickuppoints.impl.ClarifyPointsScreenStrategyConfigurationExperiment;
import defpackage.drb0;
import defpackage.w511;
import defpackage.y61;

/* loaded from: classes13.dex */
public final class l implements drb0, y61 {
    public volatile ClarifyPointsScreenStrategyConfigurationExperiment.PointConfigurationDto a;
    public volatile ClarifyPointsScreenStrategyConfigurationExperiment.PointConfigurationDto b;
    public volatile ClarifyPointsScreenStrategyConfigurationExperiment.SummaryConfigurationDto c;

    public static AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType a(ClarifyPointsScreenStrategyConfigurationExperiment.PrimarySuggestType primarySuggestType) {
        int i = k.a[primarySuggestType.ordinal()];
        if (i == 1) {
            return AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType.TEXT_SUGGEST;
        }
        if (i == 2) {
            return AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType.SELECT_ON_MAP;
        }
        if (i == 3) {
            return AddressSelectorOnMapFromSummaryRepository$AddressSelectionConfig$SelectionType.COPTER_CITY_TOUR_SELECTOR;
        }
        w511.b();
        return null;
    }
}
