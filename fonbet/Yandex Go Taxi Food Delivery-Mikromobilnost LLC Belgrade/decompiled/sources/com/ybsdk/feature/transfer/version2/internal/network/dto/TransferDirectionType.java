package com.ybsdk.feature.transfer.version2.internal.network.dto;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferDirectionType;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSFER", "TOPUP", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferDirectionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferDirectionType[] $VALUES;
    public static final TransferDirectionType TRANSFER = new TransferDirectionType("TRANSFER", 0);
    public static final TransferDirectionType TOPUP = new TransferDirectionType("TOPUP", 1);

    private static final /* synthetic */ TransferDirectionType[] $values() {
        return new TransferDirectionType[]{TRANSFER, TOPUP};
    }

    static {
        TransferDirectionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TransferDirectionType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferDirectionType valueOf(String str) {
        return (TransferDirectionType) Enum.valueOf(TransferDirectionType.class, str);
    }

    public static TransferDirectionType[] values() {
        return (TransferDirectionType[]) $VALUES.clone();
    }
}
