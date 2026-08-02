package defpackage;

import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class oon0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersErrorCode.values().length];
        try {
            iArr[ScootersErrorCode.SCOOTER_IS_NOT_IN_FIX_FINISH_AREA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
