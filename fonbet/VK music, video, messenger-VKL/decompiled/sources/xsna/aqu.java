package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.api.generated.groups.dto.GroupsGetObjectExtendedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ExecuteGroupsGet.kt */
/* loaded from: classes14.dex */
public final class aqu extends awi<bqu> {
    public static final List<GroupsFieldsDto> w;
    public final UserId s;
    public final List<GroupsFilterDto> t;
    public final List<GroupsFieldsDto> u;
    public final Long v;

    static {
        GroupsFieldsDto groupsFieldsDto = GroupsFieldsDto.START_DATE;
        GroupsFieldsDto groupsFieldsDto2 = GroupsFieldsDto.MEMBERS_COUNT;
        GroupsFieldsDto groupsFieldsDto3 = GroupsFieldsDto.VERIFIED;
        GroupsFieldsDto groupsFieldsDto4 = GroupsFieldsDto.SCREEN_NAME;
        GroupsFieldsDto groupsFieldsDto5 = GroupsFieldsDto.ACTIVITY;
        GroupsFieldsDto groupsFieldsDto6 = GroupsFieldsDto.TRENDING;
        GroupsFieldsDto groupsFieldsDto7 = GroupsFieldsDto.CAN_UPLOAD_STORY;
        GroupsFieldsDto groupsFieldsDto8 = GroupsFieldsDto.USING_VKPAY_MARKET_APP;
        GroupsFieldsDto groupsFieldsDto9 = GroupsFieldsDto.HAS_MARKET_APP;
        GroupsFieldsDto groupsFieldsDto10 = GroupsFieldsDto.DONUT;
        GroupsFieldsDto groupsFieldsDto11 = GroupsFieldsDto.LEAVE_MODE;
        GroupsFieldsDto groupsFieldsDto12 = GroupsFieldsDto.HAS_LIVE_COVER;
        GroupsFieldsDto groupsFieldsDto13 = GroupsFieldsDto.ENABLED_FEATURES;
        GroupsFieldsDto groupsFieldsDto14 = GroupsFieldsDto.CAN_UPLOAD_CLIP;
        GroupsFieldsDto groupsFieldsDto15 = GroupsFieldsDto.CAN_UPLOAD_VIDEO;
        w = e43.l(groupsFieldsDto, groupsFieldsDto2, groupsFieldsDto3, groupsFieldsDto4, groupsFieldsDto5, groupsFieldsDto6, groupsFieldsDto7, groupsFieldsDto8, groupsFieldsDto8, groupsFieldsDto9, groupsFieldsDto10, groupsFieldsDto11, groupsFieldsDto11, groupsFieldsDto12, groupsFieldsDto13, groupsFieldsDto7, groupsFieldsDto14, groupsFieldsDto15, groupsFieldsDto15, GroupsFieldsDto.CAN_POST, GroupsFieldsDto.WALL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public aqu(UserId userId, List<? extends GroupsFilterDto> list, List<? extends GroupsFieldsDto> list2, Long l) {
        this.s = userId;
        this.t = list;
        this.u = list2;
        this.v = l;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        int intValue;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        boolean z = false;
        do {
            zqu zquVar = new zqu();
            Integer valueOf = Integer.valueOf(i);
            Long l = this.v;
            GroupsGetObjectExtendedResponseDto groupsGetObjectExtendedResponseDto = (GroupsGetObjectExtendedResponseDto) yfb.x(zquVar.b(this.s, this.t, this.u, valueOf, 1000, l != null ? Integer.valueOf((int) l.longValue()) : null)).f(l7r0Var);
            arrayList.addAll(groupsGetObjectExtendedResponseDto.e());
            i2 += groupsGetObjectExtendedResponseDto.e().size();
            if (groupsGetObjectExtendedResponseDto.getCount() == i2 || groupsGetObjectExtendedResponseDto.e().isEmpty()) {
                z = true;
            } else {
                i += 1000;
            }
            Integer f = groupsGetObjectExtendedResponseDto.f();
            intValue = f != null ? f.intValue() : 0;
        } while (!z);
        new dqu();
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(dqu.a((GroupsGroupFullDto) it.next()));
        }
        return new bqu(arrayList2, intValue);
    }
}
