package xsna;

import com.vk.api.generated.base.dto.BaseUserGroupFieldsDto;
import com.vk.api.generated.groups.dto.GroupsLeaveLeaveModeDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.xqu;

/* compiled from: GroupsService.kt */
/* loaded from: classes.dex */
public final class zqu implements xqu {
    @Override // xsna.yqu
    public final ufx d(UserId userId, GroupsLeaveLeaveModeDto groupsLeaveLeaveModeDto, String str, String str2, String str3) {
        return xqu.a.d(userId, groupsLeaveLeaveModeDto, str, str2, str3);
    }

    @Override // xsna.yqu
    public final ufx l(String str, String str2, String str3, String str4, UserId userId, String str5, String str6, String str7) {
        return xqu.a.c(str, str2, str3, str4, userId, str5, str6, str7);
    }

    @Override // xsna.wqu
    public final sfx r(String str, List list, List list2) {
        return xqu.a.a(str, list, list2);
    }

    public final tfx y(UserId userId, UserId userId2, Integer num, Integer num2, String str, Boolean bool) {
        tfx tfxVar = new tfx("groups.ban", new qq(12), new rq(13));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        if (userId2 != null) {
            tfx.n(tfxVar, "owner_id", userId2, 0L, 0L, 12);
        }
        tfx.l(tfxVar, "end_date", num.intValue(), 0, 0, 8);
        tfx.l(tfxVar, "reason", num2.intValue(), 0, 0, 8);
        if (str != null) {
            tfx.o(tfxVar, "comment", str, 0, 0, 12);
        }
        tfxVar.j("comment_visible", bool.booleanValue());
        return tfxVar;
    }

    public final tfx z(String str, String str2, Integer num, String str3, List list) {
        ArrayList arrayList;
        tfx tfxVar = new tfx("groups.getRecommendedGroups", new sq(13), new tq(14));
        tfxVar.f(num.intValue(), 1, 100, "count");
        if (str != null) {
            tfx.o(tfxVar, "start_from", str, 0, 0, 12);
        }
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((BaseUserGroupFieldsDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("fields", arrayList);
        }
        if (str2 != null) {
            tfx.o(tfxVar, "ref", str2, 0, 0, 12);
        }
        if (str3 != null) {
            tfx.o(tfxVar, "track_code", str3, 0, 0, 12);
        }
        return tfxVar;
    }
}
