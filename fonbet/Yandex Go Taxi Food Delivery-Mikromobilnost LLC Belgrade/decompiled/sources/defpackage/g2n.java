package defpackage;

import com.yandex.go.due_timetable.data.api.dto.ScheduledOrderSeatsAvailableResponse;
import com.yandex.go.order.state.instructions.ScheduledOrderItemAction;
import com.yandex.go.order.state.instructions.ScheduledOrderItemActionType;
import com.yandex.go.zone.dto.objects.ScheduledOrderDescriptionItem;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes12.dex */
public final class g2n {
    public static e2n a(ScheduledOrderSeatsAvailableResponse.TimeSlotDto timeSlotDto) {
        xy40 xy40Var;
        ScheduledOrderItemActionType scheduledOrderItemActionType;
        ScheduledOrderItemAction scheduledOrderItemAction;
        c2n c2nVar;
        ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto appearanceDto = timeSlotDto.c;
        Calendar calendar = timeSlotDto.b;
        if (appearanceDto == null || calendar == null) {
            return null;
        }
        String str = appearanceDto.a;
        if (str == null) {
            str = "";
        }
        d2n d2nVar = new d2n(str, appearanceDto.b);
        List<ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto.AppearanceBannerDto> list = appearanceDto.d;
        if (list == null) {
            xy40Var = null;
        } else {
            xy40Var = new xy40(list.size());
            for (ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto.AppearanceBannerDto appearanceBannerDto : list) {
                String str2 = appearanceBannerDto.a;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = appearanceBannerDto.b;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = appearanceBannerDto.c;
                if (str4 == null) {
                    str4 = "";
                }
                ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto.AppearanceBannerDto.BannerActionDto bannerActionDto = appearanceBannerDto.d;
                if (bannerActionDto == null) {
                    scheduledOrderItemAction = null;
                } else {
                    int i = f2n.a[bannerActionDto.a.ordinal()];
                    if (i == 1) {
                        scheduledOrderItemActionType = ScheduledOrderItemActionType.SELECT_TIME_SLOT;
                    } else {
                        if (i != 2) {
                            w511.b();
                            return null;
                        }
                        scheduledOrderItemActionType = ScheduledOrderItemActionType.UNSUPPORTED;
                    }
                    scheduledOrderItemAction = new ScheduledOrderItemAction(scheduledOrderItemActionType, bannerActionDto.b);
                }
                xy40Var.g(new ScheduledOrderDescriptionItem(str2, str3, str4, scheduledOrderItemAction, 88));
            }
        }
        b2n b2nVar = new b2n(xy40Var);
        ScheduledOrderSeatsAvailableResponse.TimeSlotDto.AppearanceDto.AppearanceButtonDto appearanceButtonDto = appearanceDto.e;
        if (appearanceButtonDto == null) {
            c2nVar = null;
        } else {
            String str5 = appearanceButtonDto.a;
            String str6 = appearanceButtonDto.b;
            c2nVar = new c2n(str5, str6 != null ? str6 : "", appearanceButtonDto.c);
        }
        return new e2n(d2nVar, b2nVar, c2nVar, new y1n(calendar, !appearanceDto.c));
    }
}
