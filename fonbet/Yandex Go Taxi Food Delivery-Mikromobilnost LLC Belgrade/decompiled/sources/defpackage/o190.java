package defpackage;

import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$AnimationType;
import ru.yandex.taxi.preorder.source.DrivingRoutes$Type;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class o190 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[DrivingRoutes$Type.values().length];
        try {
            iArr[DrivingRoutes$Type.OVERRIDE_MONOCHROME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DrivingRoutes$Type.ALTERNATIVE_MONOCHROME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DrivingRoutes$Type.SELECTED_JAMS_COLORED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DrivingRoutes$Type.NORMAL_JAMS_COLORED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DrivingRoutes$Type.NORMAL_MONOCHROME.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[MapRouteAppearance$AnimationType.values().length];
        try {
            iArr2[MapRouteAppearance$AnimationType.EASY_BOTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[MapRouteAppearance$AnimationType.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
    }
}
