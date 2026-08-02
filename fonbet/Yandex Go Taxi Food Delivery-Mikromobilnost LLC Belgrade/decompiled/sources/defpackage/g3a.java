package defpackage;

import ru.yandex.taxi.layers.LayersAnalyticEventEmmiter;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class g3a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LayersAnalyticEventEmmiter.Event.values().length];
        try {
            iArr[LayersAnalyticEventEmmiter.Event.TAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
