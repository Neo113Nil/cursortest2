package defpackage;

import ru.yandex.taxi.communications.api.dto.BannerWidgets;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class gb8 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BannerWidgets.ActionType.values().length];
        try {
            iArr[BannerWidgets.ActionType.DEEPLINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BannerWidgets.ActionType.WEB_VIEW.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BannerWidgets.ActionType.CLIPBOARD_COPY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BannerWidgets.ActionType.SAVE_BENEFIT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
