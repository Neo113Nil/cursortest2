package com.ybsdk.feature.transfer.version2.api;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/transfer/version2/api/TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics", "", "Lcom/ybsdk/feature/transfer/version2/api/TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics;", "<init>", "(Ljava/lang/String;I)V", "TOKENIZATION", Card.CARD_TYPE_CREDIT_DEBIT, "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics[] $VALUES;
    public static final TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics TOKENIZATION = new TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics("TOKENIZATION", 0);
    public static final TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics PAYMENT = new TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics(Card.CARD_TYPE_CREDIT_DEBIT, 1);

    private static final /* synthetic */ TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics[] $values() {
        return new TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics[]{TOKENIZATION, PAYMENT};
    }

    static {
        TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics valueOf(String str) {
        return (TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics) Enum.valueOf(TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics.class, str);
    }

    public static TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics[] values() {
        return (TransferRemoteConfig$DashboardTopButton$TargetNfcScreenAnalytics[]) $VALUES.clone();
    }
}
