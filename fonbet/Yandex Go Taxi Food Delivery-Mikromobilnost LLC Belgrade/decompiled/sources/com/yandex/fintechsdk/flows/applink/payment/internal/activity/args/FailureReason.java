package com.yandex.fintechsdk.flows.applink.payment.internal.activity.args;

import defpackage.k4o;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/fintechsdk/flows/applink/payment/internal/activity/args/FailureReason;", "", "", Constants.KEY_MESSAGE, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "MISSING_SESSION_KEY", "MISSING_PAY_CONFIG", "MISSING_PAYMENT_DATA", "flows-applink-payment_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FailureReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FailureReason[] $VALUES;
    public static final FailureReason MISSING_PAYMENT_DATA;
    public static final FailureReason MISSING_PAY_CONFIG;
    public static final FailureReason MISSING_SESSION_KEY;
    private final String message;

    static {
        FailureReason failureReason = new FailureReason("MISSING_SESSION_KEY", 0, "session key not provided");
        MISSING_SESSION_KEY = failureReason;
        FailureReason failureReason2 = new FailureReason("MISSING_PAY_CONFIG", 1, "config data not provided");
        MISSING_PAY_CONFIG = failureReason2;
        FailureReason failureReason3 = new FailureReason("MISSING_PAYMENT_DATA", 2, "payment data not provided");
        MISSING_PAYMENT_DATA = failureReason3;
        FailureReason[] failureReasonArr = {failureReason, failureReason2, failureReason3};
        $VALUES = failureReasonArr;
        $ENTRIES = a.a(failureReasonArr);
    }

    public FailureReason(String str, int i, String str2) {
        this.message = str2;
    }

    public static FailureReason valueOf(String str) {
        return (FailureReason) Enum.valueOf(FailureReason.class, str);
    }

    public static FailureReason[] values() {
        return (FailureReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }
}
