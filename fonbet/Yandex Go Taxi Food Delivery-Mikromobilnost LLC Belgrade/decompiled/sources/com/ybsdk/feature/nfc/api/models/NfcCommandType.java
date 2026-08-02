package com.ybsdk.feature.nfc.api.models;

import defpackage.a860;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/nfc/api/models/NfcCommandType;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", CA20Status.STATUS_USER_I, "getValue", "()I", "Companion", "a860", "SELECT", "READ_RECORD", "GET_DATA", "VERIFY", "PERFORM_TRANSACTION", "GET_PROCESSING_OPTIONS", "GENERATE_AC", "DISCONNECT", "UNSPECIFIED", "feature-nfc-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NfcCommandType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NfcCommandType[] $VALUES;
    public static final a860 Companion;
    private final int value;
    public static final NfcCommandType SELECT = new NfcCommandType("SELECT", 0, 0);
    public static final NfcCommandType READ_RECORD = new NfcCommandType("READ_RECORD", 1, 1);
    public static final NfcCommandType GET_DATA = new NfcCommandType("GET_DATA", 2, 2);
    public static final NfcCommandType VERIFY = new NfcCommandType("VERIFY", 3, 3);
    public static final NfcCommandType PERFORM_TRANSACTION = new NfcCommandType("PERFORM_TRANSACTION", 4, 4);
    public static final NfcCommandType GET_PROCESSING_OPTIONS = new NfcCommandType("GET_PROCESSING_OPTIONS", 5, 5);
    public static final NfcCommandType GENERATE_AC = new NfcCommandType("GENERATE_AC", 6, 6);
    public static final NfcCommandType DISCONNECT = new NfcCommandType("DISCONNECT", 7, 7);
    public static final NfcCommandType UNSPECIFIED = new NfcCommandType("UNSPECIFIED", 8, 8);

    private static final /* synthetic */ NfcCommandType[] $values() {
        return new NfcCommandType[]{SELECT, READ_RECORD, GET_DATA, VERIFY, PERFORM_TRANSACTION, GET_PROCESSING_OPTIONS, GENERATE_AC, DISCONNECT, UNSPECIFIED};
    }

    static {
        NfcCommandType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new a860();
    }

    private NfcCommandType(String str, int i, int i2) {
        this.value = i2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static NfcCommandType valueOf(String str) {
        return (NfcCommandType) Enum.valueOf(NfcCommandType.class, str);
    }

    public static NfcCommandType[] values() {
        return (NfcCommandType[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
