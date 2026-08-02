package xsna;

import com.vk.api.generated.groups.dto.GroupsGetNameHistoryResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupNameHistoryActionDto;
import com.vk.profile.community.details.api.name_history.data.dto.CommunityNameHistoryAction;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.wt50;

/* compiled from: CommunityNameHistoryRepository.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class vah extends FunctionReferenceImpl implements izs<GroupsGetNameHistoryResponseDto, pah> {
    public static final vah b = new vah(1, wt50.class, "toGroupRenameHistory", "toGroupRenameHistory(Lcom/vk/api/generated/groups/dto/GroupsGetNameHistoryResponseDto;)Lcom/vk/profile/community/details/api/name_history/data/dto/CommunityNameHistory;", 1);

    @Override // xsna.izs
    public final pah invoke(GroupsGetNameHistoryResponseDto groupsGetNameHistoryResponseDto) {
        CommunityNameHistoryAction communityNameHistoryAction;
        GroupsGetNameHistoryResponseDto groupsGetNameHistoryResponseDto2 = groupsGetNameHistoryResponseDto;
        groupsGetNameHistoryResponseDto2.getClass();
        String e = groupsGetNameHistoryResponseDto2.e();
        List<GroupsGroupNameHistoryActionDto> d = groupsGetNameHistoryResponseDto2.d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        for (GroupsGroupNameHistoryActionDto groupsGroupNameHistoryActionDto : d) {
            String title = groupsGroupNameHistoryActionDto.getTitle();
            long d2 = groupsGroupNameHistoryActionDto.d();
            int i = wt50.a.$EnumSwitchMapping$0[groupsGroupNameHistoryActionDto.e().ordinal()];
            if (i == 1) {
                communityNameHistoryAction = CommunityNameHistoryAction.RENAME;
            } else if (i == 2) {
                communityNameHistoryAction = CommunityNameHistoryAction.CREATE;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                communityNameHistoryAction = CommunityNameHistoryAction.COLLAPSE;
            }
            arrayList.add(new rah(d2, communityNameHistoryAction, title));
        }
        return new pah(e, arrayList);
    }
}
