package com.yandex.mobile.drive.sdk.full;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/mobile/drive/sdk/full/SessionState;", "", "reservationFree", "reservationPaid", "acceptanceFree", "acceptancePaid", "riding", "parking", "unrecognized", "drive_sdk_go_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SessionState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SessionState[] $VALUES;
    public static final SessionState acceptanceFree;
    public static final SessionState acceptancePaid;
    public static final SessionState parking;
    public static final SessionState reservationFree;
    public static final SessionState reservationPaid;
    public static final SessionState riding;
    public static final SessionState unrecognized;

    static {
        SessionState sessionState = new SessionState("reservationFree", 0);
        reservationFree = sessionState;
        SessionState sessionState2 = new SessionState("reservationPaid", 1);
        reservationPaid = sessionState2;
        SessionState sessionState3 = new SessionState("acceptanceFree", 2);
        acceptanceFree = sessionState3;
        SessionState sessionState4 = new SessionState("acceptancePaid", 3);
        acceptancePaid = sessionState4;
        SessionState sessionState5 = new SessionState("riding", 4);
        riding = sessionState5;
        SessionState sessionState6 = new SessionState("parking", 5);
        parking = sessionState6;
        SessionState sessionState7 = new SessionState("unrecognized", 6);
        unrecognized = sessionState7;
        SessionState[] sessionStateArr = {sessionState, sessionState2, sessionState3, sessionState4, sessionState5, sessionState6, sessionState7};
        $VALUES = sessionStateArr;
        $ENTRIES = a.a(sessionStateArr);
    }

    public static SessionState valueOf(String str) {
        return (SessionState) Enum.valueOf(SessionState.class, str);
    }

    public static SessionState[] values() {
        return (SessionState[]) $VALUES.clone();
    }
}
