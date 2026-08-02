package com.yandex.go.payments.acceptance.data.model;

import defpackage.df;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.pd;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/payments/acceptance/data/model/AcceptancePaymentStatus;", "", "Companion", "df", "PROCESSING", "SUCCESS", "FAIL", "CANCELLED", "NOT_CREATED", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AcceptancePaymentStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AcceptancePaymentStatus[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final AcceptancePaymentStatus CANCELLED;
    public static final df Companion;
    public static final AcceptancePaymentStatus FAIL;
    public static final AcceptancePaymentStatus NOT_CREATED;
    public static final AcceptancePaymentStatus PROCESSING;
    public static final AcceptancePaymentStatus SUCCESS;
    public static final AcceptancePaymentStatus UNKNOWN;

    static {
        AcceptancePaymentStatus acceptancePaymentStatus = new AcceptancePaymentStatus("PROCESSING", 0);
        PROCESSING = acceptancePaymentStatus;
        AcceptancePaymentStatus acceptancePaymentStatus2 = new AcceptancePaymentStatus("SUCCESS", 1);
        SUCCESS = acceptancePaymentStatus2;
        AcceptancePaymentStatus acceptancePaymentStatus3 = new AcceptancePaymentStatus("FAIL", 2);
        FAIL = acceptancePaymentStatus3;
        AcceptancePaymentStatus acceptancePaymentStatus4 = new AcceptancePaymentStatus("CANCELLED", 3);
        CANCELLED = acceptancePaymentStatus4;
        AcceptancePaymentStatus acceptancePaymentStatus5 = new AcceptancePaymentStatus("NOT_CREATED", 4);
        NOT_CREATED = acceptancePaymentStatus5;
        AcceptancePaymentStatus acceptancePaymentStatus6 = new AcceptancePaymentStatus("UNKNOWN", 5);
        UNKNOWN = acceptancePaymentStatus6;
        AcceptancePaymentStatus[] acceptancePaymentStatusArr = {acceptancePaymentStatus, acceptancePaymentStatus2, acceptancePaymentStatus3, acceptancePaymentStatus4, acceptancePaymentStatus5, acceptancePaymentStatus6};
        $VALUES = acceptancePaymentStatusArr;
        $ENTRIES = kotlin.enums.a.a(acceptancePaymentStatusArr);
        Companion = new df();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new pd(3));
    }

    public static AcceptancePaymentStatus valueOf(String str) {
        return (AcceptancePaymentStatus) Enum.valueOf(AcceptancePaymentStatus.class, str);
    }

    public static AcceptancePaymentStatus[] values() {
        return (AcceptancePaymentStatus[]) $VALUES.clone();
    }
}
