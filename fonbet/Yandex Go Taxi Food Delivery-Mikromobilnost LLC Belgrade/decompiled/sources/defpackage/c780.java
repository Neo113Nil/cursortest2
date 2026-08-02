package defpackage;

import com.yandex.go.taxi.order.stack.OrderStackMvpView;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class c780 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OrderStackMvpView.AnimationType.values().length];
        try {
            iArr[OrderStackMvpView.AnimationType.HORIZONTAL_TRANSLATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[OrderStackMvpView.AnimationType.FADE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[OrderStackMvpView.AnimationType.NONE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
