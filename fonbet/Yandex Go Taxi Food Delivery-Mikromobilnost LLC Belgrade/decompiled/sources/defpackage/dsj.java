package defpackage;

import com.yandex.go.places.models.domain.entities.DeliveryRoutePointType;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class dsj {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DeliveryRoutePointType.values().length];
        try {
            iArr[DeliveryRoutePointType.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DeliveryRoutePointType.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
