package com.ybsdk.rconfig.configs;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/rconfig/configs/TransfersDashboardTopButtonsType;", "", "<init>", "(Ljava/lang/String;I)V", "NFC", "REVERSE_QR", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TransfersDashboardTopButtonsType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransfersDashboardTopButtonsType[] $VALUES;
    public static final TransfersDashboardTopButtonsType NFC = new TransfersDashboardTopButtonsType("NFC", 0);
    public static final TransfersDashboardTopButtonsType REVERSE_QR = new TransfersDashboardTopButtonsType("REVERSE_QR", 1);

    private static final /* synthetic */ TransfersDashboardTopButtonsType[] $values() {
        return new TransfersDashboardTopButtonsType[]{NFC, REVERSE_QR};
    }

    static {
        TransfersDashboardTopButtonsType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TransfersDashboardTopButtonsType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransfersDashboardTopButtonsType valueOf(String str) {
        return (TransfersDashboardTopButtonsType) Enum.valueOf(TransfersDashboardTopButtonsType.class, str);
    }

    public static TransfersDashboardTopButtonsType[] values() {
        return (TransfersDashboardTopButtonsType[]) $VALUES.clone();
    }
}
