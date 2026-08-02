package com.yandex.go.superapp_carts.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/go/superapp_carts/analytics/SuperappCartsAnalytics$CartEntryPointSource", "", "Lcom/yandex/go/superapp_carts/analytics/SuperappCartsAnalytics$CartEntryPointSource;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Search", "go-client-android.features.superapp_carts:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperappCartsAnalytics$CartEntryPointSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperappCartsAnalytics$CartEntryPointSource[] $VALUES;
    public static final SuperappCartsAnalytics$CartEntryPointSource Search;
    private final String eventValue = "search";

    static {
        SuperappCartsAnalytics$CartEntryPointSource superappCartsAnalytics$CartEntryPointSource = new SuperappCartsAnalytics$CartEntryPointSource();
        Search = superappCartsAnalytics$CartEntryPointSource;
        SuperappCartsAnalytics$CartEntryPointSource[] superappCartsAnalytics$CartEntryPointSourceArr = {superappCartsAnalytics$CartEntryPointSource};
        $VALUES = superappCartsAnalytics$CartEntryPointSourceArr;
        $ENTRIES = a.a(superappCartsAnalytics$CartEntryPointSourceArr);
    }

    public static SuperappCartsAnalytics$CartEntryPointSource valueOf(String str) {
        return (SuperappCartsAnalytics$CartEntryPointSource) Enum.valueOf(SuperappCartsAnalytics$CartEntryPointSource.class, str);
    }

    public static SuperappCartsAnalytics$CartEntryPointSource[] values() {
        return (SuperappCartsAnalytics$CartEntryPointSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
