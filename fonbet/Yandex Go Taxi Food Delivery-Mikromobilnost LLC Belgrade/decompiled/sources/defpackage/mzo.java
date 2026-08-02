package defpackage;

import com.yandex.go.taxi.order.models.api.response.status.RideCardTimerDto;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class mzo {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[RideCardTimerDto.TimerType.values().length];
        try {
            iArr[RideCardTimerDto.TimerType.UNTIL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[RideCardTimerDto.TimerType.FROM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
