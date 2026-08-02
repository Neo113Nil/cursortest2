package com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish;

import defpackage.ear;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/fintechsdk/flows/applink/payment/internal/di/paymentform/features/bdui/action/finish/FinishFlowStatus;", "", "Companion", "ear", "SUCCESS", "FAIL", "CANCEL", "UNKNOWN", "flows-applink-payment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FinishFlowStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FinishFlowStatus[] $VALUES;
    public static final FinishFlowStatus CANCEL;
    public static final ear Companion;
    public static final String ERROR_FIELD_NAME = "error";
    public static final FinishFlowStatus FAIL;
    public static final String ORDER_ID_FIELD_NAME = "orderId";
    public static final FinishFlowStatus SUCCESS;
    public static final FinishFlowStatus UNKNOWN;

    static {
        FinishFlowStatus finishFlowStatus = new FinishFlowStatus("SUCCESS", 0);
        SUCCESS = finishFlowStatus;
        FinishFlowStatus finishFlowStatus2 = new FinishFlowStatus("FAIL", 1);
        FAIL = finishFlowStatus2;
        FinishFlowStatus finishFlowStatus3 = new FinishFlowStatus("CANCEL", 2);
        CANCEL = finishFlowStatus3;
        FinishFlowStatus finishFlowStatus4 = new FinishFlowStatus("UNKNOWN", 3);
        UNKNOWN = finishFlowStatus4;
        FinishFlowStatus[] finishFlowStatusArr = {finishFlowStatus, finishFlowStatus2, finishFlowStatus3, finishFlowStatus4};
        $VALUES = finishFlowStatusArr;
        $ENTRIES = a.a(finishFlowStatusArr);
        Companion = new ear();
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static FinishFlowStatus valueOf(String str) {
        return (FinishFlowStatus) Enum.valueOf(FinishFlowStatus.class, str);
    }

    public static FinishFlowStatus[] values() {
        return (FinishFlowStatus[]) $VALUES.clone();
    }
}
