package com.yandex.go.superapp.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/superapp/api/analytics/SuperappAnalytics$OpenType", "", "Lcom/yandex/go/superapp/api/analytics/SuperappAnalytics$OpenType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Initial", "Cache", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperappAnalytics$OpenType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperappAnalytics$OpenType[] $VALUES;
    public static final SuperappAnalytics$OpenType Cache;
    public static final SuperappAnalytics$OpenType Initial;
    private final String eventValue;

    static {
        SuperappAnalytics$OpenType superappAnalytics$OpenType = new SuperappAnalytics$OpenType("Initial", 0, "initial");
        Initial = superappAnalytics$OpenType;
        SuperappAnalytics$OpenType superappAnalytics$OpenType2 = new SuperappAnalytics$OpenType("Cache", 1, "cache");
        Cache = superappAnalytics$OpenType2;
        SuperappAnalytics$OpenType[] superappAnalytics$OpenTypeArr = {superappAnalytics$OpenType, superappAnalytics$OpenType2};
        $VALUES = superappAnalytics$OpenTypeArr;
        $ENTRIES = a.a(superappAnalytics$OpenTypeArr);
    }

    public SuperappAnalytics$OpenType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SuperappAnalytics$OpenType valueOf(String str) {
        return (SuperappAnalytics$OpenType) Enum.valueOf(SuperappAnalytics$OpenType.class, str);
    }

    public static SuperappAnalytics$OpenType[] values() {
        return (SuperappAnalytics$OpenType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
