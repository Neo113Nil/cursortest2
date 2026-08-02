package xsna;

import com.vk.api.generated.groups.dto.GroupsGetMembersFieldsResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetMembersFilterDto;
import com.vk.api.generated.groups.dto.GroupsUserXtrRoleDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: GroupsGetMembersPeerApiCmd.kt */
/* loaded from: classes2.dex */
public final class zpu extends nx2<List<? extends Peer>> {
    public final Peer b;
    public final GroupsGetMembersFilterDto c;
    public final int d = 1000;
    public final boolean e;

    public zpu(Peer peer, GroupsGetMembersFilterDto groupsGetMembersFilterDto, boolean z) {
        this.b = peer;
        this.c = groupsGetMembersFilterDto;
        this.e = z;
        if (!peer.Ab(Peer.Type.GROUP)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // xsna.nx2
    public final List<? extends Peer> f(l7r0 l7r0Var) {
        List<GroupsUserXtrRoleDto> d = ((GroupsGetMembersFieldsResponseDto) bz2.l(xqu.g(new zqu(), fkq0.a(new UserId(this.b.d)), null, 0, Integer.valueOf(this.d), Collections.singletonList(UsersFieldsDto.COMMON_COUNT), this.c, null, 194), this.e)).d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        Iterator<T> it = d.iterator();
        while (it.hasNext()) {
            arrayList.add(com.vk.dto.common.a.a(((GroupsUserXtrRoleDto) it.next()).D0()));
        }
        return arrayList;
    }
}
