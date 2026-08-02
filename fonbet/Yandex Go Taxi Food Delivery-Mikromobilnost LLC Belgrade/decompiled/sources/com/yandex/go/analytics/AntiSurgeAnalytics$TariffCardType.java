package com.yandex.go.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/go/analytics/AntiSurgeAnalytics$TariffCardType", "", "Lcom/yandex/go/analytics/AntiSurgeAnalytics$TariffCardType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ExplicitAntisurge", "selector"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AntiSurgeAnalytics$TariffCardType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AntiSurgeAnalytics$TariffCardType[] $VALUES;
    public static final AntiSurgeAnalytics$TariffCardType ExplicitAntisurge;
    private final String eventValue = "explicit_antisurge";

    static {
        AntiSurgeAnalytics$TariffCardType antiSurgeAnalytics$TariffCardType = new AntiSurgeAnalytics$TariffCardType();
        ExplicitAntisurge = antiSurgeAnalytics$TariffCardType;
        AntiSurgeAnalytics$TariffCardType[] antiSurgeAnalytics$TariffCardTypeArr = {antiSurgeAnalytics$TariffCardType};
        $VALUES = antiSurgeAnalytics$TariffCardTypeArr;
        $ENTRIES = kotlin.enums.a.a(antiSurgeAnalytics$TariffCardTypeArr);
    }

    public static AntiSurgeAnalytics$TariffCardType valueOf(String str) {
        return (AntiSurgeAnalytics$TariffCardType) Enum.valueOf(AntiSurgeAnalytics$TariffCardType.class, str);
    }

    public static AntiSurgeAnalytics$TariffCardType[] values() {
        return (AntiSurgeAnalytics$TariffCardType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
