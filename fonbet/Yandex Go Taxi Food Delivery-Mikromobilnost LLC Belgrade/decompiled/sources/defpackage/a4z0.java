package defpackage;

import ru.yandex.taxi.communications.api.dto.BannerWidgets;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class a4z0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BannerWidgets.ActionType.values().length];
        try {
            iArr[BannerWidgets.ActionType.DEEPLINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BannerWidgets.ActionType.CLIPBOARD_COPY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BannerWidgets.ActionType.NAMED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BannerWidgets.ActionType.DEACTIVATE_PROMO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BannerWidgets.ActionType.SAVE_BENEFIT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
