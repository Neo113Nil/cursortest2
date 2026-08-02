package com.yandex.go.superapp.discovery.map.impl.analytics.generated;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/superapp/discovery/map/impl/analytics/generated/SuperMapAnalytics$SuperMapSearchType", "", "Lcom/yandex/go/superapp/discovery/map/impl/analytics/generated/SuperMapAnalytics$SuperMapSearchType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Zerosuggest", "Suggest", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperMapAnalytics$SuperMapSearchType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperMapAnalytics$SuperMapSearchType[] $VALUES;
    public static final SuperMapAnalytics$SuperMapSearchType Suggest;
    public static final SuperMapAnalytics$SuperMapSearchType Zerosuggest;
    private final String eventValue;

    static {
        SuperMapAnalytics$SuperMapSearchType superMapAnalytics$SuperMapSearchType = new SuperMapAnalytics$SuperMapSearchType("Zerosuggest", 0, "zerosuggest");
        Zerosuggest = superMapAnalytics$SuperMapSearchType;
        SuperMapAnalytics$SuperMapSearchType superMapAnalytics$SuperMapSearchType2 = new SuperMapAnalytics$SuperMapSearchType("Suggest", 1, "suggest");
        Suggest = superMapAnalytics$SuperMapSearchType2;
        SuperMapAnalytics$SuperMapSearchType[] superMapAnalytics$SuperMapSearchTypeArr = {superMapAnalytics$SuperMapSearchType, superMapAnalytics$SuperMapSearchType2};
        $VALUES = superMapAnalytics$SuperMapSearchTypeArr;
        $ENTRIES = a.a(superMapAnalytics$SuperMapSearchTypeArr);
    }

    public SuperMapAnalytics$SuperMapSearchType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SuperMapAnalytics$SuperMapSearchType valueOf(String str) {
        return (SuperMapAnalytics$SuperMapSearchType) Enum.valueOf(SuperMapAnalytics$SuperMapSearchType.class, str);
    }

    public static SuperMapAnalytics$SuperMapSearchType[] values() {
        return (SuperMapAnalytics$SuperMapSearchType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
