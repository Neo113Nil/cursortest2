package defpackage;

import com.yandex.delivery.mapper.model.PointType;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class hni {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PointType.values().length];
        try {
            iArr[PointType.SOURCE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PointType.DESTINATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PointType.RETURN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PointType.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
