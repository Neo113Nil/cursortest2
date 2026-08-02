package com.yandex.go.places.api.navigation;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/places/api/navigation/OrganizationCardSliderPinDisplayStrategy;", "", "ALL_PINS", "SELECTED_PIN_ONLY", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrganizationCardSliderPinDisplayStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OrganizationCardSliderPinDisplayStrategy[] $VALUES;
    public static final OrganizationCardSliderPinDisplayStrategy ALL_PINS;
    public static final OrganizationCardSliderPinDisplayStrategy SELECTED_PIN_ONLY;

    static {
        OrganizationCardSliderPinDisplayStrategy organizationCardSliderPinDisplayStrategy = new OrganizationCardSliderPinDisplayStrategy("ALL_PINS", 0);
        ALL_PINS = organizationCardSliderPinDisplayStrategy;
        OrganizationCardSliderPinDisplayStrategy organizationCardSliderPinDisplayStrategy2 = new OrganizationCardSliderPinDisplayStrategy("SELECTED_PIN_ONLY", 1);
        SELECTED_PIN_ONLY = organizationCardSliderPinDisplayStrategy2;
        OrganizationCardSliderPinDisplayStrategy[] organizationCardSliderPinDisplayStrategyArr = {organizationCardSliderPinDisplayStrategy, organizationCardSliderPinDisplayStrategy2};
        $VALUES = organizationCardSliderPinDisplayStrategyArr;
        $ENTRIES = a.a(organizationCardSliderPinDisplayStrategyArr);
    }

    public static OrganizationCardSliderPinDisplayStrategy valueOf(String str) {
        return (OrganizationCardSliderPinDisplayStrategy) Enum.valueOf(OrganizationCardSliderPinDisplayStrategy.class, str);
    }

    public static OrganizationCardSliderPinDisplayStrategy[] values() {
        return (OrganizationCardSliderPinDisplayStrategy[]) $VALUES.clone();
    }
}
