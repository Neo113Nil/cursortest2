package defpackage;

import ru.yandex.taxi.preorder.source.points.RouteOverlayPlacemarkImageProvider$PlacemarkPointType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class p6l0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RouteOverlayPlacemarkImageProvider$PlacemarkPointType.values().length];
        try {
            iArr[RouteOverlayPlacemarkImageProvider$PlacemarkPointType.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RouteOverlayPlacemarkImageProvider$PlacemarkPointType.MIDDLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[RouteOverlayPlacemarkImageProvider$PlacemarkPointType.DESTINATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
