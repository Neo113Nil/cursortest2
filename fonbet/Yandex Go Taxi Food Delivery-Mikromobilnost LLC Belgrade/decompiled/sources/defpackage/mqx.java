package defpackage;

import ru.yandex.taxi.common_models.net.map_object.LabelType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class mqx {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LabelType.values().length];
        try {
            iArr[LabelType.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LabelType.LAST.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LabelType.ZONE_POINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
