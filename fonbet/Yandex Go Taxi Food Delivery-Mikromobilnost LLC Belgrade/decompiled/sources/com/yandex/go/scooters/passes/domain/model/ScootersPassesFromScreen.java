package com.yandex.go.scooters.passes.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/scooters/passes/domain/model/ScootersPassesFromScreen;", "", "DISCOVERY", "OFFER_CARD", "CHARGERS", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersPassesFromScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersPassesFromScreen[] $VALUES;
    public static final ScootersPassesFromScreen CHARGERS;
    public static final ScootersPassesFromScreen DISCOVERY;
    public static final ScootersPassesFromScreen OFFER_CARD;

    static {
        ScootersPassesFromScreen scootersPassesFromScreen = new ScootersPassesFromScreen("DISCOVERY", 0);
        DISCOVERY = scootersPassesFromScreen;
        ScootersPassesFromScreen scootersPassesFromScreen2 = new ScootersPassesFromScreen("OFFER_CARD", 1);
        OFFER_CARD = scootersPassesFromScreen2;
        ScootersPassesFromScreen scootersPassesFromScreen3 = new ScootersPassesFromScreen("CHARGERS", 2);
        CHARGERS = scootersPassesFromScreen3;
        ScootersPassesFromScreen[] scootersPassesFromScreenArr = {scootersPassesFromScreen, scootersPassesFromScreen2, scootersPassesFromScreen3};
        $VALUES = scootersPassesFromScreenArr;
        $ENTRIES = a.a(scootersPassesFromScreenArr);
    }

    public static ScootersPassesFromScreen valueOf(String str) {
        return (ScootersPassesFromScreen) Enum.valueOf(ScootersPassesFromScreen.class, str);
    }

    public static ScootersPassesFromScreen[] values() {
        return (ScootersPassesFromScreen[]) $VALUES.clone();
    }
}
