package com.yandex.xplat.payment.sdk;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/xplat/payment/sdk/PsdkScreen;", "", "", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "BIND", "DK_BIND", "SELECT", "DK_SELECT", "PRESELECT", "DK_PRESELECT", "SELECT_BANK", "DK_SELECT_BANK", "LEGAL_AGREEMENT", "DK_LEGAL_AGREEMENT", "CVV", "WEBVIEW", "SMS_CHALLENGE", "DK_SMS_CHALLENGE", "RANDOM_AMT_CHALLENGE", "DK_RANDOM_AMT_CHALLENGE", "xplat-payment-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PsdkScreen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PsdkScreen[] $VALUES;
    public static final PsdkScreen BIND;
    public static final PsdkScreen CVV;
    public static final PsdkScreen DK_BIND;
    public static final PsdkScreen DK_LEGAL_AGREEMENT;
    public static final PsdkScreen DK_PRESELECT;
    public static final PsdkScreen DK_RANDOM_AMT_CHALLENGE;
    public static final PsdkScreen DK_SELECT;
    public static final PsdkScreen DK_SELECT_BANK;
    public static final PsdkScreen DK_SMS_CHALLENGE;
    public static final PsdkScreen LEGAL_AGREEMENT;
    public static final PsdkScreen PRESELECT;
    public static final PsdkScreen RANDOM_AMT_CHALLENGE;
    public static final PsdkScreen SELECT;
    public static final PsdkScreen SELECT_BANK;
    public static final PsdkScreen SMS_CHALLENGE;
    public static final PsdkScreen WEBVIEW;
    private final String value;

    static {
        PsdkScreen psdkScreen = new PsdkScreen("BIND", 0, "bind");
        BIND = psdkScreen;
        PsdkScreen psdkScreen2 = new PsdkScreen("DK_BIND", 1, "dk_bind");
        DK_BIND = psdkScreen2;
        PsdkScreen psdkScreen3 = new PsdkScreen("SELECT", 2, "select");
        SELECT = psdkScreen3;
        PsdkScreen psdkScreen4 = new PsdkScreen("DK_SELECT", 3, "dk_select");
        DK_SELECT = psdkScreen4;
        PsdkScreen psdkScreen5 = new PsdkScreen("PRESELECT", 4, "preselect");
        PRESELECT = psdkScreen5;
        PsdkScreen psdkScreen6 = new PsdkScreen("DK_PRESELECT", 5, "dk_preselect");
        DK_PRESELECT = psdkScreen6;
        PsdkScreen psdkScreen7 = new PsdkScreen("SELECT_BANK", 6, "select_bank");
        SELECT_BANK = psdkScreen7;
        PsdkScreen psdkScreen8 = new PsdkScreen("DK_SELECT_BANK", 7, "dk_select_bank");
        DK_SELECT_BANK = psdkScreen8;
        PsdkScreen psdkScreen9 = new PsdkScreen("LEGAL_AGREEMENT", 8, "legal_agreement");
        LEGAL_AGREEMENT = psdkScreen9;
        PsdkScreen psdkScreen10 = new PsdkScreen("DK_LEGAL_AGREEMENT", 9, "dk_legal_agreement");
        DK_LEGAL_AGREEMENT = psdkScreen10;
        PsdkScreen psdkScreen11 = new PsdkScreen("CVV", 10, "cvv");
        CVV = psdkScreen11;
        PsdkScreen psdkScreen12 = new PsdkScreen("WEBVIEW", 11, "webview");
        WEBVIEW = psdkScreen12;
        PsdkScreen psdkScreen13 = new PsdkScreen("SMS_CHALLENGE", 12, "sms_challenge");
        SMS_CHALLENGE = psdkScreen13;
        PsdkScreen psdkScreen14 = new PsdkScreen("DK_SMS_CHALLENGE", 13, "dk_sms_challenge");
        DK_SMS_CHALLENGE = psdkScreen14;
        PsdkScreen psdkScreen15 = new PsdkScreen("RANDOM_AMT_CHALLENGE", 14, "random_amt_challenge");
        RANDOM_AMT_CHALLENGE = psdkScreen15;
        PsdkScreen psdkScreen16 = new PsdkScreen("DK_RANDOM_AMT_CHALLENGE", 15, "dk_random_amt_challenge");
        DK_RANDOM_AMT_CHALLENGE = psdkScreen16;
        PsdkScreen[] psdkScreenArr = {psdkScreen, psdkScreen2, psdkScreen3, psdkScreen4, psdkScreen5, psdkScreen6, psdkScreen7, psdkScreen8, psdkScreen9, psdkScreen10, psdkScreen11, psdkScreen12, psdkScreen13, psdkScreen14, psdkScreen15, psdkScreen16};
        $VALUES = psdkScreenArr;
        $ENTRIES = a.a(psdkScreenArr);
    }

    public PsdkScreen(String str, int i, String str2) {
        this.value = str2;
    }

    public static PsdkScreen valueOf(String str) {
        return (PsdkScreen) Enum.valueOf(PsdkScreen.class, str);
    }

    public static PsdkScreen[] values() {
        return (PsdkScreen[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
