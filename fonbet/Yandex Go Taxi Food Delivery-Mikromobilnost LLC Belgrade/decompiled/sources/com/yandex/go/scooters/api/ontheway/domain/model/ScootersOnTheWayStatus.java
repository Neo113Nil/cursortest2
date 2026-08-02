package com.yandex.go.scooters.api.ontheway.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/scooters/api/ontheway/domain/model/ScootersOnTheWayStatus;", "", "", ACSPConstants.STATUS, "Ljava/lang/String;", "a", "()Ljava/lang/String;", "RESERVATION", "PAID_RESERVATION", "PARKING", "RIDING", "go-client-android.features.scooters:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScootersOnTheWayStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersOnTheWayStatus[] $VALUES;
    public static final ScootersOnTheWayStatus PAID_RESERVATION;
    public static final ScootersOnTheWayStatus PARKING;
    public static final ScootersOnTheWayStatus RESERVATION;
    public static final ScootersOnTheWayStatus RIDING;
    private final String status;

    static {
        ScootersOnTheWayStatus scootersOnTheWayStatus = new ScootersOnTheWayStatus("RESERVATION", 0, "reservation");
        RESERVATION = scootersOnTheWayStatus;
        ScootersOnTheWayStatus scootersOnTheWayStatus2 = new ScootersOnTheWayStatus("PAID_RESERVATION", 1, "paid_reservation");
        PAID_RESERVATION = scootersOnTheWayStatus2;
        ScootersOnTheWayStatus scootersOnTheWayStatus3 = new ScootersOnTheWayStatus("PARKING", 2, "parking");
        PARKING = scootersOnTheWayStatus3;
        ScootersOnTheWayStatus scootersOnTheWayStatus4 = new ScootersOnTheWayStatus("RIDING", 3, "riding");
        RIDING = scootersOnTheWayStatus4;
        ScootersOnTheWayStatus[] scootersOnTheWayStatusArr = {scootersOnTheWayStatus, scootersOnTheWayStatus2, scootersOnTheWayStatus3, scootersOnTheWayStatus4};
        $VALUES = scootersOnTheWayStatusArr;
        $ENTRIES = a.a(scootersOnTheWayStatusArr);
    }

    public ScootersOnTheWayStatus(String str, int i, String str2) {
        this.status = str2;
    }

    public static ScootersOnTheWayStatus valueOf(String str) {
        return (ScootersOnTheWayStatus) Enum.valueOf(ScootersOnTheWayStatus.class, str);
    }

    public static ScootersOnTheWayStatus[] values() {
        return (ScootersOnTheWayStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getStatus() {
        return this.status;
    }
}
