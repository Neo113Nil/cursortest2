package com.yandex.go.routeselector.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/routeselector/analytics/EditPointAnalytics$Screen", "", "Lcom/yandex/go/routeselector/analytics/EditPointAnalytics$Screen;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Main", "Summary", "IntercityCheckout", "Order", "go-client-android.features.routeselector:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EditPointAnalytics$Screen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ EditPointAnalytics$Screen[] $VALUES;
    public static final EditPointAnalytics$Screen IntercityCheckout;
    public static final EditPointAnalytics$Screen Main;
    public static final EditPointAnalytics$Screen Order;
    public static final EditPointAnalytics$Screen Summary;
    private final String eventValue;

    static {
        EditPointAnalytics$Screen editPointAnalytics$Screen = new EditPointAnalytics$Screen("Main", 0, "main");
        Main = editPointAnalytics$Screen;
        EditPointAnalytics$Screen editPointAnalytics$Screen2 = new EditPointAnalytics$Screen("Summary", 1, "summary");
        Summary = editPointAnalytics$Screen2;
        EditPointAnalytics$Screen editPointAnalytics$Screen3 = new EditPointAnalytics$Screen("IntercityCheckout", 2, "intercity_checkout");
        IntercityCheckout = editPointAnalytics$Screen3;
        EditPointAnalytics$Screen editPointAnalytics$Screen4 = new EditPointAnalytics$Screen("Order", 3, "order");
        Order = editPointAnalytics$Screen4;
        EditPointAnalytics$Screen[] editPointAnalytics$ScreenArr = {editPointAnalytics$Screen, editPointAnalytics$Screen2, editPointAnalytics$Screen3, editPointAnalytics$Screen4};
        $VALUES = editPointAnalytics$ScreenArr;
        $ENTRIES = a.a(editPointAnalytics$ScreenArr);
    }

    public EditPointAnalytics$Screen(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static EditPointAnalytics$Screen valueOf(String str) {
        return (EditPointAnalytics$Screen) Enum.valueOf(EditPointAnalytics$Screen.class, str);
    }

    public static EditPointAnalytics$Screen[] values() {
        return (EditPointAnalytics$Screen[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
