package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.model.common.TapAction$OrderAction$Flow;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class f4s {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TapAction$OrderAction$Flow.values().length];
        try {
            iArr[TapAction$OrderAction$Flow.STATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TapAction$OrderAction$Flow.ROUTE_POINTS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TapAction$OrderAction$Flow.PICKUP_POINTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
