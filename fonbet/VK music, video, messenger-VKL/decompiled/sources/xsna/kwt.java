package xsna;

import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.s1r0;
import xsna.xqu;

/* compiled from: GetUsersAndGroupsRequest.kt */
/* loaded from: classes15.dex */
public final class kwt extends awi<List<? extends UserProfile>> {
    public static final List<UsersFieldsDto> t = e43.l(UsersFieldsDto.FIRST_NAME_DAT, UsersFieldsDto.SEX, UsersFieldsDto.CAN_CALL);
    public final ArrayList s;

    public kwt(ArrayList arrayList) {
        this.s = arrayList;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        Iterable iterable;
        List<GroupsGroupFullDto> list;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (UserId userId : this.s) {
            long j = userId.b;
            if (j > 0 || j < -2000000000) {
                arrayList.add(userId);
            } else {
                arrayList2.add(new UserId(-userId.b));
            }
        }
        if (arrayList.isEmpty()) {
            iterable = EmptyList.b;
        } else {
            if ((58 & 1) != 0) {
                arrayList = null;
            }
            iterable = (List) yfb.x(s1r0.a.b(arrayList, null, (58 & 4) != 0 ? null : t, null, null)).f(l7r0Var);
        }
        if (arrayList2.isEmpty()) {
            list = EmptyList.b;
        } else {
            list = ((GroupsGetByIdObjectResponseDto) yfb.x(xqu.a.a(null, arrayList2, null)).f(l7r0Var)).d();
            if (list == null) {
                list = EmptyList.b;
            }
        }
        new j2r0();
        Iterable iterable2 = iterable;
        ArrayList arrayList3 = new ArrayList(c5g.u(iterable2, 10));
        Iterator it = iterable2.iterator();
        while (it.hasNext()) {
            arrayList3.add(j2r0.a((UsersUserFullDto) it.next()));
        }
        List<GroupsGroupFullDto> list2 = list;
        ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
        for (GroupsGroupFullDto groupsGroupFullDto : list2) {
            UserProfile userProfile = new UserProfile();
            userProfile.e = groupsGroupFullDto.y1();
            userProfile.g = groupsGroupFullDto.V1();
            userProfile.h = zm00.c(groupsGroupFullDto.V1(), groupsGroupFullDto.R1(), groupsGroupFullDto.B1(), groupsGroupFullDto.D1());
            userProfile.c = new UserId(-groupsGroupFullDto.P0().b);
            arrayList4.add(userProfile);
        }
        return j5g.u0(arrayList4, arrayList3);
    }
}
