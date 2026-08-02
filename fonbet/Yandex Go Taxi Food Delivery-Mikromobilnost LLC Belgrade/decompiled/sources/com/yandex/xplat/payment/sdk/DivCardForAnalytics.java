package com.yandex.xplat.payment.sdk;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCSP.tools.common.window.id.IDialogId;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/xplat/payment/sdk/DivCardForAnalytics;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "SELECT", "CVV", "BANK_SELECT", "EXIT", "SBP_LICENSE", "BANK_SEARCH_FIELD", "SBP_CHALLENGER", "BIND_CARD", "METHOD_SELECT", IDialogId.INTENT_EXTRA_OUT_RESULT, "I_PAYMENT_SCREEN", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DivCardForAnalytics {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DivCardForAnalytics[] $VALUES;
    public static final DivCardForAnalytics BANK_SEARCH_FIELD;
    public static final DivCardForAnalytics BANK_SELECT;
    public static final DivCardForAnalytics BIND_CARD;
    public static final DivCardForAnalytics CVV;
    public static final DivCardForAnalytics EXIT;
    public static final DivCardForAnalytics I_PAYMENT_SCREEN;
    public static final DivCardForAnalytics METHOD_SELECT;
    public static final DivCardForAnalytics RESULT;
    public static final DivCardForAnalytics SBP_CHALLENGER;
    public static final DivCardForAnalytics SBP_LICENSE;
    public static final DivCardForAnalytics SELECT;
    private final String value;

    static {
        DivCardForAnalytics divCardForAnalytics = new DivCardForAnalytics("SELECT", 0, "select");
        SELECT = divCardForAnalytics;
        DivCardForAnalytics divCardForAnalytics2 = new DivCardForAnalytics("CVV", 1, "cvv");
        CVV = divCardForAnalytics2;
        DivCardForAnalytics divCardForAnalytics3 = new DivCardForAnalytics("BANK_SELECT", 2, "SelectBankScreen");
        BANK_SELECT = divCardForAnalytics3;
        DivCardForAnalytics divCardForAnalytics4 = new DivCardForAnalytics("EXIT", 3, "ExitScreen");
        EXIT = divCardForAnalytics4;
        DivCardForAnalytics divCardForAnalytics5 = new DivCardForAnalytics("SBP_LICENSE", 4, "SbpLicence");
        SBP_LICENSE = divCardForAnalytics5;
        DivCardForAnalytics divCardForAnalytics6 = new DivCardForAnalytics("BANK_SEARCH_FIELD", 5, "BankSearchField");
        BANK_SEARCH_FIELD = divCardForAnalytics6;
        DivCardForAnalytics divCardForAnalytics7 = new DivCardForAnalytics("SBP_CHALLENGER", 6, "SbpChallengerScreen");
        SBP_CHALLENGER = divCardForAnalytics7;
        DivCardForAnalytics divCardForAnalytics8 = new DivCardForAnalytics("BIND_CARD", 7, "BindCard");
        BIND_CARD = divCardForAnalytics8;
        DivCardForAnalytics divCardForAnalytics9 = new DivCardForAnalytics("METHOD_SELECT", 8, "SelectMethodScreen");
        METHOD_SELECT = divCardForAnalytics9;
        DivCardForAnalytics divCardForAnalytics10 = new DivCardForAnalytics(IDialogId.INTENT_EXTRA_OUT_RESULT, 9, "ResultScreen");
        RESULT = divCardForAnalytics10;
        DivCardForAnalytics divCardForAnalytics11 = new DivCardForAnalytics("I_PAYMENT_SCREEN", 10, "IPaymentScreen");
        I_PAYMENT_SCREEN = divCardForAnalytics11;
        DivCardForAnalytics[] divCardForAnalyticsArr = {divCardForAnalytics, divCardForAnalytics2, divCardForAnalytics3, divCardForAnalytics4, divCardForAnalytics5, divCardForAnalytics6, divCardForAnalytics7, divCardForAnalytics8, divCardForAnalytics9, divCardForAnalytics10, divCardForAnalytics11};
        $VALUES = divCardForAnalyticsArr;
        $ENTRIES = a.a(divCardForAnalyticsArr);
    }

    public DivCardForAnalytics(String str, int i, String str2) {
        this.value = str2;
    }

    public static DivCardForAnalytics valueOf(String str) {
        return (DivCardForAnalytics) Enum.valueOf(DivCardForAnalytics.class, str);
    }

    public static DivCardForAnalytics[] values() {
        return (DivCardForAnalytics[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
