package defpackage;

import com.yandex.go.taxi.order.models.api.cancel.OrderCancelNotification;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class mk70 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderCancelNotification.Style.IconAlignment.values().length];
        try {
            iArr[OrderCancelNotification.Style.IconAlignment.CENTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderCancelNotification.Style.IconAlignment.FULL_SIZE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
