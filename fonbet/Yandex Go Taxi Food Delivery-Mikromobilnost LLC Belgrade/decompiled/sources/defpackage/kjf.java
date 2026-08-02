package defpackage;

import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class kjf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MapRouteParametersDto.ZoomableObjectType.values().length];
        try {
            iArr[MapRouteParametersDto.ZoomableObjectType.CURRENT_LOCATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MapRouteParametersDto.ZoomableObjectType.STARTING_LOCATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MapRouteParametersDto.ZoomableObjectType.DESTINATION_LOCATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
