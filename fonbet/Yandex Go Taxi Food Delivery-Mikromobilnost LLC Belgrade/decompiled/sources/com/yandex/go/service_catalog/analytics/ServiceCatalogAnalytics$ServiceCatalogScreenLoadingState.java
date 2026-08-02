package com.yandex.go.service_catalog.analytics;

import com.yandex.payment.common.result.ResultType;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/service_catalog/analytics/ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState", "", "Lcom/yandex/go/service_catalog/analytics/ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Loading", "Loaded", "Failed", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState[] $VALUES;
    public static final ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState Failed;
    public static final ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState Loaded;
    public static final ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState Loading;
    private final String eventValue;

    static {
        ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState serviceCatalogAnalytics$ServiceCatalogScreenLoadingState = new ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState("Loading", 0, ResultType.RESULT_TYPE_LOADING);
        Loading = serviceCatalogAnalytics$ServiceCatalogScreenLoadingState;
        ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState serviceCatalogAnalytics$ServiceCatalogScreenLoadingState2 = new ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState("Loaded", 1, "loaded");
        Loaded = serviceCatalogAnalytics$ServiceCatalogScreenLoadingState2;
        ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState serviceCatalogAnalytics$ServiceCatalogScreenLoadingState3 = new ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState("Failed", 2, "failed");
        Failed = serviceCatalogAnalytics$ServiceCatalogScreenLoadingState3;
        ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState[] serviceCatalogAnalytics$ServiceCatalogScreenLoadingStateArr = {serviceCatalogAnalytics$ServiceCatalogScreenLoadingState, serviceCatalogAnalytics$ServiceCatalogScreenLoadingState2, serviceCatalogAnalytics$ServiceCatalogScreenLoadingState3};
        $VALUES = serviceCatalogAnalytics$ServiceCatalogScreenLoadingStateArr;
        $ENTRIES = a.a(serviceCatalogAnalytics$ServiceCatalogScreenLoadingStateArr);
    }

    public ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState valueOf(String str) {
        return (ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState) Enum.valueOf(ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState.class, str);
    }

    public static ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState[] values() {
        return (ServiceCatalogAnalytics$ServiceCatalogScreenLoadingState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
