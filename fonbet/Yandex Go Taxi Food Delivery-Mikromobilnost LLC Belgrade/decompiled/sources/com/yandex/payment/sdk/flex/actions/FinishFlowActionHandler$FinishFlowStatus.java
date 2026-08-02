package com.yandex.payment.sdk.flex.actions;

import defpackage.bar;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/yandex/payment/sdk/flex/actions/FinishFlowActionHandler$FinishFlowStatus", "", "Lcom/yandex/payment/sdk/flex/actions/FinishFlowActionHandler$FinishFlowStatus;", "Companion", "bar", "SUCCESS", "FAIL", "CANCEL", "UNKNOWN", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinishFlowActionHandler$FinishFlowStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FinishFlowActionHandler$FinishFlowStatus[] $VALUES;
    public static final FinishFlowActionHandler$FinishFlowStatus CANCEL;
    public static final bar Companion;
    public static final FinishFlowActionHandler$FinishFlowStatus FAIL;
    public static final FinishFlowActionHandler$FinishFlowStatus SUCCESS;
    public static final FinishFlowActionHandler$FinishFlowStatus UNKNOWN;

    static {
        FinishFlowActionHandler$FinishFlowStatus finishFlowActionHandler$FinishFlowStatus = new FinishFlowActionHandler$FinishFlowStatus("SUCCESS", 0);
        SUCCESS = finishFlowActionHandler$FinishFlowStatus;
        FinishFlowActionHandler$FinishFlowStatus finishFlowActionHandler$FinishFlowStatus2 = new FinishFlowActionHandler$FinishFlowStatus("FAIL", 1);
        FAIL = finishFlowActionHandler$FinishFlowStatus2;
        FinishFlowActionHandler$FinishFlowStatus finishFlowActionHandler$FinishFlowStatus3 = new FinishFlowActionHandler$FinishFlowStatus("CANCEL", 2);
        CANCEL = finishFlowActionHandler$FinishFlowStatus3;
        FinishFlowActionHandler$FinishFlowStatus finishFlowActionHandler$FinishFlowStatus4 = new FinishFlowActionHandler$FinishFlowStatus("UNKNOWN", 3);
        UNKNOWN = finishFlowActionHandler$FinishFlowStatus4;
        FinishFlowActionHandler$FinishFlowStatus[] finishFlowActionHandler$FinishFlowStatusArr = {finishFlowActionHandler$FinishFlowStatus, finishFlowActionHandler$FinishFlowStatus2, finishFlowActionHandler$FinishFlowStatus3, finishFlowActionHandler$FinishFlowStatus4};
        $VALUES = finishFlowActionHandler$FinishFlowStatusArr;
        $ENTRIES = kotlin.enums.a.a(finishFlowActionHandler$FinishFlowStatusArr);
        Companion = new bar();
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static FinishFlowActionHandler$FinishFlowStatus valueOf(String str) {
        return (FinishFlowActionHandler$FinishFlowStatus) Enum.valueOf(FinishFlowActionHandler$FinishFlowStatus.class, str);
    }

    public static FinishFlowActionHandler$FinishFlowStatus[] values() {
        return (FinishFlowActionHandler$FinishFlowStatus[]) $VALUES.clone();
    }
}
