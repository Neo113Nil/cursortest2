package xsna;

import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.api.generated.groups.dto.GroupsGetResponseDto;
import com.vk.api.generated.notifications.dto.NotificationsNotificationGroupSettingsSectionDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: ExecuteGetCommunityNotificationSettings.kt */
/* loaded from: classes4.dex */
public final class wqt extends awi<xqt> {
    public final long s;
    public final boolean t;

    public wqt(long j, boolean z) {
        this.s = j;
        this.t = z;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        Object obj;
        zqu zquVar = new zqu();
        boolean z = this.t;
        long j = this.s;
        if (z) {
            UserId userId = new UserId(j);
            tfx tfxVar = new tfx("notifications.getGroupSettings", new to(22), new t11(25));
            tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
            List list = (List) yfb.x(tfxVar).f(l7r0Var);
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ahn.y((NotificationsNotificationGroupSettingsSectionDto) it.next()));
            }
            return new xqt(arrayList, 0, 0, 6);
        }
        GroupsGetResponseDto groupsGetResponseDto = (GroupsGetResponseDto) yfb.x(xqu.e(zquVar, null, Collections.singletonList(GroupsFilterDto.ENABLED_NOTIFICATIONS), null, 30, 89)).f(l7r0Var);
        int size = epx.f(groupsGetResponseDto.d(), Boolean.FALSE) ? groupsGetResponseDto.e().size() : 15;
        Iterator<T> it2 = groupsGetResponseDto.e().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((UserId) obj).b == j) {
                break;
            }
        }
        if (((UserId) obj) == null) {
            return new xqt(null, size, groupsGetResponseDto.getCount(), 1);
        }
        UserId userId2 = new UserId(j);
        tfx tfxVar2 = new tfx("notifications.getGroupSettings", new to(22), new t11(25));
        tfx.n(tfxVar2, "group_id", userId2, 1L, 0L, 8);
        List list2 = (List) yfb.x(tfxVar2).f(l7r0Var);
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(ahn.y((NotificationsNotificationGroupSettingsSectionDto) it3.next()));
        }
        return new xqt(arrayList2, 0, 0, 6);
    }
}
