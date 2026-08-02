package defpackage;

import ru.yandex.taxi.net.tracker.BaseSmoothMovementTracker$DataOrigin;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ka5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BaseSmoothMovementTracker$DataOrigin.values().length];
        try {
            iArr[BaseSmoothMovementTracker$DataOrigin.WEBSOCKET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BaseSmoothMovementTracker$DataOrigin.ENDPOINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
