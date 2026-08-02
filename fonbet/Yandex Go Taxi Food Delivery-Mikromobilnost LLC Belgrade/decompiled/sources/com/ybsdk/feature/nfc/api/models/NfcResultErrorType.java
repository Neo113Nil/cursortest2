package com.ybsdk.feature.nfc.api.models;

import defpackage.i960;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/nfc/api/models/NfcResultErrorType;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", CA20Status.STATUS_USER_I, "getValue", "()I", "Companion", "i960", "CARDHOLDER_VERIFICATION_REQUIRED", "NO_CARD_ERROR", "NO_TUKS_ERROR", "PERMANENT_ERROR", "TEMP_ERROR", "DISCONNECT_LINK_LOSS", "DISCONNECT_DESELECTED", "NO_PIN_ERROR", "SECURITY_ERROR", "UNKNOWN", "feature-nfc-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NfcResultErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NfcResultErrorType[] $VALUES;
    public static final i960 Companion;
    private final int value;
    public static final NfcResultErrorType CARDHOLDER_VERIFICATION_REQUIRED = new NfcResultErrorType("CARDHOLDER_VERIFICATION_REQUIRED", 0, 0);
    public static final NfcResultErrorType NO_CARD_ERROR = new NfcResultErrorType("NO_CARD_ERROR", 1, 1);
    public static final NfcResultErrorType NO_TUKS_ERROR = new NfcResultErrorType("NO_TUKS_ERROR", 2, 2);
    public static final NfcResultErrorType PERMANENT_ERROR = new NfcResultErrorType("PERMANENT_ERROR", 3, 3);
    public static final NfcResultErrorType TEMP_ERROR = new NfcResultErrorType("TEMP_ERROR", 4, 4);
    public static final NfcResultErrorType DISCONNECT_LINK_LOSS = new NfcResultErrorType("DISCONNECT_LINK_LOSS", 5, 5);
    public static final NfcResultErrorType DISCONNECT_DESELECTED = new NfcResultErrorType("DISCONNECT_DESELECTED", 6, 6);
    public static final NfcResultErrorType NO_PIN_ERROR = new NfcResultErrorType("NO_PIN_ERROR", 7, 7);
    public static final NfcResultErrorType SECURITY_ERROR = new NfcResultErrorType("SECURITY_ERROR", 8, 8);
    public static final NfcResultErrorType UNKNOWN = new NfcResultErrorType("UNKNOWN", 9, 9);

    private static final /* synthetic */ NfcResultErrorType[] $values() {
        return new NfcResultErrorType[]{CARDHOLDER_VERIFICATION_REQUIRED, NO_CARD_ERROR, NO_TUKS_ERROR, PERMANENT_ERROR, TEMP_ERROR, DISCONNECT_LINK_LOSS, DISCONNECT_DESELECTED, NO_PIN_ERROR, SECURITY_ERROR, UNKNOWN};
    }

    static {
        NfcResultErrorType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new i960();
    }

    private NfcResultErrorType(String str, int i, int i2) {
        this.value = i2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static NfcResultErrorType valueOf(String str) {
        return (NfcResultErrorType) Enum.valueOf(NfcResultErrorType.class, str);
    }

    public static NfcResultErrorType[] values() {
        return (NfcResultErrorType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
