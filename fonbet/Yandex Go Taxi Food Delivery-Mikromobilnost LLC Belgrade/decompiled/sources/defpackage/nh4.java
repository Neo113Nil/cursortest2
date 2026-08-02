package defpackage;

import ru.yandex.taxi.logistics.sdk.ui_models.background.ScaleType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class nh4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScaleType.values().length];
        try {
            iArr[ScaleType.ASPECT_FILL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScaleType.SCALE_TO_FILL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScaleType.ASPECT_FIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScaleType.NONE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
