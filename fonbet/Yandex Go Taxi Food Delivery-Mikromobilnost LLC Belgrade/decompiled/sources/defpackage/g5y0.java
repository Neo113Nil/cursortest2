package defpackage;

import com.yandex.go.taxi.order.cache.api.data.model.OrderType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class g5y0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderType.values().length];
        try {
            iArr[OrderType.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderType.AMBULANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
