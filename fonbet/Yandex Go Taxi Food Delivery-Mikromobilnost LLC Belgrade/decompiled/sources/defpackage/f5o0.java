package defpackage;

import ru.yandex.taxi.scooters.domain.model.ScootersDetailedOrderOneShotAction;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class f5o0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersDetailedOrderOneShotAction.values().length];
        try {
            iArr[ScootersDetailedOrderOneShotAction.CANCEL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersDetailedOrderOneShotAction.FINISH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersDetailedOrderOneShotAction.ROUTE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
