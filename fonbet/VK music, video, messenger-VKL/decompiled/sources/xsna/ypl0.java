package xsna;

import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import java.util.List;
import xsna.s1r0;
import xsna.xqu;

/* compiled from: StoriesAskQuestion.kt */
/* loaded from: classes15.dex */
public final class ypl0 extends awi<String> {
    public final zpl0 s;

    public ypl0(zpl0 zpl0Var) {
        this.s = zpl0Var;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        GroupsGroupFullDto groupsGroupFullDto;
        String y1;
        zpl0 zpl0Var = this.s;
        UserId userId = zpl0Var.a;
        int i = zpl0Var.b;
        String str = zpl0Var.c;
        boolean z = zpl0Var.d;
        boolean z2 = zpl0Var.e;
        tfx tfxVar = new tfx("stories.askQuestion", new az60(7), new yil0(1));
        tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        tfx.l(tfxVar, "story_id", i, 0, 0, 8);
        tfx.o(tfxVar, "question", str, 0, 0, 12);
        tfxVar.j("is_anonymous", z);
        tfxVar.j("with_mention", z2);
        yfb.x(tfxVar).f(l7r0Var);
        UserId userId2 = zpl0Var.a;
        if (userId2.b < 0) {
            List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) yfb.x(xqu.a.a(null, Collections.singletonList(fkq0.a(userId2)), null)).f(l7r0Var)).d();
            if (d != null && (groupsGroupFullDto = (GroupsGroupFullDto) j5g.Y(d)) != null && (y1 = groupsGroupFullDto.y1()) != null) {
                return y1;
            }
        } else {
            List singletonList = Collections.singletonList(userId2);
            if ((54 & 1) != 0) {
                singletonList = null;
            }
            String D0 = ((UsersUserFullDto) j5g.Y((List) yfb.x(s1r0.a.b(singletonList, null, null, (54 & 8) != 0 ? null : "ins", null)).f(l7r0Var))).D0();
            if (D0 != null) {
                return D0;
            }
        }
        return "";
    }
}
