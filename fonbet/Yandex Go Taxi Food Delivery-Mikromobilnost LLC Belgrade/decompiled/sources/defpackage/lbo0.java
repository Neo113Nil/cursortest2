package defpackage;

import com.yandex.go.scooters.parking.api.ParkingButtonAction;
import com.yandex.go.scooters.parking.api.ParkingCardOpenReason;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class lbo0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ParkingCardOpenReason.values().length];
        try {
            iArr[ParkingCardOpenReason.OFFER_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ParkingCardOpenReason.MAP_ON_ORDER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ParkingCardOpenReason.MAP_ON_PREORDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ParkingCardOpenReason.CAMERA_ON_COMPLETION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[ParkingButtonAction.values().length];
        try {
            iArr2[ParkingButtonAction.BUILD_ROUTE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ParkingButtonAction.DONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
