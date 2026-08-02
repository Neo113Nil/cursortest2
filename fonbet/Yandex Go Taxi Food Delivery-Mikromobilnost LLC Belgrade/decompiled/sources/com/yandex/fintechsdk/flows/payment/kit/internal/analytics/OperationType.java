package com.yandex.fintechsdk.flows.payment.kit.internal.analytics;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/fintechsdk/flows/payment/kit/internal/analytics/OperationType;", "", "", "type", "Ljava/lang/String;", "a", "()Ljava/lang/String;", Card.CARD_TYPE_CREDIT_DEBIT, "VERIFICATION", "flows-payment-kit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class OperationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ OperationType[] $VALUES;
    public static final OperationType PAYMENT;
    public static final OperationType VERIFICATION;
    private final String type;

    static {
        OperationType operationType = new OperationType(Card.CARD_TYPE_CREDIT_DEBIT, 0, "payment");
        PAYMENT = operationType;
        OperationType operationType2 = new OperationType("VERIFICATION", 1, "verification");
        VERIFICATION = operationType2;
        OperationType[] operationTypeArr = {operationType, operationType2};
        $VALUES = operationTypeArr;
        $ENTRIES = a.a(operationTypeArr);
    }

    public OperationType(String str, int i, String str2) {
        this.type = str2;
    }

    public static OperationType valueOf(String str) {
        return (OperationType) Enum.valueOf(OperationType.class, str);
    }

    public static OperationType[] values() {
        return (OperationType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
