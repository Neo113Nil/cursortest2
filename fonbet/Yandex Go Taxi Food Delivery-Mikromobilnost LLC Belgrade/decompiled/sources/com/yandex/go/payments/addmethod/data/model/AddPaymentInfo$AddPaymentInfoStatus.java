package com.yandex.go.payments.addmethod.data.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/payments/addmethod/data/model/AddPaymentInfo$AddPaymentInfoStatus", "", "Lcom/yandex/go/payments/addmethod/data/model/AddPaymentInfo$AddPaymentInfoStatus;", "LOADING", "ERROR", "DONE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddPaymentInfo$AddPaymentInfoStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AddPaymentInfo$AddPaymentInfoStatus[] $VALUES;
    public static final AddPaymentInfo$AddPaymentInfoStatus DONE;
    public static final AddPaymentInfo$AddPaymentInfoStatus ERROR;
    public static final AddPaymentInfo$AddPaymentInfoStatus LOADING;

    static {
        AddPaymentInfo$AddPaymentInfoStatus addPaymentInfo$AddPaymentInfoStatus = new AddPaymentInfo$AddPaymentInfoStatus("LOADING", 0);
        LOADING = addPaymentInfo$AddPaymentInfoStatus;
        AddPaymentInfo$AddPaymentInfoStatus addPaymentInfo$AddPaymentInfoStatus2 = new AddPaymentInfo$AddPaymentInfoStatus("ERROR", 1);
        ERROR = addPaymentInfo$AddPaymentInfoStatus2;
        AddPaymentInfo$AddPaymentInfoStatus addPaymentInfo$AddPaymentInfoStatus3 = new AddPaymentInfo$AddPaymentInfoStatus("DONE", 2);
        DONE = addPaymentInfo$AddPaymentInfoStatus3;
        AddPaymentInfo$AddPaymentInfoStatus[] addPaymentInfo$AddPaymentInfoStatusArr = {addPaymentInfo$AddPaymentInfoStatus, addPaymentInfo$AddPaymentInfoStatus2, addPaymentInfo$AddPaymentInfoStatus3};
        $VALUES = addPaymentInfo$AddPaymentInfoStatusArr;
        $ENTRIES = kotlin.enums.a.a(addPaymentInfo$AddPaymentInfoStatusArr);
    }

    public static AddPaymentInfo$AddPaymentInfoStatus valueOf(String str) {
        return (AddPaymentInfo$AddPaymentInfoStatus) Enum.valueOf(AddPaymentInfo$AddPaymentInfoStatus.class, str);
    }

    public static AddPaymentInfo$AddPaymentInfoStatus[] values() {
        return (AddPaymentInfo$AddPaymentInfoStatus[]) $VALUES.clone();
    }
}
