package defpackage;

import com.yandex.go.taxi.order.models.api.response.CheckInActionType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class gc8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CheckInActionType.values().length];
        try {
            iArr[CheckInActionType.QR_CODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CheckInActionType.SLIDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[CheckInActionType.BUTTON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
