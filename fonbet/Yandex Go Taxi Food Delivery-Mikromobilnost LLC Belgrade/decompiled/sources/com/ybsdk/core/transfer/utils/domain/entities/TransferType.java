package com.ybsdk.core.transfer.utils.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/core/transfer/utils/domain/entities/TransferType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "C2C", "ME2ME", "core-transfer-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TransferType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferType[] $VALUES;
    public static final TransferType C2C = new TransferType("C2C", 0, "C2C");
    public static final TransferType ME2ME = new TransferType("ME2ME", 1, "ME2ME");
    private final String value;

    private static final /* synthetic */ TransferType[] $values() {
        return new TransferType[]{C2C, ME2ME};
    }

    static {
        TransferType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransferType(String str, int i, String str2) {
        this.value = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferType valueOf(String str) {
        return (TransferType) Enum.valueOf(TransferType.class, str);
    }

    public static TransferType[] values() {
        return (TransferType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
