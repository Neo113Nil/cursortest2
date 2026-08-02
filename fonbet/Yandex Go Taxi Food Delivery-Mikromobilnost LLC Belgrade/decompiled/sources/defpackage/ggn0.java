package defpackage;

import ru.yandex.taxi.scooters.presentation.ontheway.domain.model.ScootersOnTheWayAction;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ggn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersOnTheWayAction.values().length];
        try {
            iArr[ScootersOnTheWayAction.START.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersOnTheWayAction.CONTINUE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersOnTheWayAction.BEEP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScootersOnTheWayAction.PAUSE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ScootersOnTheWayAction.CANCEL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ScootersOnTheWayAction.FINISH.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ScootersOnTheWayAction.ROUTE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
