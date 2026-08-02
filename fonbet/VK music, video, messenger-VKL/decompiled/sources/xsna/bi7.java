package xsna;

import com.vk.api.generated.board.dto.BoardGetTopicsExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsProfileItemDto;
import com.vk.dto.common.Image;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vkontakte.android.R;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.builders.ListBuilder;

/* compiled from: ExecuteBoardGetTopics.kt */
/* loaded from: classes6.dex */
public final class bi7 extends com.vk.api.request.rx.batch.a<BoardGetTopicsExtendedResponseDto, GroupsGetByIdObjectResponseDto, di7> {
    @Override // com.vk.api.request.rx.batch.a
    public final di7 K0(bv6<BoardGetTopicsExtendedResponseDto> bv6Var, bv6<GroupsGetByIdObjectResponseDto> bv6Var2) {
        BoardGetTopicsExtendedResponseDto boardGetTopicsExtendedResponseDto = bv6Var.a;
        GroupsGetByIdObjectResponseDto groupsGetByIdObjectResponseDto = bv6Var2.a;
        ListBuilder e = e43.e();
        List<GroupsGroupFullDto> d = groupsGetByIdObjectResponseDto.d();
        if (d != null) {
            for (GroupsGroupFullDto groupsGroupFullDto : d) {
                UserProfile userProfile = new UserProfile();
                userProfile.c = new UserId(-groupsGroupFullDto.P0().b);
                userProfile.d = groupsGroupFullDto.y1();
                userProfile.f = "";
                userProfile.e = userProfile.d + ' ' + userProfile.f;
                userProfile.g = groupsGroupFullDto.V1();
                e.add(userProfile);
            }
        }
        List<GroupsProfileItemDto> e2 = groupsGetByIdObjectResponseDto.e();
        Group group = null;
        if (e2 != null) {
            for (GroupsProfileItemDto groupsProfileItemDto : e2) {
                UserProfile userProfile2 = new UserProfile();
                userProfile2.c = new UserId(groupsProfileItemDto.getId());
                userProfile2.d = groupsProfileItemDto.d();
                userProfile2.f = groupsProfileItemDto.e();
                userProfile2.e = userProfile2.d + ' ' + userProfile2.f;
                userProfile2.g = groupsProfileItemDto.i();
                userProfile2.h = zm00.c(groupsProfileItemDto.i(), groupsProfileItemDto.g(), groupsProfileItemDto.f(), null);
                Image b = zm00.b(24, groupsProfileItemDto.i(), groupsProfileItemDto.g(), groupsProfileItemDto.f(), null);
                userProfile2.O = b;
                if (userProfile2.P == null && b != null) {
                    userProfile2.P = ixj0.h(b.b);
                }
                e.add(userProfile2);
            }
        }
        ListBuilder g = e.g();
        HashMap hashMap = new HashMap(g.size());
        ListIterator listIterator = g.listIterator(0);
        while (true) {
            ListBuilder.a aVar = (ListBuilder.a) listIterator;
            if (!aVar.hasNext()) {
                break;
            }
            Object next = aVar.next();
            hashMap.put(Long.valueOf(((UserProfile) next).c.b), next);
        }
        fj7 C = fsk.C(boardGetTopicsExtendedResponseDto, new wq3(5), new y40(5), vx2.d.getContext().getResources().getString(R.string.attachment), hashMap);
        List<GroupsGroupFullDto> d2 = groupsGetByIdObjectResponseDto.d();
        if (d2 != null) {
            new dqu();
            group = dqu.a((GroupsGroupFullDto) j5g.Y(d2));
        }
        return new di7(C, group);
    }
}
