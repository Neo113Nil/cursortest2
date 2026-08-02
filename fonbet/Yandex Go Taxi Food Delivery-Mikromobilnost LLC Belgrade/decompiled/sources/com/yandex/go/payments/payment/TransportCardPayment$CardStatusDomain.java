package com.yandex.go.payments.payment;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/payments/payment/TransportCardPayment$CardStatusDomain", "", "Lcom/yandex/go/payments/payment/TransportCardPayment$CardStatusDomain;", Card.ACTIVE, "BLOCKED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TransportCardPayment$CardStatusDomain {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportCardPayment$CardStatusDomain[] $VALUES;
    public static final TransportCardPayment$CardStatusDomain ACTIVE;
    public static final TransportCardPayment$CardStatusDomain BLOCKED;

    static {
        TransportCardPayment$CardStatusDomain transportCardPayment$CardStatusDomain = new TransportCardPayment$CardStatusDomain(Card.ACTIVE, 0);
        ACTIVE = transportCardPayment$CardStatusDomain;
        TransportCardPayment$CardStatusDomain transportCardPayment$CardStatusDomain2 = new TransportCardPayment$CardStatusDomain("BLOCKED", 1);
        BLOCKED = transportCardPayment$CardStatusDomain2;
        TransportCardPayment$CardStatusDomain[] transportCardPayment$CardStatusDomainArr = {transportCardPayment$CardStatusDomain, transportCardPayment$CardStatusDomain2};
        $VALUES = transportCardPayment$CardStatusDomainArr;
        $ENTRIES = a.a(transportCardPayment$CardStatusDomainArr);
    }

    public static TransportCardPayment$CardStatusDomain valueOf(String str) {
        return (TransportCardPayment$CardStatusDomain) Enum.valueOf(TransportCardPayment$CardStatusDomain.class, str);
    }

    public static TransportCardPayment$CardStatusDomain[] values() {
        return (TransportCardPayment$CardStatusDomain[]) $VALUES.clone();
    }
}
