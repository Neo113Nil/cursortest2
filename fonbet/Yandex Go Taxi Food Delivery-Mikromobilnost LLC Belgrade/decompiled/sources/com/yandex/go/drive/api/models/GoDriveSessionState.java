package com.yandex.go.drive.api.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/drive/api/models/GoDriveSessionState;", "", "ReservationFree", "ReservationPaid", "AcceptanceFree", "AcceptancePaid", "Riding", "Parking", "Unrecognized", "go-client-android.features.drive:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GoDriveSessionState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GoDriveSessionState[] $VALUES;
    public static final GoDriveSessionState AcceptanceFree;
    public static final GoDriveSessionState AcceptancePaid;
    public static final GoDriveSessionState Parking;
    public static final GoDriveSessionState ReservationFree;
    public static final GoDriveSessionState ReservationPaid;
    public static final GoDriveSessionState Riding;
    public static final GoDriveSessionState Unrecognized;

    static {
        GoDriveSessionState goDriveSessionState = new GoDriveSessionState("ReservationFree", 0);
        ReservationFree = goDriveSessionState;
        GoDriveSessionState goDriveSessionState2 = new GoDriveSessionState("ReservationPaid", 1);
        ReservationPaid = goDriveSessionState2;
        GoDriveSessionState goDriveSessionState3 = new GoDriveSessionState("AcceptanceFree", 2);
        AcceptanceFree = goDriveSessionState3;
        GoDriveSessionState goDriveSessionState4 = new GoDriveSessionState("AcceptancePaid", 3);
        AcceptancePaid = goDriveSessionState4;
        GoDriveSessionState goDriveSessionState5 = new GoDriveSessionState("Riding", 4);
        Riding = goDriveSessionState5;
        GoDriveSessionState goDriveSessionState6 = new GoDriveSessionState("Parking", 5);
        Parking = goDriveSessionState6;
        GoDriveSessionState goDriveSessionState7 = new GoDriveSessionState("Unrecognized", 6);
        Unrecognized = goDriveSessionState7;
        GoDriveSessionState[] goDriveSessionStateArr = {goDriveSessionState, goDriveSessionState2, goDriveSessionState3, goDriveSessionState4, goDriveSessionState5, goDriveSessionState6, goDriveSessionState7};
        $VALUES = goDriveSessionStateArr;
        $ENTRIES = a.a(goDriveSessionStateArr);
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static GoDriveSessionState valueOf(String str) {
        return (GoDriveSessionState) Enum.valueOf(GoDriveSessionState.class, str);
    }

    public static GoDriveSessionState[] values() {
        return (GoDriveSessionState[]) $VALUES.clone();
    }
}
