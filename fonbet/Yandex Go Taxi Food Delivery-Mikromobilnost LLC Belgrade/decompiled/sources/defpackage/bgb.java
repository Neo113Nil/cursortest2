package defpackage;

import ru.yandex.taxi.checkin.CheckInStateActionType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class bgb {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CheckInStateActionType.values().length];
        try {
            iArr[CheckInStateActionType.BUTTON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CheckInStateActionType.SLIDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CheckInStateActionType.QR_CODE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
