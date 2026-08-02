package com.yandex.go.scooters.mosru.api.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/mosru/api/domain/model/ScootersMosRuActionDialogOpenReason;", "", "MOS_RU_STATE_BAR", "DISCOVERY_SCREEN", "DISCOVERY_SHORTCUT", "OFFER_SCREEN", "FINISH_SCREEN", "go-client-android.features.scooters.mosru:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersMosRuActionDialogOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersMosRuActionDialogOpenReason[] $VALUES;
    public static final ScootersMosRuActionDialogOpenReason DISCOVERY_SCREEN;
    public static final ScootersMosRuActionDialogOpenReason DISCOVERY_SHORTCUT;
    public static final ScootersMosRuActionDialogOpenReason FINISH_SCREEN;
    public static final ScootersMosRuActionDialogOpenReason MOS_RU_STATE_BAR;
    public static final ScootersMosRuActionDialogOpenReason OFFER_SCREEN;

    static {
        ScootersMosRuActionDialogOpenReason scootersMosRuActionDialogOpenReason = new ScootersMosRuActionDialogOpenReason("MOS_RU_STATE_BAR", 0);
        MOS_RU_STATE_BAR = scootersMosRuActionDialogOpenReason;
        ScootersMosRuActionDialogOpenReason scootersMosRuActionDialogOpenReason2 = new ScootersMosRuActionDialogOpenReason("DISCOVERY_SCREEN", 1);
        DISCOVERY_SCREEN = scootersMosRuActionDialogOpenReason2;
        ScootersMosRuActionDialogOpenReason scootersMosRuActionDialogOpenReason3 = new ScootersMosRuActionDialogOpenReason("DISCOVERY_SHORTCUT", 2);
        DISCOVERY_SHORTCUT = scootersMosRuActionDialogOpenReason3;
        ScootersMosRuActionDialogOpenReason scootersMosRuActionDialogOpenReason4 = new ScootersMosRuActionDialogOpenReason("OFFER_SCREEN", 3);
        OFFER_SCREEN = scootersMosRuActionDialogOpenReason4;
        ScootersMosRuActionDialogOpenReason scootersMosRuActionDialogOpenReason5 = new ScootersMosRuActionDialogOpenReason("FINISH_SCREEN", 4);
        FINISH_SCREEN = scootersMosRuActionDialogOpenReason5;
        ScootersMosRuActionDialogOpenReason[] scootersMosRuActionDialogOpenReasonArr = {scootersMosRuActionDialogOpenReason, scootersMosRuActionDialogOpenReason2, scootersMosRuActionDialogOpenReason3, scootersMosRuActionDialogOpenReason4, scootersMosRuActionDialogOpenReason5};
        $VALUES = scootersMosRuActionDialogOpenReasonArr;
        $ENTRIES = a.a(scootersMosRuActionDialogOpenReasonArr);
    }

    public static ScootersMosRuActionDialogOpenReason valueOf(String str) {
        return (ScootersMosRuActionDialogOpenReason) Enum.valueOf(ScootersMosRuActionDialogOpenReason.class, str);
    }

    public static ScootersMosRuActionDialogOpenReason[] values() {
        return (ScootersMosRuActionDialogOpenReason[]) $VALUES.clone();
    }
}
