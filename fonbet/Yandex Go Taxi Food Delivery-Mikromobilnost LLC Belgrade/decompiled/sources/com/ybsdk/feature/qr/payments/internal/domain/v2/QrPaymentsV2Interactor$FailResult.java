package com.ybsdk.feature.qr.payments.internal.domain.v2;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/ybsdk/feature/qr/payments/internal/domain/v2/QrPaymentsV2Interactor$FailResult", "", "Lcom/ybsdk/feature/qr/payments/internal/domain/v2/QrPaymentsV2Interactor$FailResult;", "CONFIRM", "GET_RESULT", "feature-qr-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class QrPaymentsV2Interactor$FailResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ QrPaymentsV2Interactor$FailResult[] $VALUES;
    public static final QrPaymentsV2Interactor$FailResult CONFIRM;
    public static final QrPaymentsV2Interactor$FailResult GET_RESULT;

    static {
        QrPaymentsV2Interactor$FailResult qrPaymentsV2Interactor$FailResult = new QrPaymentsV2Interactor$FailResult("CONFIRM", 0);
        CONFIRM = qrPaymentsV2Interactor$FailResult;
        QrPaymentsV2Interactor$FailResult qrPaymentsV2Interactor$FailResult2 = new QrPaymentsV2Interactor$FailResult("GET_RESULT", 1);
        GET_RESULT = qrPaymentsV2Interactor$FailResult2;
        QrPaymentsV2Interactor$FailResult[] qrPaymentsV2Interactor$FailResultArr = {qrPaymentsV2Interactor$FailResult, qrPaymentsV2Interactor$FailResult2};
        $VALUES = qrPaymentsV2Interactor$FailResultArr;
        $ENTRIES = kotlin.enums.a.a(qrPaymentsV2Interactor$FailResultArr);
    }

    public static QrPaymentsV2Interactor$FailResult valueOf(String str) {
        return (QrPaymentsV2Interactor$FailResult) Enum.valueOf(QrPaymentsV2Interactor$FailResult.class, str);
    }

    public static QrPaymentsV2Interactor$FailResult[] values() {
        return (QrPaymentsV2Interactor$FailResult[]) $VALUES.clone();
    }
}
