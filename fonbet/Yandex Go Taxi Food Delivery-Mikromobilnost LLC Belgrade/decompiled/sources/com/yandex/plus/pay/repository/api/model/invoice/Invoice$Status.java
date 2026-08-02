package com.yandex.plus.pay.repository.api.model.invoice;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/yandex/plus/pay/repository/api/model/invoice/Invoice$Status", "", "Lcom/yandex/plus/pay/repository/api/model/invoice/Invoice$Status;", "CANCELLED", "CREATED", "CREATED_LEGACY", "FAILED", "PROVISION_SCHEDULED", "SCHEDULED", "STARTED", "SUCCESS", "WAIT_FOR_3DS", "WAIT_FOR_NOTIFICATION", "UNKNOWN", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Invoice$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Invoice$Status[] $VALUES;
    public static final Invoice$Status CANCELLED;
    public static final Invoice$Status CREATED;
    public static final Invoice$Status CREATED_LEGACY;
    public static final Invoice$Status FAILED;
    public static final Invoice$Status PROVISION_SCHEDULED;
    public static final Invoice$Status SCHEDULED;
    public static final Invoice$Status STARTED;
    public static final Invoice$Status SUCCESS;
    public static final Invoice$Status UNKNOWN;
    public static final Invoice$Status WAIT_FOR_3DS;
    public static final Invoice$Status WAIT_FOR_NOTIFICATION;

    static {
        Invoice$Status invoice$Status = new Invoice$Status("CANCELLED", 0);
        CANCELLED = invoice$Status;
        Invoice$Status invoice$Status2 = new Invoice$Status("CREATED", 1);
        CREATED = invoice$Status2;
        Invoice$Status invoice$Status3 = new Invoice$Status("CREATED_LEGACY", 2);
        CREATED_LEGACY = invoice$Status3;
        Invoice$Status invoice$Status4 = new Invoice$Status("FAILED", 3);
        FAILED = invoice$Status4;
        Invoice$Status invoice$Status5 = new Invoice$Status("PROVISION_SCHEDULED", 4);
        PROVISION_SCHEDULED = invoice$Status5;
        Invoice$Status invoice$Status6 = new Invoice$Status("SCHEDULED", 5);
        SCHEDULED = invoice$Status6;
        Invoice$Status invoice$Status7 = new Invoice$Status("STARTED", 6);
        STARTED = invoice$Status7;
        Invoice$Status invoice$Status8 = new Invoice$Status("SUCCESS", 7);
        SUCCESS = invoice$Status8;
        Invoice$Status invoice$Status9 = new Invoice$Status("WAIT_FOR_3DS", 8);
        WAIT_FOR_3DS = invoice$Status9;
        Invoice$Status invoice$Status10 = new Invoice$Status("WAIT_FOR_NOTIFICATION", 9);
        WAIT_FOR_NOTIFICATION = invoice$Status10;
        Invoice$Status invoice$Status11 = new Invoice$Status("UNKNOWN", 10);
        UNKNOWN = invoice$Status11;
        Invoice$Status[] invoice$StatusArr = {invoice$Status, invoice$Status2, invoice$Status3, invoice$Status4, invoice$Status5, invoice$Status6, invoice$Status7, invoice$Status8, invoice$Status9, invoice$Status10, invoice$Status11};
        $VALUES = invoice$StatusArr;
        $ENTRIES = a.a(invoice$StatusArr);
    }

    public static Invoice$Status valueOf(String str) {
        return (Invoice$Status) Enum.valueOf(Invoice$Status.class, str);
    }

    public static Invoice$Status[] values() {
        return (Invoice$Status[]) $VALUES.clone();
    }
}
