package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.groups.dto.GroupsLeaveLeaveModeDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import xsna.xqu;

/* compiled from: GroupsLeaveRequest.kt */
/* loaded from: classes15.dex */
public final class hqu extends awi<Boolean> {
    public final UserId s;
    public final String t;
    public final String u;
    public final AdminLeaveAction v;
    public final String w;

    public /* synthetic */ hqu(UserId userId, String str, String str2, AdminLeaveAction adminLeaveAction, int i) {
        this(userId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : adminLeaveAction, (String) null);
    }

    public final UserId F0() {
        return this.s;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        AdminLeaveAction adminLeaveAction = this.v;
        GroupsLeaveLeaveModeDto i = adminLeaveAction != null ? adminLeaveAction.i() : null;
        if ((80 & 2) != 0) {
            i = null;
        }
        return Boolean.valueOf(((BaseOkResponseDto) yfb.x(xqu.a.d(this.s, i, (80 & 4) != 0 ? null : this.t, (80 & 8) != 0 ? null : this.u, (80 & 32) == 0 ? this.w : null)).f(l7r0Var)) == BaseOkResponseDto.OK);
    }

    public hqu(UserId userId, String str, String str2, AdminLeaveAction adminLeaveAction, String str3) {
        this.s = userId;
        this.t = str;
        this.u = str2;
        this.v = adminLeaveAction;
        this.w = str3;
    }
}
