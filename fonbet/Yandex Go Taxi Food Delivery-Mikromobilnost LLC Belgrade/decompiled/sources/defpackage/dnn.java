package defpackage;

import com.yandex.delivery.mapper.model.PointType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class dnn {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PointType.values().length];
        try {
            iArr[PointType.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PointType.RETURN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PointType.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PointType.DESTINATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
