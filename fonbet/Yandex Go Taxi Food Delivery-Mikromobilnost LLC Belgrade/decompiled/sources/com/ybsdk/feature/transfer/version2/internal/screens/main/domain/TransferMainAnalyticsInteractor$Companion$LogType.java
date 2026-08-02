package com.ybsdk.feature.transfer.version2.internal.screens.main.domain;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/ybsdk/feature/transfer/version2/internal/screens/main/domain/TransferMainAnalyticsInteractor$Companion$LogType", "", "Lcom/ybsdk/feature/transfer/version2/internal/screens/main/domain/TransferMainAnalyticsInteractor$Companion$LogType;", "<init>", "(Ljava/lang/String;I)V", "TRANSFER", "MOBILE_PAYMENT", "INTERNET_PAYMENT", "C2G", "TEMPLATE", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferMainAnalyticsInteractor$Companion$LogType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferMainAnalyticsInteractor$Companion$LogType[] $VALUES;
    public static final TransferMainAnalyticsInteractor$Companion$LogType TRANSFER = new TransferMainAnalyticsInteractor$Companion$LogType("TRANSFER", 0);
    public static final TransferMainAnalyticsInteractor$Companion$LogType MOBILE_PAYMENT = new TransferMainAnalyticsInteractor$Companion$LogType("MOBILE_PAYMENT", 1);
    public static final TransferMainAnalyticsInteractor$Companion$LogType INTERNET_PAYMENT = new TransferMainAnalyticsInteractor$Companion$LogType("INTERNET_PAYMENT", 2);
    public static final TransferMainAnalyticsInteractor$Companion$LogType C2G = new TransferMainAnalyticsInteractor$Companion$LogType("C2G", 3);
    public static final TransferMainAnalyticsInteractor$Companion$LogType TEMPLATE = new TransferMainAnalyticsInteractor$Companion$LogType("TEMPLATE", 4);

    private static final /* synthetic */ TransferMainAnalyticsInteractor$Companion$LogType[] $values() {
        return new TransferMainAnalyticsInteractor$Companion$LogType[]{TRANSFER, MOBILE_PAYMENT, INTERNET_PAYMENT, C2G, TEMPLATE};
    }

    static {
        TransferMainAnalyticsInteractor$Companion$LogType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TransferMainAnalyticsInteractor$Companion$LogType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferMainAnalyticsInteractor$Companion$LogType valueOf(String str) {
        return (TransferMainAnalyticsInteractor$Companion$LogType) Enum.valueOf(TransferMainAnalyticsInteractor$Companion$LogType.class, str);
    }

    public static TransferMainAnalyticsInteractor$Companion$LogType[] values() {
        return (TransferMainAnalyticsInteractor$Companion$LogType[]) $VALUES.clone();
    }
}
