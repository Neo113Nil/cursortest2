package defpackage;

import com.yandex.go.scooters.passes.model.PassType;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class o2n0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ScootersErrorCode.values().length];
        try {
            iArr[ScootersErrorCode.INVALID_PAYMENT_METHOD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersErrorCode.CHECK_VERIFICATION_STATUS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersErrorCode.PHOTO_VERIFICATION_REQUIRED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScootersErrorCode.PHOTO_VERIFICATION_WITH_PASSPORT_REQUIRED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[PassType.values().length];
        try {
            iArr2[PassType.PACKAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PassType.SUPER_PASS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
