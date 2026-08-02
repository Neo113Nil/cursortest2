package defpackage;

import com.yandex.go.timer.api.TimerType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class dez0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TimerType.values().length];
        try {
            iArr[TimerType.From.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TimerType.Until.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
