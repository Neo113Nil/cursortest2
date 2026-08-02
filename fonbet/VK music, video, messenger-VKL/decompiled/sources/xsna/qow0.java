package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.im.ImageList;
import com.vk.im.ui.views.avatars.a;
import com.vk.voip.ui.group_selector.VoipGroupSelectorConfig;
import com.vk.voip.ui.group_selector.ui.b;
import java.util.ArrayList;
import java.util.List;
import xsna.cpw0;

/* compiled from: VoipGroupSelectorContentDialogViewStateMapper.kt */
/* loaded from: classes7.dex */
public final class qow0 {
    public final VoipGroupSelectorConfig a;
    public final b25 b;

    public qow0(VoipGroupSelectorConfig voipGroupSelectorConfig, b25 b25Var) {
        this.a = voipGroupSelectorConfig;
        this.b = b25Var;
    }

    public static ArrayList b(cpw0.a aVar, List list) {
        List<GroupsGroupFullDto> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (GroupsGroupFullDto groupsGroupFullDto : list2) {
            cpw0.a.AbstractC2675a abstractC2675a = aVar.c;
            boolean z = (abstractC2675a instanceof cpw0.a.AbstractC2675a.b) && epx.f(((cpw0.a.AbstractC2675a.b) abstractC2675a).a, groupsGroupFullDto);
            UserId P0 = groupsGroupFullDto.P0();
            Serializer.c<ImageList> cVar = ImageList.CREATOR;
            ImageList a = ImageList.a.a(groupsGroupFullDto.V1());
            String y1 = groupsGroupFullDto.y1();
            if (y1 == null) {
                y1 = "";
            }
            arrayList.add(new b.a.d.c(P0, a, y1, z, epx.f(groupsGroupFullDto.N3(), Boolean.TRUE)));
        }
        return arrayList;
    }

    public final b.a.d.C2048b a(cpw0.a aVar) {
        cn o = this.b.o();
        boolean z = aVar.c instanceof cpw0.a.AbstractC2675a.C2676a;
        a.b.C1179b c1179b = new a.b.C1179b(o.b);
        Serializer.c<ImageList> cVar = ImageList.CREATOR;
        return new b.a.d.C2048b(ImageList.a.c(-1, -1, o.c), c1179b, o.b, z, o.j);
    }
}
