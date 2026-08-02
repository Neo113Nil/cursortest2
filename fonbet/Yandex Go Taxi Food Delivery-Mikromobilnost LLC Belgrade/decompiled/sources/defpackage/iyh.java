package defpackage;

import com.yandex.go.logistics.cargo_flow.api.DeliveryCargoFlowPlacesNavigator$PointType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class iyh {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryCargoFlowPlacesNavigator$PointType.values().length];
        try {
            iArr[DeliveryCargoFlowPlacesNavigator$PointType.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryCargoFlowPlacesNavigator$PointType.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
