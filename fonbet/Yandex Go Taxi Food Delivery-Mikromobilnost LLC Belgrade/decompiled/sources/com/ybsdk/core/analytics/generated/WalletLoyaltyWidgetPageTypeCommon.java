package com.ybsdk.core.analytics.generated;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/core/analytics/generated/WalletLoyaltyWidgetPageTypeCommon;", "", "originalValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getOriginalValue", "()Ljava/lang/String;", "PAY_BY_QR", "PAY_BY_BLE", "PAY_BY_NFC", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WalletLoyaltyWidgetPageTypeCommon {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WalletLoyaltyWidgetPageTypeCommon[] $VALUES;
    private final String originalValue;
    public static final WalletLoyaltyWidgetPageTypeCommon PAY_BY_QR = new WalletLoyaltyWidgetPageTypeCommon("PAY_BY_QR", 0, "pay_by_qr");
    public static final WalletLoyaltyWidgetPageTypeCommon PAY_BY_BLE = new WalletLoyaltyWidgetPageTypeCommon("PAY_BY_BLE", 1, "pay_by_ble");
    public static final WalletLoyaltyWidgetPageTypeCommon PAY_BY_NFC = new WalletLoyaltyWidgetPageTypeCommon("PAY_BY_NFC", 2, "pay_by_nfc");

    private static final /* synthetic */ WalletLoyaltyWidgetPageTypeCommon[] $values() {
        return new WalletLoyaltyWidgetPageTypeCommon[]{PAY_BY_QR, PAY_BY_BLE, PAY_BY_NFC};
    }

    static {
        WalletLoyaltyWidgetPageTypeCommon[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private WalletLoyaltyWidgetPageTypeCommon(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static WalletLoyaltyWidgetPageTypeCommon valueOf(String str) {
        return (WalletLoyaltyWidgetPageTypeCommon) Enum.valueOf(WalletLoyaltyWidgetPageTypeCommon.class, str);
    }

    public static WalletLoyaltyWidgetPageTypeCommon[] values() {
        return (WalletLoyaltyWidgetPageTypeCommon[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
