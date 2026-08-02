package defpackage;

import com.yandex.go.superapp.tracking.api.domain.models.LogisticsOrderTracking$Status;
import ru.yandex.taxi.superapp.orders.models.ActionType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class biz {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[LogisticsOrderTracking$Status.values().length];
        try {
            iArr[LogisticsOrderTracking$Status.Stub.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[LogisticsOrderTracking$Status.Cancelling.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[LogisticsOrderTracking$Status.Active.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[LogisticsOrderTracking$Status.Completed.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[ActionType.values().length];
        try {
            iArr2[ActionType.ORDER_DETAILS.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ActionType.CANCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ActionType.CALL.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ActionType.LOGISTICS_PERFORMER.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ActionType.LOGISTICS_SHOW_CONTENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        b = iArr2;
    }
}
