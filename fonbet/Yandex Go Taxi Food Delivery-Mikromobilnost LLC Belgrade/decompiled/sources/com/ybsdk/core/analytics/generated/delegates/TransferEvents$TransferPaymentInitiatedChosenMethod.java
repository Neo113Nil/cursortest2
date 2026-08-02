package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/TransferEvents$TransferPaymentInitiatedChosenMethod", "", "Lcom/ybsdk/core/analytics/generated/delegates/TransferEvents$TransferPaymentInitiatedChosenMethod;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "PHONE", "CARD_OR_ACCOUNT", "SELF_TRANSFER", "REQUISITES_PERSON", "REQUISITES_LEGAL", "REQUISITES_HCS", "SELF_TOPUP", "ME2ME_TOPUP", "AFT_TOPUP", "B2C_TRANSFER", "CROSS_BORDER", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransferEvents$TransferPaymentInitiatedChosenMethod {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransferEvents$TransferPaymentInitiatedChosenMethod[] $VALUES;
    private final String originalValue;
    public static final TransferEvents$TransferPaymentInitiatedChosenMethod PHONE = new TransferEvents$TransferPaymentInitiatedChosenMethod("PHONE", 0, "phone");
    public static final TransferEvents$TransferPaymentInitiatedChosenMethod CARD_OR_ACCOUNT = new TransferEvents$TransferPaymentInitiatedChosenMethod("CARD_OR_ACCOUNT", 1, "card_or_account");
    public static final TransferEvents$TransferPaymentInitiatedChosenMethod SELF_TRANSFER = new TransferEvents$TransferPaymentInitiatedChosenMethod("SELF_TRANSFER", 2, "self_transfer");
    public static final TransferEvents$TransferPaymentInitiatedChosenMethod REQUISITES_PERSON = new TransferEvents$TransferPaymentInitiatedChosenMethod("REQUISITES_PERSON", 3, "requisites_person");
    public static final TransferEvents$TransferPaymentInitiatedChosenMethod REQUISITES_LEGAL = new TransferEvents$TransferPaymentInitiatedChosenMethod("REQUISITES_LEGAL", 4, "requisites_legal");
    public static final TransferEvents$TransferPaymentInitiatedChosenMethod REQUISITES_HCS = new TransferEvents$TransferPaymentInitiatedChosenMethod("REQUISITES_HCS", 5, "requisites_hcs");
    public static final TransferEvents$TransferPaymentInitiatedChosenMethod SELF_TOPUP = new TransferEvents$TransferPaymentInitiatedChosenMethod("SELF_TOPUP", 6, "self_topup");
    public static final TransferEvents$TransferPaymentInitiatedChosenMethod ME2ME_TOPUP = new TransferEvents$TransferPaymentInitiatedChosenMethod("ME2ME_TOPUP", 7, "me2me_topup");
    public static final TransferEvents$TransferPaymentInitiatedChosenMethod AFT_TOPUP = new TransferEvents$TransferPaymentInitiatedChosenMethod("AFT_TOPUP", 8, "aft_topup");
    public static final TransferEvents$TransferPaymentInitiatedChosenMethod B2C_TRANSFER = new TransferEvents$TransferPaymentInitiatedChosenMethod("B2C_TRANSFER", 9, "b2c_transfer");
    public static final TransferEvents$TransferPaymentInitiatedChosenMethod CROSS_BORDER = new TransferEvents$TransferPaymentInitiatedChosenMethod("CROSS_BORDER", 10, "cross_border");

    private static final /* synthetic */ TransferEvents$TransferPaymentInitiatedChosenMethod[] $values() {
        return new TransferEvents$TransferPaymentInitiatedChosenMethod[]{PHONE, CARD_OR_ACCOUNT, SELF_TRANSFER, REQUISITES_PERSON, REQUISITES_LEGAL, REQUISITES_HCS, SELF_TOPUP, ME2ME_TOPUP, AFT_TOPUP, B2C_TRANSFER, CROSS_BORDER};
    }

    static {
        TransferEvents$TransferPaymentInitiatedChosenMethod[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private TransferEvents$TransferPaymentInitiatedChosenMethod(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransferEvents$TransferPaymentInitiatedChosenMethod valueOf(String str) {
        return (TransferEvents$TransferPaymentInitiatedChosenMethod) Enum.valueOf(TransferEvents$TransferPaymentInitiatedChosenMethod.class, str);
    }

    public static TransferEvents$TransferPaymentInitiatedChosenMethod[] values() {
        return (TransferEvents$TransferPaymentInitiatedChosenMethod[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
