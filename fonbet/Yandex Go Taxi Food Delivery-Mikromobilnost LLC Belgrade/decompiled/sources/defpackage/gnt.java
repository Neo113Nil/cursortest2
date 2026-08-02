package defpackage;

import com.yandex.go.drive.api.models.GoDriveSessionState;
import com.yandex.mobile.drive.sdk.full.SessionState;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class gnt {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SessionState.values().length];
        try {
            iArr[SessionState.reservationFree.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SessionState.reservationPaid.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SessionState.acceptanceFree.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SessionState.acceptancePaid.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SessionState.riding.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SessionState.parking.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SessionState.unrecognized.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
        int[] iArr2 = new int[GoDriveSessionState.values().length];
        try {
            iArr2[GoDriveSessionState.ReservationFree.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[GoDriveSessionState.ReservationPaid.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[GoDriveSessionState.AcceptanceFree.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[GoDriveSessionState.AcceptancePaid.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[GoDriveSessionState.Riding.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[GoDriveSessionState.Parking.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[GoDriveSessionState.Unrecognized.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        b = iArr2;
    }
}
