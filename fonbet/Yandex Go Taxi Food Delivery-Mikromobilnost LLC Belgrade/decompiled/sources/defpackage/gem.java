package defpackage;

import com.yandex.go.drive.api.models.GoDriveSessionState;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class gem {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GoDriveSessionState.values().length];
        try {
            iArr[GoDriveSessionState.ReservationFree.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GoDriveSessionState.ReservationPaid.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GoDriveSessionState.AcceptanceFree.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GoDriveSessionState.AcceptancePaid.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[GoDriveSessionState.Unrecognized.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[GoDriveSessionState.Parking.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[GoDriveSessionState.Riding.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
