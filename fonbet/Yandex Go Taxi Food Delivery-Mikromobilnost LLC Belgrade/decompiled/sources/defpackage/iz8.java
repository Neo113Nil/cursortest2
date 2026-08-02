package defpackage;

import com.yandex.go.tariffcard.ui.model.CarouselWithPosition$Position;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class iz8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[CarouselWithPosition$Position.values().length];
        try {
            iArr[CarouselWithPosition$Position.ABOVE_MULTI_TARIFFS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[CarouselWithPosition$Position.ABOVE_REQUIREMENTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
