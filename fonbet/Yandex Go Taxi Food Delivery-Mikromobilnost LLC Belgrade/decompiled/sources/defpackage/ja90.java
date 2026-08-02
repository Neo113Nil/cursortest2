package defpackage;

import com.yandex.go.taxi.order.models.api.response.StateInfoTimer;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class ja90 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StateInfoTimer.TimerType.values().length];
        try {
            iArr[StateInfoTimer.TimerType.FROM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StateInfoTimer.TimerType.UNTIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
