package com.yandex.go.scooters.qr.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/scooters/qr/domain/model/ScootersAvailabilityCheckOpenReason;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "QR", "ENTERED_MANUALLY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ScootersAvailabilityCheckOpenReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersAvailabilityCheckOpenReason[] $VALUES;
    public static final ScootersAvailabilityCheckOpenReason ENTERED_MANUALLY;
    public static final ScootersAvailabilityCheckOpenReason QR;
    private final String value;

    static {
        ScootersAvailabilityCheckOpenReason scootersAvailabilityCheckOpenReason = new ScootersAvailabilityCheckOpenReason("QR", 0, "qr");
        QR = scootersAvailabilityCheckOpenReason;
        ScootersAvailabilityCheckOpenReason scootersAvailabilityCheckOpenReason2 = new ScootersAvailabilityCheckOpenReason("ENTERED_MANUALLY", 1, "entered_manually");
        ENTERED_MANUALLY = scootersAvailabilityCheckOpenReason2;
        ScootersAvailabilityCheckOpenReason[] scootersAvailabilityCheckOpenReasonArr = {scootersAvailabilityCheckOpenReason, scootersAvailabilityCheckOpenReason2};
        $VALUES = scootersAvailabilityCheckOpenReasonArr;
        $ENTRIES = a.a(scootersAvailabilityCheckOpenReasonArr);
    }

    public ScootersAvailabilityCheckOpenReason(String str, int i, String str2) {
        this.value = str2;
    }

    public static ScootersAvailabilityCheckOpenReason valueOf(String str) {
        return (ScootersAvailabilityCheckOpenReason) Enum.valueOf(ScootersAvailabilityCheckOpenReason.class, str);
    }

    public static ScootersAvailabilityCheckOpenReason[] values() {
        return (ScootersAvailabilityCheckOpenReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
