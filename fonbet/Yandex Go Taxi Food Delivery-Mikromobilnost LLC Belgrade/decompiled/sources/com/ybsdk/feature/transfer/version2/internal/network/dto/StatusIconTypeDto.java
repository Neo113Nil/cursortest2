package com.ybsdk.feature.transfer.version2.internal.network.dto;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/StatusIconTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR", "SUCCESS", "TIMEOUT", "WARNING", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StatusIconTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ StatusIconTypeDto[] $VALUES;
    public static final StatusIconTypeDto ERROR = new StatusIconTypeDto("ERROR", 0);
    public static final StatusIconTypeDto SUCCESS = new StatusIconTypeDto("SUCCESS", 1);
    public static final StatusIconTypeDto TIMEOUT = new StatusIconTypeDto("TIMEOUT", 2);
    public static final StatusIconTypeDto WARNING = new StatusIconTypeDto("WARNING", 3);

    private static final /* synthetic */ StatusIconTypeDto[] $values() {
        return new StatusIconTypeDto[]{ERROR, SUCCESS, TIMEOUT, WARNING};
    }

    static {
        StatusIconTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private StatusIconTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static StatusIconTypeDto valueOf(String str) {
        return (StatusIconTypeDto) Enum.valueOf(StatusIconTypeDto.class, str);
    }

    public static StatusIconTypeDto[] values() {
        return (StatusIconTypeDto[]) $VALUES.clone();
    }
}
