package xsna;

import com.vk.api.generated.notifications.dto.NotificationsActionButtonsDto;
import com.vk.api.generated.notifications.dto.NotificationsUnifiedActionDto;
import com.vk.api.generated.notifications.dto.NotificationsUnifiedButtonDto;
import com.vk.api.generated.notifications.dto.NotificationsUnifiedEntityDto;
import com.vk.api.generated.notifications.dto.NotificationsUnifiedNotificationDto;
import java.util.ArrayList;
import java.util.List;

/* compiled from: NotificationUnifiedUtil.kt */
/* loaded from: classes5.dex */
public final class ci70 {
    public static final NotificationsUnifiedNotificationDto a(NotificationsUnifiedNotificationDto notificationsUnifiedNotificationDto) {
        ArrayList arrayList;
        NotificationsActionButtonsDto notificationsActionButtonsDto;
        ArrayList arrayList2;
        NotificationsUnifiedEntityDto notificationsUnifiedEntityDto;
        NotificationsUnifiedActionDto d;
        ArrayList arrayList3;
        ArrayList arrayList4;
        List<NotificationsUnifiedButtonDto> e;
        List<NotificationsUnifiedButtonDto> d2;
        NotificationsUnifiedEntityDto k = notificationsUnifiedNotificationDto.k();
        NotificationsUnifiedActionDto d3 = notificationsUnifiedNotificationDto.k().d();
        ArrayList arrayList5 = null;
        NotificationsUnifiedEntityDto a = NotificationsUnifiedEntityDto.a(k, d3 != null ? NotificationsUnifiedActionDto.a(d3) : null);
        List<NotificationsUnifiedButtonDto> j = notificationsUnifiedNotificationDto.j();
        if (j != null) {
            List<NotificationsUnifiedButtonDto> list = j;
            ArrayList arrayList6 = new ArrayList(c5g.u(list, 10));
            for (NotificationsUnifiedButtonDto notificationsUnifiedButtonDto : list) {
                arrayList6.add(NotificationsUnifiedButtonDto.a(notificationsUnifiedButtonDto, NotificationsUnifiedActionDto.a(notificationsUnifiedButtonDto.d())));
            }
            arrayList = arrayList6;
        } else {
            arrayList = null;
        }
        if (notificationsUnifiedNotificationDto.e() != null) {
            NotificationsActionButtonsDto e2 = notificationsUnifiedNotificationDto.e();
            if (e2 == null || (d2 = e2.d()) == null) {
                arrayList3 = null;
            } else {
                List<NotificationsUnifiedButtonDto> list2 = d2;
                arrayList3 = new ArrayList(c5g.u(list2, 10));
                for (NotificationsUnifiedButtonDto notificationsUnifiedButtonDto2 : list2) {
                    arrayList3.add(NotificationsUnifiedButtonDto.a(notificationsUnifiedButtonDto2, NotificationsUnifiedActionDto.a(notificationsUnifiedButtonDto2.d())));
                }
            }
            NotificationsActionButtonsDto e3 = notificationsUnifiedNotificationDto.e();
            if (e3 == null || (e = e3.e()) == null) {
                arrayList4 = null;
            } else {
                List<NotificationsUnifiedButtonDto> list3 = e;
                arrayList4 = new ArrayList(c5g.u(list3, 10));
                for (NotificationsUnifiedButtonDto notificationsUnifiedButtonDto3 : list3) {
                    arrayList4.add(NotificationsUnifiedButtonDto.a(notificationsUnifiedButtonDto3, NotificationsUnifiedActionDto.a(notificationsUnifiedButtonDto3.d())));
                }
            }
            notificationsActionButtonsDto = new NotificationsActionButtonsDto(arrayList3, arrayList4);
        } else {
            notificationsActionButtonsDto = null;
        }
        List<NotificationsUnifiedEntityDto> g = notificationsUnifiedNotificationDto.g();
        if (g != null) {
            List<NotificationsUnifiedEntityDto> list4 = g;
            ArrayList arrayList7 = new ArrayList(c5g.u(list4, 10));
            for (NotificationsUnifiedEntityDto notificationsUnifiedEntityDto2 : list4) {
                NotificationsUnifiedActionDto d4 = notificationsUnifiedEntityDto2.d();
                arrayList7.add(NotificationsUnifiedEntityDto.a(notificationsUnifiedEntityDto2, d4 != null ? NotificationsUnifiedActionDto.a(d4) : null));
            }
            arrayList2 = arrayList7;
        } else {
            arrayList2 = null;
        }
        NotificationsUnifiedEntityDto f = notificationsUnifiedNotificationDto.f();
        if (f != null) {
            NotificationsUnifiedEntityDto f2 = notificationsUnifiedNotificationDto.f();
            notificationsUnifiedEntityDto = NotificationsUnifiedEntityDto.a(f, (f2 == null || (d = f2.d()) == null) ? null : NotificationsUnifiedActionDto.a(d));
        } else {
            notificationsUnifiedEntityDto = null;
        }
        NotificationsUnifiedActionDto d5 = notificationsUnifiedNotificationDto.d();
        NotificationsUnifiedActionDto a2 = d5 != null ? NotificationsUnifiedActionDto.a(d5) : null;
        List<NotificationsUnifiedButtonDto> i = notificationsUnifiedNotificationDto.i();
        if (i != null) {
            List<NotificationsUnifiedButtonDto> list5 = i;
            arrayList5 = new ArrayList(c5g.u(list5, 10));
            for (NotificationsUnifiedButtonDto notificationsUnifiedButtonDto4 : list5) {
                arrayList5.add(NotificationsUnifiedButtonDto.a(notificationsUnifiedButtonDto4, NotificationsUnifiedActionDto.a(notificationsUnifiedButtonDto4.d())));
            }
        }
        return NotificationsUnifiedNotificationDto.a(notificationsUnifiedNotificationDto, a, arrayList, notificationsActionButtonsDto, arrayList2, notificationsUnifiedEntityDto, a2, arrayList5);
    }
}
