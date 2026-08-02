package defpackage;

import ru.yandex.taxi.widget.timeline.TimelineOrientation;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class l9z0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TimelineOrientation.values().length];
        try {
            iArr[TimelineOrientation.HORIZONTAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TimelineOrientation.VERTICAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
