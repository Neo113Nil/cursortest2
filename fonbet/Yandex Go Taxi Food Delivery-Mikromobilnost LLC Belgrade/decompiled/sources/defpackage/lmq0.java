package defpackage;

import ru.yandex.taxi.preorder.summary.selector.analytics.VerticalSelectorAnalytics$SelectionChangeReason;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class lmq0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VerticalSelectorAnalytics$SelectionChangeReason.values().length];
        try {
            iArr[VerticalSelectorAnalytics$SelectionChangeReason.Tap.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VerticalSelectorAnalytics$SelectionChangeReason.Swipe.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
