package defpackage;

import com.yandex.go.navigator.order.NavigationOrder$NavigationType;
import com.yandex.go.scooters.api.domain.model.ScootersVehicleType;
import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Status;
import com.yandex.go.superapp.tracking.api.domain.models.TrackingCardStatus$Image$Clipping;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class fhw0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[ScootersVehicleType.values().length];
        try {
            iArr[ScootersVehicleType.SCOOTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersVehicleType.BIKE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[NavigationOrder$NavigationType.values().length];
        try {
            iArr2[NavigationOrder$NavigationType.AUTO.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[NavigationOrder$NavigationType.WALKING.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[LogisticsOrderTracking$Status.values().length];
        try {
            iArr3[LogisticsOrderTracking$Status.Stub.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[LogisticsOrderTracking$Status.Active.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[LogisticsOrderTracking$Status.Cancelling.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[LogisticsOrderTracking$Status.Completed.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
        int[] iArr4 = new int[TrackingCardStatus$Image$Clipping.values().length];
        try {
            iArr4[TrackingCardStatus$Image$Clipping.RoundedSquare.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[TrackingCardStatus$Image$Clipping.Circle.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        d = iArr4;
    }
}
