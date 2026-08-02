package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.api.generated.groups.dto.GroupsGetResponseDto;
import com.vk.dto.common.id.UserId;
import java.util.Collections;

/* compiled from: ExecuteNotificationsDeleteGroupSource.kt */
/* loaded from: classes5.dex */
public final class ej70 extends yvi<bvl> {
    public final long s;

    public ej70(long j) {
        this.s = j;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        UserId userId = new UserId(this.s);
        tfx tfxVar = new tfx("notifications.deleteGroupSource", new at(24), new bt(22));
        tfx.n(tfxVar, "group_id", userId, 1L, 0L, 8);
        return new bvl(((BaseBoolIntDto) yfb.A(tfxVar).f(l7r0Var)) == BaseBoolIntDto.YES, epx.f(((GroupsGetResponseDto) yfb.A(xqu.e(new zqu(), null, Collections.singletonList(GroupsFilterDto.ENABLED_NOTIFICATIONS), null, 1, 91)).f(l7r0Var)).d(), Boolean.TRUE));
    }
}
