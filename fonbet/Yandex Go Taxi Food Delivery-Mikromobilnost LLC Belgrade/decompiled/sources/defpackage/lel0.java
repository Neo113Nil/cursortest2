package defpackage;

import ru.yandex.taxi.net.tracker.TrackerMode;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class lel0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TrackerMode.values().length];
        try {
            iArr[TrackerMode.FAST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
