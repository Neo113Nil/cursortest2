package xsna;

import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class vq80 implements izs {
    public final /* synthetic */ long b;

    public /* synthetic */ vq80(long j) {
        this.b = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        GroupsGroupFullDto groupsGroupFullDto;
        List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) obj).d();
        if (d == null || (groupsGroupFullDto = (GroupsGroupFullDto) j5g.a0(d)) == null) {
            throw new IllegalStateException(("Group " + this.b + " not found").toString());
        }
        long j = groupsGroupFullDto.P0().b;
        String y1 = groupsGroupFullDto.y1();
        if (y1 == null) {
            y1 = "";
        }
        return new jbh(j, y1);
    }
}
