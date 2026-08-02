package com.yandex.go.multimodal_route.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/multimodal_route/analytics/MultimodalRouteAnalytics$MultimodalRouteScreenStatus", "", "Lcom/yandex/go/multimodal_route/analytics/MultimodalRouteAnalytics$MultimodalRouteScreenStatus;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Details", "InTransport", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MultimodalRouteAnalytics$MultimodalRouteScreenStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MultimodalRouteAnalytics$MultimodalRouteScreenStatus[] $VALUES;
    public static final MultimodalRouteAnalytics$MultimodalRouteScreenStatus Details;
    public static final MultimodalRouteAnalytics$MultimodalRouteScreenStatus InTransport;
    private final String eventValue;

    static {
        MultimodalRouteAnalytics$MultimodalRouteScreenStatus multimodalRouteAnalytics$MultimodalRouteScreenStatus = new MultimodalRouteAnalytics$MultimodalRouteScreenStatus("Details", 0, "details");
        Details = multimodalRouteAnalytics$MultimodalRouteScreenStatus;
        MultimodalRouteAnalytics$MultimodalRouteScreenStatus multimodalRouteAnalytics$MultimodalRouteScreenStatus2 = new MultimodalRouteAnalytics$MultimodalRouteScreenStatus("InTransport", 1, "in_transport");
        InTransport = multimodalRouteAnalytics$MultimodalRouteScreenStatus2;
        MultimodalRouteAnalytics$MultimodalRouteScreenStatus[] multimodalRouteAnalytics$MultimodalRouteScreenStatusArr = {multimodalRouteAnalytics$MultimodalRouteScreenStatus, multimodalRouteAnalytics$MultimodalRouteScreenStatus2};
        $VALUES = multimodalRouteAnalytics$MultimodalRouteScreenStatusArr;
        $ENTRIES = a.a(multimodalRouteAnalytics$MultimodalRouteScreenStatusArr);
    }

    public MultimodalRouteAnalytics$MultimodalRouteScreenStatus(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MultimodalRouteAnalytics$MultimodalRouteScreenStatus valueOf(String str) {
        return (MultimodalRouteAnalytics$MultimodalRouteScreenStatus) Enum.valueOf(MultimodalRouteAnalytics$MultimodalRouteScreenStatus.class, str);
    }

    public static MultimodalRouteAnalytics$MultimodalRouteScreenStatus[] values() {
        return (MultimodalRouteAnalytics$MultimodalRouteScreenStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
