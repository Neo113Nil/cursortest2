package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/TransferEvents$TransferInitiatedPrerequisites", "", "Lcom/ybsdk/core/analytics/generated/delegates/TransferEvents$TransferInitiatedPrerequisites;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "SELF_TRANSFER", "SELF_TOPUP", "COMMON_TOPUP", "B2C_TRANSFER", "PHONE_TRANSFER", "REQUISITES_LEGAL", "REQUISITES_HCS", "MOBILE_PAYMENT", "INTERNET_PAYMENT", "SBP_C2G_PAYMENT", "INVOICE_HCS_PAYMENT", "CROSS_BORDER", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferEvents$TransferInitiatedPrerequisites {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferEvents$TransferInitiatedPrerequisites[] $VALUES;
    private final String originalValue;
    public static final TransferEvents$TransferInitiatedPrerequisites SELF_TRANSFER = new TransferEvents$TransferInitiatedPrerequisites("SELF_TRANSFER", 0, "self_transfer");
    public static final TransferEvents$TransferInitiatedPrerequisites SELF_TOPUP = new TransferEvents$TransferInitiatedPrerequisites("SELF_TOPUP", 1, "self_topup");
    public static final TransferEvents$TransferInitiatedPrerequisites COMMON_TOPUP = new TransferEvents$TransferInitiatedPrerequisites("COMMON_TOPUP", 2, "common_topup");
    public static final TransferEvents$TransferInitiatedPrerequisites B2C_TRANSFER = new TransferEvents$TransferInitiatedPrerequisites("B2C_TRANSFER", 3, "b2c_transfer");
    public static final TransferEvents$TransferInitiatedPrerequisites PHONE_TRANSFER = new TransferEvents$TransferInitiatedPrerequisites("PHONE_TRANSFER", 4, "phone_transfer");
    public static final TransferEvents$TransferInitiatedPrerequisites REQUISITES_LEGAL = new TransferEvents$TransferInitiatedPrerequisites("REQUISITES_LEGAL", 5, "requisites_legal");
    public static final TransferEvents$TransferInitiatedPrerequisites REQUISITES_HCS = new TransferEvents$TransferInitiatedPrerequisites("REQUISITES_HCS", 6, "requisites_hcs");
    public static final TransferEvents$TransferInitiatedPrerequisites MOBILE_PAYMENT = new TransferEvents$TransferInitiatedPrerequisites("MOBILE_PAYMENT", 7, "mobile_payment");
    public static final TransferEvents$TransferInitiatedPrerequisites INTERNET_PAYMENT = new TransferEvents$TransferInitiatedPrerequisites("INTERNET_PAYMENT", 8, "internet_payment");
    public static final TransferEvents$TransferInitiatedPrerequisites SBP_C2G_PAYMENT = new TransferEvents$TransferInitiatedPrerequisites("SBP_C2G_PAYMENT", 9, "sbp_c2g_payment");
    public static final TransferEvents$TransferInitiatedPrerequisites INVOICE_HCS_PAYMENT = new TransferEvents$TransferInitiatedPrerequisites("INVOICE_HCS_PAYMENT", 10, "invoice_hcs_payment");
    public static final TransferEvents$TransferInitiatedPrerequisites CROSS_BORDER = new TransferEvents$TransferInitiatedPrerequisites("CROSS_BORDER", 11, "cross_border");

    private static final /* synthetic */ TransferEvents$TransferInitiatedPrerequisites[] $values() {
        return new TransferEvents$TransferInitiatedPrerequisites[]{SELF_TRANSFER, SELF_TOPUP, COMMON_TOPUP, B2C_TRANSFER, PHONE_TRANSFER, REQUISITES_LEGAL, REQUISITES_HCS, MOBILE_PAYMENT, INTERNET_PAYMENT, SBP_C2G_PAYMENT, INVOICE_HCS_PAYMENT, CROSS_BORDER};
    }

    static {
        TransferEvents$TransferInitiatedPrerequisites[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransferEvents$TransferInitiatedPrerequisites(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferEvents$TransferInitiatedPrerequisites valueOf(String str) {
        return (TransferEvents$TransferInitiatedPrerequisites) Enum.valueOf(TransferEvents$TransferInitiatedPrerequisites.class, str);
    }

    public static TransferEvents$TransferInitiatedPrerequisites[] values() {
        return (TransferEvents$TransferInitiatedPrerequisites[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
