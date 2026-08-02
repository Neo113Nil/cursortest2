package com.yandex.go.masstransit.sdk.client_api.model.trip;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/client_api/model/trip/CheckoutStatus;", "", "Failure", "Success", "Processing", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CheckoutStatus[] $VALUES;
    public static final CheckoutStatus Failure;
    public static final CheckoutStatus Processing;
    public static final CheckoutStatus Success;

    static {
        CheckoutStatus checkoutStatus = new CheckoutStatus("Failure", 0);
        Failure = checkoutStatus;
        CheckoutStatus checkoutStatus2 = new CheckoutStatus("Success", 1);
        Success = checkoutStatus2;
        CheckoutStatus checkoutStatus3 = new CheckoutStatus("Processing", 2);
        Processing = checkoutStatus3;
        CheckoutStatus[] checkoutStatusArr = {checkoutStatus, checkoutStatus2, checkoutStatus3};
        $VALUES = checkoutStatusArr;
        $ENTRIES = a.a(checkoutStatusArr);
    }

    public static CheckoutStatus valueOf(String str) {
        return (CheckoutStatus) Enum.valueOf(CheckoutStatus.class, str);
    }

    public static CheckoutStatus[] values() {
        return (CheckoutStatus[]) $VALUES.clone();
    }
}
