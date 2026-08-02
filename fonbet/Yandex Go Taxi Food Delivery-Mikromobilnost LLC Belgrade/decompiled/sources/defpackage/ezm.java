package defpackage;

import com.yandex.go.due.data.api.dto.ScheduledOrderAvailabilityRequest;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class ezm {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScheduledOrderAvailabilityRequest.OpenOrigin.values().length];
        try {
            iArr[ScheduledOrderAvailabilityRequest.OpenOrigin.INTERCITY_DASHBOARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScheduledOrderAvailabilityRequest.OpenOrigin.SUMMARY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
