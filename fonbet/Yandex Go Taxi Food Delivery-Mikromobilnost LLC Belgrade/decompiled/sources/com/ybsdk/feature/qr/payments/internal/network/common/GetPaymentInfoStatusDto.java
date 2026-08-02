package com.ybsdk.feature.qr.payments.internal.network.common;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ybsdk/feature/qr/payments/internal/network/common/GetPaymentInfoStatusDto;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "PROCESSING", "TRY_TO_REFRESH", "REDIRECT", "UNKNOWN", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetPaymentInfoStatusDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GetPaymentInfoStatusDto[] $VALUES;
    public static final GetPaymentInfoStatusDto SUCCESS = new GetPaymentInfoStatusDto("SUCCESS", 0);
    public static final GetPaymentInfoStatusDto PROCESSING = new GetPaymentInfoStatusDto("PROCESSING", 1);
    public static final GetPaymentInfoStatusDto TRY_TO_REFRESH = new GetPaymentInfoStatusDto("TRY_TO_REFRESH", 2);
    public static final GetPaymentInfoStatusDto REDIRECT = new GetPaymentInfoStatusDto("REDIRECT", 3);
    public static final GetPaymentInfoStatusDto UNKNOWN = new GetPaymentInfoStatusDto("UNKNOWN", 4);

    private static final /* synthetic */ GetPaymentInfoStatusDto[] $values() {
        return new GetPaymentInfoStatusDto[]{SUCCESS, PROCESSING, TRY_TO_REFRESH, REDIRECT, UNKNOWN};
    }

    static {
        GetPaymentInfoStatusDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private GetPaymentInfoStatusDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static GetPaymentInfoStatusDto valueOf(String str) {
        return (GetPaymentInfoStatusDto) Enum.valueOf(GetPaymentInfoStatusDto.class, str);
    }

    public static GetPaymentInfoStatusDto[] values() {
        return (GetPaymentInfoStatusDto[]) $VALUES.clone();
    }
}
