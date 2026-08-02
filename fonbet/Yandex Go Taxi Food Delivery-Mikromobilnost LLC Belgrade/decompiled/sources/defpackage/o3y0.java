package defpackage;

import com.yandex.go.taxi.order.chat.domain.model.MessengerType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class o3y0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MessengerType.values().length];
        try {
            iArr[MessengerType.WEB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MessengerType.NATIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
