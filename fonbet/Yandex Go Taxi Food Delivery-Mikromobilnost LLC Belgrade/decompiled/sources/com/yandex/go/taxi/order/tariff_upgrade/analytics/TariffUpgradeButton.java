package com.yandex.go.taxi.order.tariff_upgrade.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/taxi/order/tariff_upgrade/analytics/TariffUpgradeButton;", "", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "DONE", "DETAILS", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TariffUpgradeButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TariffUpgradeButton[] $VALUES;
    public static final TariffUpgradeButton DETAILS;
    public static final TariffUpgradeButton DONE;
    private final String analyticsName;

    static {
        TariffUpgradeButton tariffUpgradeButton = new TariffUpgradeButton("DONE", 0, "done");
        DONE = tariffUpgradeButton;
        TariffUpgradeButton tariffUpgradeButton2 = new TariffUpgradeButton("DETAILS", 1, "details");
        DETAILS = tariffUpgradeButton2;
        TariffUpgradeButton[] tariffUpgradeButtonArr = {tariffUpgradeButton, tariffUpgradeButton2};
        $VALUES = tariffUpgradeButtonArr;
        $ENTRIES = a.a(tariffUpgradeButtonArr);
    }

    public TariffUpgradeButton(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static TariffUpgradeButton valueOf(String str) {
        return (TariffUpgradeButton) Enum.valueOf(TariffUpgradeButton.class, str);
    }

    public static TariffUpgradeButton[] values() {
        return (TariffUpgradeButton[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
