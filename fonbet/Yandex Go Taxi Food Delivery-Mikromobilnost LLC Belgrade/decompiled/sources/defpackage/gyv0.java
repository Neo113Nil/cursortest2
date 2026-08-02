package defpackage;

import com.yandex.go.superapp.discovery.map.impl.data.entities.network.SuperAppDiscoveryMapLayerDto;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class gyv0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SuperAppDiscoveryMapLayerDto.values().length];
        try {
            iArr[SuperAppDiscoveryMapLayerDto.PLACES.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SuperAppDiscoveryMapLayerDto.TRANSPORT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SuperAppDiscoveryMapLayerDto.SCOOTERS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SuperAppDiscoveryMapLayerDto.TAXI.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SuperAppDiscoveryMapLayerDto.CHARGERS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
