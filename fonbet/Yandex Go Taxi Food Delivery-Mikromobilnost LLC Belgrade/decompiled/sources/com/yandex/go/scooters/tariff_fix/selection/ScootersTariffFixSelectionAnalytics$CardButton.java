package com.yandex.go.scooters.tariff_fix.selection;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/scooters/tariff_fix/selection/ScootersTariffFixSelectionAnalytics$CardButton", "", "Lcom/yandex/go/scooters/tariff_fix/selection/ScootersTariffFixSelectionAnalytics$CardButton;", "", "buttonName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "ABOUT_FIX", "ADDRESS_SEARCH", "BOOK", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersTariffFixSelectionAnalytics$CardButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersTariffFixSelectionAnalytics$CardButton[] $VALUES;
    public static final ScootersTariffFixSelectionAnalytics$CardButton ABOUT_FIX;
    public static final ScootersTariffFixSelectionAnalytics$CardButton ADDRESS_SEARCH;
    public static final ScootersTariffFixSelectionAnalytics$CardButton BOOK;
    private final String buttonName;

    static {
        ScootersTariffFixSelectionAnalytics$CardButton scootersTariffFixSelectionAnalytics$CardButton = new ScootersTariffFixSelectionAnalytics$CardButton("ABOUT_FIX", 0, "about_fix");
        ABOUT_FIX = scootersTariffFixSelectionAnalytics$CardButton;
        ScootersTariffFixSelectionAnalytics$CardButton scootersTariffFixSelectionAnalytics$CardButton2 = new ScootersTariffFixSelectionAnalytics$CardButton("ADDRESS_SEARCH", 1, "address_search");
        ADDRESS_SEARCH = scootersTariffFixSelectionAnalytics$CardButton2;
        ScootersTariffFixSelectionAnalytics$CardButton scootersTariffFixSelectionAnalytics$CardButton3 = new ScootersTariffFixSelectionAnalytics$CardButton("BOOK", 2, "book");
        BOOK = scootersTariffFixSelectionAnalytics$CardButton3;
        ScootersTariffFixSelectionAnalytics$CardButton[] scootersTariffFixSelectionAnalytics$CardButtonArr = {scootersTariffFixSelectionAnalytics$CardButton, scootersTariffFixSelectionAnalytics$CardButton2, scootersTariffFixSelectionAnalytics$CardButton3};
        $VALUES = scootersTariffFixSelectionAnalytics$CardButtonArr;
        $ENTRIES = kotlin.enums.a.a(scootersTariffFixSelectionAnalytics$CardButtonArr);
    }

    public ScootersTariffFixSelectionAnalytics$CardButton(String str, int i, String str2) {
        this.buttonName = str2;
    }

    public static ScootersTariffFixSelectionAnalytics$CardButton valueOf(String str) {
        return (ScootersTariffFixSelectionAnalytics$CardButton) Enum.valueOf(ScootersTariffFixSelectionAnalytics$CardButton.class, str);
    }

    public static ScootersTariffFixSelectionAnalytics$CardButton[] values() {
        return (ScootersTariffFixSelectionAnalytics$CardButton[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getButtonName() {
        return this.buttonName;
    }
}
