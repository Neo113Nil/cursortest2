package defpackage;

import com.yandex.go.places.models.domain.entities.PlacesMapOwner;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class iio {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PlacesMapOwner.values().length];
        try {
            iArr[PlacesMapOwner.SUPER_APP_DISCOVERY_MAP_FEATURE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PlacesMapOwner.PLACES_FEATURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
