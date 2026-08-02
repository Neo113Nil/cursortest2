package com.yandex.go.scooters.tariff_fix.selection;

import com.adjust.sdk.Constants;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/scooters/tariff_fix/selection/ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason", "", "Lcom/yandex/go/scooters/tariff_fix/selection/ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason;", "", CRLReasonCodeExtension.REASON, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SELECT_ON_MAP", "ADDRESS_SELECTION", "DEEPLINK", "preorder"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason[] $VALUES;
    public static final ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason ADDRESS_SELECTION;
    public static final ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason DEEPLINK;
    public static final ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason SELECT_ON_MAP;
    private final String reason;

    static {
        ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason scootersTariffFixSelectionAnalytics$FixSelectionOpenReason = new ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason("SELECT_ON_MAP", 0, "select_on_map");
        SELECT_ON_MAP = scootersTariffFixSelectionAnalytics$FixSelectionOpenReason;
        ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason scootersTariffFixSelectionAnalytics$FixSelectionOpenReason2 = new ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason("ADDRESS_SELECTION", 1, "address_selection");
        ADDRESS_SELECTION = scootersTariffFixSelectionAnalytics$FixSelectionOpenReason2;
        ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason scootersTariffFixSelectionAnalytics$FixSelectionOpenReason3 = new ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason("DEEPLINK", 2, Constants.DEEPLINK);
        DEEPLINK = scootersTariffFixSelectionAnalytics$FixSelectionOpenReason3;
        ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason[] scootersTariffFixSelectionAnalytics$FixSelectionOpenReasonArr = {scootersTariffFixSelectionAnalytics$FixSelectionOpenReason, scootersTariffFixSelectionAnalytics$FixSelectionOpenReason2, scootersTariffFixSelectionAnalytics$FixSelectionOpenReason3};
        $VALUES = scootersTariffFixSelectionAnalytics$FixSelectionOpenReasonArr;
        $ENTRIES = kotlin.enums.a.a(scootersTariffFixSelectionAnalytics$FixSelectionOpenReasonArr);
    }

    public ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason(String str, int i, String str2) {
        this.reason = str2;
    }

    public static ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason valueOf(String str) {
        return (ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason) Enum.valueOf(ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason.class, str);
    }

    public static ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason[] values() {
        return (ScootersTariffFixSelectionAnalytics$FixSelectionOpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getReason() {
        return this.reason;
    }
}
