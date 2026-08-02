package com.yandex.go.mainscreen.superapp.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/mainscreen/superapp/analytics/SuperappMainAnalytics$HeaderShownReason", "", "Lcom/yandex/go/mainscreen/superapp/analytics/SuperappMainAnalytics$HeaderShownReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Launch", "ScrollUp", "ReturnBack", "go-client-android.features.superapp.mainscreen:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SuperappMainAnalytics$HeaderShownReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperappMainAnalytics$HeaderShownReason[] $VALUES;
    public static final SuperappMainAnalytics$HeaderShownReason Launch;
    public static final SuperappMainAnalytics$HeaderShownReason ReturnBack;
    public static final SuperappMainAnalytics$HeaderShownReason ScrollUp;
    private final String eventValue;

    static {
        SuperappMainAnalytics$HeaderShownReason superappMainAnalytics$HeaderShownReason = new SuperappMainAnalytics$HeaderShownReason("Launch", 0, "launch");
        Launch = superappMainAnalytics$HeaderShownReason;
        SuperappMainAnalytics$HeaderShownReason superappMainAnalytics$HeaderShownReason2 = new SuperappMainAnalytics$HeaderShownReason("ScrollUp", 1, "scroll_up");
        ScrollUp = superappMainAnalytics$HeaderShownReason2;
        SuperappMainAnalytics$HeaderShownReason superappMainAnalytics$HeaderShownReason3 = new SuperappMainAnalytics$HeaderShownReason("ReturnBack", 2, "return_back");
        ReturnBack = superappMainAnalytics$HeaderShownReason3;
        SuperappMainAnalytics$HeaderShownReason[] superappMainAnalytics$HeaderShownReasonArr = {superappMainAnalytics$HeaderShownReason, superappMainAnalytics$HeaderShownReason2, superappMainAnalytics$HeaderShownReason3};
        $VALUES = superappMainAnalytics$HeaderShownReasonArr;
        $ENTRIES = a.a(superappMainAnalytics$HeaderShownReasonArr);
    }

    public SuperappMainAnalytics$HeaderShownReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SuperappMainAnalytics$HeaderShownReason valueOf(String str) {
        return (SuperappMainAnalytics$HeaderShownReason) Enum.valueOf(SuperappMainAnalytics$HeaderShownReason.class, str);
    }

    public static SuperappMainAnalytics$HeaderShownReason[] values() {
        return (SuperappMainAnalytics$HeaderShownReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
