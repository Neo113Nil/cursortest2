package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.external.miniapp.net.app.WebImageSize;
import com.vk.superapp.api.dto.group.WebGroup;

/* compiled from: GroupMapper.kt */
/* loaded from: classes6.dex */
public final class mlu {
    public static WebGroup a(GroupsGroupFullDto groupsGroupFullDto) {
        long j = groupsGroupFullDto.P0().b;
        String y1 = groupsGroupFullDto.y1();
        String str = "";
        if (y1 == null) {
            y1 = "";
        }
        String V1 = groupsGroupFullDto.V1();
        if (V1 != null) {
            WebImageSize.CREATOR.getClass();
            str = WebImageSize.a.a(100, V1).b;
        } else {
            String B1 = groupsGroupFullDto.B1();
            if (B1 != null) {
                str = B1;
            }
        }
        GroupsGroupIsClosedDto u3 = groupsGroupFullDto.u3();
        return new WebGroup(j, y1, str, u3 != null ? u3.i() : 0);
    }
}
