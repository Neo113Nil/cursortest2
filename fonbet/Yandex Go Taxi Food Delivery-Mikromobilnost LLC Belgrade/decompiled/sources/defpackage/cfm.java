package defpackage;

import com.yandex.mobile.drive.sdk.full.SessionState;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class cfm {
    public static final /* synthetic */ int[] a;

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
    }
}
