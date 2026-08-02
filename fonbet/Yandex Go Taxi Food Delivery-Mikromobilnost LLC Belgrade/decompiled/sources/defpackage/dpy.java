package defpackage;

import ru.yandex.taxi.linked_order.models.data.LinkedOrderType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class dpy {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LinkedOrderType.values().length];
        try {
            iArr[LinkedOrderType.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LinkedOrderType.AMBULANCE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
