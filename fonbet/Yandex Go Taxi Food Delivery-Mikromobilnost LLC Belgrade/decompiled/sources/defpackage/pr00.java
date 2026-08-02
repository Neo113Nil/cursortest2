package defpackage;

import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$AnimationType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class pr00 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MapRouteAppearance$AnimationType.values().length];
        try {
            iArr[MapRouteAppearance$AnimationType.EASY_BOTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MapRouteAppearance$AnimationType.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
