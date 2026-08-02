package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupTypeDto;
import com.vk.api.generated.groups.dto.GroupsSuggestionDto;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;

/* compiled from: GroupsSuggestionDtoToGroupSuggestionMapper.kt */
/* loaded from: classes3.dex */
public final class hru {
    public static final dqu a = new dqu();

    public static GroupSuggestion a(GroupsSuggestionDto groupsSuggestionDto) {
        String str;
        String str2;
        GroupsGroupFullDto d = groupsSuggestionDto.d();
        a.getClass();
        Group a2 = dqu.a(d);
        String description = groupsSuggestionDto.getDescription();
        GroupsSuggestionDto.ReasonDto e = groupsSuggestionDto.e();
        if (e != null) {
            str = e.i();
            str2 = null;
        } else {
            str = null;
            str2 = null;
        }
        String r = groupsSuggestionDto.r();
        GroupsGroupTypeDto L2 = groupsSuggestionDto.d().L2();
        if (L2 != null) {
            str2 = L2.i();
        }
        return new GroupSuggestion(a2, description, str, r, str2);
    }
}
