package defpackage;

import ru.yandex.taxi.banners.BannerType;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ft4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BannerType.values().length];
        try {
            iArr[BannerType.FULLSCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BannerType.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BannerType.NOTIFICATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
