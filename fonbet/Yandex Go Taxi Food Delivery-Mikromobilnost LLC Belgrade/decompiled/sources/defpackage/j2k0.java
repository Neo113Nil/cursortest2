package defpackage;

import ru.yandex.taxi.object.DriveState;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class j2k0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DriveState.values().length];
        try {
            iArr[DriveState.WAITING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DriveState.DRIVING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
