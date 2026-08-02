package com.ybsdk.core.analytics.generated.delegates;

import com.yandex.payment.sdk.transportcards.nfc.model.WriteBlocks;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/SplitEvents$SplitDepositTransactionStatusShownStatus", "", "Lcom/ybsdk/core/analytics/generated/delegates/SplitEvents$SplitDepositTransactionStatusShownStatus;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "OK", "ERROR", "PENDING", "TIMEOUT", "OK_LAST_OVERDUE_PAYMENT", "OK_WITH_ONE_OVERDUE_PAYMENT", "OK_WITH_SEVERAL_OVERDUE_PAYMENTS", "INSUFFICIENT_FUNDS", "INSUFFICIENT_FUNDS_WITH_AUTO_TOPUP", "OK_WITH_AUTO_TOPUP", "OK_WITH_AUTO_TOPUP_PROMO", "OK_WITH_SBP_PRESELECTION", "OK_WITH_SBP_PRESELECTION_AND_FULL_PAYMENT", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SplitEvents$SplitDepositTransactionStatusShownStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SplitEvents$SplitDepositTransactionStatusShownStatus[] $VALUES;
    private final String originalValue;
    public static final SplitEvents$SplitDepositTransactionStatusShownStatus OK = new SplitEvents$SplitDepositTransactionStatusShownStatus("OK", 0, WriteBlocks.OK);
    public static final SplitEvents$SplitDepositTransactionStatusShownStatus ERROR = new SplitEvents$SplitDepositTransactionStatusShownStatus("ERROR", 1, "error");
    public static final SplitEvents$SplitDepositTransactionStatusShownStatus PENDING = new SplitEvents$SplitDepositTransactionStatusShownStatus("PENDING", 2, "pending");
    public static final SplitEvents$SplitDepositTransactionStatusShownStatus TIMEOUT = new SplitEvents$SplitDepositTransactionStatusShownStatus("TIMEOUT", 3, "timeout");
    public static final SplitEvents$SplitDepositTransactionStatusShownStatus OK_LAST_OVERDUE_PAYMENT = new SplitEvents$SplitDepositTransactionStatusShownStatus("OK_LAST_OVERDUE_PAYMENT", 4, "ok_last_overdue_payment");
    public static final SplitEvents$SplitDepositTransactionStatusShownStatus OK_WITH_ONE_OVERDUE_PAYMENT = new SplitEvents$SplitDepositTransactionStatusShownStatus("OK_WITH_ONE_OVERDUE_PAYMENT", 5, "ok_with_one_overdue_payment");
    public static final SplitEvents$SplitDepositTransactionStatusShownStatus OK_WITH_SEVERAL_OVERDUE_PAYMENTS = new SplitEvents$SplitDepositTransactionStatusShownStatus("OK_WITH_SEVERAL_OVERDUE_PAYMENTS", 6, "ok_with_several_overdue_payments");
    public static final SplitEvents$SplitDepositTransactionStatusShownStatus INSUFFICIENT_FUNDS = new SplitEvents$SplitDepositTransactionStatusShownStatus("INSUFFICIENT_FUNDS", 7, "insufficient_funds");
    public static final SplitEvents$SplitDepositTransactionStatusShownStatus INSUFFICIENT_FUNDS_WITH_AUTO_TOPUP = new SplitEvents$SplitDepositTransactionStatusShownStatus("INSUFFICIENT_FUNDS_WITH_AUTO_TOPUP", 8, "insufficient_funds_with_auto_topup");
    public static final SplitEvents$SplitDepositTransactionStatusShownStatus OK_WITH_AUTO_TOPUP = new SplitEvents$SplitDepositTransactionStatusShownStatus("OK_WITH_AUTO_TOPUP", 9, "ok_with_auto_topup");
    public static final SplitEvents$SplitDepositTransactionStatusShownStatus OK_WITH_AUTO_TOPUP_PROMO = new SplitEvents$SplitDepositTransactionStatusShownStatus("OK_WITH_AUTO_TOPUP_PROMO", 10, "ok_with_auto_topup_promo");
    public static final SplitEvents$SplitDepositTransactionStatusShownStatus OK_WITH_SBP_PRESELECTION = new SplitEvents$SplitDepositTransactionStatusShownStatus("OK_WITH_SBP_PRESELECTION", 11, "ok_with_sbp_preselection");
    public static final SplitEvents$SplitDepositTransactionStatusShownStatus OK_WITH_SBP_PRESELECTION_AND_FULL_PAYMENT = new SplitEvents$SplitDepositTransactionStatusShownStatus("OK_WITH_SBP_PRESELECTION_AND_FULL_PAYMENT", 12, "ok_with_sbp_preselection_and_full_payment");

    private static final /* synthetic */ SplitEvents$SplitDepositTransactionStatusShownStatus[] $values() {
        return new SplitEvents$SplitDepositTransactionStatusShownStatus[]{OK, ERROR, PENDING, TIMEOUT, OK_LAST_OVERDUE_PAYMENT, OK_WITH_ONE_OVERDUE_PAYMENT, OK_WITH_SEVERAL_OVERDUE_PAYMENTS, INSUFFICIENT_FUNDS, INSUFFICIENT_FUNDS_WITH_AUTO_TOPUP, OK_WITH_AUTO_TOPUP, OK_WITH_AUTO_TOPUP_PROMO, OK_WITH_SBP_PRESELECTION, OK_WITH_SBP_PRESELECTION_AND_FULL_PAYMENT};
    }

    static {
        SplitEvents$SplitDepositTransactionStatusShownStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SplitEvents$SplitDepositTransactionStatusShownStatus(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SplitEvents$SplitDepositTransactionStatusShownStatus valueOf(String str) {
        return (SplitEvents$SplitDepositTransactionStatusShownStatus) Enum.valueOf(SplitEvents$SplitDepositTransactionStatusShownStatus.class, str);
    }

    public static SplitEvents$SplitDepositTransactionStatusShownStatus[] values() {
        return (SplitEvents$SplitDepositTransactionStatusShownStatus[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
