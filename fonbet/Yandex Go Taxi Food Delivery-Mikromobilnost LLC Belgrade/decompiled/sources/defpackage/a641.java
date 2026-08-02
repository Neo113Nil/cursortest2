package defpackage;

import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class a641 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DriveState.values().length];
        try {
            iArr[DriveState.CHECK_IN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DriveState.DRIVING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DriveState.WAITING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DriveState.TRANSPORTING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
