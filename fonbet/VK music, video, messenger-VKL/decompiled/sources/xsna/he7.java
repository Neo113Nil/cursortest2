package xsna;

import com.vk.api.generated.account.dto.AccountGetBannedResponseDto;
import com.vk.api.generated.groups.dto.GroupsGroupDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class he7 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ he7(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i;
        AccountGetBannedResponseDto accountGetBannedResponseDto = (AccountGetBannedResponseDto) obj;
        List<UsersUserFullDto> f = accountGetBannedResponseDto.f();
        if (f == null) {
            f = EmptyList.b;
        }
        new j2r0();
        List<GroupsGroupDto> d = accountGetBannedResponseDto.d();
        if (d == null) {
            d = EmptyList.b;
        }
        int count = accountGetBannedResponseDto.getCount();
        int i2 = this.c + this.b;
        List<UserId> e = accountGetBannedResponseDto.e();
        List<UsersUserFullDto> list = f;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(j2r0.a((UsersUserFullDto) it.next()));
        }
        int e2 = on00.e(c5g.u(arrayList, 10));
        if (e2 < 16) {
            e2 = 16;
            i = 16;
        } else {
            i = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(((UserProfile) next).c, next);
        }
        List<GroupsGroupDto> list2 = d;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(rte0.t((GroupsGroupDto) it3.next()));
        }
        int e3 = on00.e(c5g.u(arrayList2, 10));
        if (e3 < i) {
            e3 = i;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e3);
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            linkedHashMap2.put(fkq0.e(((Group) next2).c), next2);
        }
        return new u06(count, i2, e, linkedHashMap, linkedHashMap2);
    }
}
