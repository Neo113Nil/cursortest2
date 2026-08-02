package defpackage;

import ru.yandextaxi.flutter_yandex_mapkit.models.ProjectionType;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class dlf0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ProjectionType.values().length];
        try {
            iArr[ProjectionType.WGS_84_MERCATOR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
