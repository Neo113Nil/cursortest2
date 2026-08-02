package com.yandex.go.promocodes.base.impl.discounts.domain.analytics;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/discounts/domain/analytics/ErrorType;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NETWORK", "CARD_REQUIRED", "CARD_ONLY", Card.EXPIRED, "UNRECOGNIZED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ErrorType[] $VALUES;
    public static final ErrorType CARD_ONLY;
    public static final ErrorType CARD_REQUIRED;
    public static final ErrorType EXPIRED;
    public static final ErrorType NETWORK;
    public static final ErrorType UNRECOGNIZED;
    private final String value;

    static {
        ErrorType errorType = new ErrorType("NETWORK", 0, "network_error");
        NETWORK = errorType;
        ErrorType errorType2 = new ErrorType("CARD_REQUIRED", 1, "creditCardRequired");
        CARD_REQUIRED = errorType2;
        ErrorType errorType3 = new ErrorType("CARD_ONLY", 2, "creditCardOnly");
        CARD_ONLY = errorType3;
        ErrorType errorType4 = new ErrorType(Card.EXPIRED, 3, "expired");
        EXPIRED = errorType4;
        ErrorType errorType5 = new ErrorType("UNRECOGNIZED", 4, "unrecognized");
        UNRECOGNIZED = errorType5;
        ErrorType[] errorTypeArr = {errorType, errorType2, errorType3, errorType4, errorType5};
        $VALUES = errorTypeArr;
        $ENTRIES = a.a(errorTypeArr);
    }

    public ErrorType(String str, int i, String str2) {
        this.value = str2;
    }

    public static ErrorType valueOf(String str) {
        return (ErrorType) Enum.valueOf(ErrorType.class, str);
    }

    public static ErrorType[] values() {
        return (ErrorType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
