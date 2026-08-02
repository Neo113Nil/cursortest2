package com.yandex.go.chargers.feedback.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/chargers/feedback/domain/model/ChargersFeedbackBannerAnalyticsAlias;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SUBSCRIPTION", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersFeedbackBannerAnalyticsAlias {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChargersFeedbackBannerAnalyticsAlias[] $VALUES;
    public static final ChargersFeedbackBannerAnalyticsAlias SUBSCRIPTION;
    private final String analyticsName = "subscription";

    static {
        ChargersFeedbackBannerAnalyticsAlias chargersFeedbackBannerAnalyticsAlias = new ChargersFeedbackBannerAnalyticsAlias();
        SUBSCRIPTION = chargersFeedbackBannerAnalyticsAlias;
        ChargersFeedbackBannerAnalyticsAlias[] chargersFeedbackBannerAnalyticsAliasArr = {chargersFeedbackBannerAnalyticsAlias};
        $VALUES = chargersFeedbackBannerAnalyticsAliasArr;
        $ENTRIES = a.a(chargersFeedbackBannerAnalyticsAliasArr);
    }

    public static ChargersFeedbackBannerAnalyticsAlias valueOf(String str) {
        return (ChargersFeedbackBannerAnalyticsAlias) Enum.valueOf(ChargersFeedbackBannerAnalyticsAlias.class, str);
    }

    public static ChargersFeedbackBannerAnalyticsAlias[] values() {
        return (ChargersFeedbackBannerAnalyticsAlias[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
