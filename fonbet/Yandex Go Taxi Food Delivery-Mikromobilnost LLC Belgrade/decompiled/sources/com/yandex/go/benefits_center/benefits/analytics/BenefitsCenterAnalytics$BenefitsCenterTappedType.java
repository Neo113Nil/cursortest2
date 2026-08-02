package com.yandex.go.benefits_center.benefits.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/go/benefits_center/benefits/analytics/BenefitsCenterAnalytics$BenefitsCenterTappedType", "", "Lcom/yandex/go/benefits_center/benefits/analytics/BenefitsCenterAnalytics$BenefitsCenterTappedType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "Reload", "Filter", "AddPromo", "Promo", "SelectBenefits", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BenefitsCenterAnalytics$BenefitsCenterTappedType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BenefitsCenterAnalytics$BenefitsCenterTappedType[] $VALUES;
    public static final BenefitsCenterAnalytics$BenefitsCenterTappedType AddPromo;
    public static final BenefitsCenterAnalytics$BenefitsCenterTappedType Back;
    public static final BenefitsCenterAnalytics$BenefitsCenterTappedType Filter;
    public static final BenefitsCenterAnalytics$BenefitsCenterTappedType Promo;
    public static final BenefitsCenterAnalytics$BenefitsCenterTappedType Reload;
    public static final BenefitsCenterAnalytics$BenefitsCenterTappedType SelectBenefits;
    private final String eventValue;

    static {
        BenefitsCenterAnalytics$BenefitsCenterTappedType benefitsCenterAnalytics$BenefitsCenterTappedType = new BenefitsCenterAnalytics$BenefitsCenterTappedType("Back", 0, "back");
        Back = benefitsCenterAnalytics$BenefitsCenterTappedType;
        BenefitsCenterAnalytics$BenefitsCenterTappedType benefitsCenterAnalytics$BenefitsCenterTappedType2 = new BenefitsCenterAnalytics$BenefitsCenterTappedType("Reload", 1, "reload");
        Reload = benefitsCenterAnalytics$BenefitsCenterTappedType2;
        BenefitsCenterAnalytics$BenefitsCenterTappedType benefitsCenterAnalytics$BenefitsCenterTappedType3 = new BenefitsCenterAnalytics$BenefitsCenterTappedType("Filter", 2, "filter");
        Filter = benefitsCenterAnalytics$BenefitsCenterTappedType3;
        BenefitsCenterAnalytics$BenefitsCenterTappedType benefitsCenterAnalytics$BenefitsCenterTappedType4 = new BenefitsCenterAnalytics$BenefitsCenterTappedType("AddPromo", 3, "add_promo");
        AddPromo = benefitsCenterAnalytics$BenefitsCenterTappedType4;
        BenefitsCenterAnalytics$BenefitsCenterTappedType benefitsCenterAnalytics$BenefitsCenterTappedType5 = new BenefitsCenterAnalytics$BenefitsCenterTappedType("Promo", 4, "promo");
        Promo = benefitsCenterAnalytics$BenefitsCenterTappedType5;
        BenefitsCenterAnalytics$BenefitsCenterTappedType benefitsCenterAnalytics$BenefitsCenterTappedType6 = new BenefitsCenterAnalytics$BenefitsCenterTappedType("SelectBenefits", 5, "select_benefits");
        SelectBenefits = benefitsCenterAnalytics$BenefitsCenterTappedType6;
        BenefitsCenterAnalytics$BenefitsCenterTappedType[] benefitsCenterAnalytics$BenefitsCenterTappedTypeArr = {benefitsCenterAnalytics$BenefitsCenterTappedType, benefitsCenterAnalytics$BenefitsCenterTappedType2, benefitsCenterAnalytics$BenefitsCenterTappedType3, benefitsCenterAnalytics$BenefitsCenterTappedType4, benefitsCenterAnalytics$BenefitsCenterTappedType5, benefitsCenterAnalytics$BenefitsCenterTappedType6};
        $VALUES = benefitsCenterAnalytics$BenefitsCenterTappedTypeArr;
        $ENTRIES = a.a(benefitsCenterAnalytics$BenefitsCenterTappedTypeArr);
    }

    public BenefitsCenterAnalytics$BenefitsCenterTappedType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static BenefitsCenterAnalytics$BenefitsCenterTappedType valueOf(String str) {
        return (BenefitsCenterAnalytics$BenefitsCenterTappedType) Enum.valueOf(BenefitsCenterAnalytics$BenefitsCenterTappedType.class, str);
    }

    public static BenefitsCenterAnalytics$BenefitsCenterTappedType[] values() {
        return (BenefitsCenterAnalytics$BenefitsCenterTappedType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
