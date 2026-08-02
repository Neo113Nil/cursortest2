package com.yandex.fintechsdk.flows.applink.payment.internal.activity.paymentform.deeplink;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/fintechsdk/flows/applink/payment/internal/activity/paymentform/deeplink/ApplinkPaymentDeeplinkAction;", "", "", "stringValue", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "OPEN_SCREEN", "flows-applink-payment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ApplinkPaymentDeeplinkAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ApplinkPaymentDeeplinkAction[] $VALUES;
    public static final ApplinkPaymentDeeplinkAction OPEN_SCREEN;
    private final String stringValue = "screen.open";

    static {
        ApplinkPaymentDeeplinkAction applinkPaymentDeeplinkAction = new ApplinkPaymentDeeplinkAction();
        OPEN_SCREEN = applinkPaymentDeeplinkAction;
        ApplinkPaymentDeeplinkAction[] applinkPaymentDeeplinkActionArr = {applinkPaymentDeeplinkAction};
        $VALUES = applinkPaymentDeeplinkActionArr;
        $ENTRIES = a.a(applinkPaymentDeeplinkActionArr);
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static ApplinkPaymentDeeplinkAction valueOf(String str) {
        return (ApplinkPaymentDeeplinkAction) Enum.valueOf(ApplinkPaymentDeeplinkAction.class, str);
    }

    public static ApplinkPaymentDeeplinkAction[] values() {
        return (ApplinkPaymentDeeplinkAction[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getStringValue() {
        return this.stringValue;
    }
}
