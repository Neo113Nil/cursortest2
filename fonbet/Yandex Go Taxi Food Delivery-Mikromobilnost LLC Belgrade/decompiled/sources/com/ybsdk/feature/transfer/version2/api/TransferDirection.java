package com.ybsdk.feature.transfer.version2.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/api/TransferDirection;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSFER", "TOPUP", "feature-transfer-version2-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferDirection {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferDirection[] $VALUES;
    public static final TransferDirection TRANSFER = new TransferDirection("TRANSFER", 0);
    public static final TransferDirection TOPUP = new TransferDirection("TOPUP", 1);

    private static final /* synthetic */ TransferDirection[] $values() {
        return new TransferDirection[]{TRANSFER, TOPUP};
    }

    static {
        TransferDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransferDirection(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferDirection valueOf(String str) {
        return (TransferDirection) Enum.valueOf(TransferDirection.class, str);
    }

    public static TransferDirection[] values() {
        return (TransferDirection[]) $VALUES.clone();
    }
}
