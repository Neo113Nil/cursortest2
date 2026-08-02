package defpackage;

import com.yandex.go.taxi.summary.api.map.model.FocusPointType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class kgv0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FocusPointType.values().length];
        try {
            iArr[FocusPointType.POINT_A.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FocusPointType.POINT_B.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
