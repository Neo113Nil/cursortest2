package defpackage;

import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderSeatsAvailableResponse;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class f2n {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto.AppearanceBannerDto.BannerActionDto.BannerActionType.values().length];
        try {
            iArr[ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto.AppearanceBannerDto.BannerActionDto.BannerActionType.SELECT_TIME_SLOT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto.AppearanceBannerDto.BannerActionDto.BannerActionType.UNSUPPORTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
