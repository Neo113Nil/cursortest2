package defpackage;

import ru.yandex.taxi.communications.api.dto.BannerWidgets;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ois {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BannerWidgets.ActionType.values().length];
        try {
            iArr[BannerWidgets.ActionType.CLIPBOARD_COPY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
