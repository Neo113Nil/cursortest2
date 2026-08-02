package defpackage;

import com.yandex.go.superapp.discovery.map.api.SuperAppDiscoveryMapLayer;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class dvv0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuperAppDiscoveryMapLayer.values().length];
        try {
            iArr[SuperAppDiscoveryMapLayer.PLACES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuperAppDiscoveryMapLayer.TRANSPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SuperAppDiscoveryMapLayer.SCOOTERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SuperAppDiscoveryMapLayer.TAXI.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SuperAppDiscoveryMapLayer.CHARGERS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
