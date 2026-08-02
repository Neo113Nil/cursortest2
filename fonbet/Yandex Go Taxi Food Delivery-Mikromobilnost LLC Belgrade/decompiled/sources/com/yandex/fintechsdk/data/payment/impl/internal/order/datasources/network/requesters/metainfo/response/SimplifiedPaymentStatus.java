package com.yandex.fintechsdk.data.payment.impl.internal.order.datasources.network.requesters.metainfo.response;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.wfs0;
import defpackage.wyr0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0081\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/fintechsdk/data/payment/impl/internal/order/datasources/network/requesters/metainfo/response/SimplifiedPaymentStatus;", "", "Companion", "wfs0", "PENDING", "SUCCESS", "FAILED", "impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SimplifiedPaymentStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SimplifiedPaymentStatus[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final wfs0 Companion;
    public static final SimplifiedPaymentStatus FAILED;
    public static final SimplifiedPaymentStatus PENDING;
    public static final SimplifiedPaymentStatus SUCCESS;

    static {
        SimplifiedPaymentStatus simplifiedPaymentStatus = new SimplifiedPaymentStatus("PENDING", 0);
        PENDING = simplifiedPaymentStatus;
        SimplifiedPaymentStatus simplifiedPaymentStatus2 = new SimplifiedPaymentStatus("SUCCESS", 1);
        SUCCESS = simplifiedPaymentStatus2;
        SimplifiedPaymentStatus simplifiedPaymentStatus3 = new SimplifiedPaymentStatus("FAILED", 2);
        FAILED = simplifiedPaymentStatus3;
        SimplifiedPaymentStatus[] simplifiedPaymentStatusArr = {simplifiedPaymentStatus, simplifiedPaymentStatus2, simplifiedPaymentStatus3};
        $VALUES = simplifiedPaymentStatusArr;
        $ENTRIES = a.a(simplifiedPaymentStatusArr);
        Companion = new wfs0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new wyr0(14));
    }

    public static SimplifiedPaymentStatus valueOf(String str) {
        return (SimplifiedPaymentStatus) Enum.valueOf(SimplifiedPaymentStatus.class, str);
    }

    public static SimplifiedPaymentStatus[] values() {
        return (SimplifiedPaymentStatus[]) $VALUES.clone();
    }
}
