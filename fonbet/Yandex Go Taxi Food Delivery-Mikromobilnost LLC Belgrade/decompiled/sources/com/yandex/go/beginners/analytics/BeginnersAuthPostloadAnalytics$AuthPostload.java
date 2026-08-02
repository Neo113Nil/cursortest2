package com.yandex.go.beginners.analytics;

import defpackage.cho;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/beginners/analytics/BeginnersAuthPostloadAnalytics$AuthPostload", "Lcho;", "", "Lcom/yandex/go/beginners/analytics/BeginnersAuthPostloadAnalytics$AuthPostload;", "Total", "Launch", "Products", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
final class BeginnersAuthPostloadAnalytics$AuthPostload implements cho {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BeginnersAuthPostloadAnalytics$AuthPostload[] $VALUES;
    public static final BeginnersAuthPostloadAnalytics$AuthPostload Launch;
    public static final BeginnersAuthPostloadAnalytics$AuthPostload Products;
    public static final BeginnersAuthPostloadAnalytics$AuthPostload Total;

    static {
        BeginnersAuthPostloadAnalytics$AuthPostload beginnersAuthPostloadAnalytics$AuthPostload = new BeginnersAuthPostloadAnalytics$AuthPostload("Total", 0);
        Total = beginnersAuthPostloadAnalytics$AuthPostload;
        BeginnersAuthPostloadAnalytics$AuthPostload beginnersAuthPostloadAnalytics$AuthPostload2 = new BeginnersAuthPostloadAnalytics$AuthPostload("Launch", 1);
        Launch = beginnersAuthPostloadAnalytics$AuthPostload2;
        BeginnersAuthPostloadAnalytics$AuthPostload beginnersAuthPostloadAnalytics$AuthPostload3 = new BeginnersAuthPostloadAnalytics$AuthPostload("Products", 2);
        Products = beginnersAuthPostloadAnalytics$AuthPostload3;
        BeginnersAuthPostloadAnalytics$AuthPostload[] beginnersAuthPostloadAnalytics$AuthPostloadArr = {beginnersAuthPostloadAnalytics$AuthPostload, beginnersAuthPostloadAnalytics$AuthPostload2, beginnersAuthPostloadAnalytics$AuthPostload3};
        $VALUES = beginnersAuthPostloadAnalytics$AuthPostloadArr;
        $ENTRIES = kotlin.enums.a.a(beginnersAuthPostloadAnalytics$AuthPostloadArr);
    }

    public static BeginnersAuthPostloadAnalytics$AuthPostload valueOf(String str) {
        return (BeginnersAuthPostloadAnalytics$AuthPostload) Enum.valueOf(BeginnersAuthPostloadAnalytics$AuthPostload.class, str);
    }

    public static BeginnersAuthPostloadAnalytics$AuthPostload[] values() {
        return (BeginnersAuthPostloadAnalytics$AuthPostload[]) $VALUES.clone();
    }
}
