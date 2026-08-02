package com.ybsdk.core.transfer.utils.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/core/transfer/utils/domain/entities/TransferStatus;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "PROCESSING", "FAILED", "TIMEOUT", "ERROR", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TransferStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferStatus[] $VALUES;
    public static final TransferStatus SUCCESS = new TransferStatus("SUCCESS", 0);
    public static final TransferStatus PROCESSING = new TransferStatus("PROCESSING", 1);
    public static final TransferStatus FAILED = new TransferStatus("FAILED", 2);
    public static final TransferStatus TIMEOUT = new TransferStatus("TIMEOUT", 3);
    public static final TransferStatus ERROR = new TransferStatus("ERROR", 4);

    private static final /* synthetic */ TransferStatus[] $values() {
        return new TransferStatus[]{SUCCESS, PROCESSING, FAILED, TIMEOUT, ERROR};
    }

    static {
        TransferStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransferStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferStatus valueOf(String str) {
        return (TransferStatus) Enum.valueOf(TransferStatus.class, str);
    }

    public static TransferStatus[] values() {
        return (TransferStatus[]) $VALUES.clone();
    }
}
