package defpackage;

import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class n880 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DriveState.values().length];
        try {
            iArr[DriveState.DRIVING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DriveState.WAITING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DriveState.TRANSPORTING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DriveState.SEARCH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DriveState.SCHEDULING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DriveState.SCHEDULED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DriveState.CHECK_IN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[DriveState.COMPLETE.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
    }
}
