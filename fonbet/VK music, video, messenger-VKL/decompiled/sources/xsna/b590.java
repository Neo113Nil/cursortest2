package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.friends.dto.FriendsFriendStatusStatusDto;
import com.vk.api.generated.groups.dto.GroupsGroupDto;
import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.generated.groups.dto.GroupsGroupIsClosedDto;
import com.vk.api.generated.users.dto.UsersUserDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserSex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.h2r0;

/* compiled from: OwnerMapper.kt */
/* loaded from: classes3.dex */
public final class b590 {
    /* JADX WARN: Multi-variable type inference failed */
    public static LinkedHashMap a(b590 b590Var, List list, List list2, List list3, int i) {
        boolean z;
        List list4 = (i & 1) != 0 ? null : list;
        List list5 = (i & 4) != 0 ? null : list2;
        List list6 = (i & 8) != 0 ? null : list3;
        b590Var.getClass();
        EmptyList emptyList = EmptyList.b;
        ArrayList arrayList = new ArrayList(c5g.u(emptyList, 10));
        Iterator<E> it = emptyList.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            GroupsGroupDto groupsGroupDto = (GroupsGroupDto) it.next();
            UserId g = groupsGroupDto.g();
            String i2 = groupsGroupDto.i();
            Serializer.c<Image> cVar = Image.CREATOR;
            Image a = Image.b.a(groupsGroupDto.o());
            ImageSize Cb = a.Cb(glw.a().a(), true, false);
            Owner owner = new Owner(g, i2, groupsGroupDto.o(), Cb != null ? Cb.d.d : null, null, a, null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4153296, null);
            BaseBoolIntDto D = groupsGroupDto.D();
            BaseBoolIntDto baseBoolIntDto = BaseBoolIntDto.YES;
            owner.g(2, D == baseBoolIntDto);
            owner.g(4, groupsGroupDto.G() == baseBoolIntDto);
            String e = groupsGroupDto.e();
            owner.o(!(e == null || e.length() == 0));
            if (groupsGroupDto.F() == GroupsGroupIsClosedDto.CLOSED) {
                z = true;
            }
            owner.n(z);
            owner.B(epx.f(groupsGroupDto.K(), Boolean.TRUE));
            arrayList.add(owner);
        }
        int e2 = on00.e(c5g.u(arrayList, 10));
        if (e2 < 16) {
            e2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            linkedHashMap.put(((Owner) next).b, next);
        }
        if (list4 == null) {
            list4 = EmptyList.b;
        }
        List<UsersUserDto> list7 = list4;
        ArrayList arrayList2 = new ArrayList(c5g.u(list7, 10));
        for (UsersUserDto usersUserDto : list7) {
            String f = usersUserDto.f();
            String k = usersUserDto.k();
            BaseBoolIntDto F = usersUserDto.F();
            BaseBoolIntDto baseBoolIntDto2 = BaseBoolIntDto.YES;
            VerifyInfo verifyInfo = new VerifyInfo(F == baseBoolIntDto2 ? true : z, usersUserDto.D() == baseBoolIntDto2 ? true : z, false, false, false, false, 60, null);
            Serializer.c<Image> cVar2 = Image.CREATOR;
            Image a2 = Image.b.a(usersUserDto.u());
            ImageSize Cb2 = a2.Cb(glw.a().a(), true, z);
            String str = Cb2 != null ? Cb2.d.d : null;
            BaseSexDto C = usersUserDto.C();
            int i3 = C == null ? -1 : h2r0.a.$EnumSwitchMapping$0[C.ordinal()];
            UserSex userSex = i3 != 1 ? i3 != 2 ? UserSex.UNKNOWN : UserSex.MALE : UserSex.FEMALE;
            Integer i4 = usersUserDto.i();
            boolean z2 = i4 != null ? i4.intValue() : z ? true : z;
            FriendsFriendStatusStatusDto g2 = usersUserDto.g();
            if (g2 == null) {
                g2 = FriendsFriendStatusStatusDto.NOT_A_FRIEND;
            }
            Owner owner2 = new Owner(usersUserDto.j(), v1v.a(' ', f, k), str, str, verifyInfo, a2, null, null, null, null, userSex, f, k, false, false, false, z2, null, 0, null, null, false, 4113344, null);
            FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = FriendsFriendStatusStatusDto.IS_FRIEND;
            owner2.g(4, g2 == friendsFriendStatusStatusDto || g2 == FriendsFriendStatusStatusDto.OUTCOMING_REQUEST);
            owner2.p(g2 == friendsFriendStatusStatusDto);
            arrayList2.add(owner2);
            z = false;
        }
        int e3 = on00.e(c5g.u(arrayList2, 10));
        if (e3 < 16) {
            e3 = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e3);
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            linkedHashMap2.put(((Owner) next2).b, next2);
        }
        if (list6 == null) {
            list6 = EmptyList.b;
        }
        List list8 = list6;
        ArrayList arrayList3 = new ArrayList(c5g.u(list8, 10));
        Iterator it4 = list8.iterator();
        while (it4.hasNext()) {
            arrayList3.add(equ.a((GroupsGroupFullDto) it4.next()));
        }
        int e4 = on00.e(c5g.u(arrayList3, 10));
        if (e4 < 16) {
            e4 = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(e4);
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            Object next3 = it5.next();
            linkedHashMap3.put(((Owner) next3).b, next3);
        }
        if (list5 == null) {
            list5 = EmptyList.b;
        }
        List list9 = list5;
        ArrayList arrayList4 = new ArrayList(c5g.u(list9, 10));
        Iterator it6 = list9.iterator();
        while (it6.hasNext()) {
            arrayList4.add(new k2r0().a((UsersUserFullDto) it6.next()));
        }
        int e5 = on00.e(c5g.u(arrayList4, 10));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(e5 < 16 ? 16 : e5);
        Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            Object next4 = it7.next();
            linkedHashMap4.put(((Owner) next4).b, next4);
        }
        return pn00.n(pn00.n(pn00.n(linkedHashMap, linkedHashMap2), linkedHashMap3), linkedHashMap4);
    }
}
