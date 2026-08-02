package defpackage;

import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class no5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimationType.values().length];
        try {
            iArr[MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimationType.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimationType.EASE_BOTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
