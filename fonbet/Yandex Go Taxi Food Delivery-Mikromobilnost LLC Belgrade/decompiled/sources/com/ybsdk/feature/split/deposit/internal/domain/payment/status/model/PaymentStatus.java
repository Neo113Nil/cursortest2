package com.ybsdk.feature.split.deposit.internal.domain.payment.status.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCSP.Key.tls.TlsConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/domain/payment/status/model/PaymentStatus;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "CHALLENGE", TlsConstants.TLS_FINISHED, "FAILED", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentStatus[] $VALUES;
    public static final PaymentStatus PENDING = new PaymentStatus("PENDING", 0);
    public static final PaymentStatus CHALLENGE = new PaymentStatus("CHALLENGE", 1);
    public static final PaymentStatus FINISHED = new PaymentStatus(TlsConstants.TLS_FINISHED, 2);
    public static final PaymentStatus FAILED = new PaymentStatus("FAILED", 3);

    private static final /* synthetic */ PaymentStatus[] $values() {
        return new PaymentStatus[]{PENDING, CHALLENGE, FINISHED, FAILED};
    }

    static {
        PaymentStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private PaymentStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PaymentStatus valueOf(String str) {
        return (PaymentStatus) Enum.valueOf(PaymentStatus.class, str);
    }

    public static PaymentStatus[] values() {
        return (PaymentStatus[]) $VALUES.clone();
    }
}
