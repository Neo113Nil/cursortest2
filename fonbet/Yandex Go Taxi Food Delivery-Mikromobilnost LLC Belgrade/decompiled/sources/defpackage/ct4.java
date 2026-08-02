package defpackage;

import ru.yandex.taxi.communications.api.dto.BannerWidgets;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ct4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BannerWidgets.OnCloseEffect.Type.values().length];
        try {
            iArr[BannerWidgets.OnCloseEffect.Type.RUN_COUPONS_LIST_BEFORE_ROUTESTATS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
