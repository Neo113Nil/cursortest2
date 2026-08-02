package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import java.util.List;
import xsna.wqu;
import xsna.yqu;

/* compiled from: JoinGroupFromAd.kt */
/* loaded from: classes15.dex */
public final class k0y extends awi<l0y> {
    public static final l0y v = new l0y(false, false);
    public final UserId s;
    public final String t;
    public final String u;

    public k0y(UserId userId, String str, String str2) {
        this.s = userId;
        this.t = str;
        this.u = str2;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        GroupsGroupFullDto groupsGroupFullDto;
        zqu zquVar = new zqu();
        BaseBoolIntDto baseBoolIntDto = null;
        List<GroupsGroupFullDto> d = ((GroupsGetByIdObjectResponseDto) yfb.x(wqu.a.b(zquVar, Collections.singletonList(this.s), null, null, 6)).f(l7r0Var)).d();
        if (d != null && (groupsGroupFullDto = (GroupsGroupFullDto) j5g.Y(d)) != null) {
            baseBoolIntDto = groupsGroupFullDto.I3();
        }
        if (baseBoolIntDto == BaseBoolIntDto.YES) {
            return new l0y(false, true);
        }
        return new l0y(((BaseOkResponseDto) yfb.x(yqu.a.c(zquVar, this.s, null, this.t, this.u, null, null, null, null, 498)).f(l7r0Var)) == BaseOkResponseDto.OK, true);
    }
}
