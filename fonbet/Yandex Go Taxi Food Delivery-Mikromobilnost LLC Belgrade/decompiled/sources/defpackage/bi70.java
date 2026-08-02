package defpackage;

import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;
import com.yandex.go.taxi.order.change.route.RouteChangeWarning;
import ru.yandex.taxi.analytics.Events$Summary$SummaryState;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class bi70 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[DriveState.values().length];
        try {
            iArr[DriveState.SEARCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DriveState.EXPIRED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[DriveState.CANCELLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[DriveState.COMPLETE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[DriveState.PREORDER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[DriveState.SCHEDULING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[DriveState.SCHEDULED.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[DriveState.DRIVING.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[DriveState.WAITING.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[DriveState.TRANSPORTING.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[DriveState.CHECK_IN.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        a = iArr;
        int[] iArr2 = new int[Events$Summary$SummaryState.values().length];
        try {
            iArr2[Events$Summary$SummaryState.COLLAPSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[Events$Summary$SummaryState.EXPANDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        b = iArr2;
        int[] iArr3 = new int[PaymentMethod$Type.values().length];
        try {
            iArr3[PaymentMethod$Type.PERSONAL_WALLET.ordinal()] = 1;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr3[PaymentMethod$Type.BIRBONUS_WALLET.ordinal()] = 2;
        } catch (NoSuchFieldError unused15) {
        }
        c = iArr3;
        int[] iArr4 = new int[RouteChangeType.values().length];
        try {
            iArr4[RouteChangeType.ADD_MID_POINT.ordinal()] = 1;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr4[RouteChangeType.CHANGE_MID_POINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr4[RouteChangeType.DELETE_MID_POINT.ordinal()] = 3;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr4[RouteChangeType.CHANGE_DESTINATIONS.ordinal()] = 4;
        } catch (NoSuchFieldError unused19) {
        }
        d = iArr4;
        int[] iArr5 = new int[RouteChangeWarning.values().length];
        try {
            iArr5[RouteChangeWarning.ADD_ROUTE_POINT.ordinal()] = 1;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr5[RouteChangeWarning.CHANGE_ROUTE_POINT.ordinal()] = 2;
        } catch (NoSuchFieldError unused21) {
        }
        e = iArr5;
    }
}
