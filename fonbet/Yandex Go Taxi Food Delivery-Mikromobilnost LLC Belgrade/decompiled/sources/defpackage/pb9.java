package defpackage;

import com.yandex.go.taxi.order.models.api.response.ChangeOrderNotificationActionResponse;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class pb9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChangeOrderNotificationActionResponse.values().length];
        try {
            iArr[ChangeOrderNotificationActionResponse.COMMUNICATE_WITH_DRIVER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChangeOrderNotificationActionResponse.NONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
