package com.yandex.go.mainscreen.superapp.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/mainscreen/superapp/analytics/SuperappMainAnalytics$LocationUpdateType", "", "Lcom/yandex/go/mainscreen/superapp/analytics/SuperappMainAnalytics$LocationUpdateType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Immediate", "FirstUpdate", "FirstFresh", "FirstUpdateAfterFilter", "go-client-android.features.superapp.mainscreen:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SuperappMainAnalytics$LocationUpdateType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperappMainAnalytics$LocationUpdateType[] $VALUES;
    public static final SuperappMainAnalytics$LocationUpdateType FirstFresh;
    public static final SuperappMainAnalytics$LocationUpdateType FirstUpdate;
    public static final SuperappMainAnalytics$LocationUpdateType FirstUpdateAfterFilter;
    public static final SuperappMainAnalytics$LocationUpdateType Immediate;
    private final String eventValue;

    static {
        SuperappMainAnalytics$LocationUpdateType superappMainAnalytics$LocationUpdateType = new SuperappMainAnalytics$LocationUpdateType("Immediate", 0, "immediate");
        Immediate = superappMainAnalytics$LocationUpdateType;
        SuperappMainAnalytics$LocationUpdateType superappMainAnalytics$LocationUpdateType2 = new SuperappMainAnalytics$LocationUpdateType("FirstUpdate", 1, "first_update");
        FirstUpdate = superappMainAnalytics$LocationUpdateType2;
        SuperappMainAnalytics$LocationUpdateType superappMainAnalytics$LocationUpdateType3 = new SuperappMainAnalytics$LocationUpdateType("FirstFresh", 2, "first_fresh");
        FirstFresh = superappMainAnalytics$LocationUpdateType3;
        SuperappMainAnalytics$LocationUpdateType superappMainAnalytics$LocationUpdateType4 = new SuperappMainAnalytics$LocationUpdateType("FirstUpdateAfterFilter", 3, "first_update_after_filter");
        FirstUpdateAfterFilter = superappMainAnalytics$LocationUpdateType4;
        SuperappMainAnalytics$LocationUpdateType[] superappMainAnalytics$LocationUpdateTypeArr = {superappMainAnalytics$LocationUpdateType, superappMainAnalytics$LocationUpdateType2, superappMainAnalytics$LocationUpdateType3, superappMainAnalytics$LocationUpdateType4};
        $VALUES = superappMainAnalytics$LocationUpdateTypeArr;
        $ENTRIES = a.a(superappMainAnalytics$LocationUpdateTypeArr);
    }

    public SuperappMainAnalytics$LocationUpdateType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SuperappMainAnalytics$LocationUpdateType valueOf(String str) {
        return (SuperappMainAnalytics$LocationUpdateType) Enum.valueOf(SuperappMainAnalytics$LocationUpdateType.class, str);
    }

    public static SuperappMainAnalytics$LocationUpdateType[] values() {
        return (SuperappMainAnalytics$LocationUpdateType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
