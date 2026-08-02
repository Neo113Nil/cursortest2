package com.yandex.go.places.impl.data.entities.network.payments;

import defpackage.cka0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.t7a0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/places/impl/data/entities/network/payments/PaymentStatus;", "", "Companion", "cka0", "PROCESSING", "USER_INTERACTION", "SUCCESS", "FAILED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PaymentStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PaymentStatus[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final cka0 Companion;
    public static final PaymentStatus FAILED;
    public static final PaymentStatus PROCESSING;
    public static final PaymentStatus SUCCESS;
    public static final PaymentStatus USER_INTERACTION;

    static {
        PaymentStatus paymentStatus = new PaymentStatus("PROCESSING", 0);
        PROCESSING = paymentStatus;
        PaymentStatus paymentStatus2 = new PaymentStatus("USER_INTERACTION", 1);
        USER_INTERACTION = paymentStatus2;
        PaymentStatus paymentStatus3 = new PaymentStatus("SUCCESS", 2);
        SUCCESS = paymentStatus3;
        PaymentStatus paymentStatus4 = new PaymentStatus("FAILED", 3);
        FAILED = paymentStatus4;
        PaymentStatus[] paymentStatusArr = {paymentStatus, paymentStatus2, paymentStatus3, paymentStatus4};
        $VALUES = paymentStatusArr;
        $ENTRIES = kotlin.enums.a.a(paymentStatusArr);
        Companion = new cka0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t7a0(17));
    }

    public static PaymentStatus valueOf(String str) {
        return (PaymentStatus) Enum.valueOf(PaymentStatus.class, str);
    }

    public static PaymentStatus[] values() {
        return (PaymentStatus[]) $VALUES.clone();
    }
}
