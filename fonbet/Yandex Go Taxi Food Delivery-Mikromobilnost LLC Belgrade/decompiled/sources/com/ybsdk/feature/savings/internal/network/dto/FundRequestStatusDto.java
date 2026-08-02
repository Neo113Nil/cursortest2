package com.ybsdk.feature.savings.internal.network.dto;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/FundRequestStatusDto;", "", "<init>", "(Ljava/lang/String;I)V", "IN_PROGRESS", "READY_FOR_OPENING", "SUCCESS", "FAILED", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FundRequestStatusDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FundRequestStatusDto[] $VALUES;
    public static final FundRequestStatusDto IN_PROGRESS = new FundRequestStatusDto("IN_PROGRESS", 0);
    public static final FundRequestStatusDto READY_FOR_OPENING = new FundRequestStatusDto("READY_FOR_OPENING", 1);
    public static final FundRequestStatusDto SUCCESS = new FundRequestStatusDto("SUCCESS", 2);
    public static final FundRequestStatusDto FAILED = new FundRequestStatusDto("FAILED", 3);

    private static final /* synthetic */ FundRequestStatusDto[] $values() {
        return new FundRequestStatusDto[]{IN_PROGRESS, READY_FOR_OPENING, SUCCESS, FAILED};
    }

    static {
        FundRequestStatusDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private FundRequestStatusDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static FundRequestStatusDto valueOf(String str) {
        return (FundRequestStatusDto) Enum.valueOf(FundRequestStatusDto.class, str);
    }

    public static FundRequestStatusDto[] values() {
        return (FundRequestStatusDto[]) $VALUES.clone();
    }
}
