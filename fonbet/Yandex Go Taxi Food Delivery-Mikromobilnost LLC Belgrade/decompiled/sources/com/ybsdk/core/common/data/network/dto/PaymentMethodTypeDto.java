package com.ybsdk.core.common.data.network.dto;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/core/common/data/network/dto/PaymentMethodTypeDto;", "", "<init>", "(Ljava/lang/String;I)V", "CARD", "ME2ME", "GOOGLE_PAY", "APPLE_PAY", "YANDEX_ACCOUNT", "SAVINGS_ACCOUNT", "UNKNOWN", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentMethodTypeDto {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentMethodTypeDto[] $VALUES;
    public static final PaymentMethodTypeDto CARD = new PaymentMethodTypeDto("CARD", 0);
    public static final PaymentMethodTypeDto ME2ME = new PaymentMethodTypeDto("ME2ME", 1);
    public static final PaymentMethodTypeDto GOOGLE_PAY = new PaymentMethodTypeDto("GOOGLE_PAY", 2);
    public static final PaymentMethodTypeDto APPLE_PAY = new PaymentMethodTypeDto("APPLE_PAY", 3);
    public static final PaymentMethodTypeDto YANDEX_ACCOUNT = new PaymentMethodTypeDto("YANDEX_ACCOUNT", 4);
    public static final PaymentMethodTypeDto SAVINGS_ACCOUNT = new PaymentMethodTypeDto("SAVINGS_ACCOUNT", 5);
    public static final PaymentMethodTypeDto UNKNOWN = new PaymentMethodTypeDto("UNKNOWN", 6);

    private static final /* synthetic */ PaymentMethodTypeDto[] $values() {
        return new PaymentMethodTypeDto[]{CARD, ME2ME, GOOGLE_PAY, APPLE_PAY, YANDEX_ACCOUNT, SAVINGS_ACCOUNT, UNKNOWN};
    }

    static {
        PaymentMethodTypeDto[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PaymentMethodTypeDto(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PaymentMethodTypeDto valueOf(String str) {
        return (PaymentMethodTypeDto) Enum.valueOf(PaymentMethodTypeDto.class, str);
    }

    public static PaymentMethodTypeDto[] values() {
        return (PaymentMethodTypeDto[]) $VALUES.clone();
    }
}
