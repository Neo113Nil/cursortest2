package defpackage;

import com.yandex.go.layers.api.presentation.mapkit.MapKitObjectType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class ll00 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MapKitObjectType.values().length];
        try {
            iArr[MapKitObjectType.MASS_TRANSIT_STOP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MapKitObjectType.ORGANISATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
