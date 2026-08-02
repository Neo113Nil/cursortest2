package xsna;

import com.vk.api.generated.notifications.dto.NotificationsNotificationListRedesignResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationRedesignDto;
import com.vk.dto.common.data.VKList;
import com.vk.dto.user.RequestUserProfile;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.kb70;
import xsna.tlo0;
import xsna.w770;

/* compiled from: NotificationListMapper.kt */
/* loaded from: classes4.dex */
public final class vb70 {
    public final pax0 a;

    public vb70(pax0 pax0Var) {
        this.a = pax0Var;
    }

    public final ArrayList a(NotificationsNotificationListRedesignResponseDto notificationsNotificationListRedesignResponseDto, yos yosVar) {
        w770 dVar;
        String str;
        tlo0 hVar;
        List<NotificationsNotificationRedesignDto> j = notificationsNotificationListRedesignResponseDto.j();
        ArrayList arrayList = new ArrayList();
        la70 la70Var = new la70(new x970(notificationsNotificationListRedesignResponseDto.u(), notificationsNotificationListRedesignResponseDto.e(), notificationsNotificationListRedesignResponseDto.o(), notificationsNotificationListRedesignResponseDto.k(), notificationsNotificationListRedesignResponseDto.B(), notificationsNotificationListRedesignResponseDto.p(), notificationsNotificationListRedesignResponseDto.d(), notificationsNotificationListRedesignResponseDto.n(), notificationsNotificationListRedesignResponseDto.g(), notificationsNotificationListRedesignResponseDto.l()), this.a, new l770(new m770(), new gj70(), new vi70(), new ed70(), new zos(11), new z410(9)));
        if (yosVar != null) {
            VKList<zxq0> vKList = yosVar.a;
            ArrayList arrayList2 = new ArrayList(c5g.u(vKList, 10));
            Iterator<zxq0> it = vKList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().a);
            }
            kb70.c cVar = null;
            if (!arrayList2.isEmpty()) {
                RequestUserProfile requestUserProfile = (RequestUserProfile) j5g.Y(arrayList2);
                RequestUserProfile requestUserProfile2 = (RequestUserProfile) j5g.b0(1, arrayList2);
                int i = yosVar.b;
                if (i == 1) {
                    String str2 = requestUserProfile.h;
                    tlo0.a aVar = tlo0.Companion;
                    String str3 = requestUserProfile.e;
                    str = str3 != null ? str3 : "";
                    aVar.getClass();
                    dVar = new w770.d(str2, null, tlo0.a.c(R.string.accessibility_user, str));
                    hVar = new tlo0.h(requestUserProfile.e);
                } else if (i == 2 && requestUserProfile2 != null) {
                    dVar = new w770.a(requestUserProfile.h, requestUserProfile2.h, tq.h(tlo0.Companion, R.string.accessibility_double_user));
                    hVar = tlo0.a.c(R.string.notification_list_two_friend_request_title, requestUserProfile.e, requestUserProfile2.e);
                } else if (i <= 2 || requestUserProfile2 == null) {
                    String str4 = requestUserProfile.h;
                    tlo0.a aVar2 = tlo0.Companion;
                    String str5 = requestUserProfile.e;
                    str = str5 != null ? str5 : "";
                    aVar2.getClass();
                    dVar = new w770.d(str4, null, tlo0.a.c(R.string.accessibility_user, str));
                    hVar = new tlo0.h(requestUserProfile.e);
                } else {
                    w770.a aVar3 = new w770.a(requestUserProfile.h, requestUserProfile2.h, tq.h(tlo0.Companion, R.string.accessibility_double_user));
                    int i2 = i - 1;
                    hVar = tlo0.a.a(R.plurals.not_name_and_n_more_people, i2, requestUserProfile.d, Integer.valueOf(i2));
                    dVar = aVar3;
                }
                cVar = new kb70.c(tq.h(tlo0.Companion, R.string.not_friend_requests), hVar, dVar, g620.g);
            }
            if (cVar != null) {
                arrayList.add(cVar);
                if (!j.isEmpty()) {
                    arrayList.add(new kb70.a("divider_FriendRequest"));
                }
            }
        }
        List<NotificationsNotificationRedesignDto> list = j;
        ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(la70Var.e((NotificationsNotificationRedesignDto) it2.next()));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }
}
