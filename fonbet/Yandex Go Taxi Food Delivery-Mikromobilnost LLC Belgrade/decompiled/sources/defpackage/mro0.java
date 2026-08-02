package defpackage;

import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class mro0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersErrorCode.values().length];
        try {
            iArr[ScootersErrorCode.RESOURCE_LOCKED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersErrorCode.CAR_IS_BUSY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersErrorCode.CHECK_VERIFICATION_STATUS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
