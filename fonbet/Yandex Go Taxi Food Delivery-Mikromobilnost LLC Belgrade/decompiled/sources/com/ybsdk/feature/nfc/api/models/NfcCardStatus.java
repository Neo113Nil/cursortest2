package com.ybsdk.feature.nfc.api.models;

import com.samsung.android.sdk.samsungpay.v2.card.Card;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/nfc/api/models/NfcCardStatus;", "", "<init>", "(Ljava/lang/String;I)V", "FROZEN", Card.ACTIVE, "DELETED", "BLOCKED", "REISSUE", "UNKNOWN", "feature-nfc-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NfcCardStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NfcCardStatus[] $VALUES;
    public static final NfcCardStatus FROZEN = new NfcCardStatus("FROZEN", 0);
    public static final NfcCardStatus ACTIVE = new NfcCardStatus(Card.ACTIVE, 1);
    public static final NfcCardStatus DELETED = new NfcCardStatus("DELETED", 2);
    public static final NfcCardStatus BLOCKED = new NfcCardStatus("BLOCKED", 3);
    public static final NfcCardStatus REISSUE = new NfcCardStatus("REISSUE", 4);
    public static final NfcCardStatus UNKNOWN = new NfcCardStatus("UNKNOWN", 5);

    private static final /* synthetic */ NfcCardStatus[] $values() {
        return new NfcCardStatus[]{FROZEN, ACTIVE, DELETED, BLOCKED, REISSUE, UNKNOWN};
    }

    static {
        NfcCardStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private NfcCardStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static NfcCardStatus valueOf(String str) {
        return (NfcCardStatus) Enum.valueOf(NfcCardStatus.class, str);
    }

    public static NfcCardStatus[] values() {
        return (NfcCardStatus[]) $VALUES.clone();
    }
}
