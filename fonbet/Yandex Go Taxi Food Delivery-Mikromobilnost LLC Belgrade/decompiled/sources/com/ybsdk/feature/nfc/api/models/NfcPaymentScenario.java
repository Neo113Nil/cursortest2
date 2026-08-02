package com.ybsdk.feature.nfc.api.models;

import defpackage.k4o;
import defpackage.x860;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/nfc/api/models/NfcPaymentScenario;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", CA20Status.STATUS_USER_I, "getValue", "()I", "Companion", "x860", "PRODUCTS", "DASHBOARD", "SHORTCUT", "BACKGROUND", "OTHER", "USER_CARDS", "NFC_BUTTON", "feature-nfc-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NfcPaymentScenario {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NfcPaymentScenario[] $VALUES;
    public static final x860 Companion;
    private final int value;
    public static final NfcPaymentScenario PRODUCTS = new NfcPaymentScenario("PRODUCTS", 0, 0);
    public static final NfcPaymentScenario DASHBOARD = new NfcPaymentScenario("DASHBOARD", 1, 1);
    public static final NfcPaymentScenario SHORTCUT = new NfcPaymentScenario("SHORTCUT", 2, 2);
    public static final NfcPaymentScenario BACKGROUND = new NfcPaymentScenario("BACKGROUND", 3, 3);
    public static final NfcPaymentScenario OTHER = new NfcPaymentScenario("OTHER", 4, 4);
    public static final NfcPaymentScenario USER_CARDS = new NfcPaymentScenario("USER_CARDS", 5, 5);
    public static final NfcPaymentScenario NFC_BUTTON = new NfcPaymentScenario("NFC_BUTTON", 6, 6);

    private static final /* synthetic */ NfcPaymentScenario[] $values() {
        return new NfcPaymentScenario[]{PRODUCTS, DASHBOARD, SHORTCUT, BACKGROUND, OTHER, USER_CARDS, NFC_BUTTON};
    }

    static {
        NfcPaymentScenario[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new x860();
    }

    private NfcPaymentScenario(String str, int i, int i2) {
        this.value = i2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static NfcPaymentScenario valueOf(String str) {
        return (NfcPaymentScenario) Enum.valueOf(NfcPaymentScenario.class, str);
    }

    public static NfcPaymentScenario[] values() {
        return (NfcPaymentScenario[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
