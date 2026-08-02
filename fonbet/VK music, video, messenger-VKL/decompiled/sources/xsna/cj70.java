package xsna;

import com.vk.dto.notifications.NotificationItem;
import com.vk.dto.notifications.NotificationsGetResponse$NotificationsResponseItem;
import com.vk.lists.ListDataSet;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: NotificationsDataSet.kt */
/* loaded from: classes4.dex */
public final class cj70 extends ListDataSet<NotificationsGetResponse$NotificationsResponseItem> implements bj70 {
    @Override // xsna.bj70
    public final void C(JSONObject jSONObject, NotificationItem notificationItem) {
        NotificationItem notificationItem2;
        AbstractList abstractList = this.d;
        int size = abstractList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            NotificationsGetResponse$NotificationsResponseItem notificationsGetResponse$NotificationsResponseItem = (NotificationsGetResponse$NotificationsResponseItem) abstractList.get(i);
            if ((notificationsGetResponse$NotificationsResponseItem == null || (notificationItem2 = notificationsGetResponse$NotificationsResponseItem.b) == null) ? false : notificationItem2.zb(notificationItem)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            k(i);
            abstractList.remove(i);
            p(i);
        }
    }

    @Override // xsna.bj70
    public final void Q(NotificationItem notificationItem) {
        NotificationItem notificationItem2;
        NotificationsGetResponse$NotificationsResponseItem notificationsGetResponse$NotificationsResponseItem = new NotificationsGetResponse$NotificationsResponseItem(notificationItem, null, null);
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            NotificationsGetResponse$NotificationsResponseItem notificationsGetResponse$NotificationsResponseItem2 = (NotificationsGetResponse$NotificationsResponseItem) arrayList.get(i);
            if ((notificationsGetResponse$NotificationsResponseItem2 == null || (notificationItem2 = notificationsGetResponse$NotificationsResponseItem2.b) == null) ? false : notificationItem2.zb(notificationItem)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            h(i);
            arrayList.set(i, notificationsGetResponse$NotificationsResponseItem);
            d(i);
        }
    }

    @Override // com.vk.lists.ListDataSet, xsna.uuk
    public final void S(List<NotificationsGetResponse$NotificationsResponseItem> list) {
        if (list == null) {
            return;
        }
        y(0, list);
    }

    @Override // com.vk.lists.ListDataSet, xsna.uuk
    public final void n0(List<NotificationsGetResponse$NotificationsResponseItem> list) {
        if (list == null) {
            return;
        }
        super.n0(list);
    }
}
