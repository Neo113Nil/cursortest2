package defpackage;

import com.yandex.go.zone.dto.objects.ServiceLevel;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class ewq0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ServiceLevel.ScheduledOrderViewDto.Type.values().length];
        try {
            iArr[ServiceLevel.ScheduledOrderViewDto.Type.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ServiceLevel.ScheduledOrderViewDto.Type.TIMETABLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ServiceLevel.ScheduledOrderViewDto.Type.TIMETABLE_WITH_ADDITIONAL_SLOTS_CLARIFICATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ServiceLevel.ScheduledOrderViewDto.Type.DEEPLINK.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
