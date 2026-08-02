package defpackage;

import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class oc61 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RoutePointType.values().length];
        try {
            iArr[RoutePointType.POINT_A.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
