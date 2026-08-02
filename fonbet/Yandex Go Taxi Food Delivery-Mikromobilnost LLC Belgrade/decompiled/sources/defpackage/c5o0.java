package defpackage;

import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class c5o0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersErrorCode.values().length];
        try {
            iArr[ScootersErrorCode.INCORRECT_SCOOTER_POSITION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersErrorCode.DEPOSIT_FAILS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersErrorCode.BIKE_WHEEL_IS_NOT_LOCKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScootersErrorCode.FAILURE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ScootersErrorCode.TIMEOUT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ScootersErrorCode.CONNECTION_NOT_FOUND.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ScootersErrorCode.INTERNAL_ERROR.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
