package com.ybsdk.feature.transfer.version2.internal.network.dto;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/TransferStatusDto;", "", "<init>", "(Ljava/lang/String;I)V", "PROCESSING", "FAILED", "SUCCESS", "ACCEPTED", "UNKNOWN", "AWAITING_APPROVAL", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TransferStatusDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferStatusDto[] $VALUES;
    public static final TransferStatusDto PROCESSING = new TransferStatusDto("PROCESSING", 0);
    public static final TransferStatusDto FAILED = new TransferStatusDto("FAILED", 1);
    public static final TransferStatusDto SUCCESS = new TransferStatusDto("SUCCESS", 2);
    public static final TransferStatusDto ACCEPTED = new TransferStatusDto("ACCEPTED", 3);
    public static final TransferStatusDto UNKNOWN = new TransferStatusDto("UNKNOWN", 4);
    public static final TransferStatusDto AWAITING_APPROVAL = new TransferStatusDto("AWAITING_APPROVAL", 5);

    private static final /* synthetic */ TransferStatusDto[] $values() {
        return new TransferStatusDto[]{PROCESSING, FAILED, SUCCESS, ACCEPTED, UNKNOWN, AWAITING_APPROVAL};
    }

    static {
        TransferStatusDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TransferStatusDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferStatusDto valueOf(String str) {
        return (TransferStatusDto) Enum.valueOf(TransferStatusDto.class, str);
    }

    public static TransferStatusDto[] values() {
        return (TransferStatusDto[]) $VALUES.clone();
    }
}
