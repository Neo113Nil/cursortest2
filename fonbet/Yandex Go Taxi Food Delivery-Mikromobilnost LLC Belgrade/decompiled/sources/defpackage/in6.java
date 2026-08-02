package defpackage;

import ru.yandex.taxi.layers.domain.model.BubbleType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class in6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BubbleType.values().length];
        try {
            iArr[BubbleType.PLAIN_TEXT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BubbleType.SMALL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BubbleType.MEDIUM_OR_LARGE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BubbleType.MEDIUM_OR_LARGE_CORNER_RADIUS_16.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
