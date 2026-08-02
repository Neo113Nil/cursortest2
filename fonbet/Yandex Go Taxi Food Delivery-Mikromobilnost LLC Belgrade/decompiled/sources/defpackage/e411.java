package defpackage;

import ru.yandex.taxi.masstransit.analytic.MtDetailRouteCardOpenReason;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class e411 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[MtDetailRouteCardOpenReason.values().length];
        try {
            iArr[MtDetailRouteCardOpenReason.PULL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MtDetailRouteCardOpenReason.BUTTON_TAP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MtDetailRouteCardOpenReason.HUB.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MtDetailRouteCardOpenReason.SELECTOR_TAP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[MtDetailRouteCardOpenReason.HANDLER_TAP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[MtDetailRouteCardOpenReason.BACK_FROM_MAP_FLOW.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
