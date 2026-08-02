package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/TransferEvents$TransferLoadedPrerequisites", "", "Lcom/ybsdk/core/analytics/generated/delegates/TransferEvents$TransferLoadedPrerequisites;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "SELF_TRANSFER", "PHONE_TRANSFER", "SELF_TOPUP", "REQUISITES_LEGAL", "REQUISITES_HCS", "MOBILE_PAYMENT", "INTERNET_PAYMENT", "ME2ME_TOPUP", "AFT_TOPUP", "SBP_C2G_PAYLOAD", "INVOICE_HCS_PAYLOAD", "COMMON_TOPUP_PAYLOAD", "B2C_TRANSFER_PAYLOAD", "FUND_TOPUP", "FUND_TRANSFER", "MKK_CASHOUT_PAYLOAD", "CROSS_BORDER", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferEvents$TransferLoadedPrerequisites {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferEvents$TransferLoadedPrerequisites[] $VALUES;
    private final String originalValue;
    public static final TransferEvents$TransferLoadedPrerequisites SELF_TRANSFER = new TransferEvents$TransferLoadedPrerequisites("SELF_TRANSFER", 0, "self_transfer");
    public static final TransferEvents$TransferLoadedPrerequisites PHONE_TRANSFER = new TransferEvents$TransferLoadedPrerequisites("PHONE_TRANSFER", 1, "phone_transfer");
    public static final TransferEvents$TransferLoadedPrerequisites SELF_TOPUP = new TransferEvents$TransferLoadedPrerequisites("SELF_TOPUP", 2, "self_topup");
    public static final TransferEvents$TransferLoadedPrerequisites REQUISITES_LEGAL = new TransferEvents$TransferLoadedPrerequisites("REQUISITES_LEGAL", 3, "requisites_legal");
    public static final TransferEvents$TransferLoadedPrerequisites REQUISITES_HCS = new TransferEvents$TransferLoadedPrerequisites("REQUISITES_HCS", 4, "requisites_hcs");
    public static final TransferEvents$TransferLoadedPrerequisites MOBILE_PAYMENT = new TransferEvents$TransferLoadedPrerequisites("MOBILE_PAYMENT", 5, "mobile_payment");
    public static final TransferEvents$TransferLoadedPrerequisites INTERNET_PAYMENT = new TransferEvents$TransferLoadedPrerequisites("INTERNET_PAYMENT", 6, "internet_payment");
    public static final TransferEvents$TransferLoadedPrerequisites ME2ME_TOPUP = new TransferEvents$TransferLoadedPrerequisites("ME2ME_TOPUP", 7, "me2me_topup");
    public static final TransferEvents$TransferLoadedPrerequisites AFT_TOPUP = new TransferEvents$TransferLoadedPrerequisites("AFT_TOPUP", 8, "aft_topup");
    public static final TransferEvents$TransferLoadedPrerequisites SBP_C2G_PAYLOAD = new TransferEvents$TransferLoadedPrerequisites("SBP_C2G_PAYLOAD", 9, "sbp_c2g_payload");
    public static final TransferEvents$TransferLoadedPrerequisites INVOICE_HCS_PAYLOAD = new TransferEvents$TransferLoadedPrerequisites("INVOICE_HCS_PAYLOAD", 10, "invoice_hcs_payload");
    public static final TransferEvents$TransferLoadedPrerequisites COMMON_TOPUP_PAYLOAD = new TransferEvents$TransferLoadedPrerequisites("COMMON_TOPUP_PAYLOAD", 11, "common_topup_payload");
    public static final TransferEvents$TransferLoadedPrerequisites B2C_TRANSFER_PAYLOAD = new TransferEvents$TransferLoadedPrerequisites("B2C_TRANSFER_PAYLOAD", 12, "b2c_transfer_payload");
    public static final TransferEvents$TransferLoadedPrerequisites FUND_TOPUP = new TransferEvents$TransferLoadedPrerequisites("FUND_TOPUP", 13, "fund_topup");
    public static final TransferEvents$TransferLoadedPrerequisites FUND_TRANSFER = new TransferEvents$TransferLoadedPrerequisites("FUND_TRANSFER", 14, "fund_transfer");
    public static final TransferEvents$TransferLoadedPrerequisites MKK_CASHOUT_PAYLOAD = new TransferEvents$TransferLoadedPrerequisites("MKK_CASHOUT_PAYLOAD", 15, "mkk_cashout_payload");
    public static final TransferEvents$TransferLoadedPrerequisites CROSS_BORDER = new TransferEvents$TransferLoadedPrerequisites("CROSS_BORDER", 16, "cross_border");

    private static final /* synthetic */ TransferEvents$TransferLoadedPrerequisites[] $values() {
        return new TransferEvents$TransferLoadedPrerequisites[]{SELF_TRANSFER, PHONE_TRANSFER, SELF_TOPUP, REQUISITES_LEGAL, REQUISITES_HCS, MOBILE_PAYMENT, INTERNET_PAYMENT, ME2ME_TOPUP, AFT_TOPUP, SBP_C2G_PAYLOAD, INVOICE_HCS_PAYLOAD, COMMON_TOPUP_PAYLOAD, B2C_TRANSFER_PAYLOAD, FUND_TOPUP, FUND_TRANSFER, MKK_CASHOUT_PAYLOAD, CROSS_BORDER};
    }

    static {
        TransferEvents$TransferLoadedPrerequisites[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransferEvents$TransferLoadedPrerequisites(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferEvents$TransferLoadedPrerequisites valueOf(String str) {
        return (TransferEvents$TransferLoadedPrerequisites) Enum.valueOf(TransferEvents$TransferLoadedPrerequisites.class, str);
    }

    public static TransferEvents$TransferLoadedPrerequisites[] values() {
        return (TransferEvents$TransferLoadedPrerequisites[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
