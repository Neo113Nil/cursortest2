package com.yandex.go.address.address_map_picker.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/go/address/address_map_picker/analytics/ClarifyAnalytics$ClarifySourceScreen", "", "Lcom/yandex/go/address/address_map_picker/analytics/ClarifyAnalytics$ClarifySourceScreen;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Superapp", "SuperappSearch", "TaxiMain", "Summary", "Order", "Intercity", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ClarifyAnalytics$ClarifySourceScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ClarifyAnalytics$ClarifySourceScreen[] $VALUES;
    public static final ClarifyAnalytics$ClarifySourceScreen Intercity;
    public static final ClarifyAnalytics$ClarifySourceScreen Order;
    public static final ClarifyAnalytics$ClarifySourceScreen Summary;
    public static final ClarifyAnalytics$ClarifySourceScreen Superapp;
    public static final ClarifyAnalytics$ClarifySourceScreen SuperappSearch;
    public static final ClarifyAnalytics$ClarifySourceScreen TaxiMain;
    private final String eventValue;

    static {
        ClarifyAnalytics$ClarifySourceScreen clarifyAnalytics$ClarifySourceScreen = new ClarifyAnalytics$ClarifySourceScreen("Superapp", 0, "superapp");
        Superapp = clarifyAnalytics$ClarifySourceScreen;
        ClarifyAnalytics$ClarifySourceScreen clarifyAnalytics$ClarifySourceScreen2 = new ClarifyAnalytics$ClarifySourceScreen("SuperappSearch", 1, "superapp_search");
        SuperappSearch = clarifyAnalytics$ClarifySourceScreen2;
        ClarifyAnalytics$ClarifySourceScreen clarifyAnalytics$ClarifySourceScreen3 = new ClarifyAnalytics$ClarifySourceScreen("TaxiMain", 2, "taxi_main");
        TaxiMain = clarifyAnalytics$ClarifySourceScreen3;
        ClarifyAnalytics$ClarifySourceScreen clarifyAnalytics$ClarifySourceScreen4 = new ClarifyAnalytics$ClarifySourceScreen("Summary", 3, "summary");
        Summary = clarifyAnalytics$ClarifySourceScreen4;
        ClarifyAnalytics$ClarifySourceScreen clarifyAnalytics$ClarifySourceScreen5 = new ClarifyAnalytics$ClarifySourceScreen("Order", 4, "order");
        Order = clarifyAnalytics$ClarifySourceScreen5;
        ClarifyAnalytics$ClarifySourceScreen clarifyAnalytics$ClarifySourceScreen6 = new ClarifyAnalytics$ClarifySourceScreen("Intercity", 5, "intercity");
        Intercity = clarifyAnalytics$ClarifySourceScreen6;
        ClarifyAnalytics$ClarifySourceScreen[] clarifyAnalytics$ClarifySourceScreenArr = {clarifyAnalytics$ClarifySourceScreen, clarifyAnalytics$ClarifySourceScreen2, clarifyAnalytics$ClarifySourceScreen3, clarifyAnalytics$ClarifySourceScreen4, clarifyAnalytics$ClarifySourceScreen5, clarifyAnalytics$ClarifySourceScreen6};
        $VALUES = clarifyAnalytics$ClarifySourceScreenArr;
        $ENTRIES = a.a(clarifyAnalytics$ClarifySourceScreenArr);
    }

    public ClarifyAnalytics$ClarifySourceScreen(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ClarifyAnalytics$ClarifySourceScreen valueOf(String str) {
        return (ClarifyAnalytics$ClarifySourceScreen) Enum.valueOf(ClarifyAnalytics$ClarifySourceScreen.class, str);
    }

    public static ClarifyAnalytics$ClarifySourceScreen[] values() {
        return (ClarifyAnalytics$ClarifySourceScreen[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
